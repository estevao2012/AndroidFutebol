package br.com.moobile.teste.timefutebol.adapters;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.models.Player;
import br.com.moobile.teste.timefutebol.utils.views.ViewHelper;

public class PlayersAdapters extends BaseAdapter {

	private Context mContext;
	private List<Player> mList;
	
	public PlayersAdapters(Context applicationContext) {
		mContext = applicationContext;
		mList = new ArrayList<Player>();
	}

	@Override
	public int getCount() { 
		return mList.size();
	}

	public void add(Player _item){
		mList.add(_item);
		notifyDataSetChanged();
	}
	
	@Override
	public Player getItem(int position) { 
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) { 
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if(view == null){
			view = LayoutInflater.from(mContext).inflate(R.layout.adapter_player, parent,false);
		}
		
		Player player = getItem(position);
		
		TextView txtName 	 = ViewHelper.get(view, R.id.txtName);
		TextView txtPosition = ViewHelper.get(view, R.id.txtPosition);
		TextView txtNumber	 = ViewHelper.get(view, R.id.txtNumber);
		
		txtName.setText(player.getName());
		txtPosition.setText(player.getPosition());
		txtNumber.setText(String.valueOf(player.getNumber())); 
		
		return view;
	}

}
