package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.init.CaldrukimodModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;

public class MessagesFunnyStuffProcedure {
	public static boolean eventResult = true;

	public MessagesFunnyStuffProcedure() {
		ServerMessageEvents.ALLOW_CHAT_MESSAGE.register((message, sender, params) -> {
			execute(sender, message.decoratedContent().getString());
			boolean result = eventResult;
			eventResult = true;
			return result;
		});
	}

	public static void execute(Entity entity, String text) {
		if (entity == null || text == null)
			return;
		if (text.contains("hi ") || text.endsWith("hi")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CaldrukimodModMobEffects.HICURSE, 60, 1));
		}
	}
}