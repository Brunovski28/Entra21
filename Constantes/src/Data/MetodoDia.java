package Data;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MetodoDia {

	LocalDate se;

	public MetodoDia(LocalDate se) {
		super();
		this.se = se;
	}
	public boolean dia() {
		if (se.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
			return false;
		} else if (se.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
			return false;
		} else if (se.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
			return false;
		}else if (se.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
			return false;
		}else if (se.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			return false;
		}else if (se.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			return true;
		}else if (se.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			return true;
		} else {
			return true;
		}
	}
}
