package chapter15.javase5.string;

/**
  public final class String
  String类适用于描述字符串事物。
  那么它就提供了多个方法对字符串进行操作。
  
  字符串特性就是一旦被创造，就不会被改变。
  常见的字符串操作有哪些？
  “abc”这个字符串具备哪些功能？
  有长度，由字符组成，这些字符对应的相对位置。
  
  1）获取类方法
  	1.1	字符串中的包含的字符数，也就是字符串的长度
  			int length（）获取长度
  			数组也有length属性，但是没有length（）方法。
  	1.2   根据位置来获取位置上的某个字符。
  			char charAt（int index）
  	1.3 	根据对应的字符，返回该字符在字符串中的索引位置。
  			int indexOf（int ch）；返回的是ch在字符串中出现的第一次位置。
  			int indexOf(int ch,int fromIndex) 从fromIndex指定位置开始，获取ch在字符串中出现的位置。
  			
  			int indexOf（String str）；返回的是ch在字符串中出现的第一次位置。
  			int indexOf(String str ,int fromIndex) 从fromIndex指定位置开始，获取ch在字符串中出现的位置。		
  			
  			
  2）判断类方法
 * */

public class StringDemo {
	public static void main(String[] args) {
		String str1= new String();
		String str2 = "";
		System.out.println(str1 == str2);
		String string1 = "abc";		
		String s1 = "abc";//s1 是一个类类型变量， “abc”是一个对象。		
		s1 = "kk";	
		System.out.println("s1 = " + s1);		
		String s2 = new String("kk");
		
		//s1 代表在内存中有一个对象， s2代表在内存中有两个对象。
		
		//内存中有一个常量池,如果内存中已经存在“abc”的话，只要字符串相同，就指向同一个对象，为了节省空间用的。
		String s3 = "abc";
		System.out.println(string1 == s3);//true
		System.out.println("xxxxxxxxxxxxxxx");
		System.out.println( s1 == s2 );//false
		//String类腹泻了Object类中的equals方法，该方法用于判断字符串是否相同。
		System.out.println(s1.equals(s2));//true
	}

}
