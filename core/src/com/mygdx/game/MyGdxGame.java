package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGdxGame extends ApplicationAdapter {

	Random ran = new Random();
	
	SpriteBatch batch;
	Texture gam;
	Texture men;
	Texture img;
	Texture img2;
	Texture img3;
	boolean conf = true;
	int cont = 1;
	Music musica;
	Music hit;
	
	int x = 0;
	int y = 0;
	int z = 0;
	int frame;
	int score;
	
	Image menu;
	Image game;
	Image image1;
	Image image2;
	Image image3;
	Stage stage1;
	Stage stage2;
	Stage stage3;
	
	@Override
	public void create () {
		score = 0;
		
		batch = new SpriteBatch();
		game = new Image();
		menu = new Image();
		image1 = new Image();
		image2 = new Image();
		image3 = new Image();
		
		stage1 = new Stage();
		stage2 = new Stage();
		stage3 = new Stage();
		Gdx.input.setInputProcessor(stage1);
		
		hit = Gdx.audio.newMusic(Gdx.files.internal("sfx.wav"));
		musica = Gdx.audio.newMusic(Gdx.files.internal("19 Hidden Track.mp3"));
		
		men = new Texture("mn.png");
		gam = new Texture("gameover.png");
		img = new Texture("er.png");
		img2 = new Texture("ea.png");
		img3 = new Texture("ev.png");
		stage3.addActor(game);
		stage2.addActor(menu);
		stage1.addActor(image1);
		stage1.addActor(image2);
		stage1.addActor(image3);
		
		Texture menu = new Texture("mn.png");
		start menu1 = new start(menu);
		stage2.addActor(menu1);
		
		Texture go = new Texture("gameover.png");
		start menu5 = new start(go);
		stage3.addActor(menu5);
		
	}

	private void AgregarRojo() {
		Texture e1 = new Texture("er.png");
		Enemigo ene1 = new Enemigo(e1);
		stage1.addActor(ene1);
		ene1.setY(ran.nextInt(300)+20);

	}
	
	private void AgregarAzul() {
		Texture e2 = new Texture("ea.png");
		Enemigo1 ene2 = new Enemigo1(e2);
		stage1.addActor(ene2);
		ene2.setY(ran.nextInt(300)+10);

	}
	
	private void AgregarVerde() {
		Texture e3 = new Texture("ev.png");
		
		Enemigo2 ene3 = new Enemigo2(e3);
		
		stage1.addActor(ene3);
		
		ene3.setY(ran.nextInt(300)+30);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		musica.play();
		
	
		if(Gdx.input.justTouched()){
			hit.play();
			if(cont == 1){
			stage2.clear();
			conf = false;
			}
			cont++;
						
		}
		
		
		stage1.draw();
		stage1.act();
		
		if(frame%25 == 0)
			AgregarRojo();	
		
		if(frame%50 == 0)
			AgregarAzul();
		
		if(frame%100 == 0)
			AgregarVerde();
		
				frame++;
		
		if(conf = true){
			stage2.draw();
			stage2.act();
			}
	
		
		
	
	if(cont %20 == 0){
		stage1.clear();

		stage3.draw();
		stage3.act();	
		}
	
	
	if(cont %21 == 0){
		conf = true;
		cont = 1;
		stage3.clear();
		stage2.draw();
		stage2.act();
		Texture go = new Texture("mn.png");
		start menu = new start(go);
		stage3.addActor(menu);	
	}
	
	
	
	}
}
