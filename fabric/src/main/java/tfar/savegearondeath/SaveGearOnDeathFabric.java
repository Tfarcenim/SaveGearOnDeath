package tfar.savegearondeath;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;

public class SaveGearOnDeathFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TrinketsCompat.init();
        ServerPlayerEvents.COPY_FROM.register(SaveGearOnDeath::replaceInv);
    }
}
