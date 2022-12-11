<<<<<<< Updated upstream
package com.bezkoder.spring.security.login;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootLoginExampleApplicationTests {

	@Test
	void contextLoads() {
	}

=======
package fr.isika.al17.raiddonspringserver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.isika.al17.raiddonspringserver.controllers.MessageController;

@SpringBootTest
class RaiddonApplicationTests {

    @Autowired
    private MessageController controller;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetMessage() {
	String message = controller.getMessage();
	Assertions.assertNotNull(message);
    }
>>>>>>> Stashed changes
}
