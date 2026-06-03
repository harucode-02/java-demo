package brocode.OOP;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main33 {
    static void main(String[] args) {

            // ==========JAVA ALARM CLOCK==========

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "src/brocode/OOP/Visions - Patrick Jordan Patrikios.wav";


        while(alarmTime == null){
            try{
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }

        M33AlarmClock alarmClock = new M33AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}
