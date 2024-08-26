package v1.baseball;

/**
 * @author : lhd
 * @packageName : PACKAGE_NAME
 * @fileName : java-baseball-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-21         lhd
 */
public class BaseballGameApp {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.start(new Computer(), new Player());
    }
}
