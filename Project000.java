import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Project000 {
		public static void main(String[] args) throws Exception { //throws Exception을 써주어야 한다.(외부 전달)
			// TODO Auto-generated method stub
			
			try(FileReader in = new FileReader("D:\\Car Work Order.txt"); //읽을 것 가져와야 함
			   FileWriter out = new FileWriter("D:\\Customer Car Work Order.txt")){

		        int ch; // ( int형으로 써야함 : read라는 메소드는 파일 끝을 만나면 -2를 반환하기 때문에 
		        //변수 선언 -> 문자를 읽기 위해)
		
		        while ((ch = in.read()) != -1) {//in에서 한 문자씩 읽어라 끝이 아닐때(-1)일때 까지 
			                            //-1이라는 것을 int형으로 받는 것이다.
		        		out.write(ch);
			// System.out.print((char) ch); //(char) ch) 출력할 때 숫자로 말고 문자로 출력하도록 변환
			}
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		}
	}


