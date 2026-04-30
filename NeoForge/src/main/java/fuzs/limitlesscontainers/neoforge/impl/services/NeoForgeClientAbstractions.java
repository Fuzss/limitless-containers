package fuzs.limitlesscontainers.neoforge.impl.services;

import fuzs.limitlesscontainers.impl.services.ClientAbstractions;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.ItemDecoratorHandler;

public final class NeoForgeClientAbstractions implements ClientAbstractions {
    @SuppressWarnings("UnstableApiUsage")
    @Override
    public void renderItemOverlay(GuiGraphicsExtractor guiGraphics, Font font, ItemStack itemStack, int posX, int posY) {
        ItemDecoratorHandler.of(itemStack).render(guiGraphics, font, itemStack, posX, posY);
    }
}
