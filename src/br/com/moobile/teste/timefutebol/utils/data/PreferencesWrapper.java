package br.com.moobile.teste.timefutebol.utils.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor; 

public class PreferencesWrapper { 

private static SharedPreferences settings;
	
	public static void init(String name, Context contexto) {
		settings = contexto.getSharedPreferences(name, 0);
	}
	
	private static Editor getEditor() {
		return settings.edit();
	}
	
	public static void put(String name, String value) {
		SharedPreferences.Editor editor = getEditor();
		editor.putString(name, value);
		editor.commit();
	}
	
	public static Object get(String name) {
		return settings.getString(name, "");
	}
}