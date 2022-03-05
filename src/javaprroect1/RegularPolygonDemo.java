// Skyler Voran
// Project 1
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class RegularPolygonDemo {
    public static void main(String[] args) {
        
        Scanner infile = null;
        String input;
        ArrayList<RegularPolygon> PolygonList=new ArrayList<RegularPolygon>();
        try {
            infile = new Scanner(new File("input.txt"));
            
            while(infile.hasNext()) {
                input = infile.nextLine();
                String[] line = input.split(" ", 0);
                if (line.length == 2) {
                    PolygonList.add(new RegularPolygon(
                            Integer.parseInt(line[0]),
                            Double.parseDouble(line[1])));
                }
                else if (line.length == 4) {
                    PolygonList.add(new RegularPolygon(
                            Integer.parseInt(line[0]),
                            Double.parseDouble(line[1]), 
                            Double.parseDouble(line[2]), 
                            Double.parseDouble(line[3]) ));
                }
            }
            for(RegularPolygon r : PolygonList)
               System.out.println(r.toString());
        }
        catch(FileNotFoundException ex) {
            System.out.println("Ooops can't find the file.");
            
            
        }
        finally {
            if(infile != null) {
                infile.close();
            }
        }
        
    }
}
