package Inheritance;

class doctor {//super class
	void show() {
		System.out.println("I am doctor");
	}
}

class employe extends doctor {//sub class
	void print() {
		super.show();
		System.out.println("I am employe");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		employe e1=new employe();
		e1.print();
		//e1.show();

	}

}
