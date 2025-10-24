public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2015, "Red", 15000, "A123BC"),
            new Car(2, "BMW", "X5", 2020, "White", 45000, "D456FG"),
            new Car(3, "Lada", "Cross", 2019, "Blue", 11750, "I901KL")
        };
        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Найдено машин Toyota: " + toyotaCars.length);
    }    

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }
        Car[] result = new Car[count];
        int index = 0;

        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index] = car;
                index++;
            }
        }
        return result;
    }
}