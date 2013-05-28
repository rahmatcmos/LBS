package id.ac.itats.skripsi.lbs;

/**
 * @author Paresh N. Mayani
 * http://www.technotalkative.com
 */

import id.ac.itats.skripsi.lbs.R;
import android.os.Bundle;

public class Activity_JellyBean extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jellybean);
        setHeader(getString(R.string.JellyBeanActivityTitle), true, true);
        
    }
}
