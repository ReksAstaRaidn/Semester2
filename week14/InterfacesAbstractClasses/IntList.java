public interface IntList {
    int size();
    boolean isEmpty();
    int get(int index);
    int indexOf(int value);
    boolean contains(int value);
    void add(int value);
    void add(int index, int value);
    void remove(int index);    
}
