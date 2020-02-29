package israaa;

public class cal {
	public cal() {
		
	}
	
public int add(int a , int b) {
	int x=a;
	int y=b;
	int z= x+y;
	return z;
}
public int sub(int a , int b) {
	int x=a;
	int y=b;
	int z= x-y;
	return z;
}
public int mul(int a , int b) {
	int x=a;
	int y=b;
	int z= x*y;
	return z;
}
public int div(int a , int b) {
	int x=a;
	int y=b;
	int z= x/y;
	return z;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     cal a= new cal();
 int  z=  a.add(4, 5);
     System.out.println(z);
     int  y=  a.sub(4, 5);
     System.out.println(y);
     int  y1=  a.mul(4, 5);
     System.out.println(y1);
     int  y11=  a.div(4, 5);
     System.out.println(y11);


	}

}
