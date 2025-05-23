package draaft.mixin.item;

import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Items.class)
public class ItemsMixin {
    @ModifyArg(
            method = "<clinit>",
            slice = @Slice(
                    from = @At(value = "NEW", target = "net/minecraft/item/ElytraItem"),
                    to = @At(value = "INVOKE", target = "net/minecraft/item/ElytraItem.<init>(Lnet/minecraft/item/Item$Settings;)V")
            ),
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item$Settings;maxDamage(I)Lnet/minecraft/item/Item$Settings;"
            )
    )
    private static int elytra(int original) {
        return 22824;
    }
}
