package bttstudio.imperiumromanum;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        ArrayList<Event> eventArrayList = new EventCreator().readEventsFile(res,R.raw.events_file);

        for(int ii = 0; ii<10; ii++){
            Event current_event = new EventPicker().selectRandomEvent(eventArrayList);

            System.out.println("Event chosen: " + current_event.getEventId());
        }

    }

    private void update(){

    }
}
