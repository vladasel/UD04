
public class ej5 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		b = c;
		c = a;
		a = d;
		d = b;
		System.out.println(a+" "+b+" "+c+" "+d);
	}

}
