import java.util.*;
import javax.swing.JOptionPane;

public class PersonTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Person personT = new Person();
		String name = JOptionPane.showInputDialog("Enter Your name");;
		personT.setName(name);

		String surname = JOptionPane.showInputDialog("Enter Your Surname");
		personT.setSurname(surname);

		String cellphone = JOptionPane.showInputDialog("Enter Your Cellphone");
		personT.setCellphone(cellphone);
		
		String occupation = JOptionPane.showInputDialog("Enter Your Occupation");
		personT.setOccupation(occupation);

		String age = JOptionPane.showInputDialog("Enter Your Age");
		int dijara = Integer.parseInt(age);
		personT.setAge(dijara);
		
		JOptionPane.showMessageDialog(null,"\r\n\r\nYour Information "+personT.getName()+" " +personT.getSurname()+"\r\n"+personT.toString());
	}
}