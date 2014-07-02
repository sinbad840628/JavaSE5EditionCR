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
       2.1 字符串中是否包含某一个子串。
       			boolean  contains（charSequence）；charSequence接口类型的参数，判断字符串是否存在.
       			特殊之处;indexOf(str):可以索引str第一次出现位置，如果返回-1.表示该str不再字符串中存在。
       			所以，也可以用于对指定判断是否包含。
       			if（str.indexOf("aa") != -1）{
       			}
       			而且该方法既可以判断，又可以获取出现的位置。
       2.2 字符中是否有内容。
       			boolean isEmpty（） 1.6版本開始  相当于 str.length（） == 0  意义不是很大。
       2.3 字符串中是否以指定内容开头。
       			boolean startsWith(str)
       2.4 字符串是否以制定内容结尾。
       			boolean endWith(str)
       2.5  判断字符串内容是否相同，覆写了object类中的equals方法。
       			boolean  equals（str）
       	2.6  判断内容是否相同，并忽略大小写。
       	boolean   equalsIgnoreCase（String str） 		
       	
 3  转换
        3.1 将字符数组转成字符串。
        		构造函数;String (char[])
              	构造函数;String (char[],offset,count)；将字符数组中的一部分转成字符串。
              	
              	静态方法：  static String copyValueOf（char[] data);
              						static String copyValueOf(char[] data, int offset, int count);
              						static String valueOf(char[]);
        3.2 将字符串转成字符数组。**技巧：找中括号)
        	char[] toCharArray()：
        3.3 将字节数组转成字符串。
        		构造函数;String (byte[])
              	构造函数;String (byte[],offset,count)；将字节数组中的一部分转成字符串。
        3.4 将字符串转成字节数组。
        		byte getBytes（）；
        3.5 将基础数据类型转成字符串。
		        String valueOf(int);
		        String valueOf(double);
		        4+"";等同于    String.valueOf(4);
		        
		        
		        特殊：
		        字符串和字节数组在转换过程中，是可以制定编码表的。      
 
   4. 替换法则；   
        String replace(oldChar,newChar)
        
* */
public class StringMethodDemo {

	public static void method_replace(){
		String str = "hello java";
		String s1 = str.replace('a', 'n');
		sop("s = " + str);
		sop("s1 = " + s1);
	}
	
	public static void method_trans(){
		char[] arr = {'a','b','c','d','e','f','g'};
		//String s = new String(arr);
		String s = new String(arr,1,3);	//s = bcd
		sop("s = " + s);
	}
	
	public static void method_is(){
		String str = "ArrayDemo.java";
		sop(str.startsWith("Array"));
		sop(str.endsWith(".java"));
		sop(str.contains("Demo"));
	}
	
	
	public static void method_get(){
		String string = "abcdaef";
		sop(string.length());
		//根据索引获取字符。
		sop(string.charAt(4));
		//sop(string.charAt(40));//当访问字符串中不存在的下表是，会发生StringIndexOutOfBoundsException 的错误。
		//根据字符获取索引。
		sop(string.indexOf('a'));
		sop(string.indexOf('a',3));
		sop(string.indexOf('x',3));//如果没有找到对应的字符，就返回-1
		
		sop(string.lastIndexOf("a"));//反向索引
	}
	public static void main(String[] args) {
		//method_get();
		//method_is();
		//method_trans();
		method_replace();
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}

}
