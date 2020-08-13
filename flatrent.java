import java.util.Scanner;
class flatrent
{
	String name;
	String bhk;
	int people;
	int roomid;
	
	public flatrent(String name,String bhk,int people,int r1)
	{
			this.name=name;
			this.bhk=bhk;
			this.people=people;
			roomid=r1;
			
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


	public static void main(String args[])
	{
		String name;
		String bhk;
		int people;
		int r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
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
System.out.println("Enter the name of the person "+(i+1));
			names[i]=sc.nextLine();}
                       }

		System.out.println("Enter 1 for First Floor");
		System.out.println("Enter 2 for Second Floor");
		System.out.println("Enter 3 for Third Floor");
		r1=sc.nextInt();	
		flatrent br= new flatrent(name,bhk,people,r1);
		br.getroomid();
		
	}
		
}


