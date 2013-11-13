package com.ourownjava.utils;

import java.math.BigDecimal;

public class Trade{
		
		private Long id;
		private String exchageCode;
		private BigDecimal value;
		
		public Long getId() {
			return id;
		}
		public void setId(final Long id) {
			this.id = id;
		}
		public String getExchageCode() {
			return exchageCode;
		}
		public void setExchageCode(final String exchageCode) {
			this.exchageCode = exchageCode;
		}
		public BigDecimal getValue() {
			return value;
		}
		public void setValue(final BigDecimal value) {
			this.value = value;
		}
	}