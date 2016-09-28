package mypro01;

/**
 * @author wangc
 *
 */
public class Hello {
	public static void main(String[] args) {

		// int a= 32;
		// int b=a*2;
		// int c=b*4;
		// System.out.println(c);
		// System.out.println("大家好，我来复习学习java的");
		double d = Math.random();
		int e = (int) (d * 5);
//		if (e > 3) {
//			System.out.print(e);
//		} else {
//			System.out.print("你就是个臭傻逼");
//		}
		switch(e){
		case 1:
			System.out.println("你排行第几");
			break;
		case 2:
			System.out.println("你就是一个非常自私的人。");
			break;
			default:
				System.out.print("你怎么不去死呢、");
				
			
		}
	}
}
