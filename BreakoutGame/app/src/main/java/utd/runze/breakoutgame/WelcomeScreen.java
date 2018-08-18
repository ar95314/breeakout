package utd.runze.breakoutgame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.SurfaceHolder;

/**
 * Created by Amit Rathore.
 */
public class WelcomeScreen {

    public void show(SurfaceHolder holder, Canvas canvas, Paint paint){
        if(holder.getSurface().isValid()){
            canvas = holder.lockCanvas();
            canvas.drawColor(Color.argb(0, 0, 0, 0));

            paint.setColor(Color.argb(255, 100, 100, 100));
            paint.setTextSize(canvas.getHeight() / 6);

            String text = "Breakout Game";
            Rect bounds = new Rect();
            paint.getTextBounds(text, 0, text.length(), bounds);

            float height = paint.descent() - paint.ascent();
            float offset = (height / 2) - paint.descent();
            float xPos = (canvas.getWidth() / 2) - (bounds.width() / 2);
            float yPos = (canvas.getHeight() / 2) + offset;
            canvas.drawText(text, xPos, yPos, paint);

            text = "Touch to continue";
            paint.setColor(Color.argb(255, 255, 255, 255));
            paint.setTextSize(canvas.getHeight() / 11);
            paint.getTextBounds(text, 0, text.length(), bounds);

            xPos = (canvas.getWidth() / 2) - (bounds.width() / 2);
            yPos = (canvas.getHeight() * 3 / 4) + offset;
            canvas.drawText(text, xPos, yPos, paint);

            text = "Designed by AMIT RATHORE";
            paint.setColor(Color.argb(255, 255, 255, 255));
            paint.setTextSize(canvas.getHeight() / 18);
            paint.getTextBounds(text, 0, text.length(), bounds);

            xPos = (canvas.getWidth() / 2) - (bounds.width() / 2);
            yPos = (canvas.getHeight() * 1/ 10) + offset;
            canvas.drawText(text, xPos, yPos, paint);

            holder.unlockCanvasAndPost(canvas);
        }
    }
}

