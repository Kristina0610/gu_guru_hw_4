package hw_4;

// 2) попробовать вычисления комбинаций типов данных (int и double)
public class hw_4_2 {
  public static void main(String[] args) {
    int varIntTest = 10;
    double varDoubleTest = 1.0;
    double result = varIntTest + varDoubleTest;
    int result2 = varIntTest + (int) varDoubleTest;
    System.out.println(result);
    System.out.println(result2);
  }
}
