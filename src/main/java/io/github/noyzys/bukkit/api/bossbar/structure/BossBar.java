package io.github.noyzys.bukkit.api.bossbar.structure;

import io.github.noyzys.bukkit.api.bossbar.BossBarColor;
import io.github.noyzys.bukkit.api.bossbar.BossBarStyle;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author: NoyZys on 18:19, 20.10.2020
 **/
public interface BossBar {

    @NotNull
    String title();

    @NotNull
    BossBar setTitle(@Nullable final String title);

    @NotNull
    BossBarStyle selectStyle(final BarStyle style);

    @NotNull
    BarStyle selectStyle(final BossBarStyle style);

    @NotNull
    BossBarColor selectBarColor(final BarColor color);

    @NotNull
    BarColor selectBarColor(final BossBarColor color);
}
