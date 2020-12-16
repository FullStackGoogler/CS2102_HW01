public class ShootingResult implements IEvent {
    private final ShootingRound round1, round2, round3, round4;

    public ShootingResult(ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4) {
        this.round1 = round1;
        this.round2 = round2;
        this.round3 = round3;
        this.round4 = round4;
    }

    //Points earned is the sum of the targets hit per round
    public double pointsEarned() {
        return round1.getTargetsHit() + round2.getTargetsHit() + round3.getTargetsHit() + round4.getTargetsHit();
    }

    //Penalty time is equal to 60s multiplied by the total targets missed
    public double getPenalties() {
        return 60 * (20 - (int) pointsEarned());
    }
}