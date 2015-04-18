package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.Logging.AppLogger;

public class ActivityB extends Activity {

	public static int count = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		AppLogger.writeLog("B-OnStart");
		count++;
		
		/***/
		init();
	}

	/***/
	private void init()
	{
		TextView tv = (TextView)findViewById(R.id.tv_test);
		tv.setText("B "+count+"");
		
	}
	public void onIntent(View v) {
		Intent in = new Intent(this, MainActivity.class);
		startActivity(in);
	}

	@Override
	protected void onStart() {
		super.onStart();
		AppLogger.writeLog("B-OnStart");
		AppLogger.ToastLong(this, "B-OnStart");

	}

	@Override
	protected void onResume() {
		super.onResume();
		AppLogger.writeLog("B-onResume");
		AppLogger.ToastLong(this, "B-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		AppLogger.writeLog("B-onPause");
		AppLogger.ToastLong(this, "B-onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		AppLogger.writeLog("B-onStop");
		AppLogger.ToastLong(this, "B-onStop");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		AppLogger.writeLog("B-onRestart");
		AppLogger.ToastLong(this, "B-onRestart");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppLogger.writeLog("B-onDestroy");
		AppLogger.ToastLong(this, "B-onDestroy");
	}

}
