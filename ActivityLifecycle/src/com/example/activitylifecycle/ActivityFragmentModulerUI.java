package com.example.activitylifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.fragment.FragmentModuleA;
import com.example.fragment.FragmentModuleB;

public class ActivityFragmentModulerUI extends Activity implements FragmentModuleA.Bridge {

	String TAG = "ActivityFragmentModulerUI-";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fragment_manager);

		init(savedInstanceState);
	}

	public void init(Bundle savedInstanceState) {
		/**
		 * If removed many fragment will be added at every rotation because FragmentManager Hold Fragment with him even after
		 * activity destroyed in on restore it will restore the things 
		 */
		if (savedInstanceState != null) {
			/** Restore Status */
		} else {
			FragmentModuleA fraga = new FragmentModuleA();
			FragmentModuleB fragb = new FragmentModuleB();

			FragmentManager fragManage = getFragmentManager();
			fragManage.executePendingTransactions();

			FragmentTransaction fragTrans = fragManage.beginTransaction();
			FragmentManager.enableDebugLogging(true);

			// if (!fragb.isAdded()) {
			// Log.e("check", "fragB already removed from frameLayoutB");
			//
			// fragTrans.remove(fraga);
			// // addFragmentsInActivity(R.id.frameLayoutA,fragB);
			// } else {
			// Log.e("check", "fragB already added");
			// }

			fragTrans.add(R.id.ll_parent, fraga, "FragA");
			fragTrans.add(R.id.ll_parent, fragb, "FragB");
			// fragTrans.
			fragTrans.commit();
		}

	}

	@Override
	public void onSubjectChange(int index) {

		FragmentModuleB fragB = (FragmentModuleB) getFragmentManager().findFragmentByTag("FragB");
		fragB.onChange(index);
	}

	public void onProcess(View v) {
		Intent in = new Intent(this, MainActivity.class);
		startActivity(in);
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "ModulerUI-onRestart");
		// AppLogger.ToastShort(this, "ModulerUI-onRestart");
		// AppLogger.writeLog("ModulerUI-onRestart");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "ModulerUI-onStart");
		// AppLogger.ToastShort(this, "ModulerUI-OnStart");
		// AppLogger.writeLog("ModulerUI-OnStart");

	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG, "ModulerUI-onRestoreInstanceState");
		// AppLogger.ToastShort(this, "ModulerUI-onRestoreInstanceState");
		// AppLogger.writeLog("ModulerUI-onRestoreInstanceState");

	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "ModulerUI-onResume");
		// AppLogger.writeLog("ModulerUI-onResume");
		// AppLogger.ToastShort(this, "ModulerUI-onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "ModulerUI-onPause");
		// AppLogger.writeLog("ModulerUI-onPause");
		// AppLogger.ToastShort(this, "ModulerUI-onPause");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		Log.i(TAG, "ModulerUI-onSaveInstanceState");
		// AppLogger.writeLog("ModulerUI-onSaveInstanceState");
		// AppLogger.ToastShort(this, "ModulerUI-onSaveInstanceState");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "ModulerUI-onStop");
		// AppLogger.writeLog("ModulerUI-onStop");
		// AppLogger.ToastShort(this, "ModulerUI-onStop");

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "ModulerUI-onDestroy");
		// AppLogger.writeLog("ModulerUI-onDestroy");
		// AppLogger.ToastShort(this, "ModulerUI-onDestroy");
	}

	// @Override
	// public void onConfigurationChanged(Configuration newConfig) {
	// super.onConfigurationChanged(newConfig);
	//
	// if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
	//
	// } else {
	//
	// }
	// }

}
