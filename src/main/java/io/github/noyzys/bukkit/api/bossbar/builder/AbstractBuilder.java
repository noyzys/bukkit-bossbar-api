package io.github.noyzys.bukkit.api.bossbar.builder;

import io.github.noyzys.bukkit.api.bossbar.BossBarColor;
import io.github.noyzys.bukkit.api.bossbar.BossBarStyle;
import org.jetbrains.annotations.NotNull;

/**
 * @author: NoyZys on 19:07, 20.10.2020
 **/
public abstract class AbstractBuilder<T extends AbstractBuilder<T>> {

    public static class Builder extends AbstractBuilder<Builder> {

        public static BossBarStyle defaultStyle() {
            return BossBarStyle.SOLID;
        }

        public static BossBarColor defaultColor() {
            return BossBarColor.PINK;
        }
    }
}
