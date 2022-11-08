public class Country {

    private String name;
    private int person;
    private int square;
    private String language;

    public Country(String name, int person, int square, String language) {
        this.name = name;
        this.person = person;
        this.square = square;
        this.language = language;

    }

    @Override
    public String toString() {
        return "Country\n" +
                "name='" + name + '\'' +
                ", person=" + person +
                ", square=" + square +
                ", language='" + language + '\'';
    }
    public void area(){



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
