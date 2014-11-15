package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class startInput extends InputListener{

	start menu;
	
	startInput(start st){
		super();
		this.menu = st;
	}
	

	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button) {

		menu.remove();
	return super.touchDown(event, x, y, pointer, button);
}




}
