package ch01_variable_operator;

public class Condition02 {
    static void main() {
        int x = 10, y = 20 ;

        //두개의 숫자 중에서 큰 수 고르가
        // 타입 result = 조건식 ? 참일 때 처리 : 거짓말일 때 처리 ;
        int result = x>=y ? x : y ;
        System.out.println("result : " + result);

        System.out.println("result : " + result);

        //x가 짝수인지 홀수인지 판단해보세요

        String str = x%2 == 1 ? "홀수" : "짝수" ;
        System.out.println("str : " + str);

        x = 6 ;
        //x가 3의 배수이면 제곱을, 아니면 더하기 5의 결과를 출력하기.
        result = x%3 ==0 ? x*x : x+5 ;
        System.out.println("result : " + result);

        int month = 3 ;
        str = month >= 3 && month <= 5 ? "봄" :"다른 계절" ;
        System.out.println("결과 :" + str);

    }
}