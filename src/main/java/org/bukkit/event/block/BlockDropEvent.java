package org.bukkit.event.block;

import org.bukkit.entity.Item;
import org.bukkit.event.entity.EntitySpawnEvent;

public class BlockDropEvent extends EntitySpawnEvent {

    public BlockDropEvent(Item drop) {
        super(drop);
    }

    @Override
    public Item getEntity() {
        return (Item) entity;
    }

}
