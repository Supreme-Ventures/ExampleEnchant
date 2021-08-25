package life.savag3.example;

import life.savag3.supremehoes.HarvestContext;
import life.savag3.supremehoes.enchantments.Enchant;

import java.util.LinkedHashMap;

public class ExampleEnchant extends Enchant {

    public ExampleEnchant() {
        super("ExampleEnchant", 1000);
        LinkedHashMap<Integer, Double> costPerLevel = new LinkedHashMap<>();
        costPerLevel.put(1, 1000.0);
        costPerLevel.put(2, 1100.0);
        costPerLevel.put(3, 1200.0);

        this.costUpgradeMap = costPerLevel;
        this.maxLevel = 3;
    }

    @Override
    public void perform(HarvestContext context) {
        // Called everytime a player harvest cane since there is no random factor
        context.getPlayer().getBukkitPlayer().sendMessage("&cCongrats!");
    }
}
