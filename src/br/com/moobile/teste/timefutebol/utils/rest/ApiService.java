package br.com.moobile.teste.timefutebol.utils.rest;

import java.util.List;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import br.com.moobile.teste.timefutebol.models.Player;
import br.com.moobile.teste.timefutebol.models.Team;

public interface ApiService {
 
  @GET("/api/v1/teams")
  List<Team> listTeams(); 
 
  @GET("/api/v1/teams/{id}/players")
  List<Player> listPlayers(@Path("id") long teamId);
  
  @FormUrlEncoded
  @POST("/api/v1/register")
  String register(@Field("aparelho") String aparelho);
}