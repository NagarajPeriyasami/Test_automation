
public class add {

	                     //where we are declaring the any variable below the class above d method is 
	                      // global variable        
int a=50;

public void addition()
{
	int a=10;         //any variablble ahere we declare inside the method or curly frace is locl variable
	int b=30;
	int c=a+b;
	
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
add obj=new add();
obj.addition();
	}
///////////out put 40
	//in case 2 variables the local variable is value is taken ,,preference
}
