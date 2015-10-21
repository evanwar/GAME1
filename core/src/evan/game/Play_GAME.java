package evan.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Evan on 19/10/2015.
 */
public class Play_GAME extends BASE_GAME {
    private static final Color BACKGROUND_COLOR = new Color(0.39f, 0.58f, 0.92f, 1.0f);
    private static final float WORLD_TO_SCREEN = 1.0f / 100.0f;
    private static final float SCENE_WIDTH = 12.80f;
    private static final float SCENE_HEIGHT = 7.20f;

    private OrthographicCamera camera;
    private Viewport viewport;
    private SpriteBatch batch;
    private Texture cavemanTexture;

    @Override
    public void create() {
        camera = new OrthographicCamera();
        viewport = new FitViewport(SCENE_WIDTH, SCENE_HEIGHT, camera);
        batch = new SpriteBatch();
        cavemanTexture = new Texture(Gdx.files.internal("caveman.png"));
        cavemanTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void render() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
        batch.dispose();
        cavemanTexture.dispose();
    }
}
