package jp.ac.uryukyu.ie.e205752;

public class Game {
    public static void main(String[] args){
        Field field = new Field(8,8);
        field.prepare();
        field.putKoma(4,4,"B");
        field.putKoma(5,5,"R");
        field.putKoma(4, 5, "W");
        field.putKoma(5, 4, "Y");
        field.feature();
    }
}