package com.example.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.Logging.AppLogger;
import com.example.activitylifecycle.R;
import com.example.listener.Bridge;

public class FragmentB extends Fragment {

	String TAG = "FragmentB";
	Bridge bridgeCommunication;

	@Override
	public void onAttach(Activity activity) {

		super.onAttach(activity);

		bridgeCommunication = (Bridge) activity;

		Log.e(TAG, "F-B-onAttach");
		AppLogger.writeLog("F-B-onAttach");
		AppLogger.ToastShort(getActivity(), "F-B-onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.e(TAG, "F-B-onCreate");
		AppLogger.ToastShort(getActivity(), "F-B-onCreate");
		AppLogger.writeLog("F-B-onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		Log.e(TAG, "F-B-onCreateView");
		AppLogger.ToastShort(getActivity(), "F-B-onCreateView");
		AppLogger.writeLog("F-B-onCreateView");
		View v = inflater.inflate(R.layout.fragment_b, container, false);
		return v;
		// return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		bridgeCommunication = (Bridge) getActivity();
		
		Button btnA = (Button) getActivity().findViewById(R.id.btn_frag_b);
		btnA.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				bridgeCommunication.onChangeColorFragment(FragmentB.this);
			}
		});
		
		Log.e(TAG, "F-B-onActivityCreated");
		AppLogger.ToastShort(getActivity(), "F-B-onActivityCreated");
		AppLogger.writeLog("F-B-onActivityCreated");
	}

	@Override
	public void onStart() {

		super.onStart();
		Log.e(TAG, "F-B-onStart");
		AppLogger.writeLog("F-B-onStart");
		AppLogger.ToastShort(getActivity(), "F-B-onStart");
	}

	@Override
	public void onResume() {

		super.onResume();
		Log.e(TAG, "F-B-onResume");
		AppLogger.ToastShort(getActivity(), "F-B-onResume");
		AppLogger.writeLog("F-B-onResume");
	}

	@Override
	public void onPause() {

		super.onPause();
		Log.e(TAG, "F-B-onPause");
		AppLogger.ToastShort(getActivity(), "F-B-onPause");
		AppLogger.writeLog("F-B-onPause");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.e(TAG, "F-B-onSaveInstanceState");
		AppLogger.ToastShort(getActivity(), "F-B-onSaveInstanceState");
		AppLogger.writeLog("F-B-onSaveInstanceState");
	}

	@Override
	public void onStop() {

		super.onStop();
		Log.e(TAG, "F-B-onStop");
		AppLogger.ToastShort(getActivity(), "F-B-onStop");
		AppLogger.writeLog("F-B-onStop");
	}

	@Override
	public void onDestroyView() {

		super.onDestroyView();
		Log.e(TAG, "F-B-onDestroyView");
		AppLogger.ToastShort(getActivity(), "F-B-onDestroyView");
		AppLogger.writeLog("F-B-onDestroyView");
	}

	@Override
	public void onDestroy() {

		super.onDestroy();
		Log.e(TAG, "F-B-onDestroy");
		AppLogger.ToastShort(getActivity(), "F-B-onDestroy");
		AppLogger.writeLog("F-B-onDestroy");
	}

	@Override
	public void onDetach() {

		super.onDetach();
		Log.e(TAG, "F-B-onDetach");
		AppLogger.ToastShort(getActivity(), "F-B-onDetach");
		AppLogger.writeLog("F-B-onDetach");
	}

	public void onChangeColor() {
		View va = getActivity().findViewById(R.id.ll_frag_a);
		View vb = getActivity().findViewById(R.id.ll_frag_b);

		ColorDrawable tmp = (ColorDrawable) va.getBackground();
		va.setBackgroundDrawable((ColorDrawable) vb.getBackground());
		vb.setBackgroundDrawable(tmp);
	}

}
