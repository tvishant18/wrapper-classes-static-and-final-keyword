package wrapperclass;

public class BufferedString {

	public static void main(String[] args) {
    StringBuffer name=new StringBuffer("vishant");
	name.append(" thakur");
	System.out.println("fullname"+name);
	System.out.println(name.toString().toUpperCase());
	System.out.println("length="+name.toString().length());
	System.out.println("length="+name.length());
	System.out.println(name.substring(4, 9));
	System.out.println("reverse="+name.reverse());
	System.out.println("reverse="+name.reverse());
	char[] array=name.toString().toCharArray();
	for(int i=0;i<array.length;i++){
		System.out.print(array[i]);
		System.out.print(" ");
	}
	}

}
