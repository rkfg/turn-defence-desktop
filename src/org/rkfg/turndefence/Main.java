package org.rkfg.turndefence;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Turn Defence";
		cfg.useGL20 = false;
		cfg.width = 1024;
		cfg.height = 720;
		cfg.resizable = false;
		cfg.vSyncEnabled = true;
		
		new LwjglApplication(new TurnDefence(), cfg);
	}
}
