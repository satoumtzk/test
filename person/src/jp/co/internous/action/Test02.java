package jp.co.internous.action;

public class Test02 {
	public static void main(String[]args){
		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;

		System.out.println(jiro.name);
	    System.out.println(jiro.age);
        jiro.talk();
        jiro.walk();
	}

}
