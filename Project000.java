import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Project000 {
		public static void main(String[] args) throws Exception { //throws Exception�� ���־�� �Ѵ�.(�ܺ� ����)
			// TODO Auto-generated method stub
			
			try(FileReader in = new FileReader("D:\\Car Work Order.txt"); //���� �� �����;� ��
			   FileWriter out = new FileWriter("D:\\Customer Car Work Order.txt")){

		        int ch; // ( int������ ����� : read��� �޼ҵ�� ���� ���� ������ -2�� ��ȯ�ϱ� ������ 
		        //���� ���� -> ���ڸ� �б� ����)
		
		        while ((ch = in.read()) != -1) {//in���� �� ���ھ� �о�� ���� �ƴҶ�(-1)�϶� ���� 
			                            //-1�̶�� ���� int������ �޴� ���̴�.
		        		out.write(ch);
			// System.out.print((char) ch); //(char) ch) ����� �� ���ڷ� ���� ���ڷ� ����ϵ��� ��ȯ
			}
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		}
	}


