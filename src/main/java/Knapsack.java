import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 24);
        final Item item2 = new Item(6, 30);
        final Item item3 = new Item(2, 10);

        final Item[] items = {item1, item2, item3};

        Arrays.sort(items, Comparator.comparingDouble((Item item) -> item.valuePerUnitOfWeight()).reversed());

        System.out.println(Arrays.toString(items));

        int W = 12;

        int weightSoFar = 0;
        int valueSoFar = 0;
        int currentItem = 0;

        while (currentItem < items.length && weightSoFar != W) {
            if (weightSoFar + items[currentItem].getWeight() < W) {
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight()) *
                        items[currentItem].getValue();

                weightSoFar = W;
            }
            currentItem++;
        }
        System.out.println("Best value: " + valueSoFar);
    }
}

class Items {
    private int weight;
    private int value;

    public Items(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Items{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
