package CT417_Assignment1.B;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import CT417_Assignment1.Course;
import CT417_Assignment1.Module;
import CT417_Assignment1.Student;

public class Driver {
	private static DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
	//creating a handful of fictional students with mock data, 
	//adding the students to a number of modules and adding a number of modules to a course.  
	//Further on, the program should print out a list of all the courses, their respective modules, 
	//and all students, their usernames, assigned modules and the course(s) they are registered 
	//for to the console
	public static void main(String[] args){
	// Student Creation
	Student student1 = new Student("John Lennon", 81, dtf.parseDateTime("09/10/1940"), 10000000);
	Student student2 = new Student("Paul McCartney", 79, dtf.parseDateTime("18/06/1942"), 10000001);
	Student student3 = new Student("George Harrison", 78, dtf.parseDateTime("25/02/1943"), 10000002);
	Student student4 = new Student("Ringo Starr", 81, dtf.parseDateTime("07/07/1940"), 10000003);
	Student student5 = new Student("Mick Jagger", 78, dtf.parseDateTime("26/07/1943"), 10000004);
	Student student6 = new Student("Charlie Watts", 82, dtf.parseDateTime("02/06/1941"), 10000005);
	Student student7 = new Student("Keith Richards", 77, dtf.parseDateTime("18/12/1943"), 10000006);
	Student student8 = new Student("Ronnie Wood", 74, dtf.parseDateTime("01/06/1947"), 10000007);
	Student student9 = new Student("David Bowie", 74, dtf.parseDateTime("08/01/1947"), 10000008);
	Student student10 = new Student("Elton John", 74, dtf.parseDateTime("25/05/1947"), 10000009);
	
	List<Student> studentList = new ArrayList<Student>(){ 
		{
			add(student1);
			add(student2);
			add(student3);
			add(student4);
			add(student5);
			add(student6);
			add(student7);
			add(student8);
			add(student9);
			add(student10);
		} 
	};
	
	//Module Creation
	Module module1 = new Module("Computer Science","CS100");
	Module module2 = new Module("Statistics","CS101");
	Module module3 = new Module("Data Analysis","CS102");
	Module module4 = new Module("Programming","CS103");
	Module module5 = new Module("Networks","CS104");
	
	List<Module> moduleList = new ArrayList<Module>(){ 
		{
			add(module1);
			add(module2);
			add(module3);
			add(module4);
			add(module5);
		} 
	};
	
	//Course Creation
	Course course1 = new Course("CSIT", dtf.parseDateTime("01/09/2018"), dtf.parseDateTime("07/05/2022"));
	Course course2 = new Course("ECE", dtf.parseDateTime("01/09/2018"), dtf.parseDateTime("07/05/2022"));
	
	List<Course> courseList = new ArrayList<Course>(){ 
		{
			add(course1);
			add(course2);
		} 
	};
	
	int i = 0;
    for(Student s : studentList) {
        	if(i < 2) {
        		s.addModule(module1);
        		s.addModule(module2);
        		s.addCourse(course1);
        	}else if(i >= 2 && i < 4) {
        		s.addModule(module1);
        		s.addModule(module3);
        		s.addCourse(course1);
        	}else if(i >= 4 && i < 6) {
        		s.addModule(module2);
        		s.addModule(module3);
        		s.addCourse(course1);
        	}else if(i >= 6 && i < 8) {
        		s.addModule(module4);
        		s.addModule(module5);
        		s.addCourse(course2);
        	}else {
        		s.addModule(module4);
        		s.addModule(module5);
        		s.addCourse(course2);
        	}
        	i++;
        }
    
    course1.addModule(module1);
    course1.addModule(module2);
    course1.addModule(module3);
    
    course2.addModule(module4);
    course2.addModule(module5);
    
    //list of all the courses, their respective modules
    System.out.println("Courses List -");
    System.out.println(course1.toString());
    System.out.println(course1.getName()+ " - All Related Modules: \n"+course1.getModules().toString()+"\n");
    
    System.out.println(course2.toString());
    System.out.println(course2.getName()+ " - All Related Modules: \n"+course2.getModules().toString()+"\n");
    
    //all students, their usernames, assigned modules and the course(s) they are registered
    System.out.println("Student List -");
    for(Student s : studentList) {
    	System.out.println(s.toString());
    	System.out.println("Student Username: "+s.getUsername());
    	System.out.println("Student Modules: \n" +s.getModules());
    	System.out.println("Student Courses: \n" +s.getCourses() +"\n \n");
    }
    
    }

}
