package net.domakingo.stellarwilderness.events;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

import static net.domakingo.stellarwilderness.StellarWilderness.MODID;

@Mod.EventBusSubscriber(modid = MODID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event) {

        ConfigCommand.register(event.getDispatcher());
    }
}

