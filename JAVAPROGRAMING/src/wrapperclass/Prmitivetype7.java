package wrapperclass;

public class Prmitivetype7 {

	public static void main(String[] args) {
 String value1="apple";
 String value2="APPLE";
 
 if(value1.equals(value2)){
	 System.out.println("strings are equal");
 }
 else{
	 System.out.println("values are not equal");
 }
 if(value1.equalsIgnoreCase(value2)){
	 System.out.println("strings are equal");
 }
 else{
	 System.out.println("values are not equal");
 }
 
	}
}