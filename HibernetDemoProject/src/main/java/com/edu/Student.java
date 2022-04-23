package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity  //create table Student
public class Student {
	@Id   //primary key
private int sid;
private String sname;
//generate setter and getter method 
//generate toString
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}


}


