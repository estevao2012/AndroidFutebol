// Generated code from Butter Knife. Do not modify!
package br.com.moobile.teste.timefutebol.views;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class HomeActivity$$ViewInjector {
  public static void inject(Finder finder, final br.com.moobile.teste.timefutebol.views.HomeActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034177, "field 'mDrawerLayout'");
    target.mDrawerLayout = (android.support.v4.widget.DrawerLayout) view;
    view = finder.findRequiredView(source, 2131034179, "field 'mMenu'");
    target.mMenu = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131034180, "method 'itensMenu'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.itensMenu((android.widget.Button) p0);
        }
      });
  }

  public static void reset(br.com.moobile.teste.timefutebol.views.HomeActivity target) {
    target.mDrawerLayout = null;
    target.mMenu = null;
  }
}
