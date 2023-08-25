package algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2748 {
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new long[N + 1];

        for (int i = 0; i < N + 1; i++) {
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fibonacci(N));
    }

    private static long fibonacci(int N) {
        if (arr[N] == -1) {
            arr[N] = fibonacci(N - 1) + fibonacci(N - 2);
        }
        return arr[N];
    }
}
