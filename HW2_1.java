import java.util.Scanner;

class HW2_1{
	public static void main(String [] args){
		int a, quo; 
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Ͼ�̸��� ����: ");
		a = s.nextInt();
		
		quo = a/10000;
		a %=10000; //a = a%10000;
		
		if(quo>1) System.out.format(quo+"�� ");
		else if(quo==1) System.out.format("�� ");
		
		quo = a/1000;
		a %= 1000; 
		
		if(quo>1) System.out.format(quo+"õ ");
		else if(quo==1) System.out.format("õ ");
		
		quo = a/100;
		a %= 100; 
		
		if(quo>1) System.out.format(quo+"�� ");
		else if(quo==1) System.out.format("�� ");
		
		quo = a/10;
		a %=10; 
		
		if(quo>1) System.out.format(quo+"�� ");
		else if(quo==1) System.out.format("�� ");
		
		if(a>0) System.out.println(a+"�Դϴ�.");
	}
}