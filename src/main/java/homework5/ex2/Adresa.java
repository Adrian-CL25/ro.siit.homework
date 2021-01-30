package homework5.ex2;

public class Adresa {
    private String country;
    private  String region;

    public Adresa(String country, String region) {
        this.country = country;
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Country: ");
        builder.append(country);
        builder.append("Region: ");
        builder.append(region);

        return "Country:"+'\''+getCountry()+'\''+" Region:"+'\''+getRegion()+'\'';
    }
}
