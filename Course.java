package Maraphon;

public class Course {
    private Obstacle[] exesizes;
    public Course(Obstacle...exesizes){
        this.exesizes = exesizes;
    }
    public void doIt(Team team){
        for (Competitor c:team.getMembers()) {
            for (Obstacle e:exesizes) {
                e.doIt(c);
                if (!c.isOnDistance()) {break;}
            }
        }
    }
}
