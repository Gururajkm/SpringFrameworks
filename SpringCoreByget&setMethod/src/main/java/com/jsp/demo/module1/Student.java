package com.jsp.demo.module1;

public class Student {
private String usn;
private String name;
private double marks;

public Student() {
	
	System.out.println("const injection");
}
public String getUsn() {
	return usn;
}
public void setUsn(String usn) {
	System.out.println("setting the usn");
	this.usn = usn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("setting the name");
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	System.out.println("setting the marks");
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
}


}
