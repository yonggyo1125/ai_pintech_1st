package exam01;

public enum Transportation {
    BUS("버스"),
    SUBWAY("지하철"),
    TAXI("택시");

    private final String title;

    Transportation(String title) { // private
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
