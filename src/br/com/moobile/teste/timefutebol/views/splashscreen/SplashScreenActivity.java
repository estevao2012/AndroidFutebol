package br.com.moobile.teste.timefutebol.views.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings.Secure;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.utils.data.PreferencesWrapper;
import br.com.moobile.teste.timefutebol.utils.rest.RestClient;
import br.com.moobile.teste.timefutebol.views.main.HomeActivity;

public class SplashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		
		String android_id = Secure.getString(getContentResolver(),Secure.ANDROID_ID);
		new SplashScreenTask(android_id).execute();
	}

	private class SplashScreenTask extends AsyncTask<Void, Void, Void> {

		private String android_id;
		
		public SplashScreenTask(String android_id) {
			super();
			this.android_id = android_id;
		}
		@Override
		protected Void doInBackground(Void... params) {
			try {
				Thread.sleep(1000);
				String token = RestClient.getApiService().register(android_id); 
				PreferencesWrapper.put("token", token);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			return null;
		}
		@Override
		protected void onPostExecute(Void result) {
			Intent homeIntent = new Intent(getApplicationContext(), HomeActivity.class);
			startActivity(homeIntent);
		}
	}
}
