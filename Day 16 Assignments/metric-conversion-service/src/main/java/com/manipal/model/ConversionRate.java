package com.manipal.model;

public class ConversionRate {
	private long id;
	private String from;
	private String to;
	private double conversionMultiple;
	private int port;
	
	

	public ConversionRate() {}
	
	public ConversionRate(long id, String from, String to, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = getConversionMultiple();
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
		if(from.equals("METER") && to.equals("CM"))
			conversionMultiple = 100;
		if(from.equals("CM") && to.equals("METER"))
			conversionMultiple = .01;
		if(from.equals("KM") && to.equals("METER"))
			conversionMultiple = 1000;
		if(from.equals("METER") && to.equals("KM"))
			conversionMultiple = .001;		
		return conversionMultiple;
	}
	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
}
