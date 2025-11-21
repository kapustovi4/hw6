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
    public T getFirst() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.getFirst();
    }
    public T getLast() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.getLast();
    }
    public T getItemByIndex(int i) {
        if (i < 0 || i >= elements.size()) {
            return null;
        }
        return elements.get(i);
    }

}       