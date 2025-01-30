package Chinthakayala.Appgamingjava;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run()
    {
       System.out.println(game);
       game.up();
       game.down();
       game.left();
       game.Right();

    }

}
