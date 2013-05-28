package id.ac.itats.skripsi.lbs;


import id.ac.itats.skripsi.lbs.R;
import android.os.Bundle;

public class Activity_Tracker extends DashBoardActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);
        setHeader(getString(R.string.TrackerActivityTitle), true, true);
        
    }
}
