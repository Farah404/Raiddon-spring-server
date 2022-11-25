package fr.isika.al17.raiddonspringserver.filter;


import java.io.IOException;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import fr.isika.al17.raiddonspringserver.constant.SecurityConstant;
import fr.isika.al17.raiddonspringserver.utils.JwtUtility;


@Component
public class JwtAuthorizationFilter extends OncePerRequestFilter {

	private JwtUtility jwtUtility;
	
	public JwtAuthorizationFilter(JwtUtility jwtUtility) {
		this.jwtUtility = jwtUtility;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		if (request.getMethod().equalsIgnoreCase(SecurityConstant.OPTIONS_HTTP_METHOD)) {
			response.setStatus(HttpStatus.OK.value());
		} else {
			String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
			if (authorizationHeader == null || !authorizationHeader.startsWith(SecurityConstant.TOKEN_PREFIX)) {
				filterChain.doFilter(request, response);
				return;
			}
			String token = authorizationHeader.substring(SecurityConstant.TOKEN_PREFIX.length());
			String userName = jwtUtility.getSubject(token);
			if (jwtUtility.isTokenValide(userName, token) && SecurityContextHolder.getContext().getAuthentication() == null) {
				List<GrantedAuthority> authorities = jwtUtility.getAuthorities(token);
				Authentication authentication = jwtUtility.getAuthentication(userName, authorities, request);
				SecurityContextHolder.getContext().setAuthentication(authentication);
			} else {
				SecurityContextHolder.clearContext();
			}
		}
		filterChain.doFilter(request, response);	
	}

}