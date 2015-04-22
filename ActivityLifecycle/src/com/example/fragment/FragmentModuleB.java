package com.example.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.Logging.AppLogger;
import com.example.activitylifecycle.R;

public class FragmentModuleB extends Fragment {
	String TAG = "FragmentModuleB";
	int index;

	@Override
	public void onAttach(Activity activity) {

		super.onAttach(activity);

		Log.w(TAG, "F-B-onAttach");
		// AppLogger.writeLog("F-B-onAttach");
		// AppLogger.ToastShort(getActivity(), "F-B-onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.w(TAG, "F-B-onCreate");
		// AppLogger.ToastShort(getActivity(), "F-B-onCreate");
		// AppLogger.writeLog("F-B-onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		Log.w(TAG, "F-B-onCreateView");
		//AppLogger.ToastShort(getActivity(), "F-B-onCreateView");
		//AppLogger.writeLog("F-B-onCreateView");
		View v = inflater.inflate(R.layout.fragment_module_b, container, false);
		
		/** Since onChange is doing UI operation It might crash, this method doesnt give guarntee that activity has been acreated
		 *  so might get null pointer exception*/
//		if(savedInstanceState!=null)
//		{
//			index = savedInstanceState.getInt("index");
//			onChange(index);
//		}
		
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		Log.w(TAG, "F-B-onActivityCreated");
		if(savedInstanceState!=null)
		{
			index = savedInstanceState.getInt("index");
			onChange(index);
		}
		// AppLogger.ToastShort(getActivity(), "F-B-onActivityCreated");
		// AppLogger.writeLog("F-B-onActivityCreated");
	}

	@Override
	public void onStart() {

		super.onStart();
		Log.w(TAG, "F-B-onStart");
		// AppLogger.writeLog("F-B-onStart");
		// AppLogger.ToastShort(getActivity(), "F-B-onStart");
	}

	@Override
	public void onResume() {

		super.onResume();
		Log.w(TAG, "F-B-onResume");
		// AppLogger.ToastShort(getActivity(), "F-B-onResume");
		// AppLogger.writeLog("F-B-onResume");
	}

	@Override
	public void onPause() {

		super.onPause();
		Log.w(TAG, "F-B-onPause");
		// AppLogger.ToastShort(getActivity(), "F-B-onPause");
		// AppLogger.writeLog("F-B-onPause");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.w(TAG, "F-B-onSaveInstanceState");
		outState.putInt("index", index);
		// AppLogger.ToastShort(getActivity(), "F-B-onSaveInstanceState");
		// AppLogger.writeLog("F-B-onSaveInstanceState");
	}

	@Override
	public void onStop() {

		super.onStop();
		Log.w(TAG, "F-B-onStop");
		// AppLogger.ToastShort(getActivity(), "F-B-onStop");
		// AppLogger.writeLog("F-B-onStop");
	}

	@Override
	public void onDestroyView() {

		super.onDestroyView();
		Log.w(TAG, "F-B-onDestroyView");
		// AppLogger.ToastShort(getActivity(), "F-B-onDestroyView");
		// AppLogger.writeLog("F-B-onDestroyView");
	}

	@Override
	public void onDestroy() {

		super.onDestroy();
		Log.w(TAG, "F-B-onDestroy");
		// AppLogger.ToastShort(getActivity(), "F-B-onDestroy");
		// AppLogger.writeLog("F-B-onDestroy");
	}

	@Override
	public void onDetach() {

		super.onDetach();
		Log.w(TAG, "F-B-onDetach");
		// AppLogger.ToastShort(getActivity(), "F-B-onDetach");
		// AppLogger.writeLog("F-B-onDetach");
	}

	public void onChange(int indexs) {
		index = indexs;
		View v = getActivity().getFragmentManager().findFragmentByTag("FragB").getView();
		TextView tv = (TextView) v.findViewById(R.id.tv_test);

		tv.setText(getResources().getStringArray(R.array.Subject)[indexs]);
	}
}
