import java.io.*;
import java.util.Stack;

public class Baek9093_단어_뒤집기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine() +"\n"; // 1. 한 줄 읽기
            for (char ch : str.toCharArray()) {
                if (ch == ' ' || ch == '\n') { // 3. 공백이나 개행을 만날 시
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop()); // 4. 데이터를 꺼내 버퍼에 담는다.
                    }
                    bw.write(ch); // 5. 현재 위치값(공백이나 개행)을 버퍼에 담는다.
                }
                else stack.push(ch); // 2. stack에 데이터 저장
            }
        }
        bw.flush(); // 6. 출력
    }
}
