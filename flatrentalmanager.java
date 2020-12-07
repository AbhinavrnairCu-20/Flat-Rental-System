import java.util.Scanner;
import java.util.*;

public class flatrentalmanager
{
	void manager()
{
      int  nop, bhk;    
      int  price = 0;   
      char choice;     
      int pl[]= {1000,2000,3000,4000};
      String n[]= {"1 BHK","2 BHK","3 BHK","4 BHK"};
      List<Integer> pricearray = new ArrayList<Integer>();
      List<String> list=new ArrayList<String>(); 
      Scanner console = new Scanner(System.in);

      do
      {
         // Getting the value from the user.
         System.out.print("Enter Number of People: ");
         nop = console.nextInt();
	 System.out.println("Enter BHK: ");
	 bhk = console.nextInt();
         for(int i=0; i<10; i++)
	 {
	   if(nop == i){
	    int p = pl[nop];
	    price = price + (bhk * p);
	    list.add(n[nop]);
	    pricearray.add(bhk*p);
			}
	    //else{ System.out.println("Item does not exist in our Building!");
		  //System.exit(0);}
	 }	
	
         System.out.println("Add next item?(Y for yes or N for no): ");
         choice = console.next().charAt(0);
       }
      while ((choice == 'y') || (choice == 'Y'));
     
      System.out.println("Total amount to be paid : "+ price);
      System.out.println("Bill Generated");
      System.out.println("Purchased                                 Price(Rs)");
      System.out.println("--------------------------------------------");
      for (int i = 0 ; i < list.size(); i++) {System.out.println( list.get(i)+"                                "+pricearray.get(i)) ;}
}


public static void main(String[] args)
{
      flatrentalmanager ma= new flatrentalmanager();
      ma.manager();
}

}