package virtualKey;

import java.io.File;
import java.io.IOException;

class Files {
	public static void createFile(String fileName) {
		//Creating File to work with
		try {
			File page = new File(fileName);
			if (page.createNewFile()) {
				System.out.println("created Book File: "+ page.getName());
			} else {
				System.out.println("File already exists");
			}
		}
		catch (IOException ex) {
			System.out.println("Error Found");
		}
	}
	
	//public static void deleteFile(String fileName)
}
