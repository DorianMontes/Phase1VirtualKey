package virtualKey;

import java.util.List;
import java.util.Comparator;
import java.util.Collections;

class addFile {

	public static void AddFile(List<Directory> file, String newFile) {
        
	        file.add(new Directory(newFile));
	        System.out.println("File has been added! \n");
	        
	   	 	Collections.sort(file, Comparator.comparing(Directory::getFileName));
	   	 	System.out.println(file);

	}
}
