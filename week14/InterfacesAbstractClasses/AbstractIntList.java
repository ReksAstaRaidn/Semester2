public abstract class AbstractIntList implements IntList {
    // 1. Metode isEmpty() sama persis untuk Array dan Linked List
    // Karena kita tahu pasti ada metode size() (dari interface), kita bisa memanggilnya!
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    // 2. Metode contains() sama persis: Jika indexOf() tidak -1, berarti ada!
    @Override
    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }
    // 3. Metode bantuan (helper) untuk mengecek validitas indeks.
    // Daripada ditulis dua kali di ArrayIntList dan LinkedIntList, kita taruh di sini.
    protected void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Indeks: " + index);
        }
    }

}
