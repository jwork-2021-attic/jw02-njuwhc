package S191180122.Task2;


public class Snake {
    private static Snake theSnake;

    public static Snake getTheSnake() {
        if (theSnake == null) {
            theSnake = new Snake();
        }
        return theSnake;
    }

    private Snake() {
    }

    private Sorter sorter;
    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line,ListElf list) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step,list);
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private  void execute(String step,ListElf list) {
        String[] couple = step.split("<->");  //取出交换双方
        Elf.getElfByRank(Integer.parseInt(couple[0]), list)
                .swapPosition(Elf.getElfByRank(Integer.parseInt(couple[1]), list));
    }
    
}