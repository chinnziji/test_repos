import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class changeName {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String line = "";
		InputStream is = new FileInputStream("F:/Test/name.txt");
		@SuppressWarnings("resource")
		BufferedReader bf = new BufferedReader(new InputStreamReader(is));

		String path = "F:/Test/";
		File f = new File(path);
		if(!f.exists()){
			f.mkdirs();
		}
		FileInputStream instream = null;
		FileOutputStream outstream = null;
		while((line = bf.readLine()) != null){
				try {
					File infile = new File("F:/Test/a.xml");
					File outfile = new File(f,line+".xml");

					instream = new FileInputStream(infile);
					outstream = new FileOutputStream(outfile);

					byte[] buffer = new byte[1024];
					int length;
					while((length = instream.read(buffer)) > 0){
						outstream.write(buffer, 0, length);
					}
					instream.close();
					outstream.close();

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
		System.out.println("File copied and created successfully!!!");
	}

}
