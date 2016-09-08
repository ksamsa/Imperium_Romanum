package bttstudio.imperiumromanum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by ksamsa on 08.09.2016.
 */
public class EventPicker {

    public Event selectRandomEvent(ArrayList<Event> events_list){
        Event chosen_event = new Event();
        Random rng = new Random();

        //Events to pick from at the end
        HashMap<Integer,Event> events = new HashMap<>();
        for(int ii = 0; ii<events_list.size(); ii++){
            events.put(events_list.get(ii).event_id, events_list.get(ii));
        }

        //Gets event ids and their weights and a sum of all of them
        HashMap<Integer,Integer> event_weights = new HashMap<>();
        int total_weight = 0;

        System.out.println(events_list.get(0).event_id);
        System.out.println(events_list.get(0).event_weight);
        for(int ii = 0; ii<events_list.size(); ii++){
            event_weights.put(events_list.get(ii).event_id, events_list.get(ii).event_weight);
            total_weight = total_weight + events_list.get(ii).event_weight;
        }

        System.out.println(total_weight);
        //Gets a random weight
        int random_weight = rng.nextInt(total_weight);

        //Gets all the event ids for randomization into an ArrayList
        ArrayList<Integer> event_ids = new ArrayList<>();

        for(int ii = 0; ii<events_list.size(); ii++){
            event_ids.add(ii+1);
        }

        //Picking out event
        boolean event_found = false;
        int temp_weight = 0;
        int temp_event;

        while(event_found == false){
            temp_event = rng.nextInt(event_ids.size());
            temp_weight = temp_weight + event_weights.get(event_ids.get(temp_event));

            //Compares wights and returns chosen Event if conditions are met
            if(temp_weight >= random_weight){
                chosen_event = events.get(event_ids.get(temp_event));
                event_found = true;
            }
            else{
                //Removes event from list if weight is not reached
                event_ids.remove(temp_event);
            }
        }

        return chosen_event;
    }
}
