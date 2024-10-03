package multiplicationtable;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int rows=10;//Number of rows
   int columns=10;//Number of columns
   //Print header row
   System.out.print("|");
   for(int i=1;i<=rows;i++) {
	   System.out.print(i+"");
   }
   System.out.println();
   //Print separation line
   for(int i=0;i<=columns;i++) {
	   System.out.print("---");
   }
   System.out.println();
   //Print multiplication table
   for(int i=1;i<=rows;i++) {
	   System.out.print(i+"|");
	   for(int j=1;j<=columns;j++) {
		   System.out.print(i*j+"");
	   }
	   System.out.println();
   }
   }
}
	


