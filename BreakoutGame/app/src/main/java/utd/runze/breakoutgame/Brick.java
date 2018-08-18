package utd.runze.breakoutgame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Amit Rathore
 */
public class Brick extends VisibleGameObject {
    private boolean isVisible;

    public Brick(){
        isVisible = true;

    }

    public void setInvisible(){
        isVisible = false;
    }

    public boolean getVisibility(){
        return isVisible;
    }

    public void draw(Canvas canvas, Paint paint){
        paint.setColor(Color.argb(255, 120, 120, 120));
        if(this.isVisible) {
            super.draw(canvas, paint);
        }
    }

    @Override
    public void reset(){
        isVisible = true;
    }
}
