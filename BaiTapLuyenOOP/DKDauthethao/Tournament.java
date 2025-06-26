package DKDauthethao;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String name;
    private String location;
    private int maxTeams;
    private List<Team> registeredTeams; // doi da dang ki 

    public Tournament(String name, String location, int maxTeams){
        this.name=name;
        this.location=location;
        this.maxTeams=maxTeams;
        this.registeredTeams = new ArrayList<>();
        // registeredTeams = null;
        System.out.println("Giai dau: "+name + " o: " + location);
    }

    public boolean registerTeam(Team t){ // dang ki doi
        if( this.registeredTeams.size() < maxTeams){
            this.registeredTeams.add(t);
            System.out.println("Doi cua ban da dang ki thanh cong");
            System.out.println();

            return true;
        }
        System.out.println("Giai dau da du doi");
        return false;
    }
    public void InThongTin(){
        if(this.registeredTeams.isEmpty()){
            System.out.println("Chua co doi nao dang ki");
        }else{
            System.out.println("Cac doi da dang ki cua giai "+ name +" la:");
            for(int i=0; i < registeredTeams.size(); i++){
                    System.out.println("Doi "+ (i+1) + ":" + registeredTeams.get(i).getTeamName() +" co: "+ registeredTeams.get(i).getMembers().size() + " thanh vien");
            }
            System.out.println();


        }
    }

}
