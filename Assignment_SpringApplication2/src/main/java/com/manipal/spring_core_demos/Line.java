package com.manipal.spring_core_demos;

public class Line {
	private Point p1;
	private Point p2;

	public Point getP1() //Getters and
	{ 
		return p1;
	}

	public void setP1(Point p1) //Setters
	{
		this.p1 = p1;
	}

	public Point getP2()//Getters 
	{
		return p2;
	}

	public void setP2(Point p2)//Setters
	{
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return "Line " + super.toString() + "]";
	}

}
