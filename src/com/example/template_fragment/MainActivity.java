package com.example.template_fragment;

import com.example.testfragment2015_07_14_165639.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;

public class MainActivity extends FragmentActivity {
	private FragmentTabHost mTabHost;

	private LayoutInflater mLayoutInflater;

	private Class mFragments[] = { Fragment01.class, Fragment02.class,
			Fragment03.class, Fragment04.class };

	private int mNavImages[] = { R.drawable.nav_btn_01, R.drawable.nav_btn_02,
			R.drawable.nav_btn_03, R.drawable.nav_btn_04 };
	
	private String mTabTag[]={"1","2","3","4"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mLayoutInflater = LayoutInflater.from(this);

		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.main_content);

		int count = mFragments.length;

		for (int i = 0; i < count; i++) {
			TabSpec tabSpec = mTabHost.newTabSpec(mTabTag[i]).setIndicator(
					getTabItemView(i));
			mTabHost.addTab(tabSpec, mFragments[i], null);
			
			mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.nav_background);
		}
	}

	private View getTabItemView(int index) {
		View view = mLayoutInflater.inflate(R.layout.view_tab_item, null);

		ImageView im = (ImageView) view.findViewById(R.id.image_view);
		im.setImageResource(mNavImages[index]);

		return view;
	}
}
