package com.subscription.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subscription.domain.SubscriptionDetails;
import com.subscription.domain.SubscriptionResponse;
import com.subscription.service.SubscriptionService;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

	@Autowired
	private SubscriptionResponse subscriptionResponse;

	@Autowired
	private SubscriptionService subscriptionService;

	@CrossOrigin
	@PostMapping
	public SubscriptionResponse createSubscription(@RequestBody SubscriptionDetails subscriptionDetails)
			throws Exception {
		if (subscriptionDetails != null) {
			subscriptionResponse = subscriptionService.subscriptionCreate(subscriptionDetails);
			if(subscriptionResponse == null) {
				throw new IllegalArgumentException("Subscription creation is not successful.");
			}
		}
		return subscriptionResponse;
	}

}
