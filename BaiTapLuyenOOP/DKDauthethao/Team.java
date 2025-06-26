package DKDauthethao;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> Members;

    public Team(String teamName){
        this.teamName=teamName;
        // Members = null;
        this.Members = new ArrayList<>();
        System.out.println("Da tao doi");
    }
    public void addPlayers(Player p){
        this.Members.add(p);
        System.out.println("Ban da tham gia doi thanh cong vao team: " + teamName);
        System.out.println();

    }
    public String getTeamName() {
        return teamName;
    }
    public List<Player> getMembers() {
        return Members;
    }

    public void numberTeam(){
        if(this.Members.isEmpty()){
            System.out.println("Team chua co thanh vien nao");
        }else{
            System.out.println("Doi cua ban co:"+ Members.size()+" thanh vien");
            System.out.println("Cac thanh vien cua "+ teamName + " la:");
            for(int i = 0; i < Members.size(); i++){
                System.out.println("Thanh vien "+ (i+1) +":" + " ten: "+ Members.get(i).getName()+ " ,tuoi: "+ Members.get(i).getAge() +" ,vi tri: " + Members.get(i).getPosition());
            }
            System.out.println();

        }
    }
}
