import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Gradebook {
    
	//Treemap
	private TreeMap<String, String> Gradebook;
	//Constructor
	public Gradebook() {
		
		this.Gradebook = new TreeMap<>();
		//Puts Carl and Sarah into the gradebook
		Gradebook.put("Carl", "B+");
		Gradebook.put("Sarah", "A");
		
		
	}
	//method for menu
	public void menu() {
		
		  
     
        

			//Reads the the user input
	        Scanner pam = new Scanner(System.in);
	        //While choose is true it runs the program
	        boolean choose=true;
	        //Variable declaration
	    	String name;
	    	String grade;
;       	//While-loop
	        while(choose) {
	        	//Prompts user to enter the following:
	        	System.out.println("A)dd R)emove M)odify P)rint Q)uit");
	        	String action = pam.nextLine();
	        	//switch-case
	        	switch (action) {
	        	//If they pick "A" or "a" it adds a student to the map
	            case"A":case"a":
	            	System.out.println("Enter the students name: ");
	            	name = pam.nextLine();
	            	System.out.println("Enter the students grade: ");
	            	grade = pam.nextLine();
	            	
	            	Gradebook.put(name,grade);
	            	break;
	            	//Removes the student
	            case"R":case"r":
	            	System.out.println("Enter the name of the student");
	            	name =pam.nextLine();
	            	
	            	Gradebook.remove(name);
	            	break;
	            //Modify what is already in the list
	            case"M":case"m":
	            	System.out.println("Enter the students name: ");
	            	name = pam.nextLine();
	            	System.out.println("Enter the students grade: ");
	            	grade = pam.nextLine();
	            	
	            	Gradebook.put(name,grade);
	            	break;
	            	//Prints out all the students
	            case"P":case"p":
	            	

	                //get all entries
	                Set<Map.Entry<String, String>> entries = Gradebook.entrySet();
	                
	                //using for loop
	                for(Map.Entry<String, String> entry : entries){
	                    System.out.println( entry.getKey() + ":" + entry.getValue() );
	                }
	            	  
	            	
	            	break;
	            	
	            case"Q":case"q"://terminates
	              { 
	            	  System.out.print("See you next time!");
	                  return; 
	                  }
	              //If the user picks any other character then it defaults to Error message and prompts the user to enter a valid character
	              default:
	              { 
	            	  System.out.println("Error: Invalid character.");               
	              }
	           
	          	
	        	}
	        	
	        	
	        }

			
		}
	}
