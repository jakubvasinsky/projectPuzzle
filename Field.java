package sample;


import java.util.Collections;

public class Field {
        private Tile[][] arr;

        public Tile[][] getArr() {
            return arr;
        }

        public Field (){
            initGame();
        }

        private void initGame() {
            arr= new Tile[4][4];
            for(int i=0;i<4;i++)
                for(int j=0;j<4;j++)
                    arr[i][j]=new Tile();
        }



    }

