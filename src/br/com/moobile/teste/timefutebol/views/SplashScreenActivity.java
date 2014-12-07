package br.com.moobile.teste.timefutebol.views;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import br.com.moobile.teste.timefutebol.R;

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
