// package abstraction;
import java.util.Scanner;
public class Casestudy_ticket_booking {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Booking3 b=new Booking3();
		b.book();
		}
	}
interface reg1{
    public  void book(String name, String address, String contact, String email,String prooftype,String proofid);
}
interface tot2{
    public  void reg(String name,String address,String contact,String email,String prooftype, String proofid);
}
class Booking3 implements reg1{
	static int booked[]=new int[25];
	static void book() {
		Scanner s=new Scanner(System.in);
	      System.out.println("Registration");
	    System.out.println("Enter your name");
	  String name=s.nextLine();
	     System.out.println("Enter your address");
	   String  address=s.nextLine();
	     System.out.println("Contact Number");
	 String  contact=s.nextLine();
	  System.out.println("E-Mail ID");
	  String   email=s.nextLine();  
	     System.out.println("Enter proof type");
	   String  prooftype=s.nextLine();  
	     System.out.println("Enter proof id");
	String proofid=s.nextLine();  
	   Customer cust=new Customer(name,address,contact,email,prooftype,proofid);
	    cust.reg(name,address,contact,email,prooftype,proofid);
	  }
	@Override
	public void book(String name, String address, String contact, String email, String prooftype, String proofid) {
		

	}
	}

	class Customer implements tot2

	{	Scanner s=new Scanner(System.in);
	String pr="";
	String email1;
		static int booked[]=new int[25];
	    	String name;
	        String address;
	        String contact; 
	  		String email; 
	  		String prooftype; 
	 		String proofid;
	  Customer(String name,String address,String contact,String email,String prooftype,String proofid)
	  {
	    this.name=name;
	      this.address=address;
	      this.contact=contact;
	      this.email=email; 
	    this.prooftype=prooftype;
	     this.proofid= proofid;
	  }
	  public void reg(String name,String address,String contact,String email,String prooftype, String proofid )
	  {
	    System.out.println("Customer Details");
	    System.out.println(name);
	    System.out.println(address);
	    System.out.println(contact);
	    System.out.println(email);
	    System.out.println(prooftype);
	    System.out.println(proofid);
	    System.out.println("Thank you for registering. Your id is 1...");
	    System.out.println("Do you want to continue registration?(y/n)");
	    pr = s.next();
		if (pr.equals("n")==true || pr.equals("y")==true)
		{	
	    System.out.println("Do you want to update the email id?(y/n)");
	    String ye=s.next();
	    if(ye.equals("y")==true) {
	    System.out.println("Update Email");		
	    System.out.println("Enter new Email id:");
		email1=s.next();
		email=email1;
	    System.out.println("Email updated");
}
	    System.out.println("Your details are as follows");
	    System.out.println("Name		  :	"+name);
	    System.out.println("Address 	  :	"+address);
	    System.out.println("Contact Number	  :	"+contact);

	    System.out.println("E-Mail ID	  :	"+email);
	    System.out.println("Proof type	  :	"+prooftype);
	    System.out.println("Proof id	  :	"+proofid);
		}



	  }
	}