/**1.Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
Для класса ГорячихНапитков(Hot Drink) 
2.написать конструктор и переопределить метод toString()
3. В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре */

import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float) 1.5);
        Product item4 = new HotDrink(130, 4, "Tea", 104, (int) 90);
        Product item5 = new HotDrink(100, 5, "Koffee", 101, (int) 100);
        Product item6 = new HotDrink(170, 6, "Hot chocolate", 101, (int) 100);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        for (Product prod : venMachine.getProducts()) {
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize();

        // System.out.println("Hello, World!");
    }
}