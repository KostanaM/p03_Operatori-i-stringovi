package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		
		byte b = 123;
		System.out.println("Vrednost promenjive b  je: " + b);

		short s = 12345;
		System.out.println("Vrednost promenjive s  je: " + s);

		int i = 123456789;
		System.out.println("Vrednost promenjive i  je: " + i);

		long l = 123456789123456789L;
		System.out.println("Vrednost promenjive l  je: " + l);

		long ll = 1234_5678_9012_12L;
		System.out.println("Vrednost promenjive ll je: " + ll);

		float f = 25.05f;
		System.out.println("Vrednost promenjive f  je: " + f);

		// inicijalizacija se zavrsava slovom f ili F

		float F = 123.123F;
		System.out.println("Vrednost promenjive F  je: " + F);

		double d = 12345.12345d; // zavrsava se sa slovom d ili D
		System.out.println("Vrednost promenjive d  je: " + d);
		System.out.println(d);

		boolean bln = true;
		boolean blen = false;
		System.out.println(bln);
		System.out.println(blen);

		char znak = '%';
		System.out.println(znak);

	}

}
