package net.Jace007.JMWP.item;

import net.Jace007.JMWP.Jmwp;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Jmwp.MOD_ID);

    // Insert Items Below
    public static final DeferredItem<Item> ABADON_STICK = ITEMS.register("abadon_stick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ABU_STICK =  ITEMS.register("abu_stick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
