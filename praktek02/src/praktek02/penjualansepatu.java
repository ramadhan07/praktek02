package praktek02;

public class penjualansepatu {
    int harga_sepatu;
    int jumlah_barang;

    public penjualansepatu() {
        this.harga_sepatu = 350000;
        this.jumlah_barang = 4;
    }
    
    void cetakInfo(){
        System.out.println("============================");
        System.out.println("harga sepatu :"+harga_sepatu);
        System.out.println("harga sepatu :"+jumlah_barang);
        System.out.println("============================");
    }
    
    Integer hitungpenjualan(){
        int total;
        total=harga_sepatu*jumlah_barang;
        return total;
    }
    void cetaktotal(){
        System.out.println("totalnya   =   "+hitungpenjualan());
       
    }
}
