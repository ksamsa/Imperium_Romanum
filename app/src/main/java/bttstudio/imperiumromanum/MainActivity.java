package bttstudio.imperiumromanum;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        final ArrayList<Event> eventArrayList = new EventCreator().readEventsFile(res,R.raw.events_file);
        final Event active_event = newEvent(eventArrayList);

        final Player new_player = new Player();

        final ArrayList<TextView> values = createTextViews();

        updateUI(values, new_player, eventArrayList, active_event);

        final TextView choiceA = (TextView)findViewById(R.id.choice_a);
        TextView choiceB = (TextView)findViewById(R.id.choice_b);

        choiceA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                choiceA(active_event,new_player,values,eventArrayList);
            }
        });

        choiceB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                choiceB(active_event,new_player,values,eventArrayList);
            }
        });
    }

    private Event newEvent(ArrayList<Event> eventArrayList){
        Event event = new EventPicker().selectRandomEvent(eventArrayList);
        return event;
    }

    private void updateUI(ArrayList<TextView> values, Player current_player, ArrayList<Event> eventArrayList, Event active_event){
        values.get(0).setText(current_player.getName());
        values.get(1).setText(String.valueOf(current_player.getAge()));
        values.get(2).setText(String.valueOf(current_player.getWealth()));
        values.get(3).setText(String.valueOf(current_player.getFame()));
        values.get(4).setText(String.valueOf(current_player.getHealth()));
        values.get(5).setText(String.valueOf(current_player.getGod()));

        active_event = newEvent(eventArrayList);
        System.out.println(active_event.getChoiceA());
        System.out.println(active_event.getChoiceB());

        TextView tv1 = (TextView)findViewById(R.id.event_name);
        tv1.setText(active_event.getEventName());

        TextView tv2 = (TextView)findViewById(R.id.event_text);
        tv2.setText(active_event.getEventText());

        TextView tv3 = (TextView)findViewById(R.id.choice_a);
        tv3.setText(active_event.getChoiceA());

        TextView tv4 = (TextView)findViewById(R.id.choice_b);
        tv4.setText(active_event.getChoiceB());
    }

    private void choiceA(Event current_event, Player current_player, ArrayList<TextView> values, ArrayList<Event> eventArrayList){
        current_player.changeAge(current_event.age_change_A);
        current_player.changeWealth(current_event.wealth_change_A);
        current_player.changeFame(current_event.fame_change_A);
        current_player.changeHealth(current_event.health_change_A);
        updateUI(values, current_player, eventArrayList, current_event);
    }

    private void choiceB(Event current_event, Player current_player, ArrayList<TextView> values, ArrayList<Event> eventArrayList){
        current_player.changeAge(current_event.age_change_B);
        current_player.changeWealth(current_event.wealth_change_B);
        current_player.changeFame(current_event.fame_change_B);
        current_player.changeHealth(current_event.health_change_B);
        updateUI(values, current_player, eventArrayList, current_event);
    }

    public ArrayList<TextView> createTextViews(){
        TextView name = (TextView)findViewById(R.id.player_name);
        TextView age = (TextView)findViewById(R.id.player_age);
        TextView wealth = (TextView)findViewById(R.id.player_wealth);
        TextView fame = (TextView)findViewById(R.id.player_fame);
        TextView health = (TextView)findViewById(R.id.player_health);
        TextView god = (TextView)findViewById(R.id.player_god);

        TextView name_value = (TextView)findViewById(R.id.name_value);
        TextView age_value = (TextView)findViewById(R.id.age_value);
        TextView wealth_value = (TextView)findViewById(R.id.wealth_value);
        TextView fame_value = (TextView)findViewById(R.id.fame_value);
        TextView health_value = (TextView)findViewById(R.id.health_value);
        TextView god_value = (TextView)findViewById(R.id.god_value);

        ArrayList<TextView> values = new ArrayList<>();
        values.add(name_value);
        values.add(age_value);
        values.add(wealth_value);
        values.add(fame_value);
        values.add(health_value);
        values.add(god_value);

        name.setText("Name: ");
        age.setText("Age: ");
        wealth.setText("Wealth: ");
        fame.setText("Fame: ");
        health.setText("Health: ");
        god.setText("Worship: ");

        return values;
    }

}
