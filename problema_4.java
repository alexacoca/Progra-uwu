import javax.swing.JOptionPane;

public class problema_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * */
		
		
		int x, y, z, num;
		
		x=0;
		y=1;
		z=x+y;
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"numero?"));
		
		if (num<=1) {
			if (num==0)
				System.out.print(x);
			else
				System.out.print(x+", "+y+", "+z);
		}
		
		
		else {
		System.out.print(x+", "+y+", "+z);
		
		while (z+y<=num) {
			x=y;
			y=z;
			z=x+y;
			System.out.print(", "+z);
		}			
			
		}
		
		
		

	}

}
