package lang.print.gaps.task2;

public class advancedNamingConvention {
    public static void main(String[] args) {
        final int ADULT_AGE = 18;
        int age = 20;
        int phoneNumber = 80292255;

        callByNumber(phoneNumber);
        callToFriend(age);
        callToFriend(ADULT_AGE);
    }

    public static void callToFriend(int ageFriend) {
       System.out.println( ageFriend);
    }

    public static void callByNumber(int number) {
        System.out.println(number );
    }
}
