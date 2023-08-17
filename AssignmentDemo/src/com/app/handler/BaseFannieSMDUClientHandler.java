package com.app.handler;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class BaseFannieSMDUClientHandler {
	public static void main(String[] args) {

		String nextElevenMonthStr = "";
		String scheduledPaymentAmountsStr = "";

		Loan loan = new Loan();

		// 1. calculate and set value for LoanContractualPaymentChangeMonth
		Date nextPaymentDueDate = loan.getNextPaymentDueDate();
		if (nextPaymentDueDate != null) {

			// check date is less than 15th of current month
			boolean dateLessThan15Th = isDateLessThan15Th(nextPaymentDueDate);

			if (dateLessThan15Th) {
				// fetch month from loan.getNextPaymentDueDate()+1 and create string
				nextElevenMonthStr = concatenateElevenMonthString(nextPaymentDueDate, dateLessThan15Th);

			} else {
				// fetch month from loan.getNextPaymentDueDate()+2 and create string
				nextElevenMonthStr = concatenateElevenMonthString(nextPaymentDueDate, dateLessThan15Th);
			}
		}

		// 2. set BusinessPolicyType
		BusinessPolicyType businessPolicyType = new BusinessPolicyType();
		businessPolicyType.setName("LoanContractualPaymentChangeMonth");
		businessPolicyType.setValue(nextElevenMonthStr);

		// 3. calculate LoanContractualPaymentChangeAmount
		LocalDate nextPaymentDueLocalDate = convertToLocalDateViaInstant(loan.getNextPaymentDueDate());
		LocalDate loanStartLocalDate = convertToLocalDateViaInstant(loan.getStartDate());

		long index = ChronoUnit.MONTHS.between(nextPaymentDueLocalDate, loanStartLocalDate) + 1l;

		Collection<BigDecimal> scheduledPaymentAmounts = loan.getScheduledPaymentAmounts();

		scheduledPaymentAmountsStr = concatenateScheduledPaymentAmountsByIndex(index, scheduledPaymentAmounts);

		System.out.println(scheduledPaymentAmountsStr);
 
		BusinessPolicyType businessPolicyTypeTwo = new BusinessPolicyType();
		businessPolicyTypeTwo.setName("LoanContractualPaymentChangeAmount");
		businessPolicyTypeTwo.setValue(scheduledPaymentAmountsStr);

		
	}

	private static String concatenateScheduledPaymentAmountsByIndex(long index,
			Collection<BigDecimal> scheduledPaymentAmounts) {
		String scheduledPaymentAmountsStr = "";

		List<BigDecimal> scheduledPaymentAmountsList = new ArrayList<BigDecimal>(scheduledPaymentAmounts);

		for (int i = 1; i <= 12; i++) {

			if (scheduledPaymentAmountsStr.isBlank()) {
				scheduledPaymentAmountsStr = scheduledPaymentAmountsStr + scheduledPaymentAmountsList.get((int) index);
				index++;
				continue;
			}
			scheduledPaymentAmountsStr = scheduledPaymentAmountsStr + "|"
					+ scheduledPaymentAmountsList.get((int) index);
			index++;
		}

		return scheduledPaymentAmountsStr;

	}

	private static String concatenateElevenMonthString(Date date, boolean dateLessThan15Th) {

		LocalDate localDate = convertToLocalDateViaInstant(date);
		int monthValue;

		String nextElevenMonthStr = "";

		if (dateLessThan15Th) {
			monthValue = localDate.getMonthValue() + 1;
			localDate = localDate.plusMonths(1);
		} else {
			monthValue = localDate.getMonthValue() + 2;
			localDate = localDate.plusMonths(2);
		}

		nextElevenMonthStr = nextElevenMonthStr + monthValue;

		for (int i = 1; i <= 11; i++) {

			localDate = localDate.plusMonths(1);

			nextElevenMonthStr = nextElevenMonthStr + "|" + localDate.getMonthValue();
		}
		return nextElevenMonthStr;
	}

	private static boolean isDateLessThan15Th(Date date) {

		int dayOfMonth = convertToLocalDateViaInstant(date).getDayOfMonth();

		if (dayOfMonth < 15)
			return true;
		else
			return false;
	}

	private static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
}
