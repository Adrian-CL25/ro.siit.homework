package homework3.libraryApp;

public class AlbumArt extends Book {
    protected String paperQuality;

    public AlbumArt(String name, int noOfPages, String paperQuality) {
        super(name, noOfPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    void add() {
        setName("Noaptea sexuala");
        setPaperQuality("HQ");
        setNoOfPages(45);
        System.out.println("Album art added!!");
    }

    @Override
    void delete() {
        setName("....");
        setNoOfPages(0);
        setPaperQuality("....");
        System.out.println("Album art 'Prado' deleted!");
    }

    @Override
    void list() {
        System.out.println("Name:" + getName() + " Pages:" + getNoOfPages() + " Quality:" + getPaperQuality());

    }

    @Override
    public String toString() {
        return "\r Album Art:" + " [Name='" + name + "'" + "," + " Paper Quality=" + paperQuality + "," + " Pages=" + noOfPages + ']' + '\n';

    }

}
