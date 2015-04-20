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

		AppLogger.writeLog("B-OnCreate");
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
	public void onProcess(View v) {
		Intent in = new Intent(this, MainActivity.class);
		startActivity(in);
	}

	@Override
	protected void onStart() {
		super.onStart();
		AppLogger.writeLog("B-OnStart");
		AppLogger.ToastShort(this, "B-OnStart");

	}

	@Override
	protected void onRestoreInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
		AppLogger.writeLog("B-onRestoreInstanceState");
		AppLogger.ToastShort(this, "B-onRestoreInstanceState");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		AppLogger.writeLog("B-onResume");
		AppLogger.ToastShort(this, "B-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		AppLogger.writeLog("B-onPause");
		AppLogger.ToastShort(this, "B-onPause");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
		AppLogger.writeLog("B-onSaveInstanceState");
		AppLogger.ToastShort(this, "B-onSaveInstanceState");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		AppLogger.writeLog("B-onStop");
		AppLogger.ToastShort(this, "B-onStop");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		AppLogger.writeLog("B-onRestart");
		AppLogger.ToastShort(this, "B-onRestart");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppLogger.writeLog("B-onDestroy");
		AppLogger.ToastShort(this, "B-onDestroy");
	}

}
