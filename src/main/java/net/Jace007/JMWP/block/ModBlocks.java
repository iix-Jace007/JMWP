package net.Jace007.JMWP.block;

import net.Jace007.JMWP.Jmwp;
import net.Jace007.JMWP.block.custom.ModFlammableRotatedPillarBlock;
import net.Jace007.JMWP.block.custom.ModPlanks;
import net.Jace007.JMWP.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Jmwp.MOD_ID);

                // Start of Abadon Woodset
                    //Logs and Wood
    public static final DeferredBlock<Block> ABADON_LOG = registerBlock("abadon_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> ABADON_WOOD = registerBlock("abadon_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> ABADON_STRIPPED_LOG = registerBlock("abadon_stripped_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> ABADON_STRIPPED_WOOD = registerBlock("abadon_stripped_Wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

                    // Planks
    public static final DeferredBlock<Block> ABADON_PLANKS = registerBlock("abadon_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

                    // Slabs
    public static final DeferredBlock<Block> ABADON_SLAB = registerBlock("abadon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

                    // Stairs
    public static final DeferredBlock<Block> ABADON_STAIRS = registerBlock("abadon_stairs",
            () -> new StairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

                    // Fences
    public static final DeferredBlock<Block> ABADON_FENCE = registerBlock("abadon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<Block> ABADON_LOG_FENCE = registerBlock("abadon_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

                    // Fence Gates
    public static final DeferredBlock<Block> ABADON_FENCE_GATE = registerBlock("abadon_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

                    // Doors
    public static final DeferredBlock<Block> ABADON_DOOR = registerBlock("abadon_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<Block> ABADON_TRAPDOOR = registerBlock("abadon_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

                    // Redstone Stuff
    public static final DeferredBlock<Block> ABADON_BUTTON = registerBlock("abadon_button",
            () -> new ButtonBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredBlock<Block> ABADON_PRESSUREPLATE = registerBlock("abadon_pressureplate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));

                    // End of Abadon Woodset


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
