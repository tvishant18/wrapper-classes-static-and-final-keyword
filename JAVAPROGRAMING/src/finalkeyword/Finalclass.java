package finalkeyword;
class W{
	public void getdata1(){
		System.out.println("w>>getdata1");
	}
}
final class X extends W{
	public void getdata2(){
		System.out.println("w>>getdata2");
}
}
//(wrong declaration)class Y extends X{
class Y {
	public void getdata3(){
		System.out.println("w>>getdata3");
}
}

public class Finalclass {

	public static void main(String[] args) {
		X obj=new X();
		obj.getdata1();
		obj.getdata2();
		Y obj1=new Y();
		obj1.getdata3();
	}

}
