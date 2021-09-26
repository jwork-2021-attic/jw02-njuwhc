package S191180122.Task2;

public class ListElf {
    Elf[] elfs;
    public ListElf(int length) {
        this.elfs = new Elf[length];
    }
    public void put(Elf elf, int i) {
       // if (this.elfs[i] == null) {
            this.elfs[i] =elf;
       // }
    }
}