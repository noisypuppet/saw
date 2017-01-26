package com.callo.saw.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


/**
 * Created by callo on 1/25/2017.
 */
public class CreativeTabsaw extends CreativeTabs {

    public CreativeTabsaw(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.ARROW);
    }
}