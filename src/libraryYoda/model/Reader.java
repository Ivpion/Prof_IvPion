package libraryYoda.model;

/**
 * Created by ivan on 14.05.16.
 */
public class Reader implements Comparable {

    private int id;
    private String name;

    public Reader() {
    }

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Reader(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
