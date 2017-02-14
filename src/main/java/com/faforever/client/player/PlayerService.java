package com.faforever.client.player;

import javafx.beans.property.ReadOnlyObjectProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Set;

public interface PlayerService {

  /**
   * Returns the PlayerInfoBean for the specified username. Returns null if no such player is known.
   */
  @Nullable
  Player getPlayerForUsername(@Nullable String username);

  /**
   * Returns the PlayerInfoBean for the specified id. Returns null if no such player is known.
   */
  Optional<Player> getPlayerForId(int id);

  /**
   * Gets a player for the given username. A new user is created and registered if it does not yet exist.
   */
  Player createAndGetPlayerForUsername(@NotNull String username);

  Set<String> getPlayerNames();

  void addFriend(Player player);

  void removeFriend(Player user);

  void addFoe(Player username);

  void removeFoe(Player player);

  Player getCurrentPlayer();

  ReadOnlyObjectProperty<Player> currentPlayerProperty();

}
