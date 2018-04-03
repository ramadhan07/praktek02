package praktek02;

public class penjualansepatuaksi {
    public static void main(String[] args) {
        penjualansepatu r1 = new penjualansepatu();
        
        r1.harga_sepatu = 350000;
        r1.jumlah_barang = 4;
        
        r1.cetakInfo();
        System.out.println("total   =   "+r1.hitungpenjualan());
        r1.cetaktotal();
        
        penjualansepatu r2 = new penjualansepatu();
        r2.cetakInfo();
        
        penjualansepatu r3 = new penjualansepatu(350000,4);
        r3.cetakInfo();
    }
}
