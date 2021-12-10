package com.apb718.firstMod;

import com.apb718.firstMod.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



// The value here should match an entry in the META-INF/mods.toml file
@Mod("tutorial")
public class Tutorial
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tutorial";


    public Tutorial() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLCommonSetupEvent event) { }

    public static final ItemGroup TAB  = new ItemGroup("tutorialTab") {

        @Override
        public ItemStack createIcon(){
            return new ItemStack(RegistryHandler.QUARTER.get());
            //for vanilla item ItemStack(Items.APPLE);
            // or block ItemStack(Blocks.GRASS
        }
    };
}
