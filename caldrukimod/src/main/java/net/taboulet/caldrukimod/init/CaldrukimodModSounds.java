/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class CaldrukimodModSounds {
	public static SoundEvent ENRIQUE_LONG;
	public static SoundEvent ENRIQUE_FULL;
	public static SoundEvent ENRIQUE_QUE;
	public static SoundEvent ANGLEGRINDER_PART;
	public static SoundEvent ANGLEGRINDER_FULL;
	public static SoundEvent CALZOSKIDOG_FULL;
	public static SoundEvent CALZOSKIDOG_SMALL;
	public static SoundEvent ADRIAN_BLOCK_BREAK;
	public static SoundEvent ADRIAN_SB;
	public static SoundEvent ADRIAN_SB_A;
	public static SoundEvent ENRIQUE_SB;
	public static SoundEvent ENRIQUE_SB_A;
	public static SoundEvent FAR_SB;
	public static SoundEvent FAR_SB_A;
	public static SoundEvent GRINDER_SB;
	public static SoundEvent GRINDER_SB_A;
	public static SoundEvent SALTE_SB;
	public static SoundEvent SALTE_SB_A;
	public static SoundEvent SYFM_SB;
	public static SoundEvent SYFM_SB_A;
	public static SoundEvent AYYY;
	public static SoundEvent AYY_FULL;
	public static SoundEvent CALDRUKI_VIBE;

	public static void load() {
		ENRIQUE_LONG = register("enrique-long", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "enrique-long")));
		ENRIQUE_FULL = register("enrique-full", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "enrique-full")));
		ENRIQUE_QUE = register("enrique-que", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "enrique-que")));
		ANGLEGRINDER_PART = register("anglegrinder-part", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "anglegrinder-part")));
		ANGLEGRINDER_FULL = register("anglegrinder-full", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "anglegrinder-full")));
		CALZOSKIDOG_FULL = register("calzoskidog-full", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "calzoskidog-full")));
		CALZOSKIDOG_SMALL = register("calzoskidog-small", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "calzoskidog-small")));
		ADRIAN_BLOCK_BREAK = register("adrian-block-break", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "adrian-block-break")));
		ADRIAN_SB = register("adrian-sb", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "adrian-sb")));
		ADRIAN_SB_A = register("adrian-sb-a", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "adrian-sb-a")));
		ENRIQUE_SB = register("enrique-sb", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "enrique-sb")));
		ENRIQUE_SB_A = register("enrique-sb-a", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "enrique-sb-a")));
		FAR_SB = register("far-sb", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "far-sb")));
		FAR_SB_A = register("far-sb-a", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "far-sb-a")));
		GRINDER_SB = register("grinder-sb", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "grinder-sb")));
		GRINDER_SB_A = register("grinder-sb-a", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "grinder-sb-a")));
		SALTE_SB = register("salte-sb", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "salte-sb")));
		SALTE_SB_A = register("salte-sb-a", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "salte-sb-a")));
		SYFM_SB = register("syfm-sb", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "syfm-sb")));
		SYFM_SB_A = register("syfm-sb-a", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "syfm-sb-a")));
		AYYY = register("ayyy", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "ayyy")));
		AYY_FULL = register("ayy-full", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "ayy-full")));
		CALDRUKI_VIBE = register("caldruki-vibe", SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("caldrukimod", "caldruki-vibe")));
	}

	private static SoundEvent register(String registryname, SoundEvent element) {
		return Registry.register(BuiltInRegistries.SOUND_EVENT, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname), element);
	}
}