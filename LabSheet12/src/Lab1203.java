import java.io.*;
public final class Lab1203 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		int countbook = 0,i=1;
		while((tmp = readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			
			System.out.println(i++ +"."+data[0]+"("+data[1]+"), Ratig "+data[2]+" publist on "+data[5]);
			countbook++;
		}
		readFile.close();
		System.out.println("============================================================");
		System.out.println("count book = "+countbook);
	}

}
