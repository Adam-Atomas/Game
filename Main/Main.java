public class Main {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;
    public int getScore(){
        int points=0
        if (levelOne.GoalReached()){
            points += levelOne.getPoints();
            if (levelTwo.goalReached()){
                points+=levelTwo.getpoints();
                if (isBonus()) points *=3
                        return points
            }
        }
    }
    public static void main(String[] args){
        Game one = new Game;
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reachGoal();
        one.getLevel(3).setPoints(500);
        one.makeBonus();
        System.out.print(one.getScore());
        Game two = new Game();
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).setPoints(500);
    }
    public void play() {
    System.out.println("Enter the number ojrctd")
    }
    }
}