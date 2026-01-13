public class SoccerTeam {
    public static int gamesPlayed;
    public static int goalsScored;

    public int wins;
    public int losses;
    public int ties;

    public SoccerTeam() {
        startTournament();
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        if (myScore > otherScore) wins++;
        else if (otherScore < myScore) losses++;
        else ties++;

        if (other != null) {
            gamesPlayed++;
            goalsScored += myScore + otherScore;
            other.played(null, otherScore, myScore);
        }
    }

    public int points() {
        return wins*3 + ties;
    }

    public void reset() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static void startTournament() {
        gamesPlayed = 0;
        goalsScored = 0;
    }

    public static int games() {
        return gamesPlayed;
    }

    public static int goals() {
        return goalsScored;
    }
}