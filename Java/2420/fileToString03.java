import java.io.FileInputStream;
import java.io.IOException;
public class fileToString03  {
	
	
	public static void main(String [] args) throws IOException{
		String data = fileToString("./awmt.txt");
		//preprocessing data
		data = data.replace('"', ' ');
		data = data.replace('\'', ' ');
		data = data.replace('\n', ' ');
		data = data.replaceAll("[.,;?]", ""); //may not be correct
		
		//System.out.println(data);
		}	
	
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
