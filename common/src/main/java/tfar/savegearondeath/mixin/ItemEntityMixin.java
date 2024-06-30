package tfar.savegearondeath.mixin;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public class ItemEntityMixin {

    @Inject(method = "playerTouch", at = @At(value = "HEAD"), cancellable = true)
    private void dontPickupGearWhenDead(Player player, CallbackInfo ci){
        if (!player.isAlive()){
            ci.cancel();
        }
    }
}
