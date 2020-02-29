import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.io.RandomIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.Random;

public class RandomNumberWriter implements RandomIO {

    long num;

    RandomNumberWriter(long num){
        this.num=num;
    }

    @Override
    public void writeRandomChars(String s) throws IOException {
        Random random = new Random(num);
        File f = new File(s);
        Writer out = new FileWriter(f);

        for(int i = 0; i < 10000; i++){
            int integer = random.nextInt(100000);

            out.write(String.valueOf(integer));
        }

        out.close();
    }

    @Override
    public void writeRandomByte(String s) throws IOException {
        Random random = new Random(num);
        File f = new File(s);
        OutputStream out = new FileOutputStream(f);

        for(int i = 0; i < 10000; i++){
            int integer = random.nextInt(100000);
            byte b[] = ByteBuffer.allocate(4).putInt(integer).array();
            out.write(b);
        }

        out.close();
    }
}
