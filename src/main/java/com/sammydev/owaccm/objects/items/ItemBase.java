package com.sammydev.owaccm.objects.items;

import com.sammydev.owaccm.OWACCM;
import com.sammydev.owaccm.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    @Override
    public void registerModels()
    {
        OWACCM.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
