package com.anas.Methodcalling;

  class Sudent {

	  String name;
	  int age;
	  String address;
	  
	  public Sudent(String name, int age, String address) {
		  this.name = name;
		  this.age = age;
		  this.address = address;
	  }
	  
	  public void setname(String name) {
		  this.name = name;
		  }
	  
	  public void setAge(int age) {
		  this.age= age;
	  }
	  
	  public void setAddress(String address) {
		  this.address = address;
		    }
	  
	  public String getName() {
		  	  return name;
		   }
	  
	  public int getage() {
		  return age;
		   }
	  
	  public String getAddress() {
		  return address;
		   }
	  
	  
}
