public class DiceRoll {
    int rolla, rollb;

    //  Denne constructor definerer terningernes start værdier
    public DiceRoll(int rollA, int rollB) {
        rolla = rollA;
        rollb = rollB;
    }

    public boolean equals(DiceRoll other) {
        return other.getRolla() == rolla && other.getRollb() == rollb;
    }

    //  Returnerer den samlede værdi af spillerens to terningekast
    public int getValue() {
        return rolla + rollb;
    }

    //  Getters

    public int getRolla() {
        return rolla;
    }

    public int getRollb() {
        return rollb;
    }
}
