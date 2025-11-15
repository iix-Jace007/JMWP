package net.Jace007.JMWP.item;

import net.Jace007.JMWP.Jmwp;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Jmwp.MOD_ID);

    public static final Supplier<CreativeModeTab> JACES_WOOD = CREATIVE_MODE_TAB.register("jaces_wood_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ABADON_STICK.get()))
                    .title(Component.translatable("creativetab.jacesmegawoodp.jaces_wood"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ABADON_STICK);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
