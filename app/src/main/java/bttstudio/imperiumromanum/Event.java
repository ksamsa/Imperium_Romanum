package bttstudio.imperiumromanum;

/**
 * Created by ksamsa on 07.09.2016.
 */
public class Event {

    public int event_id;
    public String event_name;
    public String event_text;
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


    //Main event get/set

    public int getEventId(){
        return event_id;
    }

    public void setEventId(int event_id_value){
        event_id = event_id_value;
    }

    public String getEventName(){
        return event_name;
    }

    public void setEventName(String name_text){
        event_name = name_text;
    }

    public String getEventText(){
        return event_text;
    }

    public void setEventText(String event_text_value){
        event_text = event_text_value;
    }

    //Choice A get/set

    public String getChoiceA(){
        return choice_A;
    }

    public void setChoiceA(String choice_A_text){
        choice_A = choice_A_text;
    }

    public int getAgeChangeA(){
        return age_change_A;
    }

    public void setAgeChangeA(int age_change_A_value){
        age_change_A = age_change_A_value;
    }

    public int getHealthChangeA(){
        return health_change_A;
    }

    public void setHealthChangeA(int health_change_A_value){
        health_change_A = health_change_A_value;
    }

    public int getWealthChangeA(){
        return wealth_change_A;
    }

    public void setWealthChangeA(int wealth_change_A_value){
        wealth_change_A = wealth_change_A_value;
    }

    public int getFameChangeA(){
        return fame_change_A;
    }

    public void setFameChangeA(int fame_change_A_value){
        fame_change_A = fame_change_A_value;
    }

    public int getNextQuestA(){
        return next_quest_A;
    }

    public void setNextQuestA(int next_quest_A_value){
        next_quest_A = next_quest_A_value;
    }

    //Choice B get/set

    public String getChoiceB(){
        return choice_B;
    }

    public void setChoiceB(String choice_B_text){
        choice_B = choice_B_text;
    }

    public int getAgeChangeB(){
        return age_change_B;
    }

    public void setAgeChangeB(int age_change_B_value){
        age_change_B = age_change_B_value;
    }

    public int getHealthChangeB(){
        return health_change_B;
    }

    public void setHealthChangeB(int health_change_B_value){
        health_change_B = health_change_B_value;
    }

    public int getWealthChangeB(){
        return wealth_change_B;
    }

    public void setWealthChangeB(int wealth_change_B_value){
        wealth_change_B = wealth_change_B_value;
    }

    public int getFameChangeB(){
        return fame_change_B;
    }

    public void setFameChangeB(int fame_change_B_value){
        fame_change_B = fame_change_B_value;
    }

    public int getNextQuestB(){
        return next_quest_B;
    }

    public void setNextQuestB(int next_quest_B_value){
        next_quest_B = next_quest_B_value;
    }

}
