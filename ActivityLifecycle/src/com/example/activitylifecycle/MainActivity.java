package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.Logging.AppLogger;

public class MainActivity extends Activity {

	public static int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		AppLogger.writeLog("A-onCreate");
		AppLogger.ToastLong(this, "A-onCreate");
		count++;

		/** */
		init();
	}

	/** */
	private void init() {
		TextView tv = (TextView) findViewById(R.id.tv_test);
		tv.setText("A "+count + "");

	}

	public void onIntent(View v) {
		Intent in = new Intent(this, ActivityB.class);
		startActivity(in);
	}

	@Override
	protected void onStart() {
		super.onStart();
		AppLogger.writeLog("A-OnStart");
		AppLogger.ToastLong(this, "A-OnStart");

	}

	@Override
	protected void onResume() {
		super.onResume();
		AppLogger.writeLog("A-onResume");
		AppLogger.ToastLong(this, "A-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		AppLogger.writeLog("A-onPause");
		AppLogger.ToastLong(this, "A-onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		AppLogger.writeLog("A-onStop");
		AppLogger.ToastLong(this, "A-onStop");
		
		
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		AppLogger.writeLog("A-onRestart");
		AppLogger.ToastLong(this, "A-onRestart");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppLogger.writeLog("A-onDestroy");
		AppLogger.ToastLong(this, "A-onDestroy");
		
		/** Just two check what will happen if call again*/
//		Intent in = new Intent(this, MainActivity.class);
//		startActivity(in);
	}

}
