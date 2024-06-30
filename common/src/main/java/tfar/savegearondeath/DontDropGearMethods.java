package tfar.savegearondeath;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class DontDropGearMethods {
    public static void on(Inventory inv, CallbackInfo ci){
        for (int i = 0; i < inv.items.size(); i++){

            if (i < 9) {
                continue; // dont drop hotbar.
            }
            ItemStack stack = inv.items.get(i);

            if (!stack.isEmpty()){
                inv.player.drop(stack, true, false);
                inv.items.set(i, ItemStack.EMPTY); // needed to prevent duplication of some items
            }
            ci.cancel();
        }
    }
}
