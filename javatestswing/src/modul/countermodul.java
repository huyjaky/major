package modul;

public class countermodul {
    private  Double tong_bill_monphu = 0d;
    private  Double tong_bill_monchinh = 12d;
    private  Double tong_bill = 0d;


    public void them_bill(Double gia) {
        this.tong_bill_monphu += gia;
    }

    public void bot_bill (Double gia) {
        this.tong_bill_monphu -= gia;
        if (this.tong_bill_monphu < 0) {
            this.tong_bill_monphu = 0d;
        }
    }

    public void them_bill_monchinh(Double gia) {
        this.tong_bill_monchinh = gia;
    }

    public void bot_bill_monchinh () {
        this.tong_bill_monchinh = 0d;
    }

    public Double getTong_bill() {
        this.tong_bill = this.tong_bill_monchinh + this.tong_bill_monphu;
        return  this.tong_bill;
    }
}
