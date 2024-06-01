import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class  Baek1271_엄청난_부자2{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());

        bw.write(n.divide(m) + "\n");
        bw.write(String.valueOf(n.remainder(m)));
        bw.flush();
        br.close();
        bw.close();
    }
}