package draaft.mixin.world.biome;

import net.minecraft.world.biome.BambooJungleBiome;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BambooJungleBiome.class)
public abstract class BambooJungleBiomeMixin extends Biome {
    protected BambooJungleBiomeMixin(Settings settings) {
        super(settings);
    }

    @Override
    public float getMaxSpawnChance() {
        return 0.3F;
    }
}
