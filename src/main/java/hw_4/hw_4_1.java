package hw_4;

//поупражняться с математическими и логическими операторами,
// добиться переполнения при вычислениях,
// посмотреть результаты (вывести в консоль)

public class hw_4_1 {
  public static void main(String[] args) {
    byte varByte1 = 10;
    byte varByte2 = 127;
    System.out.println(varByte1+varByte2);

    short varShort1 = 1000;
    short varShort2 = 3278;
    System.out.println(varShort1*varShort2);

    int varInt1 = 2;
    int varInt2 = 2147483647;
    System.out.println(varInt1*varInt2);



    int age = 6;
    boolean canGoToSchool = age >= 6 && age < 18;
    System.out.println(canGoToSchool);

  }

}
