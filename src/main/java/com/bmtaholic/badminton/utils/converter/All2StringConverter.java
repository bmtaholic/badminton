package com.bmtaholic.badminton.utils.converter;

import java.math.BigDecimal;

import net.sf.cglib.core.Converter;

public class All2StringConverter implements Converter {

	@SuppressWarnings("all")
	@Override
	public Object convert(Object o, Class aClass, Object o1) {
		if (o == null) {
			return null;
		}
		if (o.getClass().isAssignableFrom(BigDecimal.class)) {
			return o.toString();
		} else {
			return o;
		}
	}
}
