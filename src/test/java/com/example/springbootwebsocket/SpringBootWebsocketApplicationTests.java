package com.example.springbootwebsocket;

import com.example.springbootwebsocket.controller.UserController;
import com.example.springbootwebsocket.model.User;
import com.example.springbootwebsocket.model.UserResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWebsocketApplicationTests {

	@Test
	public void contextLoads() {
		UserController user = new UserController();
		UserResponse response = user.getUser(new User("Shashank"));
		Assert.assertEquals(response.getContent(), "Hello Shashank");
	}

}
