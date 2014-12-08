package br.com.moobile.teste.timefutebol.views.main;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

	protected HomeActivity mainActivity;
	private int layout;

	
	public BaseFragment(int layout) {
		super();
		this.layout = layout;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(layout, container, false);
		ButterKnife.inject(this, view); 
		initView(view); 
		return view;
	}
	
	protected abstract void initView(View view);

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		mainActivity = (HomeActivity) activity;
	}
	
	public void useMenu(){
		mainActivity.getDraweToggle().setDrawerIndicatorEnabled(true);
	}
	
	public void useButtonBack(){
		setHasOptionsMenu(true); 
		mainActivity.getDraweToggle().setDrawerIndicatorEnabled(false);
	}
	
	public Context getAppContext(){
		return mainActivity.getApplicationContext();
	}
	
	public void setTitle(String title){
		mainActivity.getSupportActionBar().setTitle(title);
	}
}
