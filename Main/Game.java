public class Main {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;
}
public Game() {
    levelOne = new Level();
    levelTwo = new Level();
    levelThree = new Level();
}
public class level {
    private boolean goalReached;
    private int points;
}
public boolean goalReached(){
    return goalReached;
}
public void setPoints(int p) {
    points = p;
}
public class Main {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;
}
public boolean isBonus() {
    return bonus;
}
public void makeBonus(){
bonus = true;
}
public Level getLevel(int i){
    if (i==1) return levelOne;
    if (i==2) return levelTwo;
    if (i==3) return levelThree;
    return null;
}
