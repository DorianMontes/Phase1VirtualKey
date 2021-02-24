package virtualKey;

import java.util.ArrayList;
import java.util.List;

class VirtualMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("************************");
        System.out.println("Welcome to VirtualKey!");
        System.out.println("Developer: Dorian Montes");
        System.out.println("************************");
        System.out.println("\n");
        List<Directory> fileList = new ArrayList<Directory>();
        
        fileList.add(new Directory("Winnie the Pooh"));
        fileList.add(new Directory("Homework"));
        fileList.add(new Directory("To Do List"));
        fileList.add(new Directory("BucketList"));

		WelcomeScreen screen = new WelcomeScreen();
		screen.ShowMainScreen(fileList);
	}



}
