import java.util.Scanner; 
import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   

public class flatrentalbill
{     List<Integer> pricearray = new ArrayList<Integer>();
      List<String> list=new ArrayList<String>(); 
      int  price = 0;
      protected String manager = "Akshay";
 public void recep()
{
      int  nop, bhk;    
      char choice;     
      int pl[]= {1000,2000,3000,4000};
      String n[]= {"1 BHK","2 BHK","3 BHK","4 BHK"};
      Scanner console = new Scanner(System.in);
      do
      {
         System.out.println("Rooms Available:" + n);
	 // Get the value from the user.
         System.out.print("Enter Number of People: ");
         item = console.nextInt();
	 System.out.println("Enter bhk: ");
	 quantity = console.nextInt();
         for(int i=0; i<4; i++)
	 {
	   if(nop == i){
	    int p = pl[nop];
	    price = price + (bhk * p);
	    list.add(n[item]);
	    pricearray.add(nop*p);
			}
	    //else{ System.out.println("Room does not exist!");
		  //System.exit(0);}
	 }	
	
         System.out.print("Book Another Room ?(Y for yes or N for no): ");
         choice = console.next().charAt(0);
       }
      while ((choice == 'y') || (choice == 'Y'));
     
      
      System.out.println("Bill Generated");
      System.out.println("--------------------------------------------");
     
}

 	private void details(){
	int OutletId = 710365;
	int CashierID = 156543;
	}

void generatebill(){
		System.out.println("Purchased                          Price(Rs)");
      		System.out.println("--------------------------------------------");
     		for (int i = 0 ; i < list.size(); i++) {System.out.println( list.get(i)+"                                "+pricearray.get(i)) ;}
		System.out.println("Total                              "+price);
}


public static void main(String[] args)
{
      outlet ma= new outlet();
      ma.manager();
      ma.display();
      ma.generatebill();
      //ma.details();
}

}

class outlet extends flatrentalbill{
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
void display(){System.out.println(manager); 
System.out.println(dtf.format(now));}

}