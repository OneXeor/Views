package io.singulart.particlesviewsample;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

public class DotItem {

    private float size;

    private PointF position;

    private int color;

    private Paint paint;

    private float speed;

    private float vx = 1;
    private float vy = 1;

    DotItem(float size, PointF position, int color) {
        this.size = size;
        this.position = position;
        this.color = color;
        init();
    }

    DotItem(float size, PointF position, int color, float speed) {
        this.speed = speed;
        this.size = size;
        this.position = position;
        this.color = color;
        init();
    }

    private void init() {
        initPaint();
        initPoint();
    }

    private void initPaint() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(color);
        paint.setAntiAlias(true);
    }

    private void initPoint() {
        if (position == null)
            position = new PointF();
    }

    public float getSpeed() {
        return speed;
    }

    public void setPosition(double x, double y) {
        this.position.set((float) x, (float) y);
    }

    public PointF getPosition() {
        return position;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    void render(Canvas canvas) {
        if (canvas != null)
            canvas.drawCircle(position.x, position.y, size, paint);
    }

    public void setColor(int color) {
        this.color = color;
    }
}
