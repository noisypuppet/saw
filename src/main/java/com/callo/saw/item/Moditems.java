package com.callo.saw.item;

import com.callo.saw.sawmod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by callo on 1/26/2017.
 */
public class Moditems {

    public static Item tutorialItem;

    public static void preInit() {

        tutorialItem = new itemTutorialitem("tutorial_item");

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(tutorialItem, new ResourceLocation(sawmod.MODID, "tutorial_item"));
    }

    public static void registerRenders() {
        registerRender(tutorialItem);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(sawmod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}