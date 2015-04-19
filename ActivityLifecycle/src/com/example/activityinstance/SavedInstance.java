package com.example.activityinstance;

import com.example.Logging.AppLogger;
import com.example.activitylifecycle.MainActivity;
import com.example.activitylifecycle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SavedInstance extends Activity {

	public static int count = 0;

	@Override
	protected void onCreate(Bundle SavedInstance) {
		super.onCreate(SavedInstance);

		setContentView(R.layout.activity_save_instance);

		AppLogger.writeLog("SavedInstance-OnCreate");
		count++;

		/***/
		init();
	}

	/***/
	private void init() {
		TextView tv = (TextView) findViewById(R.id.tv_test);
		tv.setText("save " + count + "");
	}

	public void onIntent(View v) {
		Intent in = new Intent(this, MainActivity.class);
		startActivity(in);
	}

	@Override
	protected void onStart() {
		super.onStart();
		AppLogger.writeLog("SavedInstance-OnStart");
		AppLogger.ToastShort(this, "SavedInstance-OnStart");

	}

	@Override
	protected void onRestoreInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		AppLogger.writeLog("SavedInstance-onRestoreInstanceState");
		AppLogger.ToastShort(this, "SavedInstance-onRestoreInstanceState");
		
		/** Restore*/
		AppLogger.ToastShort(this, "Value Restore"+outState.getInt("count"));
	}

	@Override
	protected void onResume() {
		super.onResume();
		AppLogger.writeLog("SavedInstance-onResume");
		AppLogger.ToastShort(this, "SavedInstance-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		AppLogger.writeLog("SavedInstance-onPause");
		AppLogger.ToastShort(this, "SavedInstance-onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		AppLogger.writeLog("SavedInstance-onStop");
		AppLogger.ToastShort(this, "SavedInstance-onStop");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		AppLogger.writeLog("SavedInstance-onSaveInstanceState");
		AppLogger.ToastShort(this, "SavedInstance-onSaveInstanceState");
		
		/** Restore*/
		outState.putInt("count", count);
		AppLogger.ToastShort(this, "Value stored"+count);
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		AppLogger.writeLog("SavedInstance-onRestart");
		AppLogger.ToastShort(this, "SavedInstance-onRestart");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppLogger.writeLog("SavedInstance-onDestroy");
		AppLogger.ToastShort(this, "SavedInstance-onDestroy");
	}

}
