package wrapperclass;

public class Prmitivetype6 {

	public static void main(String[] args) {
String firstname="vishant";
String lastname=" thakur";
//String firstname=firstname+lastname;(string is immutable )
String fullname=firstname+lastname;
System.out.println(fullname);
System.out.println("length="+
fullname.length());
System.out.println(fullname.toLowerCase());
System.out.println(fullname.concat(fullname));
System.out.println(fullname.substring(2, 5));
System.out.println(fullname.toUpperCase());

	}
}