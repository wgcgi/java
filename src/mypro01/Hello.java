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
		// System.out.println("��Һã�������ϰѧϰjava��");
		double d = Math.random();
		int e = (int) (d * 5);
//		if (e > 3) {
//			System.out.print(e);
//		} else {
//			System.out.print("����Ǹ���ɵ��");
//		}
		switch(e){
		case 1:
			System.out.println("�����еڼ�");
			break;
		case 2:
			System.out.println("�����һ���ǳ���˽���ˡ�");
			break;
			default:
				System.out.print("����ô��ȥ���ء�");
				
			
		}
	}
}
