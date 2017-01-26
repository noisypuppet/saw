package com.callo.saw;

import com.callo.saw.item.Moditems;
import com.callo.saw.proxy.CommonProxy;
import com.callo.saw.tab.CreativeTabsaw;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = sawmod.MODID, version = sawmod.VERSION, name = sawmod.Name)
public class sawmod {
    public static final String MODID = "sawmod";
    public static final String VERSION = "1.0";
    public static final String Name = "Saw Mod";

@SidedProxy (clientSide = "com.callo.saw.proxy.ClientProxy", serverSide = "com.callo.saw.proxy.CommonProxy")
public static CommonProxy proxy;


    @Mod.Instance
    public static sawmod instance;

    public static CreativeTabsaw tabtutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabtutorial = new CreativeTabsaw(CreativeTabs.getNextID(), "Saw_stuff");
        Moditems.preInit();
        proxy.preinit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event) {

        proxy.postinit(event);
    }
}
