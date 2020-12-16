//Eric Zhou, ezzhou

import org.junit.*;
import static org.junit.Assert.*;

public class Examples {
    ShootingRound r1 = new ShootingRound(4);
    ShootingRound r2 = new ShootingRound(1);
    ShootingRound r3 = new ShootingRound(5);
    ShootingRound r4 = new ShootingRound(3);
    ShootingRound r5 = new ShootingRound(0);
    ShootingRound r6 = new ShootingRound(2);

    ShootingResult shootingResult1 = new ShootingResult(r5, r4, r1, r3);
    SkiingResult skiingResult1 = new SkiingResult(2, 37.6, 34.5, 39.9, 32.6, 2);

    ShootingResult shootingResult2 = new ShootingResult(r2, r6, r4, r1);
    SkiingResult skiingResult2 = new SkiingResult(6, 51.7, 47.5, 48.5, 49.2, 7);

    Athlete athlete1 = new Athlete(new FinalResult(shootingResult1, skiingResult1));
    Athlete athlete2 = new Athlete(new FinalResult(shootingResult2, skiingResult2));

    //ShootingResult test cases
    @Test
    public void checkShootingPoints() {
        assertEquals(12, shootingResult1.pointsEarned(), 0.01);
        assertEquals(10, shootingResult2.pointsEarned(), 0.01);
    }
    @Test
    public void checkShootingPenalty() {
        assertEquals(480, shootingResult1.getPenalties(), 0.01);
        assertEquals(600, shootingResult2.getPenalties(), 0.01);
    }

    //SkiingResult test cases
    @Test
    public void checkSkiingPoints() {
        assertEquals(144.6, skiingResult1.pointsEarned(), 0.01);
        assertEquals(196.9, skiingResult2.pointsEarned(), 0.01);
    }
    @Test
    public void checkSkiingPenalty() {
        assertEquals(10, skiingResult1.getPenalties(), 0.01);
        assertEquals(35, skiingResult2.getPenalties(), 0.01);
    }

    //finalScore() test cases
    @Test
    public void checkFinalScore() {
        assertEquals(627.6, athlete1.getFinalResult().finalScore(), 0.01);
        assertEquals(831.9, athlete2.getFinalResult().finalScore(), 0.01);
    }

    //betterSkiier() test cases
    @Test
    public void checkBetterSkiier() {
        assertTrue(athlete1.betterSkiier(athlete2));
        assertFalse(athlete2.betterSkiier(athlete1));
        assertFalse(athlete1.betterSkiier(athlete1));
    }

    //betterShooter() test cases
    @Test
    public void checkBetterShooter() {
        assertTrue(athlete1.betterShooter(athlete2));
        assertFalse(athlete2.betterShooter(athlete2));
    }

    //hasBeaten() test cases
    @Test
    public void checkHasBeaten() {
        assertTrue(athlete1.hasBeaten(athlete2));
        assertFalse(athlete2.hasBeaten(athlete1));
        assertFalse(athlete2.hasBeaten(athlete2));
    }
}