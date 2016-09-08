package bttstudio.imperiumromanum;

import android.content.Context;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


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

        try {
            while((line = bufferedReader.readLine()) != null) {
                if(line.length() == 0){
                }
                else{

                    String parameter = line.substring(0, line.indexOf("=") - 1).trim();
                    String value = line.substring(line.indexOf("=") + 2);

                    Event event = new Event();



                switch(parameter){
                    case "event_id":
                        events.add(new Event());
                        events.get(events.size() - 1).setEventId(Integer.parseInt(value));
                        break;
                    case "event_weight":
                        events.get(events.size() - 1).setEventWeight(Integer.parseInt(value));
                        break;
                    case "event_name":
                        events.get(events.size() - 1).setEventName(value);
                        break;
                    case "event_text":
                        events.get(events.size() - 1).setEventText(value);
                        break;
                    case "choice_A":
                        events.get(events.size() - 1).setChoiceA(value);
                        break;
                    case "age_change_A":
                        events.get(events.size() - 1).setAgeChangeA(Integer.parseInt(value));
                        break;
                    case "health_change_A":
                        events.get(events.size() - 1).setHealthChangeA(Integer.parseInt(value));
                        break;
                    case "wealth_change_A":
                        events.get(events.size() - 1).setWealthChangeA(Integer.parseInt(value));
                        break;
                    case "fame_change_A":
                        events.get(events.size() - 1).setFameChangeA(Integer.parseInt(value));
                        break;
                    case "next_quest_A":
                        events.get(events.size() - 1).setNextQuestA(Integer.parseInt(value));
                        break;
                    case "choice_B":
                        events.get(events.size() - 1).setChoiceB(value);
                        break;
                    case "age_change_B":
                        events.get(events.size() - 1).setAgeChangeB(Integer.parseInt(value));
                        break;
                    case "health_change_B":
                        events.get(events.size() - 1).setHealthChangeB(Integer.parseInt(value));
                        break;
                    case "wealth_change_B":
                        events.get(events.size() - 1).setWealthChangeB(Integer.parseInt(value));
                        break;
                    case "fame_change_B":
                        events.get(events.size() - 1).setFameChangeB(Integer.parseInt(value));
                        break;
                    case "next_quest_B":
                        events.get(events.size() - 1).setNextQuestB(Integer.parseInt(value));
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
