package homework8;

public class DriveApp {
    public static void main(String[] args) {


        PersonsByThreads personsByThreads = new PersonsByThreads();
        personsByThreads.setName("Persons with access:\n");
        System.out.println(personsByThreads.getName());
        personsByThreads.start();


    }
}
