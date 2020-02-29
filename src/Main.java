import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {
        RandomNumberWriter r = new RandomNumberWriter(1);
        r.writeRandomByte("D:\\labs\\lab5sem2\\src\\byte");
        r.writeRandomChars("D:\\labs\\lab5sem2\\src\\char");
    }
}
