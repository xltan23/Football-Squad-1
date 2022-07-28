package sg.edu.nus.iss.PlayerProfile.models;

public class Footballer {
    
    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private String position;

    public Footballer(String fn, String ln, int h, int w, String p) {
        this.firstName = fn;
        this.lastName = ln;
        this.height = h;
        this.weight = w;
        this.position = p;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return "Footballer [firstName=" + firstName + ", height=" + height + ", lastName=" + lastName + ", position="
                + position + ", weight=" + weight + "]";
    } 


}
