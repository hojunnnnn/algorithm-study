package baekjoon.Bronze;

import java.io.*;

public class Baek15727_조별과제를_하려는데_조장이_사라졌다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        if(L % 5 == 0) System.out.println(L / 5);
        else System.out.println(L / 5 + 1);
    }
}