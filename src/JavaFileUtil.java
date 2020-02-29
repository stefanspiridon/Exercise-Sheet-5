import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.io.ConcatenateJavaFiles;

import java.io.*;

public class JavaFileUtil implements ConcatenateJavaFiles {

    @Override
    public void concatenateJavaFiles(String s, String s1) throws IOException {
        File file = new File(s);
        File[] dir = file.listFiles();

        OutputStream out = new FileOutputStream(s1);
        byte[] buf = new byte[2];
        for (File file1 : dir){
            if(file1.isFile()){
                InputStream in = new FileInputStream(file1);
                int b=0;
                while( (b=in.read(buf)) >= 0)
                    out.write(buf, 0, b);
                in.close();
            }
            out.close();
        }
    }
}