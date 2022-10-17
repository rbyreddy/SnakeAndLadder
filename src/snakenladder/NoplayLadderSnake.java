package snakenladder;

public class NoplayLadderSnake {
    public static void main(String[] args) {
        double Random = Math.floor(Math.random() * 10) % 3;
        System.out.println("Check Options:" + Random);

        int Dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
        int NoPlay = 0;
        int ladder = 1;
        int sanke = -1;
        int Stay = 0;
        int Position = 0;
        int MovesAhead = 1;
        int MovesBehind = -1;

        double TotalMovesAhead = 0;
        double TotalMovesBehind = 0;
        double Check = Math.floor(Math.random() * 10) % 3;
        if (Check == NoPlay) {
            Stay = 0;

        }

        //System.out.println("Stays:"  +Stay);

        else if (Check == ladder) {
            Position = Position + Dice;
        }
        TotalMovesAhead = MovesAhead + Random;

        System.out.println("Ladder MovesAhead:" + TotalMovesAhead);
    }
}
