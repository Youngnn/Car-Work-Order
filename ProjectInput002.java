import java.io.FileInputStream;
import java.io.IOException;

public class ProjectInput002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			byte list[] = new byte[6]; //1���� �迭�� ��ü�� ���� 6����������� 6���� ����Ʈ 
			
			try(FileInputStream in = new FileInputStream("D:\\Lotto.bin")) { //���� �� inputStream���� ���� �׸��� (�������� ����) 
				in.read(list); //(6����)��ü�� �о�� 
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			for(byte a : list) //�ݺ������� ��ü�� �־��ְ� ���
				System.out.print(a+ "\t");
			System.out.println("A���� Lotto ��ȣ �Է¿Ϸ�");
			System.out.println();
		}
}