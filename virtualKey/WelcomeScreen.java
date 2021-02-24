package virtualKey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Collections;
import java.util.stream.Collectors;


public class WelcomeScreen implements Screen{
    
    private ArrayList<String> options1 = new ArrayList<>();

    public WelcomeScreen() {
    	options1.add("1. View the Sorted File Directory");
    	options1.add("2. Work with an existing or new File");
    	options1.add("3. Close Application");
    }
    
    
    
    @Override
    public void ShowMainScreen(List<Directory> file)
    {
        System.out.println("\n");
        System.out.println("Select an option you wish to perform: \n");
        for (String s : options1)  {
            System.out.println(s);
        }
        try {
	        Scanner sc = new Scanner(System.in);
	        int  option =  sc.nextInt();
	        if(option > 3 || option < 1) {
            	System.out.println("\n [" + option + "] is not a valid option. please try again \n");
            	ShowMainScreen(file);
            }
	        for(int j=1;j<=options1.size();j++){
	            if(option==j){
	                switch (option){
	                    case 1:
	                    	//Sort
	                   	 	Collections.sort(file, Comparator.comparing(Directory::getFileName));
	                   	 	System.out.println("Here is the Available Sorted Directory: \n" + file);
	                   	 	ShowMainScreen(file);
	                        break;
	                    case 2:
	                    	//edit an existing or new file
	                    	WelcomeScreenTwo screen = new WelcomeScreenTwo();
	                		screen.ShowMainScreen(file);            	
	                        break;
	                    case 3:
	                    	//Exit Application
	                    	System.out.println("Closing your application... \nThank you!");
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        ShowMainScreen(file);
	                        break;
	                }
	            }
	        }
        }
        catch (InputMismatchException ex) {
        	System.out.println("\n Option selection invalid. \n Please select option by typing an integer \n");
        	ShowMainScreen(file);
        }
    }
}

