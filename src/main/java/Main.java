import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Главное меню:
                    1 - Добавьте новую игрушку
                    2 - Введите частоту выпадения любой игрушки
                    3 - Проведите розыгрыш и сохраните результат
                    0 - Выход
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("До новых встреч!!");
                    System.exit(0);
                }
                default -> System.out.println("Неправильный выбор. Пробоуйте снова.");
            }
        }
    }
}