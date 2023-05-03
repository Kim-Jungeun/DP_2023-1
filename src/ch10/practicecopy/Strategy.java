package ch10.practicecopy;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
