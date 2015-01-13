import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.io.IOException;

class IOApp {

	public static void main(String[] args) throws IOException {

		Console c = System.console();
		
		/********************************* Input reading *******************************/

		String name = c.readLine("Introduce the file name: ");

		/********************************** Create file ********************************/

		// Create and open file
		FileWriter fr = new FileWriter(name + ".txt");

		// Write the text
		fr.write("test on file\n");
		fr.write("second text\n");

		// Close the file
		fr.close();

		/*********************************** Read file *********************************/

		String content = null;
		File file = new File(name + ".txt");
		try {

			// Open file and read
			FileReader reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			
			// Read all lines
			reader.read(chars);
			content = new String(chars);
			System.out.print(content);

			// Close the file
			reader.close();

			// Other way to read file
			RandomAccessFile file2 = new RandomAccessFile(name + ".txt","r");
			String line;
			while((line=file2.readLine())!=null){
				System.out.println(line);
			}
			
			// Reset the seek (position 0 on file)
			file2.seek(0);

			// Close file
			file2.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}