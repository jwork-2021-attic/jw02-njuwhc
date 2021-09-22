package S191180122.Task3;
import S191180122.Task3.Line.Position;

import java.util.Random;

public class Elf implements Linable{
    
    private final int r;
    private final int g;
    private final int b;

    Random random = new Random();

    private Position position;

    Elf() {
        this.r = random.nextInt(256);
        this.g = random.nextInt(256);
        this.b = random.nextInt(256);
    }

    public static Elf getElfByRank(int rank,ListElf list) {

        for (int i = 0;i<list.elfs.length;i++){
            if(list.elfs[i].rank() == rank){
                return list.elfs[i];
            }
        }
        return null;
    }


    public int rank() {
        //return this.r*1000000+this.g*1000+this.b;
        return  (this.r * 299 + this.g * 587 + this.b * 114);
    }
    public int rankrgb() {
        //return this.r*1000000+this.g*1000+this.b;
        return  (int) (this.r * 0.299 + this.g * 0.587 + this.b * 0.114);
    }
    


    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.rankrgb() + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }


    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Elf another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }

    
    
}