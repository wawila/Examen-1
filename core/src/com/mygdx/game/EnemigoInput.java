package com.mygdx.game;


import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemigoInput extends InputListener{

	
	
	Enemigo enemigo;
	int score;
	
	public EnemigoInput() {
		
	}
	
	EnemigoInput(Enemigo enemigo){
		super();
		this.enemigo = enemigo;
	}
	

	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button) {
		MyGdxGame s = new MyGdxGame();

		enemigo.remove();
		s.score = s.score + 1;
		System.out.println("Score: " + s.score);
	return super.touchDown(event, x, y, pointer, button);
}
	
}
	