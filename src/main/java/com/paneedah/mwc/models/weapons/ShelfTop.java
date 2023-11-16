package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ShelfTop extends ModelBase implements IModernModel {
	private final ModelRenderer shelf1;

	public ShelfTop() {
		textureWidth = 128;
		textureHeight = 128;

		shelf1 = new ModelRenderer(this);
		shelf1.setRotationPoint(-8.0F, 22.0F, -5.0F);
		shelf1.cubeList.add(new ModelBox(shelf1, 0, 0, 0.0F, 0.0F, 0.0F, 16, 2, 10, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		shelf1.render(f5);
	}
}