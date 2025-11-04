public class TimeCalc {
    public static void main(String[] args) {
        String inputTime = args[0];
        int inputMinutes = Integer.parseInt(args[1]);

        int inputTimeH = Integer.parseInt("" + inputTime.charAt(0) + inputTime.charAt(1));
        int inputTimeM = Integer.parseInt("" + inputTime.charAt(3) + inputTime.charAt(4));

        int totalMinutes = inputTimeH*60+inputMinutes+inputTimeM;
        int totalHours = totalMinutes/60;
        int newHours = totalHours % 24;
        String newHoursOut = (""+newHours);


        int newMinutes = totalMinutes - (totalHours * 60);
        String newMinutesOut = (""+newMinutes);

        newHoursOut = newHours < 10 ? ("0"+newHours) : newHoursOut;
        newMinutesOut = newMinutes < 10 ? ("0"+newMinutes) : newMinutesOut;

        String output = (newHoursOut+":"+newMinutesOut);

        System.out.println(output);
        // System.out.println(totalMinutes);


    }
}
