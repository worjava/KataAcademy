package Exception;

class Car22 {

public static void main(String[] args) throws Exception {
    try (Car car = new Car()) {
        car.drive();


    } catch (Exception e) {
    }
}

static public class Car implements AutoCloseable {
    void drive() {
        System.out.println("Машина поехала");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Машина закрывается");
    }
}
}

