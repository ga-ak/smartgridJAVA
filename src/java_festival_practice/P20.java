package java_festival_practice;

import java.util.Scanner;

public class P20 {

    // 명진이는 멀리 뛰기를 연습하고 있습니다.
    // 명진이는 다리가 짧아 한번에 1칸 또는 2칸 밖에 뛸 수 없습니다.
    // 칸이 총 4개 있을 때, 명진이는
    // (1칸, 1칸, 1칸, 1칸,)
    // (1칸, 2칸, 1칸)
    // (1칸, 1칸, 2칸)
    // (2칸, 1칸, 1칸)
    // (2칸, 2칸)
    // 의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다.
    // 멀리뛰기에 사용될 칸의 수 n이 주어질 때,
    // 명진이가 끝에 도달하는 방법이 몇 가지인지 출력하는 jumpCase 메소드를 완성하세요.
    // 예를 들어 4가 입력된다면, 5를 반환하라

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 >> ");
        int inputNum = sc.nextInt();
        System.out.println(jumpCase(inputNum));

    }

    public static int jumpCase(int input) {

        int k = input/2;
        int result = 0;
        int size = input-1;

        for (int i = 1; i <= k; i++) {
            result += combination(size--, i);
        }
        return result+1;
    }

    public static int combination(int n, int r) {
        int a = 1,b=1,c=1,result=1;

        for (int i = 2; i <= n; i++) {
            a *= i;
        }

        for (int i = 2; i <= n - r; i++) {
            b *= i;
        }

        a = a/b;

        for (int i = 2; i <= r; i++) {
            c*=i;
        }

        result = a/c;


        return result;
    }
}
