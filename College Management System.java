import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class college 
{
	static String Name="Datta Meghe College Of Engineering";
	
	static String Address="Sector-3,Plot No.98,Near Rajiv Gandhi Garden,Airoli,Navi Mumbai";
	
	static String City="Airoli";
	
	static int EstablishedYear=1990;
	
	static long ContactNumber=942292386l;
	
	static String Principle="Dr.R S Sawarkar";
	
	static String NAAC ="A+";
	
	static String Ratings="4.5*";
	
	public static   void collegeDetails()
	{
		
		System.out.println("Name : " + Name);
		System.out.println("Address : " + Address);
		System.out.println("Established Year : " + EstablishedYear);
		System.out.println("Contact Number : " + ContactNumber);
		System.out.println("Principle : " + Principle);
		System.out.println("NAAC : " + NAAC);
		System.out.println("Ratings : " + Ratings);
	}
}


class Department extends college
{
    private String code;
    private String name;
    private String head;

    public Department(String code,String name,String head) 
    {
        this.code = code;
        this.name = name;
        this.head = head;
    }

    // Getters and setters for code, name, and head

    public String getCode() 
    {
        return code;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getHead() 
    {
        return head;
    }

    public void setHead(String head)
    {
        this.head = head;
    }
}


//Faculty class (Base class)
class Faculty extends college
{
 private String name;
 private String designation;

 public Faculty(String name, String designation) 
 {
     this.name = name;
     this.designation = designation;
 }

 public String getName()
 {
	 return name;
 }
 
 public String getDesignation()
 {
	 return designation;
 }
 
 // Common method for all faculty members
 public void displayInformation() 
 {
     System.out.println("Name: " + name);
     System.out.println("Designation: " + designation);
 }
}


//TeachingStaff class (Subclass)
class TeachingStaff extends Faculty 
{
 private String subject;

 public TeachingStaff(String name, String designation, String subject)
 {
     super(name, designation);
     this.subject = subject;
 }
 
 public String getSubject()
 {
	 return subject;
 }
 
 

 // Overriding the displayInformation method for TeachingStaff
 @Override
 public void displayInformation()
 {
     super.displayInformation();
     System.out.println("Teaching Subject: " + subject);
     
 }
}


//NonTeachingStaff class (Subclass)
class NonTeachingStaff extends Faculty 
{
 private String department;

 public NonTeachingStaff(String name, String designation, String department)
 {
     super(name, designation);
     this.department = department;
 }
 
 public String getDepartment()
 {
	 return department;
 }
 

 // Overriding the displayInformation method for NonTeachingStaff
 @Override
 public void displayInformation() 
 {
     super.displayInformation();
     System.out.println("Department: " + department);
     
 }
}


//Student class (Base class)
class Student extends college 
{
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId)
    {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    public String getName()
    {
   	 return name;
    }
    public int getAge()
    {
   	 return age;
    }
    public String getStudentId()
    {
   	 return studentId;
    }
    
    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); 
        System.out.println("Student ID: " + studentId);
    }
}

class PGStudent extends Student 
{
    private String pgProgram;

    public PGStudent(String name, int age, String studentId, String pgProgram) {
        super(name, age, studentId);
        this.pgProgram = pgProgram;
    }
    public String getpgProgram()
    {
   	 return pgProgram;
    }
    
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("PG Program: " + pgProgram);
        System.out.println("------------------------------------------------------------------------------------");
    }
}

class UGStudent extends Student 
{
    private String ugProgram;

    public UGStudent(String name, int age, String studentId, String ugProgram)
    {
        super(name, age, studentId);
        this.ugProgram = ugProgram;
    }
    public String getugProgram()
    {
   	 return ugProgram;
    }
    
    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("UG Program: " + ugProgram);
        
        System.out.println("------------------------------------------------------------------------------------");
    }
}

class StudentManager 
{
    private List<PGStudent> pgStudents;
    private List<UGStudent> ugStudents;

    public StudentManager() 
    {
        pgStudents = new ArrayList<>();
        ugStudents = new ArrayList<>();
    }

    public void addPGStudent(PGStudent pgStudent)
    {
        pgStudents.add(pgStudent);
        
    }

    public void addUGStudent(UGStudent ugStudent) 
    {
        ugStudents.add(ugStudent);
    }

    public void displayAllPGStudents() 
    {
        for (PGStudent pgStudent : pgStudents)
        {
            pgStudent.displayInfo();
        }
    }

    public void displayAllUGStudents()
    {
        for (UGStudent ugStudent : ugStudents)
        {
            ugStudent.displayInfo();
        }
    }
}


class Classroom extends college
{
    private String className;
    private int capacity;
    private boolean isOccupied;

    public Classroom(String className, int capacity)
    {
        this.className = className;
        this.capacity = capacity;
        this.isOccupied = false; // By default, the classroom is not occupied.
    }

    public String getClassName() 
    {
        return className;
    }

    public int getCapacity() 
    {
        return capacity;
    }

    public boolean isOccupied() 
    {
        return isOccupied;
    }

    public void occupy()
    {
        isOccupied = true;
    }

    public void vacant() 
    {
        isOccupied = false;
    }

    public void displayClassInfo() 
    {
        System.out.println("Class Name: " + className);
        System.out.println("Capacity: " + capacity);
        System.out.println("Occupied: " + (isOccupied ? "Yes" : "No"));
    }
}




abstract class MenuItem 
{
    private String name;
    private double price;

    public MenuItem(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public abstract void displayInfo();
}

class Beverage extends MenuItem
{
    private String size;

    public Beverage(String name, double price, String size)
    {
        super(name, price);
        this.size = size;
    }

    public String getSize() 
    {
        return size;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("Name: " + getName());  
        System.out.println("Price: $" + getPrice());  
        System.out.println("Size: " + size);
        System.out.println("----------------------------------------------------------");
    }
}

class Food extends MenuItem 
{
    private String category;

    public Food(String name, double price, String category)
    {
        super(name, price);
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Name: " +  getName());
        System.out.println("Price: $" +  getPrice()) ;
        System.out.println("Category: " + category);
        System.out.println("-------------------------------------------------------");
    }
}


class Canteen 
{
    private List<MenuItem> menu;

    public Canteen()
    {
        menu = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item)
    {
        menu.add(item);
    }

    public void removeMenuItem(MenuItem item)
    {
        menu.remove(item);
    }

    public void displayMenu() 
    {
        
        for (MenuItem item : menu)
        {
            item.displayInfo();
        }
       
    }
}


	


class Book
{
    private String title;
    private String author;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    @Override
    public String toString() 
    {
        return "Title: " + title +     " Author: " + author;
    }
}

class Library extends college
{
    private List<Book> books;

    public Library()
    {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) 
    {
        books.add(book);
    }

    public void displayBooks() 
    {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
    }
}


       


class Hostel extends college 
{
    private String hostelName;
    private int numberOfRooms;
    private int vacantRooms;

    public Hostel(String name, int totalRooms) 
    {
        hostelName = name;
        numberOfRooms = totalRooms;
        vacantRooms = totalRooms; // Initially, all rooms are vacant
    }

    // Getter methods
    public String getHostelName() 
    {
        return hostelName;
    }

    public int getNumberOfRooms() 
    {
        return numberOfRooms;
    }

    public int getVacantRooms() 
    {
        return vacantRooms;
    }

    // Method to check-in a student
    public void checkIn()
    {
        if (vacantRooms > 0) 
        {
            vacantRooms--;
            System.out.println("Student checked in");
            System.out.println("Vacant rooms: " + vacantRooms);
            
        } 
        else 
        {
            System.out.println("Sorry, no vacant rooms available.");
        }
    }

    // Method to check-out a student
    public void checkOut()
    {
        if (vacantRooms < numberOfRooms) 
        {
           vacantRooms++;
            System.out.println("Student checked out");
            System.out.println("VacantRooms:"  + vacantRooms);
            
        } 
        else 
        {
            System.out.println("All rooms are already vacant.");
        }
    }

    // Method to display hostel information
    public void displayInfo() 
    {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Total Rooms: " + numberOfRooms);
        System.out.println("Vacant Rooms: " + vacantRooms);
    }
}

class BoysHostel extends Hostel 
{
    private int boysField; 

    public BoysHostel(String name, int totalRooms, int Field) 
    {
        super(name, totalRooms);
        boysField = Field;
    }

    
}

class GirlsHostel extends Hostel 
{
    private int girlsField; 

    public GirlsHostel(String name, int totalRooms, int Field) 
    {
        super(name, totalRooms);
        girlsField = Field;
    }

    
}


class Auditorium 
{
    private List<Event> events;

    public Auditorium()
    {
        events = new ArrayList<>();
    }

    // Method to add an event to the auditorium
    public void addEvent(Event event) 
    {
        events.add(event);
    }

    // Method to get all events in the auditorium
    public List<Event> getAllEvents() 
    {
        return events;
    }

    // Inner class representing an event
    public static class Event 
    {
        private String eventName;
        private String date;
        private String time;
        private int duration; // Duration of the event in minutes

        public Event(String eventName, String date, String time, int duration) 
        {
            this.eventName = eventName;
            this.date = date;
            this.time = time;
            this.duration = duration;
        }

        // Getter methods
        public String getEventName() 
        {
            return eventName;
        }

        public String getDate() 
        {
            return date;
        }

        public String getTime() 
        {
            return time;
        }

        public int getDuration() 
        {
            return duration;
        }

        @Override
        public String toString() 
        {
            return "Event Name: " + eventName + ", Date: " + date + ", Time: " + time + ", Duration: " + duration + " minutes";
        }
    }
}














public class Driver
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        
        if (username.equals("admin") && password.equals("1234")) 
        {
        	
            System.out.println("Authentication successful!");
            System.out.println("Welcome, " + username + "!");
            int choice;

            do 
            {
                printMenu();
                choice = sc.nextInt();

                switch (choice)
                {
                    case 1:
                    	System.out.println("Display College details:");
                    	System.out.println();
                    	college.collegeDetails();
                    	System.out.println();
                    	break;
                          
                    case 2:
                    	System.out.println("Display Department details:");
                    	System.out.println();
                    	ArrayList<Department> departments = new ArrayList<>();
                        departments.add(new Department("CS1234", "Computer", "Dr. John Doe"));
                        
                        departments.add(new Department("IT0214", "Information Technology", "Dr. Jane Smith"));
                        
                        departments.add(new Department("MECH125", "Mechanical", "Dr. Joe Doen"));
                        
                        departments.add(new Department("AIDS4567", "AIDS", "Dr. Smith Sen"));
                        
                        departments.add(new Department("EXTC5467", "Electronics and Telecommunication", "Dr. Rane Rio"));
                        
                        departments.add(new Department("EXTC5467", "Electrical", "Dr. Rio Jane"));
                        
                        for (Department department : departments) {
                            System.out.println("Department Code: " + department.getCode());
                            System.out.println("Department Name: " + department.getName());
                            System.out.println("Department Head: " + department.getHead());
                            System.out.println();
                        }
                    	break;
                    
                    case 3:
                        System.out.println("Display Faculty details:");
                        System.out.println();
                        List<Faculty> facultyList = new ArrayList<>();
                        System.out.println();

                        // Adding faculty members to the list
                        facultyList.add(new TeachingStaff("Dr. John Doe",  "HOD",  "Computer"));
                        facultyList.add(new TeachingStaff("Assis Prof. Robert Sen",  "Assistant Professor",  "Computer"));
                        facultyList.add(new TeachingStaff("Prof. Nikisha Jadhav", "Professor", "Computer"));
                        
                        facultyList.add(new TeachingStaff("Dr. Jame Smith",  "HOD",  "Information Technology"));
                        facultyList.add(new TeachingStaff("Assis Prof. Athang Patil ",  "Assistant Professor",  "Information Technology"));
                        facultyList.add(new TeachingStaff("Prof. Nikita Patil", "Professor", "Information Technology"));
                        
                        facultyList.add(new TeachingStaff("Dr. Joe Doen",  "HOD",  "Mechanical"));
                        facultyList.add(new TeachingStaff("Assis Prof. Akshay Acharya",  "Associate Professor",  "Mechanical"));
                        facultyList.add(new TeachingStaff("Prof. Rujhan Kazi", "Professor", "Mechanical"));
                        
                        facultyList.add(new TeachingStaff("Dr. Smith Sen",  "HOD",  "AIDS"));
                        facultyList.add(new TeachingStaff("Assis Prof. Amey Gudhekar",  "Assistant Professor",  "AIDS"));
                        facultyList.add(new TeachingStaff("Prof. Mary Nelson", "Professor", "AIDS"));
                        
                        facultyList.add(new TeachingStaff("Dr. Rane Rio",  "HOD",  "Electronics and Telecommunication"));
                        facultyList.add(new TeachingStaff("Assis prof. Robert Sen",  "Assistant Professor",  "Electronics and Telecommunication"));
                        facultyList.add(new TeachingStaff("Prof. Mary Nelson", "Professor", "Electronics and Telecommunication"));
                        
                        facultyList.add(new TeachingStaff("Dr. Rio Jane",  "HOD",  "Electrical"));
                        facultyList.add(new TeachingStaff("Assis Prof. Robert Sen",  "Assistant Professor",  "Electrical"));
                        facultyList.add(new TeachingStaff("Prof. Mary Nelson", "Professor", "Electrical"));
                      
                       
                        facultyList.add(new NonTeachingStaff("Michael Brown", "Administrative Assistant", "Administration"));
                        
                        facultyList.add(new NonTeachingStaff("Sarah Johnson", "IT Specialist", "IT Department"));
                        
                        facultyList.add(new NonTeachingStaff("Liam	Olivia" ,"Librarians" ,"Library"));
                        
                        facultyList.add(new NonTeachingStaff("Noah Emma" ,"Clerical" ,"Clerk Department"));
                        
                        facultyList.add(new NonTeachingStaff("Oliver Charlotte" ,"Accountants" ,"Accounts Department"));
                        
                        facultyList.add(new NonTeachingStaff("Jane Sen", "Admin Assistant", "Administration"));
                        
                        facultyList.add(new NonTeachingStaff("Mary Ren", "Cafeteria", "Catering Department"));
                        
                        facultyList.add(new NonTeachingStaff("Sophia Fem", "Security", "Security Department"));
                        
                        // Displaying information for all faculty members in the list
                        for (Faculty faculty : facultyList) {
                            faculty.displayInformation();
                            System.out.println("------------------");
                        }
                        break;
                    case 4:
                        System.out.println("Display Student details:");
                        System.out.println();
                        StudentManager studentManager = new StudentManager();

                        UGStudent ugStudent1 = new UGStudent("Ritika Sen", 18, "UG32", "Computer Science");
                        UGStudent ugStudent2 = new UGStudent("Rani Bagde", 20, "UG456", "Information Technology");
                        UGStudent ugStudent3 = new UGStudent("Kajal Magar", 21, "UG12", "Mechanical");
                        UGStudent ugStudent4 = new UGStudent("Pooja Patil", 22, "UG23", "AIDS");
                        UGStudent ugStudent5 = new UGStudent("Tanay Patil", 24, "UG45", "Electronics and Telecommunication");
                        UGStudent ugStudent6 = new UGStudent("Disha Wani", 25, "UG74", "Electrical");
                        
                        PGStudent pgStudent1 = new PGStudent("Riya lin", 26, "PG56", "Machine Learning ");
                        PGStudent pgStudent2 = new PGStudent("Krishna Len", 28, "PG45", "Management Information System");
                        PGStudent pgStudent3 = new PGStudent("Akshay Lathi", 30, "PG46", "Cloud Computing");
                        PGStudent pgStudent4 = new PGStudent("Vedant Patil", 25, "PG12", "Devops");

                        studentManager.addUGStudent(ugStudent1);
                        studentManager.addUGStudent(ugStudent2);
                        studentManager.addUGStudent(ugStudent3);
                        studentManager.addUGStudent(ugStudent4);
                        studentManager.addUGStudent(ugStudent5);
                        studentManager.addUGStudent(ugStudent6);
                        
                        studentManager.addPGStudent(pgStudent1);
                        studentManager.addPGStudent(pgStudent2);
                        studentManager.addPGStudent(pgStudent3);
                        studentManager.addPGStudent(pgStudent4);
                        
                        System.out.println("PG Students:");
                        System.out.println();
                        studentManager.displayAllPGStudents();
                      
                        System.out.println("UG Students:");
                        System.out.println();
                        studentManager.displayAllUGStudents();
                        //studentManager.displayAllStudents();
                        
                        break;
                        
                    case 5:
                        System.out.println("Display Classroom details:");  
                        System.out.println();
                        
                         Classroom mathClass = new Classroom("Math Class", 30);
                         Classroom physicsClass = new Classroom("Physics Class", 25);
                         Classroom devopsClass = new Classroom("Devops Class", 20);
                         Classroom MISClass = new Classroom("MIS Class", 12);
                         Classroom STQAClass = new Classroom("STQA Class" , 10);

                         mathClass.displayClassInfo();
                         System.out.println(); 
                         
                         physicsClass.displayClassInfo();
                         System.out.println();
                         
                         devopsClass.displayClassInfo();
                         System.out.println();
                         
                         MISClass.displayClassInfo();
                         System.out.println();

                         // Occupying the classrooms
                          mathClass.occupy();
                          physicsClass.occupy();
                          devopsClass.occupy();
                          MISClass.occupy();
                         
                          mathClass.displayClassInfo();
                          System.out.println(); 

                          physicsClass.displayClassInfo();
                          System.out.println(); 
                           
                          devopsClass.displayClassInfo();
                          System.out.println(); 
                           
                          MISClass.displayClassInfo();
                          System.out.println(); 

                          // Vacating the classrooms
                          mathClass.vacant();
                          physicsClass.vacant();
                          devopsClass.vacant();
                          MISClass.vacant();

                              
                          break;
                    
                    case 6:
                        System.out.println("Display Canteen menu:");
                        System.out.println();
                        Canteen canteen = new Canteen();

                        Beverage coke = new Beverage("Coca-Cola", 1.5, "Small");
                        Beverage orangeJuice = new Beverage("Orange Juice", 2.0, "Medium");
                        
                        Food pizza = new Food("Pizza", 50.0, "Main Course");
                        Food misalpav = new Food("Misal Pav" , 60.0 , "Main Course");
                        Food masaladosa = new Food("Masala Dosa" , 40.0 , "Main Course");
                       
                        Food salad = new Food("Caesar Salad", 60.5, "Appetizer");
                        Food Fries = new Food("Fries", 20.5, "Appetizer");
                        Food soups = new Food("Soups" , 30.0 , "Appetizer");
                        
                        canteen.addMenuItem(coke);
                        
                        canteen.addMenuItem(orangeJuice);
                        
                        canteen.addMenuItem(pizza);
                        
                        canteen.addMenuItem(misalpav);
                        
                        canteen .addMenuItem(masaladosa);
                        
                        canteen.addMenuItem(Fries);
                        
                        canteen.addMenuItem(salad);
                        
                        canteen.addMenuItem(soups);

                        canteen.displayMenu();
                        break;
                    
                    case 7:
                        System.out.println("Display Library details:");
                        System.out.println();
                        Library library = new Library();

                        // Adding books to the library
                        Book book1 = new Book("Math Book", "Kumbojkar");
                        
                        Book book2 = new Book("STQA",  "TechNeo");
                        
                        Book book3 = new Book("MIS",  "TechMax");
                        
                        Book book4 = new Book("Machine Learning",  "John Myles");
                        
                        Book book5 = new Book("Data Science",  "Sophia sen");
                        
                        library.addBook(book1);
                        library.addBook(book2);
                        library.addBook(book3);
                        library.addBook(book4);
                        library.addBook(book5);
                        

                        // Displaying all books in the library
                        library.displayBooks();
            	    break;
                        
                        
                    case 8:
                        System.out.println("Display Hostel details:");
                        System.out.println();
                        BoysHostel boysHostel = new BoysHostel("Boys Hostel", 20, 100); 
                        GirlsHostel girlsHostel = new GirlsHostel("Girls Hostel", 15, 50); 

                        // Perform operations on BoysHostel
                        boysHostel.displayInfo();
                        boysHostel.checkIn();
                        boysHostel.checkOut();
                        System.out.println();
                        boysHostel.displayInfo();
                        System.out.println();

                        // Perform operations on GirlsHostel
                        girlsHostel.displayInfo();
                        girlsHostel.checkIn();
                        girlsHostel.checkOut();
                        System.out.println();
                        girlsHostel.displayInfo();
                    break;
                    case 9:
                        System.out.println("Display Auditorium details");
                        System.out.println();
                        Auditorium auditorium = new Auditorium();

                        Auditorium.Event event1 = new Auditorium.Event("Workshop on AI", "2023-09-15", "6:00 PM", 120);
                        
                        Auditorium.Event event2 = new Auditorium.Event("Seminar on Gate Exam", "2023-10-20", "10:30 AM", 90);
                        
                        Auditorium.Event event3 = new Auditorium.Event("Technitude Event", "2023-11-05", "3:00 PM", 150);
                        
                        Auditorium.Event event4 = new Auditorium.Event("Orientation of Website", "2023-11-05", "3:00 PM", 180);
                        
                        Auditorium.Event event5 = new Auditorium.Event("Workshop on Cloud Computing", "2023-09-15", "6:00 PM", 120);
                        
                        Auditorium.Event event6 = new Auditorium.Event("Internship Fair", "2023-09-15", "6:00 PM", 90);

                        auditorium.addEvent(event1);
                        
                        auditorium.addEvent(event2);
                        
                        auditorium.addEvent(event3);
                        
                        auditorium.addEvent(event4);
                        
                        auditorium.addEvent(event5);
                        
                        auditorium.addEvent(event6);

                        // Get all events
                        List<Auditorium.Event> allEvents = auditorium.getAllEvents();
                        System.out.println("All Events:");
                        for (Auditorium.Event event : allEvents) 
                        {
                            System.out.println(event);
                            System.out.println();
                        }
                    
             
                        break;
                    
                    case 10:
                        System.out.println("Exiting the program");
                        break;
                        
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
            while (choice != 10);

            sc.close();
        }
            
            
            
        

        else
	    {
	        System.out.println("Authentication failed. Invalid username or password");
	    }
	}
            
            
       
	 	




	private static void printMenu() 
	{
		
		System.out.println("Menu options:");
        System.out.println("1. College details");
        System.out.println("2. Department Details");
        System.out.println("3. Faculty");
        System.out.println("4. Student");
        System.out.println("5. Classroom");
        System.out.println("6. Canteen");
        System.out.println("7. Library");
        System.out.println("8. Hostel");
        System.out.println("9. Auditorium");
        System.out.println("10. Exiting the program");
        System.out.println();
        System.out.print("Enter your choice: ");
		
	}
}	 
		
	