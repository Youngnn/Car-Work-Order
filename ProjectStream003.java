/*
���� ���� �̸��� �Է��Ͻÿ� : a.jpg
���� ���� �̸��� �Է��ϼ��� : B.jpg
a.jpg�� b.jpg�� �����߽��ϴ�.
*/

import java.io.*; //�� �־�� �ϴ� import
import java.util.Scanner; //Ű����� �Է� �޾ƾ� �ϴϱ�

public class ProjectStream003 {


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //input ��� scan ģ�� 
		System.out.print("���񳻿��� ���� �̸��� �Է��ϼ��� : ");
		
		String inputFileName = scan.next(); // String inputFileName�� scan.next()���� �Է¹ްڴ�.
		
		System.out.print("���� ���񳻿��� ���� �̸��� �Է��ϼ��� : ");

		String outputFileName = scan.next(); // String OutputFileName�� scan.next()���� ����ϰڴ�.
		
		try (InputStream inputStream = new FileInputStream(inputFileName); //try ���ȿ��� Stream�����ϰ� �ʱ�ȭ -> close �� �ʿ� ����! 
				OutputStream outputStream = new FileOutputStream(outputFileName)){
			
			int c;
			
			while((c= inputStream.read()) != -1) { //������ -1�� ������ �д´�.
				outputStream.write(c); // output�̶�� �޼ҵ�� ���ش�.
		}
	}
		System.out.println(inputFileName + "��" + outputFileName + "�� �����Ͽ����ϴ�.");
	}

}
