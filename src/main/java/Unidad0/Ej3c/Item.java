package Unidad0.Ej3c;

public class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        setId(id);
        setName(name);
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
}
