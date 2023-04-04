package Methods;
class DisplayOverloading{
	public void disp(int num,char c){
		System.out.println(c+""+num);
	}
}

public class MethodOverloading4 {
public static void main(String[] args) {
		DisplayOverloading obj =new DisplayOverloading();
		obj.disp(12,'x');
		MethodOverloading4 m1=new MethodOverloading4();
		
		{
			System.out.println("calling");
		}
		
		

	}

}
