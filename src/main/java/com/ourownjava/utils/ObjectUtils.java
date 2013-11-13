package com.ourownjava.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author ourownjava.com
 * 
 */
public class ObjectUtils {
	
	public String toDelimitedString(final Object object, final String delimit) {
		final List<Object> fieldValues = new ArrayList<Object>();
		final Field[] fields = object.getClass().getDeclaredFields();
		try {
			for (final Field field : fields) {
				fieldValues.add(PropertyUtils.getSimpleProperty(object, field.getName()));
			}
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}

		return StringUtils.join(fieldValues, delimit);
	}

}
