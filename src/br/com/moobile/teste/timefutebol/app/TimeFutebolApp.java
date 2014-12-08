package br.com.moobile.teste.timefutebol.app;

import br.com.moobile.teste.timefutebol.utils.data.PreferencesWrapper;
import br.com.moobile.teste.timefutebol.utils.rest.RestClient;
import android.app.Application;

public class TimeFutebolApp extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Configurando RestClient
		RestClient.init();

		// Configurando Preferences
		PreferencesWrapper.init("timefutebol", getApplicationContext());
	}

}
