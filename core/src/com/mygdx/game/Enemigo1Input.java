package com.mygdx.game;


import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Enemigo1Input extends InputListener{

	
	Enemigo1 enemigo;
	
	Enemigo1Input(Enemigo1 enemigo){
		super();
		this.enemigo = enemigo;
	}
	

	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button) {
		MyGdxGame s = new MyGdxGame();
		s.score = s.score + 5;
		System.out.println("Score: " + s.score);
		enemigo.remove();
	return super.touchDown(event, x, y, pointer, button);
}
	
}
	