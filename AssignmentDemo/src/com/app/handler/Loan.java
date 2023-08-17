package com.app.handler;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

public class Loan {

	private Date nextPaymentDueDate;
	private Date startDate;
	private Collection<BigDecimal> scheduledPaymentAmounts;

	public Date getNextPaymentDueDate() {
		nextPaymentDueDate = new GregorianCalendar(2022, Calendar.MAY, 10).getTime();
		return nextPaymentDueDate;
	}

	public void setNextPaymentDueDate(Date nextPaymentDueDate) {
		this.nextPaymentDueDate = nextPaymentDueDate;
	}

	public Date getStartDate() {
		startDate = new GregorianCalendar(2022, Calendar.AUGUST, 10).getTime();

		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Collection<BigDecimal> getScheduledPaymentAmounts() {

		scheduledPaymentAmounts = Arrays.asList(new BigDecimal(599.48).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(599.48).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP).setScale(2, BigDecimal.ROUND_UP),
				new BigDecimal(575.12).setScale(2, BigDecimal.ROUND_UP));

		return scheduledPaymentAmounts;
	}

	public void setScheduledPaymentAmounts(Collection<BigDecimal> scheduledPaymentAmounts) {
		this.scheduledPaymentAmounts = scheduledPaymentAmounts;

	}

}