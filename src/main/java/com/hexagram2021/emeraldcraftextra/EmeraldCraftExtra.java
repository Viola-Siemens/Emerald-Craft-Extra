package com.hexagram2021.emeraldcraftextra;

import com.hexagram2021.emeraldcraftextra.common.ECEContent;
import com.hexagram2021.emeraldcraftextra.common.register.ECEItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EmeraldCraftExtra.MODID)
public class EmeraldCraftExtra {
	public static final String MODID = "emeraldcraftextra";

	public EmeraldCraftExtra() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ECEContent.modConstruction(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	public static final CreativeModeTab EMERALD_CRAFT_EXTRA = new CreativeModeTab(MODID) {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ECEItems.EMERALD_CRAFT_EGG.get());
		}
	};
}
