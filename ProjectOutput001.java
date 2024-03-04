import java.io.FileOutputStream;
import java.io.IOException;

public class ProjectOutput001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte list[] = {02, 15, 21 , 24, 29, 38};
		
		try(FileOutputStream out = new FileOutputStream("D:\\Lotto.bin")){
			for(byte a : list)
				out.write(a);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}

