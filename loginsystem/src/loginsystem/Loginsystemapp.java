package loginsystem;
import java.util.Scanner;

public class Loginsystemapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	
		System.out.println("Login System");
		
		System.out.println("Enter Your Username");
		String username=input.nextLine();
		
		System.out.println("Enter Your Password");
		String password=input.nextLine();
		
		String correct_username="jessie";
		String correct_password="1234";
		
		if (username.equals(correct_username)&& password.equals(correct_password)) {
			System.out.println("correct credentials");
		}else {
			System.out.println("wrong credentials");
		}
		
		
		
		
		
		
				

	}

}
