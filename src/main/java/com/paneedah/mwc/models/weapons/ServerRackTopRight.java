package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ServerRackTopRight extends ModelBase implements IModernModel {
	private final ModelRenderer bone;

	public ServerRackTopRight() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -3.0F, -6.0F, 16, 2, 13, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -3.0F, -6.1F, 2, 3, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -3.0F, 5.1F, 2, 3, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 50, 7.1F, -3.0F, -4.5F, 1, 3, 10, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}