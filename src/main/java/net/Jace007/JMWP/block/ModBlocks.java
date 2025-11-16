package net.Jace007.JMWP.block;

import net.Jace007.JMWP.Jmwp;
import net.Jace007.JMWP.block.custom.ModFlammableRotatedPillarBlock;
import net.Jace007.JMWP.block.custom.ModLeavesEx;
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
    public static final DeferredBlock<Block> ABADON_STRIPPED_LOG = registerBlock("abadon_stripped_log.json",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> ABADON_STRIPPED_WOOD = registerBlock("abadon_stripped_Wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

                    // Planks
    public static final DeferredBlock<Block> ABADON_PLANKS = registerBlock("abadon_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

                    // Slabs
    public static final DeferredBlock<SlabBlock> ABADON_SLAB = registerBlock("abadon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> ABADON_LOG_SLAB = registerBlock("abadon_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> ABADON_STRIPPED_WOOD_SLAB = registerBlock("abadon_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

                    // Stairs
    public static final DeferredBlock<StairBlock> ABADON_STAIRS = registerBlock("abadon_stairs",
            () -> new StairBlock(ModBlocks.ABADON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> ABADON_LOG_STAIRS = registerBlock("abadon_log_stairs",
            () -> new StairBlock(ModBlocks.ABADON_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> ABADON_STRIPPED_WOOD_STAIRS = registerBlock("abadon_stripped_wood_stairs",
            () -> new StairBlock(ModBlocks.ABADON_STRIPPED_WOOD.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

                    // Fences
    public static final DeferredBlock<FenceBlock> ABADON_FENCE = registerBlock("abadon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> ABADON_LOG_FENCE = registerBlock("abadon_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

                    // Fence Gates
    public static final DeferredBlock<FenceGateBlock> ABADON_FENCE_GATE = registerBlock("abadon_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> ABADON_LOG_FENCE_GATE = registerBlock("abadon_log_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

                    // Doors
    public static final DeferredBlock<DoorBlock> ABADON_DOOR = registerBlock("abadon_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> ABADON_TRAPDOOR = registerBlock("abadon_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> ABADON_LOG_TRAPDOOR = registerBlock("abadon_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));

                    // Redstone Stuff
    public static final DeferredBlock<ButtonBlock> ABADON_BUTTON = registerBlock("abadon_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));
    public static final DeferredBlock<ButtonBlock> ABADON_LOG_BUTTON = registerBlock("abadon_log_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));
    public static final DeferredBlock<PressurePlateBlock> ABADON_PRESSUREPLATE = registerBlock("abadon_pressureplate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));

                    // Saplings & Leaves
    public static final DeferredBlock<LeavesBlock> ABADON_LEAVES = registerBlock("abadon_leaves",
            () -> new ModLeavesEx(, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> ABADON_SAPLING = registerBlock("abadon_sapling",
            () -> new SaplingBlock(, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

                    // End of Abadon Woodset | Notes: Needs Signs, Boat, and Chest Boat


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
