package io.github.noyzys.bukkit.api.bossbar.structure.repository;

import org.jetbrains.annotations.Nullable;

import java.util.Optional;

/**
 * @author: NoyZys on 18:55, 20.10.2020
 **/
public interface Repository<T> {

    @Nullable
    T collectRepository();
}
