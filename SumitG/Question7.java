/* → WAP to print number of days gape in your age as enter DD-MM-YYYY with current system date? */

     import java.text.*;   
   import java.util.*;  
    public class Question7 { 

      public static void main(String[] args)
       { 
        Scanner scanner = new Scanner(System.in); 
        // Get user input for birthdate 
        System.out.print("Enter your birthdate (DD-MM-YYYY): ");    
        String birthdateInput = scanner.next(); 
        try { 
            // Calculate and print the age difference in days        
       int ageDifference = calculateAgeDifference(birthdateInput);        
        System.out.println("Number of days gap in your age: " + 
                    ageDifference + " days"); 
        } catch (ParseException e) { 
            System.out.println("Invalid date format. Please enter the date in DD-MM-YYYY format."); 
        } 
    } 
    private static int calculateAgeDifference(String birthdate) throws  ParseException 
     { 
        // Get the current system date 
        Date currentDate = new Date(); 
        // Define the date format for parsing 
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
        // Convert the input birthdate string to a Date object 
        Date birthdateObj = dateFormat.parse(birthdate); 
        // Calculate the age difference in days     
      long ageDifferenceInMillis = currentDate.getTime() - birthdateObj.getTime();    
       int ageDifferenceInDays = (int) (ageDifferenceInMillis / (24 * 60 * 60 * 1000)); 
        return ageDifferenceInDays; 
    } 
} 
