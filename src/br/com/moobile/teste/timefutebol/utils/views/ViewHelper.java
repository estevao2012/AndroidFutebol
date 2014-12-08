package br.com.moobile.teste.timefutebol.utils.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;
import android.view.View;

public class ViewHelper {

	public static void abreFragment(FragmentManager fragmentManager, int layout, Fragment instranciaAlvo) {
		FragmentTransaction ft = fragmentManager.beginTransaction();
		ft.replace(layout, instranciaAlvo);
		ft.addToBackStack(instranciaAlvo.getClass().getSimpleName());
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		ft.commit();
	}
	
	public static <T extends View> T get(View view, int id) {
        SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
        if (viewHolder == null) {
            viewHolder = new SparseArray<View>();
            view.setTag(viewHolder);
        }
        View childView = viewHolder.get(id);
        if (childView == null) {
            childView = view.findViewById(id);
            viewHolder.put(id, childView);
        }
        return (T) childView;
    }
}
