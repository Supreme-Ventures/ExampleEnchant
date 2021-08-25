package life.savag3.example;

import life.savag3.supremehoes.enchantments.Enchants;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        Enchants.getInstance().addEnchant(ExampleEnchant.class);
    }
}
