public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); //сщздаем переменную  service метода BmiService как новую переменную
        int price = 10_000; // передается только одна величина в метод,стоимость. на выходе получаем  количество миль
        int miles = service.calculate(price); // вызываем функцию calculate, передаем данные переменной price в функцию

        System.out.println();
        System.out.println(price);
        System.out.println(miles);

        System.out.println();
        System.out.println("100_000");
        System.out.println(service.calculate(100_000));


        System.out.println();
        System.out.println("-168");
        System.out.println(service.calculate(-168));
    }
}