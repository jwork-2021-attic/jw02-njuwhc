package S191180122.Task3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {
    public static void main(String[] args) throws IOException {
        Line line = new Line(64);
        ListElf list =new ListElf(64);
        for(int i=0;i<64;i++) {
            Elf elf = new Elf();
            line.put(elf, i);
            list.put(elf, i);
        }
        Snake theSnake = Snake.getTheSnake();

        //Sorter sorter = new BubbleSorter();   //返回实现这一接口的对象
        //Sorter sorter = new SelectionSorter();
        Sorter sorter = new QuickSorter();

        theSnake.setSorter(sorter); //使用这种排序方法

        String log = theSnake.lineUp(line,list);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
    }
    
}