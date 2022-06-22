public class Main {
    public static void main(String[] args) {
        float balans = (float) 400.57;
        float payment = (float) 1114.80;

        int bonus = (int) payment / 100;
        float finalBalance = (balans + payment + bonus);
        if (payment > 1000.00) {
            System.out.println(("Начислено бонусов: " + (bonus)) + ("     Баланс составляет: " + (finalBalance)));
        } else {
            System.out.println(("Бонус не начислен") + ("   Баланс составляет: " + (finalBalance - bonus)));
        }
    }
}
//решила оставить вещественный тип данных float для баланса и платежа, поскольку это отражает реальную картину,
// нежели тип int.
// но столкнулась с тем, что в определенных случаях выводится конечный баланс с 4мя знаками после ","
//не смогла это поправить с помощью "%.2f"