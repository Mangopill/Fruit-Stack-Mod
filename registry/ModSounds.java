package com.fruitstack.fruitstack.common.registry;

import com.fruitstack.fruitstack.fruitstack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds
{
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, fruitstack.MODID);
	public static final RegistryObject<SoundEvent> BLOCK_CLAY_OVEN_CRACKLE = SOUNDS.register("block.clay_oven.crackle",
			() -> new SoundEvent(new ResourceLocation(fruitstack.MODID, "block.clay_oven.crackle")));

	public static final RegistryObject<SoundEvent> BLOCK_TVFMPOIT_BOIL = SOUNDS.register("block.tripod_vessel_for_making_pills_of_immortality.boil",
			() -> new SoundEvent(new ResourceLocation(fruitstack.MODID, "block.tripod_vessel_for_making_pills_of_immortality.boil")));

	public static final RegistryObject<SoundEvent> BLOCK_TVFMPOIT_BOIL_SOUP = SOUNDS.register("block.tripod_vessel_for_making_pills_of_immortality.boil_soup",
			() -> new SoundEvent(new ResourceLocation(fruitstack.MODID, "block.tripod_vessel_for_making_pills_of_immortality.boil_soup")));

	public static final RegistryObject<SoundEvent> BEATING_MELONS = SOUNDS.register("block.beating_melons.hit",
			() -> new SoundEvent(new ResourceLocation(fruitstack.MODID, "block.beating_melons.hit")));
	public static final RegistryObject<SoundEvent> JUICER = SOUNDS.register("block.juicer.stir",
			() -> new SoundEvent(new ResourceLocation(fruitstack.MODID, "block.juicer.stir")));
}
