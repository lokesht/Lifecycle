package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.TextView;

import com.example.Logging.AppLogger;
import com.example.activityinstance.SavedInstance;
import com.example.implecitintent.ActivityImplicitIntent;

public class MainActivity extends Activity {

	public static int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		AppLogger.writeLog("A-onCreate");
		AppLogger.ToastShort(this, "A-onCreate");
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
		AppLogger.ToastShort(this, "A-OnStart");

	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		AppLogger.writeLog("A-onRestoreInstanceState");
		AppLogger.ToastShort(this, "A-onRestoreInstanceState");
	}
	@Override
	protected void onResume() {
		super.onResume();
		AppLogger.writeLog("A-onResume");
		AppLogger.ToastShort(this, "A-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		AppLogger.writeLog("A-onPause");
		AppLogger.ToastShort(this, "A-onPause");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
		AppLogger.writeLog("A-onSaveInstanceState");
		AppLogger.ToastShort(this, "A-onSaveInstanceState");
	}
	@Override
	protected void onStop() {
		super.onStop();
		AppLogger.writeLog("A-onStop");
		AppLogger.ToastShort(this, "A-onStop");
		
		
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		AppLogger.writeLog("A-onRestart");
		AppLogger.ToastShort(this, "A-onRestart");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppLogger.writeLog("A-onDestroy");
		AppLogger.ToastShort(this, "A-onDestroy");
		
		/** Just two check what will happen if call again*/
//		Intent in = new Intent(this, MainActivity.class);
//		startActivity(in);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent in=null;
		switch(item.getItemId())
		{
		case R.id.action_save_instance:
			 in = new Intent(this, SavedInstance.class);
			startActivity(in);
			break;
		case R.id.action_implicit_intent:
			 in = new Intent(this, ActivityImplicitIntent.class);
			startActivity(in);
		}
		return super.onOptionsItemSelected(item);
	}

}
