package kom.warside;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Koma on 17.01.2017.
 */
public abstract class BasicBattleState {

    protected GameStateManagement gsm;
    protected LibgdxGame app;

    protected SpriteBatch batch, batch_hud;
    protected OrthographicCamera maincamera;
    protected OrthographicCamera camera_hud;


    protected BasicBattleState(GameStateManagement gsm){
        this.gsm = gsm;
        this.app = gsm.application();


        batch = app.getBatch();
        batch_hud = app.getBatch();

        maincamera = app.getCamera();
        camera_hud = app.getCameraHud();
    }

    public void resize(int w, int h){
        maincamera.setToOrtho(false, w, h);
    }



    public abstract void update(float delta);
    public abstract void render();
    public abstract void dispose();

}
