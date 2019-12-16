package Maraphon;

public class Team {

    private String name_team;
    private Competitor[] members_team;

    //
    public Competitor[] getMembers() {
        return members_team;
    }

    public Team(String name_team, Competitor... members_team) {
        this.name_team = name_team;
        this.members_team = members_team;
    }

    void outputWinners() {
        System.out.println("Победители");
        for (Competitor o : members_team) {
            if (o.isOnDistance()) {
                o.info();
            }
        }
    }
}
