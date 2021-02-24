package virtualKey;

import java.util.List;

class deleteFile {


	public static void DeleteFile(List<Directory> file, String delete){
	
		int size1 = file.size();
		file.removeIf(files -> files.getFileName().contains(delete));
		int size2 = file.size();
		
		
		if(size1 != size2 ) {
			System.out.println("file named [" + delete + "] deleted from the Directory \n");
		}
		else {
			System.out.println("file named [" + delete + "] is not present in the Directory");
		}
	}
}
