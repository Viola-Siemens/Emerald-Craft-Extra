package com.hexagram2021.emeraldcraftextra.common.register;

import com.hexagram2021.emeraldcraftextra.common.items.LightShadowDominatorSwordItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.hexagram2021.emeraldcraftextra.EmeraldCraftExtra.EMERALD_CRAFT_EXTRA;
import static com.hexagram2021.emeraldcraftextra.EmeraldCraftExtra.MODID;

public class ECEItems {
	public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

	private static final Item.Properties EGG_PROPERTIES = new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(EMERALD_CRAFT_EXTRA);
	private static final Item.Properties COMMON_PROPERTIES = new Item.Properties().tab(EMERALD_CRAFT_EXTRA);
	private static final Item.Properties UNCOMMON_PROPERTIES = new Item.Properties().rarity(Rarity.UNCOMMON).tab(EMERALD_CRAFT_EXTRA);
	private static final Item.Properties SWORD_PROPERTIES = new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).tab(EMERALD_CRAFT_EXTRA);

	private static final Tier LIGHT_SHADOW_DOMINATOR = new ForgeTier(4, 1, 10.0F, 90.0F, 20, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.STRING));
	private static final Tier REINFORCED_LIGHT_SHADOW_DOMINATOR = new ForgeTier(4, 1, 12.0F, 160.0F, 25, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.STRING));

	public static final RegistryObject<Item> EMERALD_CRAFT_EGG = REGISTER.register("emerald_craft_egg", () -> new Item(EGG_PROPERTIES) {
		@Override
		public boolean isFoil(ItemStack itemStack) {
			return true;
		}
	});
	public static final RegistryObject<Item> BOTANY_EMISSARY_EGG = REGISTER.register("botany_emissary_egg", () -> new Item(EGG_PROPERTIES) {
		@Override
		public boolean isFoil(ItemStack itemStack) {
			return true;
		}
	});
	public static final RegistryObject<LightShadowDominatorSwordItem> LIGHT_SHADOW_DOMINATOR_SWORD = REGISTER.register("light_shadow_dominator_sword", () -> new LightShadowDominatorSwordItem(LIGHT_SHADOW_DOMINATOR, SWORD_PROPERTIES));
	public static final RegistryObject<LightShadowDominatorSwordItem> REINFORCED_LIGHT_SHADOW_DOMINATOR_SWORD = REGISTER.register("reinforced_light_shadow_dominator_sword", () -> new LightShadowDominatorSwordItem(REINFORCED_LIGHT_SHADOW_DOMINATOR, SWORD_PROPERTIES) {
		@Override
		public void inventoryTick(ItemStack p_41404_, Level p_41405_, Entity p_41406_, int p_41407_, boolean p_41408_) {
			super.inventoryTick(p_41404_, p_41405_, p_41406_, p_41407_, p_41408_);
		}
	});

	public static void init(IEventBus bus) {
		REGISTER.register("emerald_matrix", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("lapis_matrix", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("infinite_juice", () -> new Item(UNCOMMON_PROPERTIES));

		REGISTER.register("gaia_storm", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("terrasteel_matrix", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("spirit_ingot", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("botany_cream", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("mana_pylon_matrix", () -> new Item(COMMON_PROPERTIES));

		REGISTER.register("light_shadow_dominator_sword_blade", () -> new Item(UNCOMMON_PROPERTIES));
		REGISTER.register("light_shadow_dominator_sword_hilt", () -> new Item(UNCOMMON_PROPERTIES));
		REGISTER.register("shadow_ingot", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("obsidian_matrix", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("compressed_obsidian", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("universe_ingot", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("light_shadow_sword_spirit", () -> new Item(UNCOMMON_PROPERTIES));
		REGISTER.register("elementary_blade", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("elementary_knife", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("elementary_sword", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("light_brand", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("light_ingot", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("blaze_ingot", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("glow_ingot", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("shining_star", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("gold_matrix", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("infinite_core", () -> new Item(UNCOMMON_PROPERTIES));

		REGISTER.register("eternal_spinning_heart_of_light", () -> new Item(UNCOMMON_PROPERTIES));
		REGISTER.register("stress_core", () -> new Item(UNCOMMON_PROPERTIES));
		REGISTER.register("elementary_strength", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("he_compressed_motor", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("he_redstone_matrix", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("he_core", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("elementary_energy", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("fusion_star", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("mimetic_neutretto", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("energy_matrix", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("coal_matrix", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("compressed_coal_block", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("worldshapers_stress_meter", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("infinitely_spinning_wheel", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("universe_wheel", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("infinitely_spinning_core", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("antimatter_energy_core", () -> new Item(COMMON_PROPERTIES));
		REGISTER.register("antimatter_ingot", () -> new Item(COMMON_PROPERTIES));

		REGISTER.register(bus);
	}
}
