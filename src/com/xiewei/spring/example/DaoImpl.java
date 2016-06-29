package com.xiewei.spring.example;

import java.util.Calendar;

public class DaoImpl implements IDao {

	public String sayHello(String name) {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour < 6)
			return "�賿��, " + name;
		if (hour < 12)
			return "���Ϻ�, " + name;
		if (hour < 13)
			return "�����, " + name;
		if (hour < 18)
			return "�����, " + name;
		return "���Ϻ�, " + name;
	}

}
