public class Main {
    public static void main(String[] args){
        Course c = new Course("пр1","пр2");
        Team team = new Team("m1","m2","m3","m4");
        c.doIt(team);
        team.showResults(team);
    }
}
