public class Main {
    public static void main(String[] args) {
        String myName = "Mikhail";
        int myAge = 30;
        double myWeight = 62.4;
        String outString = myName + ": age - " + myAge + ", weight - " + myWeight;

        System.out.println(outString);

        boolean isOld = myAge > 99;
        boolean isYoung = myAge <= 99;

        System.out.println(isOld);
        System.out.println(isYoung);
    }
}
