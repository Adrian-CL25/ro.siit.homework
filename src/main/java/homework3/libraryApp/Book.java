package homework3.libraryApp;

abstract class Book {
    public String name ;
    public int noOfPages ;
    abstract void add();
    abstract void delete();
    abstract void list();

    public Book(String name, int noOfPages) {
        this.name = name;
        this.noOfPages = noOfPages;
    }

     String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
