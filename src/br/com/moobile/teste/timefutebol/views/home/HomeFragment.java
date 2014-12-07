package br.com.moobile.teste.timefutebol.views.home;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.adapters.TeamsAdapters;
import br.com.moobile.teste.timefutebol.models.Team;
import br.com.moobile.teste.timefutebol.utils.ViewHelper;
import br.com.moobile.teste.timefutebol.views.HomeActivity;
import br.com.moobile.teste.timefutebol.views.players.PlayersFragment;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class HomeFragment extends Fragment {

	@InjectView(R.id.listTeams)
	ListView mListTeams;
	private TeamsAdapters mAdapter;
	private HomeActivity mainActivity;

	public HomeFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View parentView = inflater.inflate(R.layout.fragment_home, container, false);
		ButterKnife.inject(this, parentView);

		mainActivity.getDraweToggle().setDrawerIndicatorEnabled(true);
		
		mAdapter = new TeamsAdapters(getActivity().getApplicationContext());
		mListTeams.setAdapter(mAdapter);
		mListTeams.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				PlayersFragment playerFragment = new PlayersFragment();
				Bundle args = new Bundle();
				args.putLong("team", id);
				playerFragment.setArguments(args); 
				ViewHelper.abreFragment(getFragmentManager(), R.id.container, playerFragment);
			}
		});
		mAdapter.add(new Team("Cruzeiro"));
		mAdapter.add(new Team("Atletico"));

		return parentView;
	}
	
	@Override
	public void onAttach(Activity activity) { 
		super.onAttach(activity); 
		mainActivity = (HomeActivity)activity;
	}

}
