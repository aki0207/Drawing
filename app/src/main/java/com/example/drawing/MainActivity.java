package com.example.drawing;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView myView = new MyView(this);
        setContentView(myView);
    }

    // Viewを継承したクラス
    class MyView extends View {
        /* private Paint paint;
         private Paint TestPaint;*/
        //配列を使えるのか確認
        private Paint[] ArrayPaint;


        // 描画するラインの太さ
        private float StrokeWidth = 3.0f;

        public MyView(Context context) {
            super(context);
          /*  paint = new Paint();
            TestPaint = new Paint();*/
            ArrayPaint = new Paint[36];

            for (int i = 0; i < 36; i++) {
                ArrayPaint[i] = new Paint();
            }

            /*ArrayPaint[0] = new Paint();
            ArrayPaint[1] = new Paint();*/
        }

        @Override
        protected void onDraw(Canvas canvas) {
           /* // ペイントする色の設定
            //paint.setColor(Color.argb(255, 255, 0, 255));
            paint.setColor(Color.RED);
            // ペイントストロークの太さを設定
            paint.setStrokeWidth(StrokeWidth);
            // Styleのストロークを設定する
            //paint.setStyle(Paint.Style.STROKE);//線だけ
            paint.setStyle(Paint.Style.STROKE);//塗りつぶし

            //2つめをつくってみる
            TestPaint.setColor(Color.BLUE);
            TestPaint.setStrokeWidth(3.0f);
            TestPaint.setStyle(Paint.Style.STROKE);
*/
            //配列描画実験
           /* ArrayPaint[0].setColor(Color.BLACK);
            ArrayPaint[0].setStrokeWidth(1.0f);
            ArrayPaint[0].setStyle(Paint.Style.STROKE);

            ArrayPaint[1].setColor(Color.GREEN);
            ArrayPaint[1].setStrokeWidth(9.0f);
            ArrayPaint[1].setStyle(Paint.Style.STROKE);*/

            // drawRectを使って矩形を描画する、引数に座標を設定
            //drawRect(横縦横縦)
           /* canvas.drawRect(201, 450, 251, 500, paint);
            canvas.drawRect(150, 450, 200, 500, TestPaint);*/


            //drawRectの座標指定に使用する
            int x = 252;
            int y = 250;
            int width = 302;
            int height = 300;

            for (int i = 0; i < 24; i++) {
                for (int k = 0; k < 12; k++) {


                    ArrayPaint[k].setColor(Color.BLACK);
                    ArrayPaint[k].setStrokeWidth(1.0f);


                    ArrayPaint[k].setStyle(Paint.Style.STROKE);
                    canvas.drawRect(x, y, width, height, ArrayPaint[k]);
                    x = width + 1;
                    width = x + 50;

                }

                x = 252;
                y = height + 1;
                width = 302;
                height = y + 50;


            }


        }
    }
}