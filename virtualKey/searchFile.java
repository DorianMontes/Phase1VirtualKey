package virtualKey;

import java.util.List;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class searchFile {

	public static void SearchFile(List<Directory> file, String searched) {
        List<String> searchDirectory = 
				file.stream()
             	 	.filter(d->d.getFileName().matches(searched))
             		.map(Directory::getFileName)
             		.collect(Collectors.toCollection(ArrayList::new));
        if(searchDirectory.size()>0) {
             System.out.println("your searched File is in the directory: \n" + searchDirectory + "\n");
        }
        else {
             System.out.println("file is not in the directory. \n (Be sure to check Case Sensitivity when searching) \n");
        }
	}
}
