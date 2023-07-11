package Domen;

public class HotDrink extends Product {
    // Поля
    private float hotDrinkVolume;

    // Свойства
    public float getHotDrinkVolume() {
        return hotDrinkVolume;
    }

    public void setHotDrinkVolume(float bottleVolume) {
        this.hotDrinkVolume = bottleVolume;
    }

    // конструкторы
    public HotDrink(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.hotDrinkVolume = 0f;
    }

    public HotDrink(int price, int place, String name, long id, int bottleVolume) {
        super(price, place, name, id);
        this.hotDrinkVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntemp=" + hotDrinkVolume;
    }

}