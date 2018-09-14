package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CoyDeleteFiles {
	public void fileDeleteCopy() throws IOException {
		Path source = Paths.get("test.txt");
		System.out.println(source.getFileName());
		
		/*Path target = Paths.get("files/todelet.txt");
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);*/
		
		/*Path toDelete = Paths.get("files/todelet.txt");
		Files.delete(toDelete);
		System.out.println("File deleted");*/
		
		Path newdir = Paths.get("files/newdir");
		Files.createDirectories(newdir);
		
		Files.move(source, newdir.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
	}

}
