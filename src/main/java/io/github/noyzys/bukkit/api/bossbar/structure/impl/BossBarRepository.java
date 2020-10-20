package io.github.noyzys.bukkit.api.bossbar.structure.impl;

import io.github.noyzys.bukkit.api.bossbar.structure.BossBar;
import io.github.noyzys.bukkit.api.bossbar.structure.repository.Repository;
import org.bukkit.Server;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/**
 * @author: NoyZys on 18:54, 20.10.2020
 **/
public class BossBarRepository implements Repository<BossBar> {

    private final Server server;

    @Contract(pure = true)
    public BossBarRepository(final Server server) {
        this.server = server;
    }

    @Override
    public @Nullable BossBar collectRepository() {
        return null;
    }
}
