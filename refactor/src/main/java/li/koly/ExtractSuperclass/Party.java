package li.koly.ExtractSuperclass;

public abstract class Party {
    protected final String name;

    public Party(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
