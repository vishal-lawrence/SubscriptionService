package com.subscription.domain;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SubscriptionResponse {
	private String amount;
	private String subscriptionType;
	private List<String> invoiceDate;

	public SubscriptionResponse() {

	}

	public SubscriptionResponse(String amount, String subscriptionType, List<String> invoiceDate) {
		this.amount = amount;
		this.subscriptionType = subscriptionType;
		this.invoiceDate = invoiceDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public List<String> getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(List<String> invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

}
