package com.example.template_fragment;

import com.example.testfragment2015_07_14_165639.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment01 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// comment
		return inflater.inflate(R.layout.fragment_01, null);
	}

}
