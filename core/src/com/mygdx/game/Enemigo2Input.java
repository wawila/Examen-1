package com.mygdx.game;


import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Enemigo2Input extends InputListener{


	Enemigo2 enemigo;

	public Enemigo2Input() {
		}
	
	int score;
	
	Enemigo2Input(Enemigo2 enemigo){
		super();
		this.enemigo = enemigo;
	}
	

	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button){ 
		
	MyGdxGame s = new MyGdxGame();

		enemigo.remove();
		s.score = s.score + 10;
		System.out.println("Score: " + s.score);
	return super.touchDown(event, x, y, pointer, button);
}
	
}
	