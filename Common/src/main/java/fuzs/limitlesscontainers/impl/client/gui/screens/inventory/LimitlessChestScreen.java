package fuzs.limitlesscontainers.impl.client.gui.screens.inventory;

import fuzs.limitlesscontainers.api.limitlesscontainers.v1.client.LimitlessContainerScreen;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.MenuAccess;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class LimitlessChestScreen<T extends AbstractContainerMenu> extends LimitlessContainerScreen<T> {
    private static final Identifier CONTAINER_BACKGROUND = Identifier.withDefaultNamespace(
            "textures/gui/container/generic_54.png");

    private final int containerRows;

    public static <M extends AbstractContainerMenu, S extends Screen & MenuAccess<M>> MenuScreens.ScreenConstructor<M, S> containerRows(int containerRows) {
        return (M abstractContainerMenu, Inventory inventory, Component component) -> {
            return (S) new LimitlessChestScreen<>(abstractContainerMenu, inventory, component, containerRows);
        };
    }

    public LimitlessChestScreen(T menu, Inventory playerInventory, Component title, int containerRows) {
        super(menu, playerInventory, title, DEFAULT_IMAGE_WIDTH, 114 + containerRows * 18);
        this.containerRows = containerRows;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
        super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED,
                CONTAINER_BACKGROUND,
                this.leftPos,
                this.topPos,
                0,
                0,
                this.imageWidth,
                this.containerRows * 18 + 17,
                256,
                256);
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED,
                CONTAINER_BACKGROUND,
                this.leftPos,
                this.topPos + this.containerRows * 18 + 17,
                0,
                126,
                this.imageWidth,
                96,
                256,
                256);
    }
}
