package net.galahad.wakfucraft.item;

import net.galahad.wakfucraft.WakfuCraft;
import net.galahad.wakfucraft.item.custom.RubilaxDagger;
import net.galahad.wakfucraft.item.custom.RubilaxGreatsword;
import net.galahad.wakfucraft.item.custom.RubilaxSword;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, WakfuCraft.MOD_ID);

    public static final RegistryObject<Item> RUBILAX_DAGGER = ITEMS.register("rubilax_dagger", RubilaxDagger::new);
    public static final RegistryObject<Item> RUBILAX_SWORD = ITEMS.register("rubilax_sword", RubilaxSword::new);
    public static final RegistryObject<Item> RUBILAX_GREATSWORD = ITEMS.register("rubilax_greatsword", RubilaxGreatsword::new);

    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
