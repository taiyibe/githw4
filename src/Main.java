public class Main {
    public static void main(String[] args) {
        MagicBox<String> strBox = new MagicBox<String>(5);

        testAdd(strBox.add("string 1"));
        testAdd(strBox.add("string 2"));
        testAdd(strBox.add("string 3"));
        testAdd(strBox.add("string 4"));

        try {
            String res = strBox.pick();
            System.out.print("Выбранно: ");
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        testAdd(strBox.add("string 5"));

        try {
            String res = strBox.pick();
            System.out.print("Выбранно: ");
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        MagicBox<Integer> intBox = new MagicBox<Integer>(3);

        testAdd(intBox.add(1));
        testAdd(intBox.add(2));
        testAdd(intBox.add(3));
        testAdd(intBox.add(4));

        try {
            Integer res = intBox.pick();
            System.out.print("Выбранно: ");
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static private void testAdd(boolean rs) {
        if (rs) {
            System.out.println("Успешно добавлен");
        } else {
            System.out.println("Коробка полна");
        }
    }
}