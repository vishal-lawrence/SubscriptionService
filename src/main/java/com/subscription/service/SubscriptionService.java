package com.subscription.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.subscription.domain.SubscriptionDetails;
import com.subscription.domain.SubscriptionResponse;

@Service
public class SubscriptionService {
	private static final String DAILY = "DAILY";
	private static final String WEEKLY = "WEEKLY";
	private static final String MONTHLY = "MONTHLY";

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public SubscriptionResponse subscriptionCreate(SubscriptionDetails subscriptionDetails) throws Exception {
		Date fromDate = sdf.parse(subscriptionDetails.getFromDate());
		Date toDate = sdf.parse(subscriptionDetails.getToDate());

//		if (fromDate.after(toDate)) {
//			throw new IllegalArgumentException("From Date can't be After To Date.");
//		}
		String subscriptionType = subscriptionDetails.getSubscriptionType();
		String amount = "$" + subscriptionDetails.getAmount();

		List<String> dates = new ArrayList<>();
		Calendar start = Calendar.getInstance();
		start.setTime(fromDate);

		Calendar end = Calendar.getInstance();
		end.setTime(toDate);
		end.add(Calendar.DATE, 1);

		while (start.before(end)) {
			Date result = start.getTime();
			dates.add(sdf.format(result));
			if (subscriptionType.equals(DAILY)) {
				start.add(Calendar.DATE, 1);
			} else if (subscriptionType.equals(WEEKLY)) {
				start.add(Calendar.DATE, 7);
			} else if (subscriptionType.equals(MONTHLY)) {
				start.add(Calendar.MONTH, 1);
			}
		}

		return new SubscriptionResponse(amount, subscriptionDetails.getSubscriptionType(), dates);

	}

}
