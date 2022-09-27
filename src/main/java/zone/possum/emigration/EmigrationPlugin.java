package zone.possum.emigration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import net.fabricmc.loader.api.FabricLoader;
import zone.possum.emigration.compat.farmersdelight.FarmersDelightPlugin;
import zone.possum.emigration.core.SimpleEMIngrationPlugin;

public class EmigrationPlugin implements EmiPlugin {
    public static final Logger LOGGER = LoggerFactory.getLogger("emigration");

    private static void register(SimpleEMIngrationPlugin plugin, EmiRegistry emiRegistry) {
        if (FabricLoader.getInstance().isModLoaded(plugin.getMod())) plugin.register(emiRegistry);
    }

    @Override
    public void register(EmiRegistry emi) {
        register(new FarmersDelightPlugin(), emi);
    }
}
