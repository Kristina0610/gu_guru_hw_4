package hw_4;

//поупражняться с математическими и логическими операторами,
// добиться переполнения при вычислениях,
// посмотреть результаты (вывести в консоль)

public class hw_4_1 {
  public static void main(String[] args) {
    byte varByte = 10 + 127;
    short varShort = 10 - 32787;
    int varInt = 1 * 2147483648;

    System.out.println(varInt);
    System.out.println(varByte);
    System.out.println(varShort);

    int age = 6;
    boolean canGoToSchool = age >= 6 && age < 18;
    System.out.println(canGoToSchool);

  }

}
