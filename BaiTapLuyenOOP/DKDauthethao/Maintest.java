package DKDauthethao;

public class Maintest {
    public static void main(String[] args) {
        Tournament giai1 = new Tournament("quyen anh", "Ha noi", 8);
        Tournament giai2 = new Tournament("ve", "Hoa binh", 12);
        Tournament giai3 = new Tournament("lap trinh", "Bac ninh", 10);

        // Team t1 = new Team("team 1");
        Team t2 = new Team("team 2");
        // Team t3 = new Team("team 3");
        // Team t5 = new Team("team 5");
        Team t4 = new Team("team 4");
        Team t6 = new Team("team 6");

        Player p1 = new Player("Thang", 16, "tan cong");
        Player p2 = new Player("Anh", 16, "Phong thu");
        Player p3 = new Player("Tuan", 16, "chinh");
        Player p4 = new Player("Kieu", 16, "du bi");
        Player p5 = new Player("Thu", 16, "chinh");
        Player p6 = new Player("Phong", 16, "du bi");
        
        t2.addPlayers(p1);
        t2.addPlayers(p2);
        t2.numberTeam();
        
        t4.addPlayers(p3);
        t4.addPlayers(p4);
        t4.numberTeam();
        
        t6.addPlayers(p5);
        t6.addPlayers(p6);
        t6.numberTeam();
    
        giai1.registerTeam(t2);
        giai2.registerTeam(t4);
        giai3.registerTeam(t6);
        
        
        giai1.InThongTin();
        giai2.InThongTin();
        giai3.InThongTin();
    }
}
    