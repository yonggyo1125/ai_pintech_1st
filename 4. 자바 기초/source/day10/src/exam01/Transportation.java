package exam01;

public enum Transportation {
    BUS("버스") {
        @Override
        public int getTotal(int person) {
            return 1500 * person;
        }
    },
    SUBWAY("지하철") {
        @Override
        public int getTotal(int person) {
            return 1400 * person;
        }
    },
    TAXI("택시") {
        @Override
        public int getTotal(int person) {
            return 4500 * person;
        }
    };

    private final String title;

    Transportation(String title) { // private
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getTotal(int person);
}
