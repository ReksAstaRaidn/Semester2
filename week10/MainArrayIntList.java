public class MainArrayIntList {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList();

        for (int i = 1; i <= 15; i++) {
            list1.add(i * 10);
        }
        System.out.println("Isi list awal: " + list1);
        System.out.println("Ukuran (size): " + list1.size());

        list1.add(2, 999);
        System.out.println("Setelah disisipkan 999 di indeks 2: " + list1);

        list1.remove(0);
        System.out.println("Setelah elemen indeks 0 dihapus: " + list1);

        System.out.println("isEmpty: " + list1.isEmpty());

        System.out.println("indexOf(999): " + list1.indexOf(999));
        System.out.println("indexOf(777): " + list1.indexOf(777));

        System.out.println("contains(999): " + list1.contains(999));
        System.out.println("contains(777): " + list1.contains(777));

        list1.clear();
        System.out.println("Setelah clear: " + list1);
        System.out.println("isEmpty setelah clear: " + list1.isEmpty());
    }
}
