package com.example.activitylifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.Logging.AppLogger;
import com.example.fragment.FragmentLife;

public class ActivityDynamicFrag extends Activity {

	public static int count = 0;
	String TAG = "ActivityDynamicFrag";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dynamic_main);

		Log.i(TAG, "ActivityDynamicFrag-onCreate");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-onCreate");
		AppLogger.writeLog("ActivityDynamicFrag-onCreate");

		count++;

		/** */
		init();

	}

	/** */
	private void init() {
		TextView tv = (TextView) findViewById(R.id.tv_test);
		tv.setText("A " + count + "");

		/** Fragment Test */
		// FragmentLife fragLife =new FragmentLife();

	}

	public void onProcess(View v) {
		FragmentLife fragLife = new FragmentLife();
		FragmentManager manage = getFragmentManager();
		
		FragmentTransaction fragTrans = manage.beginTransaction();
		fragTrans.add(R.id.ll_main,fragLife, "Testing");
		fragTrans.commit();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "ActivityDynamicFrag-onRestart");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-onRestart");
		AppLogger.writeLog("ActivityDynamicFrag-onRestart");

	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "ActivityDynamicFrag-onStart");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-OnStart");
		AppLogger.writeLog("ActivityDynamicFrag-OnStart");

	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG, "ActivityDynamicFrag-onRestoreInstanceState");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-onRestoreInstanceState");
		AppLogger.writeLog("ActivityDynamicFrag-onRestoreInstanceState");

	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "ActivityDynamicFrag-onResume");
		AppLogger.writeLog("ActivityDynamicFrag-onResume");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "ActivityDynamicFrag-onPause");
		AppLogger.writeLog("ActivityDynamicFrag-onPause");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-onPause");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		Log.i(TAG, "ActivityDynamicFrag-onRestoreInstanceState");
		AppLogger.writeLog("ActivityDynamicFrag-onSaveInstanceState");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-onSaveInstanceState");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "ActivityDynamicFrag-onStop");
		AppLogger.writeLog("ActivityDynamicFrag-onStop");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-onStop");

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "ActivityDynamicFrag-onDestroy");
		AppLogger.writeLog("ActivityDynamicFrag-onDestroy");
		AppLogger.ToastShort(this, "ActivityDynamicFrag-onDestroy");

	}

}
