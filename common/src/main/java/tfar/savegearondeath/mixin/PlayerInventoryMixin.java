package tfar.savegearondeath.mixin;

import net.minecraft.world.entity.player.Inventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tfar.savegearondeath.DontDropGearMethods;

@Mixin(Inventory.class)
public class PlayerInventoryMixin {

    @Inject(method = "dropAll", at = @At(value = "HEAD"), cancellable = true)
    private void dontDropGear(CallbackInfo ci){
        Inventory inv = (Inventory) (Object) this;
        DontDropGearMethods.on(inv, ci);
    }
}
