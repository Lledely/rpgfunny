package net.lledely.rpg.block;

import net.lledely.rpg.RPGFunny;
import net.lledely.rpg.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            RPGFunny.MOD_ID);

    public static final RegistryObject<Block> UPGRADE_TABLE = registerBlock("upgrade_table",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHEST).sound(SoundType.METAL)));

    public static final RegistryObject<Block> WAYPOINT = registerBlock("waypoint",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> DARK_DIAMOND_ORE = registerBlock("dark_diamond_ore",
            ()-> new DropExperienceBlock(UniformInt.of(6, 8),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                                .strength(2.2f)
                                .requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
