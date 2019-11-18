public class Printer {
    private int paper;


    public Printer(int paper) {
        this.paper = paper;
    }

    public int print(int pages, int copies){
        return pages*copies;
    }

    public boolean canPrint() {
//        if (this.paper >= (pages*copies));
//        return (this.paper -= (pages*copies));
        return this.paper >=0;
    }

}

