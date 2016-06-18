package finalkeyword;
class V{
	int a=10;
	final int b=20;
	public void setdata(){
		a=20;
		//b=40;
	}
	public void getdata(){
		System.out.println("the values of a and b are  "+a+" and "+b+" respectively");
	}
}
public class datavariable {

	public static void main(String[] args) {
V obj=new V();
obj.setdata();
obj.getdata();

	}

}
