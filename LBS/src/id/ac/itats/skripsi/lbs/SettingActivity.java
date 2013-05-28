package id.ac.itats.skripsi.lbs;


import id.ac.itats.skripsi.lbs.R;
import android.os.Bundle;

public class SettingActivity  extends DashBoardActivity {
   
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setHeader(getString(R.string.SettingActivityTitle), true, false);
        
    }
}
