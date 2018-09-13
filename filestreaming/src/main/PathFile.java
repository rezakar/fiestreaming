package main;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFile {
	public void getPath() throws IOException {
		Path path = Paths.get("test.txt");
		System.out.println(path.toString());
		System.out.println(path.getFileName());
		System.out.println(path.getNameCount());
		System.out.println(path.getName(path.getNameCount()-1));
		Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
		System.out.println(realPath);

	}
	
}
