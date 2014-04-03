
package com.kylejanssen.drop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Drop";
        config.width = 800;
        config.height = 480;
        config.addIcon("icon.png", Files.FileType.Internal);
		new LwjglApplication(new Drop(), config);
	}
}
