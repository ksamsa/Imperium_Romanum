package bttstudio.imperiumromanum;

import android.content.Context;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by ksamsa on 07.09.2016.
 */
public class EventCreator {

    public ArrayList events;




    public static ArrayList readEventsFile(Resources res, int resId){

        ArrayList<Event> events = new ArrayList<>();


        InputStream inputStream = res.openRawResource(resId);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
/*

        public String choice_A;
        public int age_change_A;
        public int health_change_A;
        public int wealth_change_A;
        public int fame_change_A;
        public int next_quest_A;
        public String choice_B;
        public int age_change_B;
        public int health_change_B;
        public int wealth_change_B;
        public int fame_change_B;
        public int next_quest_B;
*/

        try {
            while((line = bufferedReader.readLine()) != null) {
                if(line.length() == 0){
                }
                else{
                    System.out.println(line);
                    System.out.println(line.indexOf("="));
                    String parameter = line.substring(0, line.indexOf("=") - 1).trim();
                    String value = line.substring(line.indexOf("=") + 2);

                switch(parameter){
                    case "event_id":
                        events.add(new Event());
                        events.get(events.size() - 1).setEventId(Integer.parseInt(value));
                        break;
                    case "event_weight":
                        break;
                    case "event_name":
                        break;
                    case "event_text":
                        break;
                    case "choice_A":
                        break;
                    case "age_change_A":
                        break;
                    case "health_change_A":
                        break;
                    case "wealth_change_A":
                        break;
                    case "fame_change_A":
                        break;
                    case "next_quest_A":
                        break;
                    case "choice_B":
                        break;
                    case "age_change_B":
                        break;
                    case "health_change_B":
                        break;
                    case "wealth_change_B":
                        break;
                    case "fame_change_B":
                        break;
                    case "next_quest_B":
                        break;

                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return events;
    }
}
