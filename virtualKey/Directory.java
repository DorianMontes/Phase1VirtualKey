package virtualKey;

public class Directory {
	private String fileName;
	
	public Directory(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	@Override
	public String toString() {
		return " " + fileName;
	}	
}
