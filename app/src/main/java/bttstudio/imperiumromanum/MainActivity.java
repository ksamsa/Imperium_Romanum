package bttstudio.imperiumromanum;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        ArrayList<Event> eventArrayList = new EventCreator().readEventsFile(res,R.raw.events_file);

        Player new_player = new Player();

        TextView name = (TextView)findViewById(R.id.player_name);
        TextView age = (TextView)findViewById(R.id.player_age);
        TextView wealth = (TextView)findViewById(R.id.player_wealth);
        TextView fame = (TextView)findViewById(R.id.player_fame);
        TextView health = (TextView)findViewById(R.id.player_health);
        TextView god = (TextView)findViewById(R.id.player_god);

        name.setText("Name: " + new_player.getName());
        age.setText("Age: " + new_player.getAge());
        wealth.setText("Wealth: " + new_player.getWealth());
        fame.setText("Fame: " + new_player.getFame());
        health.setText("Health: " + new_player.getHealth());
        god.setText("Worship: " + new_player.getGod());


        Event active_event = newEvent(eventArrayList);

        TextView tv1 = (TextView)findViewById(R.id.event_name);
        tv1.setText(active_event.getEventName());

        TextView tv2 = (TextView)findViewById(R.id.event_text);
        tv2.setText(active_event.getEventText());


    }

    private Event newEvent(ArrayList<Event> eventArrayList){
        Event event = new EventPicker().selectRandomEvent(eventArrayList);
        return event;
    }


}
