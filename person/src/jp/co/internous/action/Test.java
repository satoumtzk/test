package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;

		System.out.println(taro.name);
	    System.out.println(taro.age);
        taro.talk();
        taro.walk();

    	Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;

		System.out.println(jiro.name);
	    System.out.println(jiro.age);
        jiro.talk();
        jiro.walk();

    	Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;

		System.out.println(hanako.name);
	    System.out.println(hanako.age);
        hanako.talk();
        hanako.walk();

        Person mitsuyo=new Person();
		mitsuyo.name="佐藤光世";
		mitsuyo.age=18;

		System.out.println(mitsuyo.name);
	    System.out.println(mitsuyo.age);
	    mitsuyo.talk();
	    mitsuyo.walk();
	}
	}
