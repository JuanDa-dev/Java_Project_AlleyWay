
package niveles;

import gamecomponents.Brick;
import gamecomponents.GameSpace;
import java.awt.Color;
import java.util.Random;

public class Nivel2 extends Nivel {

    @Override
    public void createBricks() {
        Color color = new Color(98, 187, 55);
        int salto = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                switch (i) {//Depedendiendo de para hacer saltos y establecer el color al ladrillo
                    case 2:
                    case 3:
                        color = new Color(225, 220, 17);
                        salto = 20;
                        break;
                    case 4:
                    case 5:
                        color = new Color(20, 220, 217);
                        salto = 40;
                        break;
                    case 6:
                    case 7:
                        color = new Color(202, 40, 202);
                        salto = 60;
                        break;
                    case 8:
                    case 9:
                        color = new Color(244, 74, 108);
                        salto = 80;
                        break;
                    case 10:
                    case 11:
                        color = new Color(64, 128, 128);
                        salto = 100;
                        break;
                }
                this.añadirLadrillo(new Brick(10 + 62 * j, 20 + 17 * i + salto, color));
                this.añadirLadrillo(new Brick(10 + 62 * j + 434, 20 + 17 * i + salto, color));
            }
        }
    }

    //Basicamente lo mismo que hace el cambio de colores del nivel1 solo que con menos ladrillos
    @Override
    public void cambioColores() {
        if (this.longitudArrayLadrillos() == 96) {
            int n = 16;
            for (int i = 0; i < 6; i++) {
                Random random = new Random();
                int red = random.nextInt(256);
                int green = random.nextInt(256);
                int blue = random.nextInt(256);
                Color color = new Color(red, green, blue);
                for (int j = n - 16; j < n; j++) {
                    this.getBrick(j).setColor(color);
                }
                n += 16;
            }
        }
    }

}
