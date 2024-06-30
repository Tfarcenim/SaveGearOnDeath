package tfar.savegearondeath;

import net.fabricmc.loader.api.FabricLoader;


public class TrinketsCompat {

    public static void init(){
        if (FabricLoader.getInstance().isModLoaded("trinkets")){
  /*          TrinketDropCallback.EVENT.register(new TrinketDropCallback() {
                @Override
                public DropRule drop(DropRule rule, ItemStack stack, SlotReference ref, LivingEntity entity) {
                    return DropRule.KEEP;
                }
            });*/
        }
    }
}
