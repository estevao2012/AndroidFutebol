// Generated code from Butter Knife. Do not modify!
package br.com.moobile.teste.timefutebol.views.main.home;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class HomeFragment$$ViewInjector {
  public static void inject(Finder finder, final br.com.moobile.teste.timefutebol.views.main.home.HomeFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034185, "field 'mListTeams'");
    target.mListTeams = (android.widget.ListView) view;
    view = finder.findRequiredView(source, 2131034186, "field 'mEmptyView'");
    target.mEmptyView = (android.widget.TextView) view;
  }

  public static void reset(br.com.moobile.teste.timefutebol.views.main.home.HomeFragment target) {
    target.mListTeams = null;
    target.mEmptyView = null;
  }
}
