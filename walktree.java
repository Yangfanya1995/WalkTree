package walkTree;

import java.io.IOException;
import java.nio.file.*;
public class walktree {
    public static void main(String[] args) throws IOException {
        Path start = FileSystems.getDefault().getPath("G:\\testdata");
        Files.walk(start)
                .filter(path -> path.toFile().isFile())//是一个文件
                .filter(path -> path.toString().endsWith(".java"))//文件后缀名
                .forEach(System.out::println);//打印文件名
    }
}
