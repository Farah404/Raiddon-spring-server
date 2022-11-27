package fr.isika.al17.raiddonspringserver;

import java.io.File;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import fr.isika.al17.raiddonspringserver.constant.FileConstant;

@SpringBootApplication
public class RaiddonSpringServerApplication {

    public static void main(String[] args) {
	SpringApplication.run(RaiddonSpringServerApplication.class, args);
	new File(FileConstant.USER_FOLDER).mkdirs();
    }

    @Bean
    public CorsFilter corsFilter() {
	UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
	CorsConfiguration corsConfiguration = new CorsConfiguration();
	corsConfiguration.setAllowCredentials(true);
	corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
	corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
		"Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
		"Access-Control-Request-Method", "Access-Control-Request-Headers"));
	corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token",
		"Authorization", "Access-Control-Allow-Origin", "Access-Control-Allow-Origin",
		"Access-Control-Allow-Credentials"));
	corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
	urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
	return new CorsFilter(urlBasedCorsConfigurationSource);
    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
	return new WebMvcConfigurer() {
	  @Override 
	  public void addCorsMappings (CorsRegistry registry) {
	      registry.addMapping("/**").allowedOrigins("http://localhost:4200");
	  }
	};
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
	return new BCryptPasswordEncoder();
    }

}
