package id.ac.itats.skripsi.lbs;


import id.ac.itats.skripsi.lbs.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends DashBoardActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setHeader(getString(R.string.HomeActivityTitle), true, true);
        
    }
    
    public void onButtonClicker(View v)
    {
    	Intent intent;
    	
    	switch (v.getId()) {
		case R.id.main_btn_mapview:
			intent = new Intent(this, Activity_MapView.class);
			startActivity(intent);
			break;

		case R.id.main_btn_tracker:
			intent = new Intent(this, Activity_Tracker.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_calendar:
			intent = new Intent(this, Activity_Calendar.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_report:
			intent = new Intent(this, Activity_Report.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_customer:
			intent = new Intent(this, Activity_Customer.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_notes:
			intent = new Intent(this, Activity_Notes.class);
			startActivity(intent);
			break;	
		default:
			break;
		}
    }
}

