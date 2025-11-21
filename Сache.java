import java.util.LinkedList;

class Cache<T> {
    private final int maxSize;
    private final LinkedList<T> elements;
    
    public Cache(int n) {
        this.maxSize = n;
        this.elements = new LinkedList<>();  
    }
    public void add(T item) {
        elements.add(item);
        if (elements.size() > maxSize) {
            elements.removeFirst();
        }
    }
    public boolean remove(T item) {
        return elements.remove(item);
    }
    public boolean exists(T item) {
        return elements.contains(item);
    }
}       