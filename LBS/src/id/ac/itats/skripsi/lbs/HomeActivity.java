package id.ac.itats.skripsi.lbs;

/**
 * @author Paresh N. Mayani
 * http://www.technotalkative.com
 */

import id.ac.itats.skripsi.lbs.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setHeader(getString(R.string.HomeActivityTitle), true, true);
        
    }
    
    /**
     * Button click handler on Main activity
     * @param v
     */
    public void onButtonClicker(View v)
    {
    	Intent intent;
    	
    	switch (v.getId()) {
		case R.id.main_btn_mapview:
			intent = new Intent(this, Activity_MapView.class);
			startActivity(intent);
			break;

		case R.id.main_btn_tracker:
			intent = new Intent(this, Activity_Froyo.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_gingerbread:
			intent = new Intent(this, Activity_Gingerbread.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_honeycomb:
			intent = new Intent(this, Activity_Honeycomb.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_ics:
			intent = new Intent(this, Activity_ICS.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_jellybean:
			intent = new Intent(this, Activity_JellyBean.class);
			startActivity(intent);
			break;	
		default:
			break;
		}
    }
}

