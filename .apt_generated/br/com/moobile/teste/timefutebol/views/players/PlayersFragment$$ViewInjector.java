// Generated code from Butter Knife. Do not modify!
package br.com.moobile.teste.timefutebol.views.players;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class PlayersFragment$$ViewInjector {
  public static void inject(Finder finder, final br.com.moobile.teste.timefutebol.views.players.PlayersFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034188, "field 'mNumberPlayers'");
    target.mNumberPlayers = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034187, "field 'mTeamSigla'");
    target.mTeamSigla = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034189, "field 'mListPlayers'");
    target.mListPlayers = (android.widget.ListView) view;
    view = finder.findRequiredView(source, 2131034186, "field 'mTeamName'");
    target.mTeamName = (android.widget.TextView) view;
  }

  public static void reset(br.com.moobile.teste.timefutebol.views.players.PlayersFragment target) {
    target.mNumberPlayers = null;
    target.mTeamSigla = null;
    target.mListPlayers = null;
    target.mTeamName = null;
  }
}
