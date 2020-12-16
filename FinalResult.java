public class FinalResult {
    private final ShootingResult shootingResult;
    private final SkiingResult skiingResult;

    public FinalResult(ShootingResult shootingResult, SkiingResult skiingResult) {
        this.shootingResult = shootingResult;
        this.skiingResult = skiingResult;
    }

    //Returns the final score of an athlete, based on their skiing time, shooting and skiing penalties, modified by their skiing position
    public double finalScore() {
        return skiingResult.pointsEarned() + skiingResult.getPenalties() + shootingResult.getPenalties() + modifier();
    }

    public SkiingResult getSkiingResult() {
        return skiingResult;
    }

    public ShootingResult getShootingResult() {
        return shootingResult;
    }

    //Returns the amount of points deducted off of the final score based on their position
    private double modifier() {
        switch(skiingResult.getPosition()) {
            case 1:
                return -10;
            case 2:
                return -7;
            case 3:
                return -3;
            case 4:
                return -1;
            default:
                return 0;
        }
    }
}