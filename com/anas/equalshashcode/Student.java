package com.anas.equalshashcode;

public class Student {
	
	private int rollNumber;
	private String name;
	private String address;
	
	public Student(int rollNumber, String address, String string) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}
	 public void setName(String name) {
		 this.name = name;
		  }
	 
	 public void seAddress(String address) {
		 this.address = address;
		  }

	 public String getName() {
		 return name;
		 }
	 
	 public String geAddress() {
		 return address;
		  }
	 
	 /**
	  * @return the rollNumber
	  */
	 public int getRollNumber() {
		 return rollNumber;
		}
	 
	 /**
	  * @param rollNumber the RollNumber to set
	  */
	 public void setRollNumber(int rollNumber) {
		 this.rollNumber = rollNumber;
	      }
	 
       }
