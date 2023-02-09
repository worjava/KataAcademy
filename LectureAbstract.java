
//нельзя использовать конструктор в абстрактный классах для создания объекта и экземпляр асбтсрактного класса
//Абстрактные классы призваны предостовлять функционал для наследников. А производные классы реализуют этот функционал.

public class LectureAbstract {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", "sberbank");
        bob.display();
        Client alex = new Client("Alex", "cберанк");


        alex.display();
    }

}

abstract class Person {


    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void display();
}

class Employee extends Person {
    private String bank;


    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display() {

        System.out.println("Менеджер " + bank + " Имя " + getName());
    }
}

class Client extends Person {

    private String bank;

    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }


    @Override
    public void display() {

    }
}






