package com.manipal.model;

public class MetricCalculatorBean {
	private long id;
	private String from;
	private String to;
	private double conversionMultiple;
	private int unit;
	private double totalUnits;
	int port;
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public MetricCalculatorBean() {}
	public MetricCalculatorBean(long id, String from, String to, double conversionMultiple, int unit,
			double totalUnits, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.unit = unit;
		this.totalUnits = totalUnits;
		this.port = port;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public double getTotalUnits() {
		return totalUnits;
	}
	public void setTotalUnits(double totalUnits) {
		this.totalUnits = totalUnits;
	}
	
	
	
	
}
