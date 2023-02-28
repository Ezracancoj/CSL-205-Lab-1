package edu.monmouth.s1326470.CS205.Lab1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lab1 {

	private static final Throwable e = null;

	public static void main(String[] args) {
		//Step one Redirect STDERR and STDOUT using the method presented in class
		try {
			PrintStream newIO = new
			PrintStream(Lab1Constants.LOGFILENAME);
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(Lab1Constants.REDIRECTFAILURE);
			}
	
	//Step two declare and fill an array of references to Student objects
	Student students[] = new Student[]{
		new Student(100,18,"John"),
		new Student(101,19,"Jane"),
		new Student(102,20,"Larry"),
		new Student(103,20,"Karen"),
		new Student(104,21,"Karl")};
		
	//Step three Using an attribute of the array, print out the number of elements in the students array
	System.out.println("Number of elements in students: " + students.length);  
    
    //Step four ask what validating the data means
	for(Student i: students) {
		i.toString();
		}
	//Step five change the Student object whose name is “Larry” to 21
	int index = 0;//Int to hold index of Larry
	String studentName = null;//String to hold name
	for(Student i : students){
		studentName = i.getName();
		//Check if the name is Larry
		if(studentName.equals("Larry")){
			//Make age 21
			i.setAge(21);
		}else {
		index++;
		}
	}
	//Making sure age for Larry is changed
	System.out.println("Larry's age: " + students[index].getAge());
	
	//Step six create another loop that iterates through each reference in the students array
	
	System.out.println("---------students with age less than 20---------");
	
	for(Student i: students) {
		//Print only student objects with an age less than 20
		if(i.getAge() < 20) {
			System.out.println(i.toString());
			
		}
		}
	
	//Step seven declare another array of references to Student objects named newStudents.
	//The capacity of newStudents is 3. Always size an array with a constant-never a literal
	Student  newStudents[] = new Student[Lab1Constants.newStudents];
	
	
	//Step eight using a method from the System class (that we used in class), copy Student
	//objects with the names “Larry”, “Karen” and “Karl” from the students array to the newStudents array.
	int num = 0;
	index = 0;//Set index to 0
	for(Student i: students) {
		if(i.getName().equals("Larry")) {
			System.arraycopy(students,index,newStudents,num,1);
			
			num++;
		}else {
			index++;
		}
		
	}
	index = 0;//Set index to 0
	for(Student i: students) {
		if(i.getName().equals("Karen")) {
			System.arraycopy(students,index,newStudents,num, 1);
			
			num++;
		}else {
			index++;
		}
		
	}
		index = 0;//Set index to 0
		for(Student i: students) {
			if(i.getName().equals("Karen")) {
				System.arraycopy(students,index,newStudents,num,1);
				
			}else {
				index++;
			}
		}
	
	//Step nine create a loop that iterates through the newStudents array and prints each object
		System.out.println("---------new students list---------");
		for(Student i: newStudents) {
			System.out.println(i.toString());
		}
}
}
