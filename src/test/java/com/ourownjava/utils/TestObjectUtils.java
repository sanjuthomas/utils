package com.ourownjava.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author ourownjava.com
 *
 */
public class TestObjectUtils {
	
	private static final String PIPE_DELIMIT = "|";
	
	private ObjectUtils objectUtils;
	
	@Before
	public void setUp(){
		this.objectUtils = new ObjectUtils();
	}
	
	@Test
	public void testToDelimitedString(){
		final String delimitedString = objectUtils.toDelimitedString(createTrade(), PIPE_DELIMIT);
		assertNotNull(delimitedString);
		assertEquals("1|NYSE|11324.11", delimitedString);
	}
	
	private Trade createTrade(){
		final Trade trade = new Trade();
		trade.setId(1L);
		trade.setExchageCode("NYSE");
		trade.setValue(new BigDecimal("11324.11"));
		return trade;
	}

}
