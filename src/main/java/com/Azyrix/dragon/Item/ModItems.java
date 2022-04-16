package com.Azyrix.dragon.Item;

import com.Azyrix.dragon.MCCourseMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);
    public static final Registry


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
