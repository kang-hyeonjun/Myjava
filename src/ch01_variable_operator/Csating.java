package ch01_variable_operator;

public class Csating {
    static void main() {
         int kor = 50, eng = 60, math= 80 ;
         int total = kor + eng + math ;
         System.out.println("총점 : " +total);

         double average = (double) total / 3 ;
         System.out.println("평균 : "+ average);
    }
}
