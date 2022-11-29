package fr.isika.al17.raiddonspringserver;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import fr.isika.al17.raiddonspringserver.constant.FileConstant;
import fr.isika.al17.raiddonspringserver.models.User;

@SpringBootApplication
public class RaiddonSpringServerApplication {

    public static void main(String[] args) {
	SpringApplication.run(RaiddonSpringServerApplication.class, args);
	new File(FileConstant.USER_FOLDER).mkdirs();
	
	User user1 = new User();
    }
    
	    @Bean
	    public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	    }
}