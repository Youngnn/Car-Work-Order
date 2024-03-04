import java.io.FileInputStream;
import java.io.IOException;

public class ProjectInput002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			byte list[] = new byte[6]; //1차원 배열로 객체를 만듬 6개만들었으니 6개의 바이트 
			
			try(FileInputStream in = new FileInputStream("D:\\Lotto.bin")) { //읽을 때 inputStream으로 읽음 그리고 (읽으려는 파일) 
				in.read(list); //(6개의)객체를 읽어라 
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			for(byte a : list) //반복문으로 객체를 넣어주고 출력
				System.out.print(a+ "\t");
			System.out.println("A수동 Lotto 번호 입력완료");
			System.out.println();
		}
}