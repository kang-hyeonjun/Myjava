package ch01_variable_operator;

public class CondOper {
    static void main() {
        int x = 3, y = 8, z = 4 ;
        // int max = x > y ? x : y ;  //큰 수 구하기 예시

        int max = x > y ?(x > z ?x :z) :(y>z ?y :z) ;



        System.out.println("max : "+max );
    }
}
