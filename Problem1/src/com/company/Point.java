package com.company;

public class Point {
	
	private double x;//x坐标
	private double y;//y坐标
	private double area;//面积
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
	}

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
