package br.com.moobile.teste.timefutebol.utils.rest.actions;

import java.util.List;

import android.os.AsyncTask;
import br.com.moobile.teste.timefutebol.adapters.PlayersAdapters;
import br.com.moobile.teste.timefutebol.models.Player;
import br.com.moobile.teste.timefutebol.utils.rest.RestClient;

public class SyncPlayersList  extends AsyncTask<Void, Void, List<Player>>{
	private PlayersAdapters mAdapter; 
	private long teamID;
	
	public SyncPlayersList(PlayersAdapters mAdapter, long teamID) { 
		this.mAdapter = mAdapter;
		this.teamID = teamID;
	}
	
	@Override
	protected List<Player> doInBackground(Void... params) { 
		return RestClient.getApiService().listPlayers(teamID);
	} 
	@Override
	protected void onPostExecute(List<Player> result) {
		for (Player t : result) {
			mAdapter.add(t);
		} 
	} 
}