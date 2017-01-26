package com.callo.saw.proxy;

import com.callo.saw.item.Moditems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by callo on 1/25/2017.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preinit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        Moditems.registerRenders();
    }

    @Override
    public void postinit(FMLPostInitializationEvent event) {

    }
}