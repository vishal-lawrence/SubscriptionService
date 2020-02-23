package com.subscription;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.subscription.controller.SubscriptionController;
import com.subscription.service.SubscriptionService;

@SpringBootTest
class SubscriptionServiceApplicationTests {
	
	@Mock
	private SubscriptionService subscriptionService;
	
	@InjectMocks
	private SubscriptionController subscriptionController;
	
	@Test
	void contextLoads() {
	}

}
