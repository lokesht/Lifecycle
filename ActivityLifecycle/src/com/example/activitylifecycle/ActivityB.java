package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.Logging.AppLogger;

public class ActivityB extends Activity {

	public static int count = 0;
	String TAG = "ActivityB";
	
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
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "B-onRestart");
		AppLogger.ToastShort(this, "B-onRestart");
		AppLogger.writeLog("B-onRestart");
		
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "B-onStart");
		AppLogger.ToastShort(this, "B-OnStart");
		AppLogger.writeLog("B-OnStart");
		

	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG, "B-onRestoreInstanceState");
		AppLogger.ToastShort(this, "B-onRestoreInstanceState");
		AppLogger.writeLog("B-onRestoreInstanceState");
		
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "B-onResume");
		AppLogger.writeLog("B-onResume");
		AppLogger.ToastShort(this, "B-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "B-onPause");
		AppLogger.writeLog("B-onPause");
		AppLogger.ToastShort(this, "B-onPause");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		Log.i(TAG, "B-onRestoreInstanceState");
		AppLogger.writeLog("B-onSaveInstanceState");
		AppLogger.ToastShort(this, "B-onSaveInstanceState");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "B-onStop");
		AppLogger.writeLog("B-onStop");
		AppLogger.ToastShort(this, "B-onStop");

	}

	

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "B-onDestroy");
		AppLogger.writeLog("B-onDestroy");
		AppLogger.ToastShort(this, "B-onDestroy");

		/** Just two check what will happen if call again */
		// Intent in = new Intent(this, MainActivity.class);
		// startActivity(in);
	}

}
