
import java.util.*;
public class SQL_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How many tables do you want to work on?");
		int tables = scan.nextInt();
		for(int j = 0; j < tables; j++)
		{
			System.out.println("Please enter number of tuples in the table");
			
			int num = scan.nextInt();
			String[] list = new String[num];
			System.out.println("Please enter name of table:");
			String name = scan.next();
			scan.nextLine();
			System.out.println("Insert tuples:");
			for(int i = 0; i < num; i++)
			{
				String tuple = scan.nextLine();
				list[i] = tuple;
			}
			
			for(int i = 0; i < list.length; i++)
			{
				System.out.println("INSERT INTO	" + name);
				System.out.println("VALUES	  (" + list[i] + ");");
				System.out.println();
				System.out.println();
			}
		}
		scan.close();
	}

}
