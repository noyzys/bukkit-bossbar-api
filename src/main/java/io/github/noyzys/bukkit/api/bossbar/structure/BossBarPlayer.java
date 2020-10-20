package io.github.noyzys.bukkit.api.bossbar.structure;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author: NoyZys on 18:29, 20.10.2020
 **/
public interface BossBarPlayer {

    void addPlayer(@Nullable final Player player);

    void removePlayer(@Nullable final Player player);

    default void addPlayers(@NotNull final Iterable<Player> players) {
        for (Player player : players) {
            addPlayer(player);
        }
    }

    default void removePlayers(@NotNull final Iterable<Player> players) {
        for (Player player : players) {
            removePlayer(player);
        }
    }

    void removeAll();

    @NotNull
    List<Player> players();
}
