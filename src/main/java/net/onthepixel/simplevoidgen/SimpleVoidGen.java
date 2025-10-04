package net.onthepixel.simplevoidgen;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public final class SimpleVoidGen extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("VoidGen Plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("VoidGen Plugin has been disabled!");
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidChunkGenerator();
    }

    public static class VoidChunkGenerator extends ChunkGenerator {

        @Override
        public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
            return createChunkData(world);
        }
    }
}
