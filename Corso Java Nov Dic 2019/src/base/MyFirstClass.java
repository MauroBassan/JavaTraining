package base;

public class MyFirstClass {
	
	public static void main(String[] args) {
		byte b=10;
		Byte bw= (byte) (b*b);
		System.out.println("Byte Wrapper " + bw);
		
		short s=(short) (b*10);
		Short sw=(short)(s*s);
		System.out.println("Short Wrapper " + sw);
		
		int i=s*10;
		Integer iw= i*i;
		System.out.println("Integer Wrapper "+iw);
		
		long l=i*10;
		Long lw= l*l;
		System.out.println("Long Wrapper "+lw);
	}
}