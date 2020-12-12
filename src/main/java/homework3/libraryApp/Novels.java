package homework3.libraryApp;

public class Novels extends Book {
    protected String type;

    public Novels(String name, int noOfPages, String type) {
        super(name, noOfPages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    @Override
    void add() {
        setName("White Queen");
        setType("historic");
        setNoOfPages(500);
        System.out.println("Novel 'White Queen' added!");
    }

    @Override
    void delete() {
        setName("....");
        setType("....");
        setNoOfPages(0);
        System.out.println("Novel 'Ion' deleted!");
    }

    @Override
    void list() {
        System.out.println("Name:" + getName() + "," + " Pages:" + getNoOfPages() + "," + " Type:" + getType());

    }

    @Override
    public String toString() {
        return "\r Novel:" + " [ Name='" + name + "'" + "," + "Type=" + type + "," + " Pages=" + noOfPages + ']' + '\n';
    }

}




