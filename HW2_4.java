import java.util.Scanner;

class HW2_4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int score;
		
		
		System.out.print("����: ");
		score = s.nextInt();
		
		if(score>100|| score <0) System.out.println("�߸��� �����Դϴ�. ");
		else if(score>=90) System.out.println("��");
		else if(score>=80) System.out.println("��");  /*
		else if(80<=score<90)�� �Ұ����մϴ�. 
		else if(score>=80&& score<90)�� ���� ������ ������
		14��° ���α��� �Դٴ� ���� 90���� ���� �ʾҴٴ� ���̱� ������ 
		score<90�� ���� �����մϴ�!
		*/
		else if(score>=70) System.out.println("��");
		else if(score>=60) System.out.println("��");
		else System.out.println("��");
	}
}