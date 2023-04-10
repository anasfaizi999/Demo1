package com.anas.comparator;



class Student implements Comparable<Student>{
	  private int rollNumber;
		private String name;
		private int age;
		
		public Student(int rollNumber, String name, int age ) {
			this.rollNumber = rollNumber;
			this.name = name;
			this.age = age;
		}
		 public void setName(String name) {
			 this.name = name;
			  }
		 
		 public void seAddress(String address) {
			 this.name = address;
			  }

		 public String getName() {
			 return name;
			 }
		 
		 public int getage() {
			 return age;
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
		@Override
		public int compareTo(Student student) {
			return this.rollNumber= student.rollNumber;
		}
		 
		
		 
	       }

	 
	