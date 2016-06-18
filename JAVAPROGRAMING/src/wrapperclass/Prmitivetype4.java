package wrapperclass;

public class Prmitivetype4 {

	public static void main(String[] args) {
		Integer a=new Integer(10);
		Integer b=new Integer(20);
		int c=a.intValue()+b.intValue();
	//	int c=Integer.parseInt(new String(""+a))+Integer.parseInt(new String(""+b));
		System.out.println("sum="+c);
	}

}
