package id.ac.itats.skripsi.lbs;

import java.io.File;

import org.mapsforge.android.maps.MapActivity;
import org.mapsforge.android.maps.MapView;
import org.mapsforge.map.reader.header.FileOpenResult;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_MapView extends MapActivity {

	private static final File MAP_FILE = new File(Environment
			.getExternalStorageDirectory().getPath(), "surabaya.map");

	MapView mapView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_mapview);
		setHeader(getString(R.string.MapViewActivityTitle), true, true);
		// mapView = new MapView(this);
		this.mapView = (MapView) findViewById(R.id.mapView);
		mapView.setClickable(true);
		mapView.setBuiltInZoomControls(true);

		FileOpenResult fileOpenResult = mapView.setMapFile(MAP_FILE);
		if (!fileOpenResult.isSuccess()) {
			Toast.makeText(this, fileOpenResult.getErrorMessage(),
					Toast.LENGTH_LONG).show();
			finish();
		}

	}

	public void setHeader(String title, boolean btnHomeVisible,
			boolean btnFeedbackVisible) {
		ViewStub stub = (ViewStub) findViewById(R.id.vsHeader);
		View inflated = stub.inflate();

		TextView txtTitle = (TextView) inflated.findViewById(R.id.txtHeading);
		txtTitle.setText(title);

		Button btnHome = (Button) inflated.findViewById(R.id.btnHome);
		if (!btnHomeVisible)
			btnHome.setVisibility(View.INVISIBLE);

		Button btnFeedback = (Button) inflated.findViewById(R.id.btnFeedback);
		if (!btnFeedbackVisible)
			btnFeedback.setVisibility(View.INVISIBLE);

	}

	public void btnHomeClick(View v) {
		Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);

	}

	public void btnFeedbackClick(View v) {
		Intent intent = new Intent(getApplicationContext(),
				FeedbackActivity.class);
		startActivity(intent);
	}

}