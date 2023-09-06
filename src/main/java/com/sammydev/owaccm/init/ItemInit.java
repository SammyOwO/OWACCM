package com.sammydev.owaccm.init;

import com.sammydev.owaccm.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item TEST_ITEM = new ItemBase("test_item");
}
