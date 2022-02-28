import java.nio.file.PathMatcher;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:01:00AM";
        char ampm = s.charAt(s.length() - 2);
        String hour = s.substring(0, 2);
        String result = "";

        if (ampm == 'A') {
            if (hour.equals("12")) {
                hour = "00";
            }
            result = hour + s.substring(2, (s.length() - 2));
        } else

        if (ampm == 'P') {
            if (!hour.equals("12")) {
                hour = Integer.toString(Integer.parseInt(hour) + 12);
            } else
                result = hour + s.substring(2, (s.length() - 2));
        }

        System.out.println(result);
    }
}






// if (s.substring(8, 9).equals("A")) {
// if (s.substring(0, 2).equals("01")) {
// time = "01" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("02")) {
// time = "02" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("03")) {
// time = "03" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("04")) {
// time = "04" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("05")) {
// time = "05" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("06")) {
// time = "06" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("07")) {
// time = "07" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("08")) {
// time = "08" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("09")) {
// time = "09" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("10")) {
// time = "10" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("11")) {
// time = "11" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("12")) {
// time = "00" + s.substring(2, 8);
// }
// }

// if (s.substring(8, 9).equals("P")) {
// if (s.substring(0, 2).equals("12")) {
// time = "12" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("01")) {
// time = "13" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("02")) {
// time = "14" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("03")) {
// time = "15" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("04")) {
// time = "16" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("05")) {
// time = "17" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("06")) {
// time = "18" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("07")) {
// time = "19" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("08")) {
// time = "20" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("09")) {
// time = "21" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("10")) {
// time = "22" + s.substring(2, 8);
// }
// if (s.substring(0, 2).equals("11")) {
// time = "23" + s.substring(2, 8);
// }

// }
// System.out.println(time);
// }
// System.out.println(s.substring(8,9));
// }
