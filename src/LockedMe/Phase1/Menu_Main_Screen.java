package LockedMe.Phase1;

import java.io.IOException;
import java.util.Scanner;
public class Menu_Main_Screen {

	public static void chooseOption() throws IOException {
			System.out.println("WELCOME to LockedMe.com: Lockers Pvt. Ltd.");
			System.out.println("==========================================");
			System.out.println("Developed by : Minal Cheema");
			
			System.out.println("Please follow the instructions provided below to use the application.");

			System.out.println("1.	List all the files in a specified directory.");
			System.out.println("2.	Add a new file.");
			System.out.println("3.	Remove an existing file.");
			System.out.println("4.	Search a specific file.");
			System.out.println("9.	Close the application.");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please enter the number provided for the function you want to perform: ");
			int option = sc.nextInt();
			
			switch (option) {
			case 1: {
				Get_FileNames listEntries = new Get_FileNames();
				listEntries.getList();
				break;
			}
			case 2: {
				Add_New_File addFile = new Add_New_File();
				addFile.newFile();
				break;
			}
			case 3: {
				Remove_File removeFile = new Remove_File();
				removeFile.deleteFile();
				break;
			}
			case 4: {
				Search_File searchFile = new Search_File();
				searchFile.searchFile();
				break;
			}
			case 9: {
				System.exit(1);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option + ". Please select a number from given options");
			}
		}
	}
