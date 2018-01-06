package com.xty.qq.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class PotionFactory {
    private final Map<PotionType, Potion> potions;

    public PotionFactory() {
        potions = new EnumMap<>(PotionType.class);
    }

    Potion createPotion(PotionType potionType){
        Potion potion = potions.get(potionType);
        if (potion == null){
            switch (potionType){
                case HEALING:
                    potion = new HealingPotion();
                    potions.put(PotionType.HEALING, potion);
                    break;

                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    potions.put(PotionType.HOLY_WATER, potion);
                    break;

                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    potions.put(PotionType.INVISIBILITY, potion);
                    break;

                case POISON:
                    potion = new PoisonPotion();
                    potions.put(PotionType.POISON, potion);
                    break;

                case STRENGTH:
                    potion = new StrengthPotion();
                    potions.put(PotionType.STRENGTH, potion);
                    break;
            }
        }
        return potion;
    }
}
