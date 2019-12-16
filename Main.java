package Maraphon;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Земляне", new Human("Женя"), new Cat("Мурзик"), new Dog("Полкан"));
        Course course = new Course(new Cross(50), new Wall(2), new Water(20), new Cross(100));
        course.doIt(team);
        team.outputWinners();
    }
}

