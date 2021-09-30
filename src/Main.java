import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){
        Course c = new Course("пр1","пр2");
        Team team = new Team("Ivan","Diman","Roman","Stepan");
        c.doIt(team);
        team.showResults();
    }
}
