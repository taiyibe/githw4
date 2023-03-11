import java.util.Random;

public class MagicBox<T> {
    private int count;
    private T[] box;
    private Random rnd;

    public MagicBox(int size) {
        box = (T[]) new Object[size];
        count = 0;
        rnd = new Random();
    }

    public boolean add(T item) {
        for (int i = box.length - 1; i >= 0; i--) {
            if (box[i] == null) {
                box[count] = item;
                count++;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        if (box.length != count) {
            throw new RuntimeException("Коробка не полна, ячеек осталось: " + Integer.toString(box.length - count));
        } else {
            return box[rnd.nextInt(box.length)];
        }
    }
}
