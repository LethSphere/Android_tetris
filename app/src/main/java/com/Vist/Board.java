package com.Vist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.ipsec.ike.IkeKeyIdIdentification;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.ViewGroupUtils;

import com.proyecto.tetris.MainActivity;

public class Board extends View {
    private final int GRID_ROWS = 20;
    private final int GRID_COLUMN = 10 ;
    private GridLayout gridLayout ;
    private int gridCellSize;
    private Block piece;
    private Color color;
    public Board(Context context){

        super(context);

      gridCellSize= 270/ this.GRID_COLUMN;
            spawnBlock();
        //gridRows = gridLayout.getHeight()/this.GRID_COLUMN;

    }

    public void spawnBlock()
    {
        piece = new Block(new int[][]{{1,0},{1,0},{1,1}},Color.CYAN);
    }

    private void drawPiece(Canvas canvas){
        Paint p = new Paint();
        for (int row = 0; row <piece.getHeight() ;row++) {
            for (int col = 0; col<piece.getWidth(); col++) {
                if(piece.getShape()[row][col] == 1) {
                    int x = (piece.getX() +col)*100;
                    int y = (piece.getY() +row)*100;
                    p.setColor(piece.getColor());
                    p.setStyle(Paint.Style.FILL);
                    canvas.drawRect(x, y, 100, 100, p);

                }

            }
        }
    }
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        //Paint p = new Paint();
        drawPiece(canvas);
        // fill
        for (int y = 0; y<20; y++) {
            for (int x = 0; x <10; x++) {
                Paint p = new Paint();
                p.setColor(Color.BLACK);
                p.setStrokeWidth(3);
                p.setStyle(Paint.Style.STROKE);
                canvas.drawRect(x*100, y*100, 100, 100, p);


                }

            }



    }
}

