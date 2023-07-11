package Domen;

public class HotDrink extends Product {
    // Поля
    private int hotDrinkTemp;

    // Свойства
    public int hotDrinkTemp() {
        return hotDrinkTemp;
    }

    public void setBottleVolume(int hotDrinkTemp) {
        this.hotDrinkTemp = hotDrinkTemp;
    }

    // конструкторы
    public HotDrink(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.hotDrinkTemp = (int) 0f;
    }

    public HotDrink(int price, int place, String name, long id, int hotDrinkTemp) {
        super(price, place, name, id);
        this.hotDrinkTemp = hotDrinkTemp;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntemp=" + hotDrinkTemp;
    }

}