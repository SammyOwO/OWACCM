package com.sammydev.owaccm.objects.blocks;

import com.sammydev.owaccm.OWACCM;
import com.sammydev.owaccm.init.BlockInit;
import com.sammydev.owaccm.init.ItemInit;
import com.sammydev.owaccm.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material)
    {
        super(material);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        OWACCM.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "Inventory");
    }
}
