package net.galahad.wakfucraft.item.custom;

import net.galahad.wakfucraft.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;

public class RubilaxSword extends SwordItem {
    public RubilaxSword() {
        super(
            Tiers.NETHERITE, 6, -2.4f, new Item.Properties().durability(5031));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack item = player.getItemInHand(hand);
        int dano = item.getDamageValue();
        ItemStack novoItem = new ItemStack(ModItems.RUBILAX_GREATSWORD.get());
        setDamage(novoItem, dano);
        if(!level.isClientSide) {
            player.setItemInHand(hand, novoItem);
        }
        System.out.println("foi na sword");
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
}
