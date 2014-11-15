package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class start extends Image{

	start(Texture texture){
		super(texture);
		addListener(new startInput(this));
	}
	public void act(float delta){
		super.act(delta);
		this.setX(this.getX()+0);
	}
}