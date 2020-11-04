import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import java.util.Scanner;
public class flatrent
{
	String name;
	String bhk;
	int people;
	int roomid;
	owner Owner ;
	protected String IDproof;
	flatrent(String flat)
	{
		IDproof = flat;
	}
	
       flatrent(String name,String bhk,int people,int r1,owner Owner)
	{
			this.name=name;
			this.bhk=bhk;
			this.people=people;
			roomid=r1;
		this.Owner=Owner;
	}
	public void getroomid()
	{
		if(roomid==1)
		{
			System.out.println("Room 101 is Booked");
		}
		else if(roomid==2)

		{
			System.out.println("Room 201 is Booked");
			
		}
		else if (roomid==3)

		{
			System.out.println("Room 301 is Booked");
			
		}
		else
		{
			System.out.println("Wrong Input");
			
		}
	}

	public static void stringTest(){
		String s1="**********************THANK ";
		String s2="YOU**********************"; 
		String s3=s1.concat(s2);
		System.out.println(s3);
  
		}
	public static void stringBufferTest(){ 
		StringBuffer sb = new StringBuffer("******************HAVE A PLEASENT STAY ");
		sb.append("WITH US*********");
		System.out.println(sb);
		} 
		
public static void main(String args[])
	{
		String name;
		String bhk;
		int people;
		int r1,r2;
		final StringBuilder payment = new StringBuilder("Cash"); 
		owner Owner = new owner("Akshay","8129405010");
		Scanner sc=new Scanner(System.in);
		entry.cust s1 = new entry.cust();    
		entry obj[] = new entry[1];
		entry.change();                
		s1.show();
		obj[0]=new entry(args[0],30);  
		System.out.println("");
		System.out.println("Enter Your Name");
		name=sc.nextLine();
		System.out.println("Enter BHK needed");
		bhk=sc.nextLine();
		System.out.println("Enter Number of People Staying");
		people=sc.nextInt(); // This is the place yes
                      String names[]=new String[people];
                       sc.nextLine();
		
		for(int i=0;i<people;i++)
		{
		 	if(i==0)
			 names[i]=name;
	
			else{
System.out.println("Enter the name of the Person "+(i+1));
			names[i]=sc.nextLine();}
                       }

		System.out.println("Enter 1 for First Floor");
		System.out.println("Enter 2 for Second Floor");
		System.out.println("Enter 3 for Third Floor");
		r1=sc.nextInt();	
		flatrent br= new flatrent(name,bhk,people,r1,Owner);
		br.getroomid();
		obj[0].display("ROOM IS READY");
		System.out.println("Mode of Payment: "+payment);
		System.out.println("Owner Name: "+br.Owner.ownname);
		System.out.println("Owner Number: "+br.Owner.ownnum);
		stringTest();
		stringBufferTest(); 		
	}

}

class owner 
{
  
  String ownname;
  String ownnum;
  
  owner(String ownname, String ownnum) {
    this.ownname = ownname;
    this.ownnum = ownnum;
  }
}
class entry extends flatrent
{
	static String receptionist = "James"; 
	static void change()
	{
		receptionist = "James";
	}
	static { System.out.println("**********************We Welcome You TO**********************");}    
	entry(String flat, int password)
	{
		super(flat);
		int p= password;
	}
	entry(String flat, int password, int entryid)     
	{
		super(flat);
		int p=password;
		int entid= entryid;
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	void display()
	{
		System.out.println(IDproof);
		System.out.println(dtf.format(now));	
		System.out.println(dtf.format(now));

	}
	void display(String status)               
	{
		System.out.println("\n"+"Receptionist incharge : "+receptionist+"\n"+"ID Submitted : "+IDproof);
		System.out.println("Booking Time: "+dtf.format(now));
		System.out.println("Room Status : "+status); 
        	
		 
	}
	static class cust    
	{
		void show()
		{
			System.out.println(".......................MAKHANA TOWERS.......................");
		}
	}
	
}
