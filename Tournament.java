import java.util.Random;
public class Tournament {
    static SoccerTeam[] teams = new SoccerTeam[4];
    static Random rand = new Random();

    public static void main(String[] args) {
        RoundRobin();
        RoundRobin();
    }

    static void RoundRobin() {
        for (int i = 0; i < 4; i++) {
            teams[i] = new SoccerTeam();
        }

        teams[0].played(teams[1], rand.nextInt(2), rand.nextInt(2)); 
        teams[0].played(teams[2], rand.nextInt(2), rand.nextInt(2)); 
        teams[0].played(teams[3], rand.nextInt(2), rand.nextInt(2)); 
        teams[1].played(teams[2], rand.nextInt(2), rand.nextInt(2)); 
        teams[1].played(teams[3], rand.nextInt(2), rand.nextInt(2)); 
        teams[2].played(teams[3], rand.nextInt(2), rand.nextInt(2));
        
        for (SoccerTeam team : teams) {
            System.out.println("score: " + team.points());
            team.reset();
        }
        System.out.println("games: " + teams[0].games());
        System.out.println("goals: " + teams[0].goals() + "\n");
    }
}