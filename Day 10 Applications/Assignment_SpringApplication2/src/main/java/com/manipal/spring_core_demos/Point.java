package com.manipal.spring_core_demos;

public class Point {
	private int xCordinate;
	private int yCordinate;

	public int getxCordinate() {
		return xCordinate;
	}

	public void setxCordinate(int xCordinate) {
		this.xCordinate = xCordinate;
	}

	public int getyCordinate() {
		return yCordinate;
	}

	public void setyCordinate(int yCordinate) {
		this.yCordinate = yCordinate;
	}

	@Override
	public String toString() {
		return "Point [xCordinate=" + xCordinate + ", yCordinate=" + yCordinate + super.toString() + "]";
	}

}
