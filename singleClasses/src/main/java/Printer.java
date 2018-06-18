public class Printer {
    private int tray_vol;
    private int pages;
    private int copies;
    private int toner;
    private int paper;

    public Printer(int tray_vol){
        this.tray_vol = tray_vol;
        this.toner = 1200;
    }

    public int sheets(){
        return this.tray_vol;
    }

    public void print(int pages, int copies){
        this.pages = pages;
        this.copies = copies;
        if (this.pages * this.copies <= this.tray_vol ){
            this.tray_vol = this.tray_vol - (this.pages * this.copies);
            this.toner = this.toner - (this.pages * this.copies);
        }
    }

    public void refil(int paper) {
        this.paper = paper;
        this.tray_vol = this.tray_vol + this.paper;
    }

    public int getToner() {
        return toner;
    }
}
