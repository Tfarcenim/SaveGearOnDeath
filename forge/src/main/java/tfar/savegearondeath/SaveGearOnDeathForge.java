package tfar.savegearondeath;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(SaveGearOnDeath.MOD_ID)
public class SaveGearOnDeathForge {
    
    public SaveGearOnDeathForge() {
        SaveGearOnDeath.init();
        MinecraftForge.EVENT_BUS.addListener(this::cloneEvent);
    }

    private void cloneEvent(PlayerEvent.Clone event) {
        SaveGearOnDeath.replaceInv(event.getOriginal(),event.getEntity(),!event.isWasDeath());
    }
}