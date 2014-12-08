package br.com.moobile.teste.timefutebol.views.main;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.utils.views.ViewHelper;
import br.com.moobile.teste.timefutebol.views.main.home.HomeFragment;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class HomeActivity extends ActionBarActivity{

	@InjectView(R.id.drawer_layout) DrawerLayout mDrawerLayout; 
	@InjectView(R.id.navigation_drawer) LinearLayout mMenu;	
	private ActionBarDrawerToggle mDrawerToggle;
 
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_home);
		ButterKnife.inject(this);
		mDrawerToggle =  new ActionBarDrawerToggle(this, mDrawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		mDrawerLayout.setDrawerListener(mDrawerToggle); 
		
		getSupportActionBar().setDisplayHomeAsUpEnabled(true); 
		getSupportActionBar().setHomeButtonEnabled(true);
		
		ViewHelper.abreFragment(getSupportFragmentManager(), R.id.container, new HomeFragment()); 
	} 	

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState); 
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { 
        if (mDrawerToggle.onOptionsItemSelected(item)) {
          return true;
        } 
        return super.onOptionsItemSelected(item);
   	}
    
    @OnClick(R.id.times)
    void itensMenu(Button btn) { 
    	ViewHelper.abreFragment(getSupportFragmentManager(), R.id.container, new HomeFragment());
    	mDrawerLayout.closeDrawer(mMenu);
	}
    
    public ActionBarDrawerToggle getDraweToggle(){
    	return mDrawerToggle;
    }

}
