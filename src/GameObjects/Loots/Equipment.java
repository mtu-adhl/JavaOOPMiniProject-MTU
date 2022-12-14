package GameObjects.Loots;

import GameObjects.Item;

public class Equipment extends Item {
    private String slot; // "head" || "body" || "misc"
    private int def;
    public Equipment(String name, String desc, int durability, int def, String slot) {
        super(name, desc, durability, 0);
        setDef(def);
        setSlot(slot);
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", desc='" + getDesc() + '\'' +
                ", durability=" + getDurability() +
                ", maxDurability=" + getMaxDurability() +
                ", weight=" + getWeight() +
                ", def=" + getDef() +
                ", slot='" + getSlot() + '\'' +
                '}';
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
