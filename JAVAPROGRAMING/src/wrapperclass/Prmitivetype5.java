package wrapperclass;

public class Prmitivetype5 {

	public static void main(String[] args) {
		String fruit="apple";
		System.out.println(fruit);
//---------------------------------------------------------------------------------------		
		String fruit1=fruit;
		System.out.println(fruit1);
//-----------------------------------------------------------------------------------------		
		String fruit2=new String("orange"); 
		System.out.println(fruit2);
//------------------------------------------------------------------------------------------
		String fruit3=new String(fruit2);
		System.out.println(fruit3);
	}

}
