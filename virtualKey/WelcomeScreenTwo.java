package virtualKey;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WelcomeScreenTwo implements Screen{
	
    private ArrayList<String> options2 = new ArrayList<>();

	
	public WelcomeScreenTwo() {
		options2.add("1. Add a File");
        options2.add("2. Delete a File");
        options2.add("3. Search a File");
        options2.add("4. Return to previous menu");
	}
	
	@Override
    public void ShowMainScreen(List<Directory> file) {
    	System.out.println("Select an option you wish to perform on a File: \n");
		for (String s : options2)  {
            System.out.println(s);
        }
		try {
			Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        if(options > 4 || options < 1) {
            	System.out.println("\n [" + options + "] is not a valid option. please try again \n");
            	ShowMainScreen(file);
            }
	        for(int j=1;j<=options2.size();j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                    	//add a File
	                		System.out.println("Type in the name of the file you wish to create: ");
	                        Scanner sss = new Scanner(System.in);
	                        String  newFile =  sss.nextLine();
	                    	addFile.AddFile(file, newFile);
	                    	ShowMainScreen(file);
	                        break;
	                    case 2:
	                    	//delete a File
	                    	System.out.println("Which File do you wish to search for?: \n");
	            			Scanner s = new Scanner(System.in);
	            	        String  d =  s.nextLine();
	            	        deleteFile.DeleteFile(file, d);
	                    	ShowMainScreen(file);
	                        break;
	                    case 3:
	                    	//Search for a File
	                    	System.out.println("Which File do you wish to Delete?: \n");
	            			Scanner ss = new Scanner(System.in);
	            	        String  f =  ss.nextLine();
	            	        
	            	        searchFile.SearchFile(file, f);
	                    	ShowMainScreen(file);
	                        break;
	                    case 4:
	                    	WelcomeScreen screen = new WelcomeScreen();
	                		screen.ShowMainScreen(file);
	                		break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
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
