import java.util.Scanner;

/**
 * Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
public class InteractRunner {
    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("First: ");
                String first = reader.next();
                System.out.println("Second: ");
                String second = reader.next();
                calc.add(Integer.parseInt(first), Integer.parseInt(second));
                System.out.println("Result: " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit: yes/no " + exit);
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}