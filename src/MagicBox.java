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
        boolean is_empty = false;
        for (int i = box.length - 1; i >= 0; i--) {
            if (box[i] == null) {
                is_empty = true;
            } else {
                break;
            }
        }

        if (is_empty) {
            box[count] = item;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public T pick() {
        boolean is_empty = false;
        for (int i = box.length - 1; i >= 0; i--) {
            if (box[i] == null) {
                is_empty = true;
            } else {
                break;
            }
        }

        if (is_empty) {
            throw new RuntimeException("Коробка не полна, ячеек осталось: " + Integer.toString(box.length - count));
        } else {
            return box[rnd.nextInt(box.length)];
        }
    }
}
