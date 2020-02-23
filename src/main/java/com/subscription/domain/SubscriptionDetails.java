package com.subscription.domain;

public class SubscriptionDetails {
	private double amount;
	private String subscriptionType;
	private String weekOrMonthDay;
	private String fromDate;
	private String toDate;

	public SubscriptionDetails() {

	}

	public SubscriptionDetails(double amount, String subscriptionType, String weekOrMonthDay, String fromDate,
			String toDate) {
		this.amount = amount;
		this.subscriptionType = subscriptionType;
		this.weekOrMonthDay = weekOrMonthDay;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public String getWeekOrMonthDay() {
		return weekOrMonthDay;
	}

	public void setWeekOrMonthDay(String weekOrMonthDay) {
		this.weekOrMonthDay = weekOrMonthDay;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}
