package com.example.activitylifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.Logging.AppLogger;
import com.example.fragment.FragmentA;
import com.example.fragment.FragmentB;
import com.example.listener.Bridge;

public class ActivityFragmentManager extends Activity implements Bridge{
	public static int count = 0;
	String TAG = "ActivityFragmentManager";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_manager);

		Log.i(TAG, "ActivityFragmentManager-onCreate");
		AppLogger.ToastShort(this, "ActivityFragmentManager-onCreate");
		AppLogger.writeLog("ActivityFragmentManager-onCreate");

		count++;

		/** */
		init();

	}

	/** */
	private void init() {
		FragmentA a = new FragmentA();
		FragmentB b = new FragmentB();

		FragmentManager manage = getFragmentManager();
		FragmentTransaction trans = manage.beginTransaction();

		trans.add(R.id.ll_parent,a, "A");
		trans.add(R.id.ll_parent,b, "B");
		trans.commit();

	}

	/** If you add this line to button android:onClick="onProcess"
	 * It will search method inside activity so remove this from fragment layout*/
	public void onProcess(View v) {
		
		Intent in = new Intent(this, ActivityB.class);
		startActivity(in);
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "ActivityFragmentManager-onRestart");
		AppLogger.ToastShort(this, "ActivityFragmentManager-onRestart");
		AppLogger.writeLog("ActivityFragmentManager-onRestart");

	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "ActivityFragmentManager-onStart");
		AppLogger.ToastShort(this, "ActivityFragmentManager-OnStart");
		AppLogger.writeLog("ActivityFragmentManager-OnStart");

	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG, "ActivityFragmentManager-onRestoreInstanceState");
		AppLogger.ToastShort(this, "ActivityFragmentManager-onRestoreInstanceState");
		AppLogger.writeLog("ActivityFragmentManager-onRestoreInstanceState");

	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "ActivityFragmentManager-onResume");
		AppLogger.writeLog("ActivityFragmentManager-onResume");
		AppLogger.ToastShort(this, "ActivityFragmentManager-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "ActivityFragmentManager-onPause");
		AppLogger.writeLog("ActivityFragmentManager-onPause");
		AppLogger.ToastShort(this, "ActivityFragmentManager-onPause");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		Log.i(TAG, "ActivityFragmentManager-onRestoreInstanceState");
		AppLogger.writeLog("ActivityFragmentManager-onSaveInstanceState");
		AppLogger.ToastShort(this, "ActivityFragmentManager-onSaveInstanceState");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "ActivityFragmentManager-onStop");
		AppLogger.writeLog("ActivityFragmentManager-onStop");
		AppLogger.ToastShort(this, "ActivityFragmentManager-onStop");

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "ActivityFragmentManager-onDestroy");
		AppLogger.writeLog("ActivityFragmentManager-onDestroy");
		AppLogger.ToastShort(this, "ActivityFragmentManager-onDestroy");
	}

	@Override
	public void onChangeColorFragment(Fragment frag) {
		
		if(frag instanceof  FragmentA)
		{
			FragmentA a = (FragmentA)frag;
			a.onChangeColor();
		}else if(frag instanceof  FragmentB)
		{
			FragmentB a = (FragmentB)frag;
			a.onChangeColor();
		}
		
		
	}

}
