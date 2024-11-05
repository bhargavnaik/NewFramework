package filesandfolders;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\DELL\\Desktop\\ECLIPSE\\abc.txt");
 
		System.out.println(file.createNewFile());
	}

}
