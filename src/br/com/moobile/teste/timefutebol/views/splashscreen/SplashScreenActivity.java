package br.com.moobile.teste.timefutebol.views.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import br.com.moobile.teste.timefutebol.R;
import br.com.moobile.teste.timefutebol.utils.data.PreferencesWrapper;
import br.com.moobile.teste.timefutebol.views.main.HomeActivity;

public class SplashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		new SplashScreenTask().execute();
	}

	private class SplashScreenTask extends AsyncTask<Void, Void, Void> {

		@Override
		protected Void doInBackground(Void... params) {
			try {
				// Só pra fala que ta processando alguma coisa ,KKKK, SQN 
//				TODO: Fazer requisição de token
				Thread.sleep(1000);
				PreferencesWrapper.put("token", "698dc19d489c4e4db73e28a713eab07b");
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
