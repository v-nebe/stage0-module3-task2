package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    public static void main(String[] args){
        callToFriend();
        callByNumber(34567);
    }

    public static void callToFriend() {
        System.out.println("You call a friend");
    }

    public static void callByNumber(int number) {
        System.out.println("You called the number: " + number);
    }
}

