package com.LvSb.MinFac.setup;

import com.LvSb.MinFac.Main;
import com.LvSb.MinFac.blocks.FancyBlockColor;
import com.LvSb.MinFac.blocks.FancyModelLoader;
import com.LvSb.MinFac.blocks.FirstBlockScreen;
import com.LvSb.MinFac.blocks.MagicRenderer;
import com.LvSb.MinFac.client.AfterLivingRenderer;
import com.LvSb.MinFac.client.InWorldRenderer;
import com.LvSb.MinFac.entities.WeirdMobRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static com.LvSb.MinFac.blocks.MagicRenderer.MAGICBLOCK_TEXTURE;

@Mod.EventBusSubscriber(modid = Main.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    public static void init(final FMLClientSetupEvent event) {
        ScreenManager.registerFactory(Registration.FIRSTBLOCK_CONTAINER.get(), FirstBlockScreen::new);
        RenderingRegistry.registerEntityRenderingHandler(Registration.WEIRDMOB.get(), WeirdMobRenderer::new);
        ModelLoaderRegistry.registerLoader(new ResourceLocation(Main.MODID, "fancyloader"), new FancyModelLoader());
        MagicRenderer.register();
        MinecraftForge.EVENT_BUS.addListener(InWorldRenderer::render);
        MinecraftForge.EVENT_BUS.addListener(AfterLivingRenderer::render);

        RenderTypeLookup.setRenderLayer(Registration.COMPLEX_MULTIPART.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(Registration.FANCYBLOCK.get(), (RenderType) -> true);

        Minecraft.getInstance().getBlockColors().register(new FancyBlockColor(), Registration.FANCYBLOCK.get());
    }

    @SubscribeEvent
    public static void onItemColor(ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, i) -> 0xff0000, Registration.WEIRDMOB_EGG.get());
    }

    @SubscribeEvent
    public static void onTextureStitch(TextureStitchEvent.Pre event) {
        if (!event.getMap().getTextureLocation().equals(AtlasTexture.LOCATION_BLOCKS_TEXTURE)) {
            return;
        }

        event.addSprite(MAGICBLOCK_TEXTURE);
    }

    @SubscribeEvent
    public void onTooltipPre(RenderTooltipEvent.Pre event) {
        Item item = event.getStack().getItem();
        if (item.getRegistryName().getNamespace().equals(Main.MODID)) {
            event.setMaxWidth(200);
        }
    }
}
