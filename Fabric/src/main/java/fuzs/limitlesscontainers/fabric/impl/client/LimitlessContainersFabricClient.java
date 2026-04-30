package fuzs.limitlesscontainers.fabric.impl.client;

import fuzs.limitlesscontainers.common.impl.LimitlessContainers;
import fuzs.limitlesscontainers.common.impl.client.LimitlessContainersClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class LimitlessContainersFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(LimitlessContainers.MOD_ID, LimitlessContainersClient::new);
    }
}
