public class Team {
    public Team(String m1,String m2, String m3, String m4){

    }
    public static void showResults(Team team){
        String[] members = new String[4];
        members[0]="Ivan";
        members[1]="Vovan";
        members[2]="Roman";
        members[3]="Diman";
        for (int i=0;i< members.length;i++) {
            System.out.println("Участник " + (members[i]) + " прошёл препятствия");
        }
    }

}
