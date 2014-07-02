package chapter12.javase5.enumeration;

import java.util.Random;

public class Question {
		
		Random random = new Random();
		Answers ask(){
			int problem = (int)( 100 * random.nextDouble());
			if( problem < 15 ){
				return Answers.MAYBE; //15%
			}
			if (problem < 30) {
				return Answers.SEVERAL;
			}
			if (problem < 60) {
				return Answers.SOON;
			}
			if ( problem < 75) {
				return Answers.OFTEN;
			}
			if( problem < 90){
				return Answers.ALWAYS;
			}else {
				return Answers.NEVER;
			}
		}//

}
