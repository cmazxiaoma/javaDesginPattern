package 模板模式;

public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        this.initialize();

        this.startPlay();

        this.endPlay();
    }
}
