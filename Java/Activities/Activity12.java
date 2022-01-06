package activities;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable add1=(a,b)->(a+b);
		System.out.println(add1.add(10,40));
		Addable add2=(int a,int b)->{ return (a+b);};
		System.out.println(add2.add(100, 200));
		

	}

}
