package br.com.moobile.teste.timefutebol.views.main.players;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.adapters.PlayersAdapters;
import br.com.moobile.teste.timefutebol.utils.rest.actions.SyncPlayersList;
import br.com.moobile.teste.timefutebol.views.main.BaseFragment;
import butterknife.InjectView;

public class PlayersFragment extends BaseFragment {

	@InjectView(R.id.listPlayers)
	ListView mListPlayers;
	@InjectView(R.id.teamName)
	TextView mTeamName;
	@InjectView(R.id.teamSigla)
	TextView mTeamSigla; 

	private PlayersAdapters mAdapter;

	public PlayersFragment() {
		super(R.layout.fragment_players);
	}

	@Override
	protected void initView(View view) {
		useButtonBack();

		Bundle extras 	 = getArguments();
		long teamID 	 = extras.getLong("team_id", 0);
		String nameTeam  = extras.getString("name", "");
		String siglaTeam = extras.getString("sigla", "");
		mAdapter 		 = new PlayersAdapters(getAppContext()); 
		
		mTeamName.setText(nameTeam);
		mTeamSigla.setText(siglaTeam); 
		
		mListPlayers.setAdapter(mAdapter); 
		new SyncPlayersList(mAdapter, teamID).execute(); 
		
		setTitle(nameTeam);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			getActivity().onBackPressed();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
