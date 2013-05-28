package id.ac.itats.skripsi.lbs;

import id.ac.itats.skripsi.lbs.R;
import android.os.Bundle;

public class Activity_Calendar extends DashBoardActivity {
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        setHeader(getString(R.string.CalendarActivityTitle), true, true);
        
    }
}
