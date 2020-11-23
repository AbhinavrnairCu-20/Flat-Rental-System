import java.util.*;
import java.sql.Timestamp;    
import java.util.Date; 
import java.util.ArrayList;
import java.util.List;   
import java.util.Scanner;
import Allot.allotme;
public class Allot 
{
static final int allotted=20;
static int total= 100;
static void display() {
System.out.println("Now Total Rooms Remaining = " + (total -(allotted +1)));
}
}
class Rent {

	int Rent;
	int Water;
	int Electricity;
	Rent() {
	}
	Rent(int r, int w, int e) {
		Rent = r;
		Water = w;
		Electricity = e;
	}
	void getDefinitTotal() {
		System.out.println("Total Rent : " + (Rent + Water + Electricity) + "Rs");
	}
}
class Room {
  public String studyroom;
  public int roomNo;
  Room(String name, int number) {
    this.studyroom = name;
    this.roomNo = number;
  }
}
class Makhana {
  private final List < Room > rooms;
  Makhana(List < Room > rooms) {
    this.rooms = rooms;
  }
  public List < Room > getTotalRoomsInMakhana() {
    return rooms;
  }
}
class BasicCharge extends Rent {

	double weight;
	BasicCharge() {
	}
	BasicCharge(int r, int w, int e) {
		super(r, w, e);
	}
}
class  OwnerDetails 
{
    public void disp(String ak)
    {
	 System.out.println("---------------------------------------");
         System.out.println("\t"+ak);
    }
    public void disp(String co ,Long num)  
    {
         System.out.println(co);
	 System.out.println("Contact Number:"+num);
    }
}

abstract class mess{
  public abstract void Numberofdays();
}
class food extends mess{
   public void Numberofdays(){
     System.out.println("Enter Number of Times a day :");  
     Scanner sc=new Scanner(System.in);
	 int times = sc.nextInt();
	 int onemeal = 1800;
	 int twomeal = 2000;
	 int threemeal = 2100;
	 System.out.println("Enter Number of Days :"+times); 
	 if (times == 0)
	 {
		 System.out.println("No Mess");
	 }
	 if (times == 1) 
	 {
		 System.out.println("Amount is:" + onemeal);
	 }
	 else if (times == 2) 
	 {
		 System.out.println("Amount is:" + twomeal);
	 }
	 else if (times == 3)
	 {
		 System.out.println("Amount is:" + threemeal);
	 }
	 else
	 {
		 System.out.println("nothing");
	 }
  }
}
interface Tentantextra {
  public void tentantinfo();
interface GaurdianDetail {
  public void gaurdianinfo();
class Extrainfo implements Tentantextra, GaurdianDetail {
  public void tentantinfo() {
	  Scanner sc = new Scanner(System.in);
	String mail;
	String blood;
    System.out.println("/t/t" + "Additional Information");
	System.out.println("Mail ID :");
	mail=sc.nextLine();
	System.out.println("Blood Group :");
	blood=sc.nextLine();
  }
  public void gaurdianinfo() {
	Scanner sc = new Scanner(System.in);
	String GaurdianName;
	String Contactnum;
	String relation;
    System.out.println("/t" + "Gaurdian Contact");
	System.out.println("Name");
	GaurdianName=sc.nextLine();
	System.out.println("Gaurdian Contact Number");
	Contactnum=sc.nextLine();	
	System.out.println("Relation");
	relation=sc.nextLine();
  }
}
}
}
class flatrent 
{
	static{
System.out.println("**********************We Welcome You TO**********************");
System.out.println(".......................MAKHANA TOWERS.......................");
} 

   public int EmpID;
   public int TIDNum;
   public String EmpName;
   public String TID;
   public String TName;
   
   flatrent()
   {
       this.EmpID = 001;
       this.EmpName = "James";
   }
   flatrent(String TenantID, String TenantName , int TenantIDNum)
   {
       TID= TenantID ;
       TName= TenantName ;
       TIDNum = TenantIDNum ;
   }
   public int getEmpID() {
       return EmpID;
   }
   public String getTID() {
       return TID;
   }
	
   public void setTID(String TID) {
       this.TID = TID;
   }
   public String getEmpName() {
       return EmpName;
   }
   public String getTName() {
       return TName;
   }
   public void TName(String TName) {
       this.TName = TName;
   }
   public int getTIDNum() {
       return TIDNum;
   }
   public void TIDNum(int TIDNum) {
       this.TIDNum = TIDNum;
   }

   public static void main(String args[])
   {
	   
       flatrent myobj = new flatrent();
       System.out.println("Employee ID is: "+myobj.getEmpID());
       System.out.println("Employee Name is: "+myobj.getEmpName());
       System.out.println("------------------------------");
       System.out.println("Allotted So Far = " + (Allot.allotted));
       System.out.println("------------------------------");
       Scanner sc= new Scanner(System.in);      
       System.out.print("Enter Tenant ID Proof Submitted- ");
	   String a= sc.nextLine();
       System.out.print("Enter Tenant Name ");  
       String b= sc.nextLine();  
       System.out.print("Enter Tenant ID number number- ");
       int c= sc.nextInt();  
       flatrent myobj2 = new flatrent(a, b, c);
       System.out.println("------------------------------");
       System.out.println("Tenant ID Subumitted is is: "+myobj2.getTID());
       System.out.println("Tenant Name: "+myobj2.getTName());
       System.out.println("Tenant ID Numberis: "+myobj2.getTIDNum()); 
       System.out.println("------------------------------");
	   Extrainfo myObj4 = new Extrainfo();
       myObj4.tentantinfo();
       myObj4.gaurdianinfo();
	   System.out.println("------------------------------");
	   mess p = new food();
	   p.Numberofdays();
	   System.out.println("------------------------------");
	   sharedPrinter printer = new sharedPrinter();
	   alreadybookedThread alreadybookedThread = new alreadybookedThread(20, printer);
	   alreadybookedThread.setName("Already Booked by New Students");
	   facultyThread facultyThread = new facultyThread(20, printer);
	   facultyThread.setName("Continued By Old Students:");
	   alreadybookedThread.start();
	   facultyThread.start();
	   System.out.println("------------------------------");
       Allot obb202 = new Allot();
	   obb202.display();
       System.out.println("------------------------------");
	   BasicCharge mb1 = new BasicCharge(10, 10, 10);
	   System.out.println("Monthly Rent " + mb1.Rent);
	   System.out.println("Water Charge " + mb1.Water);
	   System.out.println("Electricity Charge :" + mb1.Electricity);
	   mb1.getDefinitTotal();
       System.out.println("------------------------------");
       String Sa = String.join("BILLED","BY");
	   System.out.println(Sa);
	   System.out.println("RECIPIONIST" +"  " +args[0]);
       System.out.println("------------------------------");
       Timestamp ts=new Timestamp(System.currentTimeMillis());  
       Date date=ts;  
       System.out.println("Billing Time :"+date);
	   System.out.println("------------------------------");
	   Room room1 = new Room("Dining Hall", 29 );
	   Room room2 = new Room("Manager 1", 2);
       Room room3 = new Room("Manager 2", 92);
	   System.out.println("------------------------------");
	   System.out.println("\t\t" + "FLAT INFO" );
       List < Room > books = new ArrayList < Room > ();
       books.add(room1);
       books.add(room2);
       books.add(room3);
       Makhana Makhana = new Makhana(books);
       List < Room > rooms = Makhana.getTotalRoomsInMakhana();
	   for (Room room: rooms) {
		   System.out.println("Location of  " + room.studyroom + " is: " + room.roomNo);
		   }
		   StringBuffer sb=new StringBuffer("HAVE A PLASENT STAY");  
		   sb.append("   "+b);
			System.out.println("You have been given Room 21");
		   System.out.println(sb); 
		   OwnerDetails obj = new OwnerDetails();
		   obj.disp("Owner Details");
		   obj.disp("Akshay Mohan",123456789L);
   }
}
class alreadybookedThread extends Thread
{
int limit;
sharedPrinter printer;
public alreadybookedThread(int limit, sharedPrinter printer)
{
this.limit = limit;
this.printer = printer;
}
@Override
public void run() 
{
int AlreadyBooked = 1;        //First alreadybooked number is 1
while (AlreadyBooked <= limit)
{
printer.printalreadybooked(AlreadyBooked);       //Calling printalreadybooked() method of SharedPrinter class
AlreadyBooked = AlreadyBooked + 2;         //Incrementing to next alreadybooked number
}
}
}
class facultyThread extends Thread
{
int limit;
sharedPrinter printer;
public facultyThread(int limit, sharedPrinter printer)
{
this.limit = limit;
this.printer = printer;
}
@Override
public void run() 
{
int Faculty = 2;           //First faculty number is 2
while (Faculty <= limit)
{
printer.printfaculty(Faculty);          //Calling printfaculty() method of SharedPrinter class
Faculty = Faculty + 2;           //Incrementing to next faculty number
}
}
}
class sharedPrinter
{
boolean isalreadybookedPrinted = false;

synchronized void printalreadybooked(int number)
{
while (isalreadybookedPrinted)
{
try
{
wait();
} 
catch (InterruptedException e)
{
e.printStackTrace();
}
}
System.out.println(Thread.currentThread().getName()+" : "+number);
isalreadybookedPrinted = true;
try
{
Thread.sleep(500);
} 
catch (InterruptedException e) 
{
e.printStackTrace();
}
notify();
}
synchronized void printfaculty(int number)
{
while (! isalreadybookedPrinted)
{
try
{
wait();
}
catch (InterruptedException e) 
{
e.printStackTrace();
}
}
System.out.println(Thread.currentThread().getName()+" : "+number);
isalreadybookedPrinted = false;
try
{
Thread.sleep(500);
} 
catch (InterruptedException e) 
{
e.printStackTrace();
}
notify();
}
}
