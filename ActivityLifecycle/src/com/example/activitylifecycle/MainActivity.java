package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.Logging.AppLogger;
import com.example.activityinstance.SavedInstance;
import com.example.implecitintent.ActivityImplicitIntent;
import com.example.toast.ActivityCustomToast;

public class MainActivity extends Activity {

	public static int count = 0;
	String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i(TAG, "A-onCreate");
		AppLogger.ToastShort(this, "A-onCreate");
		AppLogger.writeLog("A-onCreate");

		count++;

		/** */
		init();

	}

	/** */
	private void init() {
		TextView tv = (TextView) findViewById(R.id.tv_test);
		tv.setText("A " + count + "");
	}

	public void onProcess(View v) {
		Intent in = new Intent(this, ActivityB.class);
		startActivity(in);
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "A-onRestart");
		AppLogger.ToastShort(this, "A-onRestart");
		AppLogger.writeLog("A-onRestart");

	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "A-onStart");
		AppLogger.ToastShort(this, "A-OnStart");
		AppLogger.writeLog("A-OnStart");

	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG, "A-onRestoreInstanceState");
		AppLogger.ToastShort(this, "A-onRestoreInstanceState");
		AppLogger.writeLog("A-onRestoreInstanceState");

	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "A-onResume");
		AppLogger.writeLog("A-onResume");
		AppLogger.ToastShort(this, "A-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "A-onPause");
		AppLogger.writeLog("A-onPause");
		AppLogger.ToastShort(this, "A-onPause");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		Log.i(TAG, "A-onSaveInstanceState");
		AppLogger.writeLog("A-onSaveInstanceState");
		AppLogger.ToastShort(this, "A-onSaveInstanceState");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "A-onStop");
		AppLogger.writeLog("A-onStop");
		AppLogger.ToastShort(this, "A-onStop");

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "A-onDestroy");
		AppLogger.writeLog("A-onDestroy");
		AppLogger.ToastShort(this, "A-onDestroy");

		/** Just two check what will happen if call again */
		// Intent in = new Intent(this, MainActivity.class);
		// startActivity(in);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent in = null;
		switch (item.getItemId()) {
		case R.id.action_save_instance:
			in = new Intent(this, SavedInstance.class);
			startActivity(in);
			break;
		case R.id.action_implicit_intent:
			in = new Intent(this, ActivityImplicitIntent.class);
			startActivity(in);

		case R.id.action_custom_toast:
			in = new Intent(this, ActivityCustomToast.class);
			startActivity(in);

		case R.id.action_dynamic_frag:
			in = new Intent(this, ActivityDynamicFrag.class);
			startActivity(in);
			
		case R.id.action_fragment_manager:
			in = new Intent(this, ActivityFragmentManager.class);
			startActivity(in);
			
		case R.id.action_fragment_module_ui:
			in = new Intent(this, ActivityFragmentModulerUI.class);
			startActivity(in);
		}
		return super.onOptionsItemSelected(item);
	}

}
