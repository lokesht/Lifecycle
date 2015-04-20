package com.example.fragment;

import com.example.Logging.AppLogger;
import com.example.activitylifecycle.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentLife extends Fragment {

	String TAG = "FragmentLife";
	@Override
	public void onAttach(Activity activity) {

		super.onAttach(activity);
		Log.e(TAG, "FRAG-onAttach");
		AppLogger.writeLog("FRAG-onAttach");
		AppLogger.ToastShort(getActivity(), "FRAG-onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.e(TAG, "FRAG-onCreate");
		AppLogger.ToastShort(getActivity(), "FRAG-onCreate");
		AppLogger.writeLog("FRAG-onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		
		
		Log.e(TAG, "FRAG-onCreateView");
		AppLogger.ToastShort(getActivity(), "FRAG-onCreateView");
		AppLogger.writeLog("FRAG-onCreateView");
		
		return inflater.inflate(R.layout.fragment_life, container, false);
		//return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onStart() {

		super.onStart();
		Log.e(TAG, "FRAG-onStart");
		AppLogger.writeLog("FRAG-onStart");
		AppLogger.ToastShort(getActivity(), "FRAG-onStart");
	}

	@Override
	public void onResume() {

		super.onResume();
		Log.e(TAG, "FRAG-onResume");
		AppLogger.ToastShort(getActivity(), "FRAG-onResume");
		AppLogger.writeLog("FRAG-onResume");
	}

	@Override
	public void onPause() {

		super.onPause();
		Log.e(TAG, "FRAG-onPause");
		AppLogger.ToastShort(getActivity(), "FRAG-onPause");
		AppLogger.writeLog("FRAG-onPause");
	}

	@Override
	public void onStop() {

		super.onStop();
		Log.e(TAG, "FRAG-onStop");
		AppLogger.ToastShort(getActivity(), "FRAG-onStop");
		AppLogger.writeLog("FRAG-onStop");
	}

	@Override
	public void onDestroyView() {

		super.onDestroyView();
		Log.e(TAG, "FRAG-onDestroyView");
		AppLogger.ToastShort(getActivity(), "FRAG-onDestroyView");
		AppLogger.writeLog("FRAG-onDestroyView");
	}

	@Override
	public void onDestroy() {

		super.onDestroy();
		Log.e(TAG, "FRAG-onDestroy");
		AppLogger.ToastShort(getActivity(), "FRAG-onDestroy");
		AppLogger.writeLog("FRAG-onDestroy");
	}

	@Override
	public void onDetach() {

		super.onDetach();
		Log.e(TAG, "FRAG-onDetach");
		AppLogger.ToastShort(getActivity(), "FRAG-onDetach");
		AppLogger.writeLog("FRAG-onDetach");
	}
}
