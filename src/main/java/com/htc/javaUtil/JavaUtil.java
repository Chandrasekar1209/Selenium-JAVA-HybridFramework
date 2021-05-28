package com.htc.javaUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtil {

	//***************Date And Time Formate*********//

	public static String getCurrentDateTime() {
		DateFormat customFormat=new SimpleDateFormat("E,dd_MMMM_yyyy_hh_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
	}



}
