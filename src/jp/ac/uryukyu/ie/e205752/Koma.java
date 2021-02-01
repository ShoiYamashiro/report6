package jp.ac.uryukyu.ie.e205752;
/**
 * オセロ一つ一つの情報をKomaクラスとして設定
 * コマの状態を空のときはE,白の時はW,黒の時はB,赤の時はR,黄色の時はYとする。
 * コマの状態はString型のstate変数で管理
 * コマの状態を変更するsetStateメソット。
 * コマの位置を取得するgetPositionメソット
 */
public class Koma {
    private String state;

    private int x;
    private int y;

    public Koma(int x,int y){
        this.state = "E";
        this.x = x;
        this.y = y;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    public int[] getPosition(){
        int[]pos = {this.x, this.y};
        return pos;
    }
}