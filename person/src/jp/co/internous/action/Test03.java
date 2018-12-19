package jp.co.internous.action;

public class Test03 {
	public static void main(String[]args){
		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;

		System.out.println(hanako.name);
	    System.out.println(hanako.age);
        hanako.talk();
        hanako.walk();
	}

}
