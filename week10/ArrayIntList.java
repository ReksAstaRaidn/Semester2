public class ArrayIntList {
    private int[] elementData;
    private int size;

    public ArrayIntList() {
        elementData = new int[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int value) {
        pastikanKapasitas();
        elementData[size] = value;
        size++;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Indeks tidak valid: " + index);
        }
        pastikanKapasitas();
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    public int get(int index) {
        cekIndeks(index);
        return elementData[index];
    }

    public void remove(int index) {
        cekIndeks(index);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void clear() {
        size = 0;
    }

    private void pastikanKapasitas() {
        if (size >= elementData.length) {
            int kapasitasBaru = elementData.length * 2;
            int[] arrayBaru = new int[kapasitasBaru];
            for (int i = 0; i < size; i++) {
                arrayBaru[i] = elementData[i];
            }
            elementData = arrayBaru;
        }
    }

    private void cekIndeks(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indeks tidak valid: " + index);
        }
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }
}
