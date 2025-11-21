public class Main {
    public static void main(String[] args) {
        Cache<String> stringCache = new Cache<>(3);
        
        stringCache.add("Первый");
        stringCache.add("Второй");
        stringCache.add("Третий");
        printCache(stringCache);
        System.out.println("");
        
        stringCache.add("Четвертый");
        printCache(stringCache);
        System.out.println("");

        System.out.println("Первый элемент: " + stringCache.getFirst());
        System.out.println("Последний элемент: " + stringCache.getLast());
        System.out.println("");

        System.out.println("Индекс " + 2 + ": " + stringCache.getItemByIndex(2));
        System.out.println("Индекс " + 3 + ": " + stringCache.getItemByIndex(3));
        System.out.println("");

        System.out.println("Существует 'Второй': " + stringCache.exists("Второй"));
        System.out.println("Существует 'Первый': " + stringCache.exists("Первый"));
        System.out.println("");

        System.out.println("Удаляем 'Второй': " + stringCache.remove("Второй"));
        System.out.println("Удаляем 'Первый': " + stringCache.remove("Первый"));
        printCache(stringCache);
        
    }
    
    private static void printCache(Cache<String> cache) {
        for (int i = 0; i < 3; i++) {
            String element = cache.getItemByIndex(i);
            if (element != null) {
                System.out.println("  [" + i + "] " + element);
            }
        }
    }
}