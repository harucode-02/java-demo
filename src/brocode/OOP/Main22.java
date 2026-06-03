package brocode.OOP;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main22 {
    static void main(String[] args) {
        // How to PLAY AUDIO with Java (.wav, .au, .aiff)

        // STAGE-01
        String filePath = "src/brocode/OOP/Visions - Patrick Jordan Patrikios.wav";
        File file = new File(filePath);

        // STAGE-02
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

        // STAGE-03
            Clip clip = AudioSystem.getClip();
           clip.open(audioStream);


        // STAGE-04
           String response = "";

           while(!response.equals("Q")){

                System.out.println("P = Play");
                System.out.println("P = Play");
                System.out.println("R = Reset");
                System.out.println("P = Play");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
           }

        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
