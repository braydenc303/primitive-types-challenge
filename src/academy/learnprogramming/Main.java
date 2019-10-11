package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        byte myChallengeByte = 82;
        short myChallengeShort = 15000;
        int myChallengeInt = 5;
        //We do not seem to get the casting error with long.
        long myChallengeLong = 50000 + 10 * (myChallengeByte + myChallengeShort + myChallengeInt);

        System.out.println("myChallenge: " + myChallengeLong);    
        short shortTotal = (short) (1000 + 10 * (myChallengeByte + myChallengeShort + myChallengeInt));
        System.out.println("myChallengeShortTotal: " + shortTotal);
    }
}