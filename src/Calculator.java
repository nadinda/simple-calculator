import java.util.Scanner;

public class Calculator {
    int number1;
    int number2;
    int operator;
    double jawaban;

    public void inputCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama : ");
        number1 = scanner.nextInt();

        System.out.print("Masukkan Bilangan Kedua : ");
        number2 = scanner.nextInt();

        System.out.println("1. Tambah ");
        System.out.println("2. Kurang ");
        System.out.println("3. Kali ");
        System.out.println("4. Bagi ");

        System.out.print("Pilih Operator : " );
        operator = scanner.nextInt();

        calculatorSwitchCase();

    }

    public void calculatorSwitchCase() {
        switch (operator) {
            case 1:
                jawaban = number1 + number2;
                break;
            case 2:
                jawaban = number1 - number2;
                break;
            case 3:
                jawaban = number1 * number2;
                break;
            case 4:
                jawaban = number1 / number2;
                break;
        }
    }

    public void resultCalculator(){
        System.out.print(number1+" "+operator+" "+number2+" = "+jawaban);
    }
}