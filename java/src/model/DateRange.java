package model;

import java.time.LocalDate;

public interface DateRange {
	LocalDate getStartDate();
	LocalDate getEndDate();

	default boolean isValidRange() {
		return getEndDate() == null || !getEndDate().isBefore(getStartDate());
	}
}
