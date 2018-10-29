public class Q1 {

    public static void main(String[] args) {
        String time1 = "12:00:00AM";
        String time2 = "02:00:00PM";
        String time3 = "09:12:56AM";

        String expected1 = "00:00:00";
        String expected2 = "14:00:00";
        String expected3 = "09:12:56";

        String got1 = convertTime(time1);
        String got2 = convertTime(time2);
        String got3 = convertTime(time3);

        System.out.println(time1 + " -> " + expected1 + "? got:" + got1 + " " + (got1.equals(expected1)));
        System.out.println(time2 + " -> " + expected2 + "? got:" + got2 + " " + (got2.equals(expected2)));
        System.out.println(time3 + " -> " + expected3 + "? got:" + got3 + " " + (got3.equals(expected3)));
    }

    public static String convertTime(String input) {
    }
}
