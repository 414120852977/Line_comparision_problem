
public class uc1 {
	public static void main(String[] args) {
		int X1=1;
		int X2=2;
		int Y1=3;
		int Y2=-6;
		int lengthofline=0;
		
		lengthofline=(int) Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
		System.out.println("length of line :"+lengthofline);
	}

}
