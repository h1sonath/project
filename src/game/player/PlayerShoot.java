package game.player;

import base.Attribute;
import base.GameObjectManager;
import input.MouseInput;

public class PlayerShoot implements Attribute<Player> {


    public PlayerShoot() {
    }

    @Override
    public void run(Player gameObject) {
        {
            BulletPlayer bulletPlayer = new BulletPlayer();
            if (MouseInput.instance.clicked) {

                bulletPlayer.position.set(gameObject.position);

                GameObjectManager.instance.add(bulletPlayer);

                bulletPlayer.velocity.set(MouseInput.instance.vector2D.subtract(gameObject.position).normalized().multiply(4.4f));
            }
        }
    }
}
