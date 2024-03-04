/*
원본 파일 이름을 입력하시오 : a.jpg
복사 파일 이름을 입력하세요 : B.jpg
a.jpg를 b.jpg로 복사했습니다.
*/

import java.io.*; //꼭 있어야 하는 import
import java.util.Scanner; //키보드로 입력 받아야 하니까

public class ProjectStream003 {


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //input 대신 scan 친거 
		System.out.print("정비내역서 파일 이름을 입력하세요 : ");
		
		String inputFileName = scan.next(); // String inputFileName을 scan.next()으로 입력받겠다.
		
		System.out.print("고객용 정비내역서 파일 이름을 입력하세요 : ");

		String outputFileName = scan.next(); // String OutputFileName을 scan.next()으로 출력하겠다.
		
		try (InputStream inputStream = new FileInputStream(inputFileName); //try 블럭안에서 Stream선언하고 초기화 -> close 할 필요 없음! 
				OutputStream outputStream = new FileOutputStream(outputFileName)){
			
			int c;
			
			while((c= inputStream.read()) != -1) { //파일이 -1일 때까지 읽는다.
				outputStream.write(c); // output이라는 메소드로 써준다.
		}
	}
		System.out.println(inputFileName + "을" + outputFileName + "로 복사하였습니다.");
	}

}
