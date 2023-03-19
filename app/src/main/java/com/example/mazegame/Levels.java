package com.example.mazegame;

import static com.example.mazegame.LevelsActivity.level;
import static com.example.mazegame.Menu.restartEndlessMode;

import static java.lang.Thread.sleep;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Levels extends View {

    private enum Direction{
        UP, DOWN, LEFT, RIGHT
    }

    public static Canvas mazeCanvas;
    private static int thisLevel;
    private static Cell[][] cells;
    private static Cell player, exit;
    private static int COLS = 1 , ROWS = 2;
    private static final float WALL_THICKNESS = 4;
    private static float cellSize, hMargin, vMargin, margin;
    private static Paint wallPaint, playerPaint, exitPaint, hintPaint;
    private Random random;


    public Levels(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        wallPaint = new Paint();
        wallPaint.setColor(Color.BLACK);
        wallPaint.setStrokeWidth(WALL_THICKNESS);

        playerPaint = new Paint();
        playerPaint.setColor(Color.RED);

        exitPaint = new Paint();
        exitPaint.setColor(Color.BLUE);

        hintPaint = new Paint();
        hintPaint.setColor(Color.YELLOW);

        random = new Random();

        createMaze();
    }

    private Cell getNeighbour(Cell cell){
        ArrayList<Cell> neighbours = new ArrayList<>();

        //left neighbour
        if(cell.col > 0){
            if(!cells[cell.col - 1][cell.row].visited){
                neighbours.add(cells[cell.col - 1][cell.row]);
            }
        }

        //right neighbour
        if(cell.col < COLS - 1){
            if(!cells[cell.col + 1][cell.row].visited){
                neighbours.add(cells[cell.col + 1][cell.row]);
            }
        }

        //top neighbour
        if(cell.row > 0){
            if(!cells[cell.col][cell.row - 1].visited){
                neighbours.add(cells[cell.col][cell.row - 1]);
            }
        }

        //bottom neighbour
        if(cell.row < ROWS - 1){
            if(!cells[cell.col][cell.row + 1].visited){
                neighbours.add(cells[cell.col][cell.row + 1]);
            }
        }

        if(neighbours.size() > 0){
            int index = random.nextInt(neighbours.size());
            return neighbours.get(index);
        }
        return null;
    }

    private static void removeWall(Cell current, Cell next){
        if(current.col == next.col && current.row == next.row + 1){
            current.topWall = false;
            next.bottomWall = false;
        }

        if(current.col == next.col && current.row == next.row - 1){
            current.bottomWall = false;
            next.topWall = false;
        }

        if(current.col == next.col + 1 && current.row == next.row){
            current.leftWall = false;
            next.rightWall = false;
        }

        if(current.col == next.col - 1 && current.row == next.row){
            current.rightWall = false;
            next.leftWall = false;
        }
    }

    static void createMaze(){
        ArrayList<Pair<Cell, Cell>> path = new ArrayList<>();
        thisLevel = level;

        switch(thisLevel)
        {
            case 1 :
                ROWS = 3; COLS = 3;
                cells = new Cell[COLS][ROWS];
                for(int x = 0; x < COLS; x++){
                    for(int y = 0; y < ROWS; y++){
                        cells[x][y] = new Cell(x, y);
                    }
                }

                Collections.addAll(
                        path,
                        new Pair<>(cells[0][0], cells[1][0]),
                        new Pair<>(cells[1][0], cells[2][0]),
                        new Pair<>(cells[1][0], cells[2][0]),
                        new Pair<>(cells[2][0], cells[2][1]),
                        new Pair<>(cells[2][1], cells[1][1]),
                        new Pair<>(cells[1][1], cells[0][1]),
                        new Pair<>(cells[0][1], cells[0][2]),
                        new Pair<>(cells[0][2], cells[1][2]),
                        new Pair<>(cells[1][2], cells[2][2])
                );
                break;

            case 2 :
                ROWS = 6; COLS = 4;
                cells = new Cell[COLS][ROWS];
                for(int x = 0; x < COLS; x++){
                    for(int y = 0; y < ROWS; y++){
                        cells[x][y] = new Cell(x, y);
                    }
                }

                Collections.addAll(
                        path,
                        new Pair<>(cells[0][0], cells[1][0]),
                        new Pair<>(cells[1][0], cells[2][0]),
                        new Pair<>(cells[2][0], cells[3][0]),
                        new Pair<>(cells[0][0], cells[0][1]),
                        new Pair<>(cells[0][1], cells[0][2]),
                        new Pair<>(cells[0][2], cells[0][3]),
                        new Pair<>(cells[0][3], cells[0][4]),
                        new Pair<>(cells[1][1], cells[2][1]),
                        new Pair<>(cells[2][1], cells[3][1]),
                        new Pair<>(cells[3][0], cells[3][1]),
                        new Pair<>(cells[0][3], cells[1][3]),
                        new Pair<>(cells[1][1], cells[1][2]),
                        new Pair<>(cells[3][1], cells[3][2]),
                        new Pair<>(cells[2][2], cells[3][2]),
                        new Pair<>(cells[1][2], cells[1][3]),
                        new Pair<>(cells[1][4], cells[2][4]),
                        new Pair<>(cells[2][2], cells[2][3]),
                        new Pair<>(cells[2][3], cells[3][3]),
                        new Pair<>(cells[3][3], cells[3][4]),
                        new Pair<>(cells[2][4], cells[3][4]),
                        new Pair<>(cells[0][4], cells[0][5]),
                        new Pair<>(cells[0][5], cells[1][5]),
                        new Pair<>(cells[1][4], cells[1][5]),
                        new Pair<>(cells[2][4], cells[2][5]),
                        new Pair<>(cells[2][5], cells[3][5])
                );
                break;

            case 3 :
                ROWS = 3; COLS = 3;
                break;

            case 4 :
                ROWS = 3; COLS = 3;
                break;

            case 5 :
                ROWS = 3; COLS = 3;
                break;

            case 6 :
                ROWS = 3; COLS = 3;
                break;

            case 7 :
                ROWS = 3; COLS = 3;
                break;

            case 8 :
                ROWS = 3; COLS = 3;
                break;

            case 9 :
                ROWS = 3; COLS = 3;
                break;

            case 10 :
                ROWS = 3; COLS = 3;
                break;

            case 11 :
                ROWS = 3; COLS = 3;
                break;

            case 12 :
                ROWS = 3; COLS = 3;
                break;

            case 13 :
                ROWS = 3; COLS = 3;
                break;

            case 14 :
                ROWS = 3; COLS = 3;
                break;

            case 15 :
                ROWS = 3; COLS = 3;
                break;

            case 16 :
                ROWS = 3; COLS = 3;
                break;

            case 17 :
                ROWS = 3; COLS = 3;
                break;

            case 18 :
                ROWS = 3; COLS = 3;
                break;

            case 19 :
                ROWS = 3; COLS = 3;
                break;

            case 20 :
                ROWS = 3; COLS = 3;
                break;

            case 21 :
                ROWS = 3; COLS = 3;
                break;

            case 22 :
                ROWS = 3; COLS = 3;
                break;

            case 23 :
                ROWS = 3; COLS = 3;
                break;

            case 24 :
                ROWS = 3; COLS = 3;
                break;

            case 25 :
                ROWS = 3; COLS = 3;
                break;

            case 26 :
                ROWS = 3; COLS = 3;
                break;

            case 27 :
                ROWS = 3; COLS = 3;
                break;

            case 28 :
                ROWS = 3; COLS = 3;
                break;

            case 29 :
                ROWS = 3; COLS = 3;
                break;

            case 30 :
                ROWS = 3; COLS = 3;
                break;
        }

        player = cells[0][0];
        exit = cells[COLS - 1][ROWS - 1];

        for(int i = 0; i < path.size(); i++){
            removeWall(path.get(i).first, path.get(i).second);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mazeCanvas = canvas;
        int width = getWidth();
        int height = getHeight();

        if(height != 0 && width/height < COLS/ROWS)
            cellSize = width/(COLS + 1);
        else
            cellSize = height/(ROWS + 1);

        hMargin = (width - COLS * cellSize) / 2;
        vMargin = (height - ROWS * cellSize) / 2;

        canvas.translate(hMargin, vMargin);

        for(int x = 0; x < COLS; x++){
            for(int y = 0; y < ROWS; y++){
                if(cells[x][y].topWall) {
                    canvas.drawLine(
                            x * cellSize,
                            y * cellSize,
                            (x + 1) * cellSize,
                            y * cellSize,
                            wallPaint
                    );
                }
                if(cells[x][y].leftWall) {
                    canvas.drawLine(
                            x * cellSize,
                            y * cellSize,
                            x * cellSize,
                            (y + 1) * cellSize,
                            wallPaint
                    );
                }
                if(cells[x][y].bottomWall) {
                    canvas.drawLine(
                            x * cellSize,
                            (y + 1) * cellSize,
                            (x + 1) * cellSize,
                            (y + 1) * cellSize,
                            wallPaint
                    );
                }
                if(cells[x][y].rightWall) {
                    canvas.drawLine(
                            (x + 1) * cellSize,
                            y * cellSize,
                            (x + 1) * cellSize,
                            (y + 1) * cellSize,
                            wallPaint
                    );
                }
            }
        }

        margin = cellSize / 10;

        canvas.drawRect(
                player.col * cellSize + margin,
                player.row * cellSize + margin,
                (player.col + 1) * cellSize - margin,
                (player.row + 1) * cellSize - margin,
                playerPaint
        );

        canvas.drawRect(
                exit.col * cellSize + margin,
                exit.row * cellSize + margin,
                (exit.col + 1) * cellSize - margin,
                (exit.row + 1) * cellSize - margin,
                exitPaint
        );
    }

    private void movePlayer(Direction direction){
        switch (direction){
            case UP:
                if(!player.topWall){
                    player = cells[player.col][player.row - 1];
                }
                break;
            case DOWN:
                if(!player.bottomWall){
                    player = cells[player.col][player.row + 1];
                }
                break;
            case LEFT:
                if(!player.leftWall){
                    player = cells[player.col - 1][player.row];
                }
                break;
            case RIGHT:
                if(!player.rightWall){
                    player = cells[player.col + 1][player.row];
                }
        }
        checkExit();
        invalidate();
    }

    private void checkExit(){
        if(player == exit){
            level++;
            createMaze();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            return true;
        }

        if(event.getAction() == MotionEvent.ACTION_MOVE){
            float x = event.getX();
            float y = event.getY();

            float playerCenterX = hMargin + (player.col + 0.5f) * cellSize;
            float playerCenterY = vMargin + (player.row + 0.5f) * cellSize;

            float dx = x - playerCenterX;
            float dy = y - playerCenterY;

            float absDx = Math.abs(dx);
            float absDy = Math.abs(dy);

            if(absDx > cellSize/2 || absDy > cellSize/2){
                if(absDx > absDy){
                    //move in x direction
                    if(dx > 0){
                        movePlayer(Direction.RIGHT);
                    }
                    else{
                        movePlayer(Direction.LEFT);
                    }
                }
                else{
                    //move in y direction
                    if(dy > 0) {
                        movePlayer(Direction.DOWN);
                    }
                    else{
                        movePlayer(Direction.UP);
                    }
                }
            }

            return true;
        }

        return super.onTouchEvent(event);
    }

    private static class Cell{
        boolean
                topWall = true,
                rightWall = true,
                bottomWall = true,
                leftWall = true,
                visited = false;

        int col, row;

        public Cell(int col, int row) {
            this.col = col;
            this.row = row;
        }
    }

    public void showEndlessModeHint(){
        for(int i = 0; i < COLS; i++){
            for(int j = 0; j < ROWS; j++){
                cells[i][j].visited = false;
            }
        }
        player.visited = true;

        Map<Cell, Cell> parent = new HashMap<>();

        ArrayList<Cell> hintNeighbours;
        Queue<Cell> q = new LinkedList<>();
        q.add(player);

        while(!q.isEmpty()){
            Cell current = q.poll();
            hintNeighbours = getAllNeighbours(current);
            if(hintNeighbours == null)continue;
            for(int i = 0; i < hintNeighbours.size(); i++){
                parent.put(hintNeighbours.get(i), current);
                if(hintNeighbours.get(i) == exit){
                    Stack<Cell> road = new Stack<>();
                    Cell curr = exit;

                    while(curr != player){
                        road.push(curr);
                        curr = parent.get(curr);
                    }

                    int hintCount = ROWS/2;
                    int k = Math.min(road.size(), hintCount);
                    while(k > 0){
                        k--;
                        curr = road.pop();
                    }
                    player = curr;
                    checkExit();
                    invalidate();

                    return;
                }
                else{
                    hintNeighbours.get(i).visited = true;
                    q.add(hintNeighbours.get(i));
                }
            }
        }
    }

    private static ArrayList<com.example.mazegame.Levels.Cell> getAllNeighbours(Cell cell){
        ArrayList<Cell> neighbours = new ArrayList<>();

        //left neighbour
        if(cell.col > 0){
            if(!cells[cell.col - 1][cell.row].visited && !cells[cell.col][cell.row].leftWall){
                neighbours.add(cells[cell.col - 1][cell.row]);
            }
        }

        //right neighbour
        if(cell.col < COLS - 1){
            if(!cells[cell.col + 1][cell.row].visited && !cells[cell.col][cell.row].rightWall){
                neighbours.add(cells[cell.col + 1][cell.row]);
            }
        }

        //top neighbour
        if(cell.row > 0){
            if(!cells[cell.col][cell.row - 1].visited && !cells[cell.col][cell.row].topWall){
                neighbours.add(cells[cell.col][cell.row - 1]);
            }
        }

        //bottom neighbour
        if(cell.row < ROWS - 1){
            if(!cells[cell.col][cell.row + 1].visited && !cells[cell.col][cell.row].bottomWall){
                neighbours.add(cells[cell.col][cell.row + 1]);
            }
        }

        if(neighbours.size() > 0){
            return neighbours;
        }
        return null;
    }
}
