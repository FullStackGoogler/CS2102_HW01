public class Athlete {
    private final FinalResult finalresult;

    public Athlete(FinalResult finalresult) { this.finalresult = finalresult; }

    //Returns whether or not they have a lower ski time (w/o penalties) than a given Athlete
    public boolean betterSkiier(Athlete athlete) {
        return finalresult.getSkiingResult().pointsEarned() < athlete.getFinalResult().getSkiingResult().pointsEarned();
    }

    //Returns whether or not they have a higher shooting score (w/o penalties) than a given Athlete
    public boolean betterShooter(Athlete athlete) {
        return finalresult.getShootingResult().pointsEarned() > athlete.getFinalResult().getShootingResult().pointsEarned();
    }

    //Returns whether or not they have a lower ski time, OR a higher shooting score
    public boolean hasBeaten(Athlete athlete) {
        return (betterSkiier(athlete)) || (betterShooter(athlete));
    }

    public FinalResult getFinalResult() {
        return finalresult;
    }
}