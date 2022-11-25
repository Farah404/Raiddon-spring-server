package fr.isika.al17.raiddonspringserver.utils;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.JWTVerifier;

import fr.isika.al17.raiddonspringserver.constant.SecurityConstant;
import fr.isika.al17.raiddonspringserver.models.CustomUserDetails;

@Component
public class JwtUtility {

    @Value("${jwt.secret}")
    private String secret;

    public String generateJwtToken(CustomUserDetails customUserDetails) {
	String[] claims = getClaimsFromUser(customUserDetails);
	return JWT.create().withIssuer(SecurityConstant.GET_RAIDDON)
		.withAudience(SecurityConstant.GET_RAIDDON_ADMINISTRATION).withIssuedAt(new Date())
		.withSubject(customUserDetails.getUsername()).withArrayClaim(SecurityConstant.AUTHORITIES, claims)
		.withExpiresAt(new Date(System.currentTimeMillis() + SecurityConstant.EXPIRATION_TIME))
		.sign(Algorithm.HMAC512(secret.getBytes()));
    }

    public List<GrantedAuthority> getAuthorities(String token) {
	String[] claims = getClaimsFromToken(token);
	return Stream.of(claims).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    public Authentication getAuthentication(String username, List<GrantedAuthority> authorities,
	    HttpServletRequest request) {
	UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
		username, null, authorities);
	usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	return usernamePasswordAuthenticationToken;
    }

    private String[] getClaimsFromToken(String token) {
	JWTVerifier jwtVerifier = getJWTVerifier();
	return jwtVerifier.verify(token).getClaim(SecurityConstant.AUTHORITIES).asArray(String.class);
    }

    public boolean isTokenValide(String username, String token) {
	JWTVerifier jwtVerifier = getJWTVerifier();
	return StringUtils.isNoneEmpty(username) && !isTokenExpired(jwtVerifier, token);
    }

    private boolean isTokenExpired(JWTVerifier jwtVerifier, String token) {
	Date expirationDate = jwtVerifier.verify(token).getExpiresAt();
	return expirationDate.before(new Date());
    }

    public String getSubject(String token) {
	JWTVerifier jwtVerifier = getJWTVerifier();
	return jwtVerifier.verify(token).getSubject();
    }

    private JWTVerifier getJWTVerifier() {
	JWTVerifier jwtVerifier;
	try {
	    Algorithm algorithm = Algorithm.HMAC512(secret);
	    jwtVerifier = JWT.require(algorithm).withIssuer(SecurityConstant.GET_RAIDDON).build();
	} catch (JWTVerificationException jWTVerificationException) {
	    throw new JWTVerificationException(SecurityConstant.TOKEN_CANNOT_BE_VERIFIED);
	}
	return jwtVerifier;
    }

    private String[] getClaimsFromUser(CustomUserDetails customUserDetails) {
	return customUserDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority).toArray(String[]::new);
    }

}
