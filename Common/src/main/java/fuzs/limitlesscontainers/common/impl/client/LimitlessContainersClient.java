package fuzs.limitlesscontainers.common.impl.client;

import fuzs.limitlesscontainers.common.impl.LimitlessContainers;
import fuzs.limitlesscontainers.common.impl.client.gui.screens.inventory.LimitlessChestScreen;
import fuzs.limitlesscontainers.common.impl.init.ModRegistry;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.common.api.client.core.v1.context.MenuScreensContext;
import fuzs.puzzleslib.common.api.core.v1.ModLoaderEnvironment;

public class LimitlessContainersClient implements ClientModConstructor {

    @Override
    public void onRegisterMenuScreens(MenuScreensContext context) {
        if (!ModLoaderEnvironment.INSTANCE.isDevelopmentEnvironment(LimitlessContainers.MOD_ID)) return;
        context.registerMenuScreen(ModRegistry.LIMITLESS_CHEST_MENU.value(),
                LimitlessChestScreen.containerRows(6));
    }
}
