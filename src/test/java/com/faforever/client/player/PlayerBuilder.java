package com.faforever.client.player;

import com.faforever.client.chat.SocialStatus;
import com.faforever.client.chat.avatar.AvatarBean;
import com.faforever.client.game.Game;

public class PlayerBuilder {

  private final Player player;

  private PlayerBuilder(String username) {
    player = new Player(username);
  }

  public static PlayerBuilder create(String username) {
    return new PlayerBuilder(username);
  }

  public PlayerBuilder defaultValues() {
    return id(1)
        .chatOnly(false)
        .leaderboardRatingDeviation(250)
        .leaderboardRatingMean(1500)
        .socialStatus(SocialStatus.OTHER)
        .clan("e")
        .country("US");
  }

  private PlayerBuilder clan(String clan) {
    player.setClan(clan);
    return this;
  }

  public PlayerBuilder id(int id) {
    player.setId(id);
    return this;
  }

  public Player get() {
    return player;
  }

  public PlayerBuilder chatOnly(boolean chatOnly) {
    player.setChatOnly(chatOnly);
    return this;
  }

  public PlayerBuilder socialStatus(SocialStatus socialStatus) {
    player.setSocialStatus(socialStatus);
    return this;
  }

  public PlayerBuilder leaderboardRatingMean(float mean) {
    player.setLeaderboardRatingMean(mean);
    return this;
  }

  public PlayerBuilder leaderboardRatingDeviation(float deviation) {
    player.setLeaderboardRatingDeviation(deviation);
    return this;
  }

  public PlayerBuilder game(Game game) {
    player.setGame(game);
    return this;
  }

  public PlayerBuilder country(String country) {
    player.setCountry(country);
    return this;
  }

  public PlayerBuilder avatar(AvatarBean avatar) {
    player.setAvatarUrl(avatar == null ? null : avatar.getUrl().toExternalForm());
    player.setAvatarTooltip(avatar == null ? null : avatar.getDescription());
    return this;
  }
}
