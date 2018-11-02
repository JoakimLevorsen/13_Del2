public class Dice {

    private int maxFaceValue;

    public Dice(int maxFaceValue){
        this.maxFaceValue = maxFaceValue;

    }
    public int roll(){
        double d = Math.random()*maxFaceValue+1;
        int faceValue = (int)d;
        return faceValue;

    }

}
