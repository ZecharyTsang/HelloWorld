import javax.swing.*;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "";
		int x = 0;
		
		
		input = JOptionPane.showInputDialog("Enter an integer.");
		x = Integer.parseInt(input);
		
		if(x < 10) {
			System.out.println("Hello World");
		}else {
			System.out.println("Goodbye World");
		}
		
		for(int counter = 0; counter <= x; counter++) {
			for(int counter2 = 0; counter2 <= counter; counter2++) {
				System.out.print("*");

			} //for
			System.out.println();
		} //for
	}

}
