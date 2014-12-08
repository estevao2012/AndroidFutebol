package br.com.moobile.teste.timefutebol.utils.rest.actions;

import java.util.List;

import android.os.AsyncTask;
import br.com.moobile.teste.timefutebol.adapters.TeamsAdapters;
import br.com.moobile.teste.timefutebol.models.Team;
import br.com.moobile.teste.timefutebol.utils.rest.RestClient;

public class SyncTeamList extends AsyncTask<Void, Void, List<Team>>{
	TeamsAdapters mAdapter; 
	
	public SyncTeamList(TeamsAdapters mAdapter) { 
		this.mAdapter = mAdapter;
	}
	
	@Override
	protected List<Team> doInBackground(Void... params) { 
		List<Team> repos = RestClient.getApiService().listTeams();
		return repos;
	} 
	@Override
	protected void onPostExecute(List<Team> result) {
		for (Team t : result) {
			mAdapter.add(t);
		} 
	} 
}
