/** Kalkulator

 Nilai 1 : <inputA>			// 5
 Nilai 2 : <inputB>			// 2
 Pilih Operator:
 1. Tambah
 2. Kurang
 3. Kali
 4. Bagi
 Pilihan (1..4) : <inputOperator>	// 1

 5 + 2 = 7
 ...
 Operator tidak ditemukan
 **/

import java.util.Scanner;

public class Calculator {
    int number1;
    int number2;
    int operator;
    String printOperator;
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

        System.out.print("Pilih Operator(1-4): " );
        operator = scanner.nextInt();

        calculatorSwitchCase();

    }

    public void calculatorSwitchCase() {
        switch (operator) {
            case 1:
                jawaban = number1 + number2;
                printOperator = "+";
                break;
            case 2:
                jawaban = number1 - number2;
                printOperator = "-";
                break;
            case 3:
                jawaban = number1 * number2;
                printOperator = "*";
                break;
            case 4:
                jawaban = number1 / number2;
                printOperator = "/";
                break;
            default:
                System.out.println("Operator tidak tersedia");
        }
    }

    public void resultCalculator(){
        System.out.print(number1+" "+printOperator+" "+number2+" = "+jawaban);
    }
}