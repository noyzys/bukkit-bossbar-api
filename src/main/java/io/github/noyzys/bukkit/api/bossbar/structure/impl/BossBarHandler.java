package io.github.noyzys.bukkit.api.bossbar.structure.impl;

import io.github.noyzys.bukkit.api.bossbar.BossBarColor;
import io.github.noyzys.bukkit.api.bossbar.BossBarStyle;
import io.github.noyzys.bukkit.api.bossbar.structure.BossBar;
import io.github.noyzys.bukkit.api.bossbar.structure.BossBarPlayer;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static io.github.noyzys.bukkit.api.bossbar.builder.AbstractBuilder.Builder.defaultColor;
import static io.github.noyzys.bukkit.api.bossbar.builder.AbstractBuilder.Builder.defaultStyle;

/**
 * @author: NoyZys on 19:05, 20.10.2020
 **/
final class BossBarHandler implements BossBar, BossBarPlayer {

    private final org.bukkit.boss.BossBar bossBar;

    @Contract(pure = true)
    BossBarHandler(final org.bukkit.boss.BossBar bossBar) {
        this.bossBar = bossBar;
    }

    @NotNull
    @Override
    public String title() {
        return bossBar.getTitle();
    }

    @NotNull
    @Override
    public BossBar setTitle(final String title) {
        bossBar.setTitle(title);
        return this;
    }

    @NotNull
    @Override
    public BossBarStyle selectStyle(final BarStyle style) {
        switch (style) {
            case SOLID:
                return BossBarStyle.SOLID;
            case SEGMENTED_6:
                return BossBarStyle.SEGMENTED_6;
            case SEGMENTED_10:
                return BossBarStyle.SEGMENTED_10;
            case SEGMENTED_12:
                return BossBarStyle.SEGMENTED_12;
            case SEGMENTED_20:
                return BossBarStyle.SEGMENTED_20;
            default:
                return defaultStyle();
        }
    }

    @NotNull
    @Override
    public BarStyle selectStyle(final BossBarStyle style) {
        switch (style) {
            case SOLID:
                return BarStyle.SOLID;
            case SEGMENTED_6:
                return BarStyle.SEGMENTED_6;
            case SEGMENTED_10:
                return BarStyle.SEGMENTED_10;
            case SEGMENTED_12:
                return BarStyle.SEGMENTED_12;
            case SEGMENTED_20:
                return BarStyle.SEGMENTED_20;
            default:
                return selectStyle(defaultStyle());
        }
    }

    @NotNull
    @Override
    public BossBarColor selectBarColor(final BarColor color) {
        switch (color) {
            case PINK:
                return BossBarColor.PINK;
            case BLUE:
                return BossBarColor.BLUE;
            case RED:
                return BossBarColor.RED;
            case GREEN:
                return BossBarColor.GREEN;
            case YELLOW:
                return BossBarColor.YELLOW;
            case PURPLE:
                return BossBarColor.PURPLE;
            case WHITE:
                return BossBarColor.WHITE;
            default:
                return defaultColor();
        }
    }

    @NotNull
    @Override
    public BarColor selectBarColor(final BossBarColor color) {
        switch (color) {
            case PINK:
                return BarColor.PINK;
            case BLUE:
                return BarColor.BLUE;
            case RED:
                return BarColor.RED;
            case GREEN:
                return BarColor.GREEN;
            case YELLOW:
                return BarColor.YELLOW;
            case PURPLE:
                return BarColor.PURPLE;
            case WHITE:
                return BarColor.WHITE;
            default:
                return selectBarColor(defaultColor());
        }
    }

    /*
        Section bar for player.
     */

    @Override
    public void addPlayer(final @Nullable Player player) {

    }

    @Override
    public void removePlayer(final @Nullable Player player) {

    }

    @Override
    public void addPlayers(final @NotNull Iterable<Player> players) {

    }

    @Override
    public void removePlayers(final @NotNull Iterable<Player> players) {

    }

    @Override
    public void removeAll() {

    }

    @NotNull
    @Override
    public List<Player> players() {
        return null;
    }
}
