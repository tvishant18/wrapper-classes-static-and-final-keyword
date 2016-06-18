package wrapperclass;

public class Prmitivetype {

	public static void main(String[] args) {
		int a=10;//primitive type
		Integer b=new Integer(20);
		//int c=a+b;compatible due to autoboxing feature in java 1.5 nd upwards versions
		int c=a+Integer.parseInt(new String(""+b));
		System.out.println("sum="+c);
	}

}
