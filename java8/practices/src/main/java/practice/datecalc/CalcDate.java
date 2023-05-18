package practice.datecalc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalcDate {
	public static void main(String[] args) {
		//String timestamp = "20171107235959";
		String timestamp = "20170101085960";
		new CalcDate().addOneSecond(timestamp);
	}

	protected String addOneSecond(String timestamp) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(sdf.parse(timestamp));
			calendar.add(Calendar.SECOND, 1);
	        return sdf.format(calendar.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
