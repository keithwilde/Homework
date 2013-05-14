import java.io.*;
public class fileToString  {
	//public static void main(String [] args) throws IOException{
	//	System.out.println(fileToString("./awmt.txt"));
	//}
		public static String fileToString(String fileName){
			String result = "";
			try{
					FileInputStream file = new FileInputStream(fileName);
					byte[] b = new byte[file.available()];
					System.out.println("number of bytes in this file =" + file.available());
					file.read(b);
					file.close();
					result = new String(b);
			}
			catch (Exception e){
			}
			return result;
		}
	}

