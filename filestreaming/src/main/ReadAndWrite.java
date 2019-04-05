package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;



public class ReadAndWrite  {
	public static void readAndWrite() throws Exception {
		Path source =  Paths.get("files/test.txt");
		Path target = Paths.get("files/targettext.txt");
		Charset charset = Charset.forName("US-ASCII");
		ArrayList<String> lines = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(source,charset)) {
			String line= null;
			while((line = reader.readLine()) !=null){
				System.out.println(line);
				lines.add(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try (BufferedWriter writer = Files.newBufferedWriter(target, charset)){
			Iterator<String> iterator = lines.iterator();
			while(iterator.hasNext()) {
				String s = iterator.next();
				writer.append(s, 0, s.length());
				writer.newLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
