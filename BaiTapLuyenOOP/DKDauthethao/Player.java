package DKDauthethao;

public class Player {
    private String name;
    private int age;
    private String position; // vi tri

    public Player(String name, int age, String position){
        this.name=name;
        this.age=age;
        this.position=position;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPosition() {
        return position;
    }

}
