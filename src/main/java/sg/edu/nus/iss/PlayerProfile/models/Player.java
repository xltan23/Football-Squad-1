package sg.edu.nus.iss.PlayerProfile.models;

public class Player {
    
    private String name;
    private String email;
    private int height;
    private int weight;
    private String position;

    public Player(String n, String e, int h, int w, String p) {
        this.name = n;
        this.email = e;
        this.height = h;
        this.weight = w;
        this.position = p;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Player [email=" + email + ", height=" + height + ", name=" + name + ", position=" + position
                + ", weight=" + weight + "]";
    }
    
}
