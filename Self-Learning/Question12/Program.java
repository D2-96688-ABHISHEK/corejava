package com.sunbeam.SelfLearningQ12;
import java.util.Arrays;
import java.util.Comparator;

//2. Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city
//(desc), 2nd level sorting should be on marks (desc), 3rd level sorting should be on name (asc)

public class Program {

	
	public static void main(String[] args) {
		class CityComparator implements Comparator<Student> {
			@Override
			public int compare(Student st1, Student st2) {
				int result = st2.getCity().compareTo(st1.getCity());
				if(result == 0) {
					result = Double.compare(st2.getMarks(), st1.getMarks());
					if(result == 0) {
						result = st1.getName().compareTo(st2.getName());
						return result;
					}
					return result;
				}
				return result;
			}
		}
		

		
		Student[] students = {
			    new Student(1, "Suyash", "Pune", 85.5),
			    new Student(2, "Mahesh", "Satara", 60.5),
			    new Student(3, "Ganesh", "Satara", 80.5),
			    new Student(4, "Prasad", "Satara", 80.5),
			    new Student(5, "Maruti", "Satara", 80.5),
			    new Student(6, "Rahul", "Mumbai", 78.0),
			    new Student(7, "Pravin", "Pune", 55.5),
			    new Student(8, "Prakash", "Nashik", 67.5),
			    new Student(9, "Anjali", "Nashik", 92.3),
			    new Student(10, "Priya", "Kolhapur", 88.7),
			    new Student(11, "Neha", "Satara", 90.1)
		};
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].toString());
		}
		
		System.out.println("\nSorting based on 1st level city Level(DESC), 2nd level Marks(DESC), 3rd level Name(ASC) : ");
		Arrays.sort(students, new CityComparator());
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].toString());
		}
		
	}
}
