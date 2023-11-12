package com.hexagram2021.emeraldcraftextra.common.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LightShadowDominatorSwordItem extends SwordItem {
	public LightShadowDominatorSwordItem(Tier tier, Properties props) {
		super(tier, 3, -2.4F, props);
	}

	@Override
	public boolean isDamageable(ItemStack stack) {
		return false;
	}

	@Override
	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
		components.add(Component.translatable("desc.emeraldcraftextra.light_shadow_dominator_sword").withStyle(ChatFormatting.GRAY));
	}
}
