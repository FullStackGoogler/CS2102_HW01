public class SkiingResult implements IEvent {
    private final int position;
    private final double lap1, lap2, lap3, lap4;
    private final int penalties;

    public SkiingResult(int pos, double lap1, double lap2, double lap3, double lap4, int penalties) {
        this.position = pos;
        this.lap1 = lap1;
        this.lap2 = lap2;
        this.lap3 = lap3;
        this.lap4 = lap4;
        this.penalties = penalties;
    }

    //Points earned is the sum of each lap time
    public double pointsEarned() {
        return lap1 + lap2 + lap3 + lap4;
    }

    //Penalty time is equal to 5s multiplied by the amount of penalties
    public double getPenalties() {
        return 5 * penalties;
    }

    public int getPosition() {
        return position;
    }
}
