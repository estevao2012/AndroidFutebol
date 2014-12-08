package br.com.moobile.teste.timefutebol.utils.rest;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import br.com.moobile.teste.timefutebol.utils.data.PreferencesWrapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RestClient {
	private static final String BASE_URL = "http://10.0.2.2:3000";
	private static ApiService apiService;

	public static void init() {
		Gson gson = new GsonBuilder().setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'").create();

		RequestInterceptor requestInterceptor = new RequestInterceptor() {
			@Override
			public void intercept(RequestFacade request) {
				request.addHeader("Authorization", "Token token=" + PreferencesWrapper.get("token"));
			}
		};

		RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
				.setEndpoint(BASE_URL).setRequestInterceptor(requestInterceptor).setConverter(new GsonConverter(gson))
				.build();

		apiService = restAdapter.create(ApiService.class);
	}

	public static ApiService getApiService() {
		return apiService;
	}
}
