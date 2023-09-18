package com.anansi.vanq.init;

import com.anansi.vanq.DivPunish;
import com.anansi.vanq.vanq;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.anansi.vanq.ModItemTier;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "vanq");

    public static final RegistryObject<Item> DIVPUNISH = ITEMS.register("divpunish",
            () -> new DivPunish(ModItemTier.DIVPUNISH, 0, -2.4f, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

}
