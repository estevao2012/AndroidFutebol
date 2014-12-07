package br.com.moobile.teste.timefutebol.views.players;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.adapters.PlayersAdapters;
import br.com.moobile.teste.timefutebol.models.Player;
import br.com.moobile.teste.timefutebol.views.HomeActivity;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class PlayersFragment extends Fragment {

	private long teamID;

	@InjectView(R.id.listPlayers)
	ListView mListPlayers;
	@InjectView(R.id.teamName)
	TextView mTeamName;
	@InjectView(R.id.teamSigla)
	TextView mTeamSigla;
	@InjectView(R.id.numberPlayers)
	TextView mNumberPlayers;

	private PlayersAdapters mAdapter;

	private HomeActivity mainActivity;

	public PlayersFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_players, container, false);
		ButterKnife.inject(this, view);

		Bundle extras = getArguments();
		teamID = extras.getLong("team", 0);

		mAdapter = new PlayersAdapters(getActivity().getApplicationContext());
		mListPlayers.setAdapter(mAdapter);
		mAdapter.add(new Player("Teste", "Goleiro", 1));
		mAdapter.add(new Player("Teste Zagueir", "Zagueiro", 4));

		// Define Time
		mTeamName.setText("Cruzeiro");
		mTeamSigla.setText("CRU");
		mNumberPlayers.setText(String.valueOf(mAdapter.getCount()));


		setHasOptionsMenu(true); 
		mainActivity.getDraweToggle().setDrawerIndicatorEnabled(false);

		return view;
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
	

	@Override
	public void onAttach(Activity activity) { 
		super.onAttach(activity); 
		mainActivity = (HomeActivity)activity;
	}
}
