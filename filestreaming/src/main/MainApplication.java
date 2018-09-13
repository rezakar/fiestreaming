package main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApplication  {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get("test.txt");
		System.out.println(source.getFileName());
		




	}

}
