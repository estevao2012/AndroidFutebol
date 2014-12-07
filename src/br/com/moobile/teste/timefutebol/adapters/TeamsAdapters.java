package br.com.moobile.teste.timefutebol.adapters;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.models.Team;
import br.com.moobile.teste.timefutebol.utils.ViewHelper;

public class TeamsAdapters extends BaseAdapter{

	private List<Team> mTeams;
	private Context mContext;
	
	public TeamsAdapters(Context mContext) {
		super();
		this.mContext = mContext;
		mTeams = new ArrayList<Team>();
	}
	
	@Override
	public int getCount() { 
		return mTeams.size();
	}
	
	public void add(Team _team) {
		mTeams.add(_team);
		notifyDataSetChanged();
	}

	@Override
	public Team getItem(int position) { 
		return mTeams.get(position);
	}

	@Override
	public long getItemId(int position) { 
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if(view == null){
			view = LayoutInflater.from(mContext).inflate(R.layout.adapter_team, parent, false); 
		}
		
		TextView name = ViewHelper.get(view, R.id.txtName);
		name.setText(getItem(position).toString()); 
		
		return view;
	}
}
