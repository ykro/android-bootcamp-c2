package com.elementalgeeks.bootcampsw.fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elementalgeeks.bootcampsw.R;

public class EventsListFragment extends ListFragment {
	
	@Override  
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_events_list, container, false);
		return view;
	} 	
}
