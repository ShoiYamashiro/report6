package jp.ac.uryukyu.ie.e205752;

public class Game {
    public static void main(String[] args){
        Field field = new Field(8,8);
        field.prepare();
        field.putKoma(2,4,"R");
        field.putKoma(3,2,"W");
        field.putKoma(3,3,"R");
        field.putKoma(3,4,"B");
        field.putKoma(4,3,"W");
        field.putKoma(4,4,"Y");
        field.putKoma(4,5,"B");
        field.putKoma(5,3,"Y");
        field.feature();
    }
}