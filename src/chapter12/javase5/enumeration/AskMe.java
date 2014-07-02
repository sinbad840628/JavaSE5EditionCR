package chapter12.javase5.enumeration;

public class AskMe {
	public static void answer(Answers result){
		switch (result) {
		case NEVER:System.out.println("never");break;
		case MAYBE:System.out.println("maybe");break;
		case SEVERAL:System.out.println("several");break;
		case OFTEN:System.out.println("often");break;
		case SOON:System.out.println("soon");break;
		case ALWAYS:System.out.println("always");break;
		default:System.out.println("ERROR");break;
		}
	}
	
	public static void main(String args[]){
		Question q = new Question();
		answer( q.ask());
		answer( q.ask());
		answer( q.ask());
		answer( q.ask());
		answer( q.ask());
		answer( q.ask());
		answer( q.ask());
	}
}
