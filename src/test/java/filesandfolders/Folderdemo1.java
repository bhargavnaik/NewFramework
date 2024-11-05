package filesandfolders;

import java.io.File;

public class Folderdemo1 {

	public static void main(String[] args) {
		
		File f1=new File("C:\\Users\\DELL\\Desktop\\ECLIPSE\\xyz");
 
		System.out.println(f1.mkdir());
	}

}
