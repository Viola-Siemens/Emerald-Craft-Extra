package com.hexagram2021.emeraldcraftextra.common;

import com.hexagram2021.emeraldcraftextra.common.register.ECEItems;
import net.minecraftforge.eventbus.api.IEventBus;

public class ECEContent {
	public static void modConstruction(IEventBus bus) {
		ECEItems.init(bus);
	}
}
