package jp.co.internous.action;

public class Test04 {
	public static void main(String[]args){
		Person mitsuyo=new Person();
		mitsuyo.name="佐藤光世";
		mitsuyo.age=18;

		System.out.println(mitsuyo.name);
	    System.out.println(mitsuyo.age);
	    mitsuyo.talk();
	    mitsuyo.walk();

	   
	}

}
