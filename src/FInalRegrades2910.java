import java.io.File;


public class FInalRegrades2910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		File dir = new File("C:\\Users\\danin\\Downloads\\A2_Java_Rename");
		File[] directoryListing = dir.listFiles();
		boolean flag = false;
		File rename;
		//loop through each file
		for (int i = 0; i < directoryListing.length; i++) {
			//set the new name of the file to remove the first 16 characters
			rename = new File("C:/Users/danin/Downloads/A2_Java_Rename/" + directoryListing[i].getName().substring(16));
			flag = directoryListing[i].renameTo(rename);
			//print out the names of the files for testing
			System.out.println(directoryListing[i].getName());
			if (flag == true) {
				//if the rename was successful
	            System.out.println("File " + i + " Successfully Rename");
	        }
	        // if renameTo() return false then else block is
	        // executed
	        else {
	            System.out.println("Operation Failed");
	        }
		}

	}

}
