package br.com.moobile.teste.timefutebol.views.main.home;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.adapters.TeamsAdapters;
import br.com.moobile.teste.timefutebol.utils.rest.actions.SyncTeamList;
import br.com.moobile.teste.timefutebol.utils.views.ViewHelper;
import br.com.moobile.teste.timefutebol.views.main.BaseFragment;
import br.com.moobile.teste.timefutebol.views.main.players.PlayersFragment;
import butterknife.InjectView;

public class HomeFragment extends BaseFragment implements OnItemClickListener {

	@InjectView(R.id.listTeams) ListView mListTeams;
	@InjectView(R.id.emptyView) TextView mEmptyView;
	private TeamsAdapters mAdapter; 

	public HomeFragment() {
		super(R.layout.fragment_home);
	}
 
	@Override
	protected void initView(View view) { 
		useMenu(); 
		
		mAdapter = new TeamsAdapters(getAppContext());
		mListTeams.setEmptyView(mEmptyView);
		mListTeams.setAdapter(mAdapter);
		mListTeams.setOnItemClickListener(this);
		
		setTitle(getResources().getString(R.string.app_name));
		
		new SyncTeamList(mAdapter).execute(); 
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		selectTeam(position, id);
	}
	
	private void selectTeam(int position, long id){
		PlayersFragment playerFragment = new PlayersFragment();
		
		Bundle args = new Bundle();
		args.putLong("team_id", id);
		args.putString("name", mAdapter.getItem(position).getName());
		args.putString("sigla", mAdapter.getItem(position).getSigla()); 
		playerFragment.setArguments(args);
		
		ViewHelper.abreFragment(getFragmentManager(), R.id.container, playerFragment);
	}
}
