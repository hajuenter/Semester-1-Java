package pemograman; //package/folder

public class Pegawai { //kelas Pegawai

    static String nik; //variabel nik untuk penyimpan nomor nik pegawai
    static String nama; //variabel nama untuk menyimpan nama pegawai
    static int gaji; //variabel gaji untuk menimpan gaji pegawai

    public static float uang_makan(int Gaji) { /* metode(fungsi) static bertipe data float dengan nama metod uang_makan 
                                               yang memiliki parameter integer Gaji*/
        
        return Gaji / 100 * 10; //mengembalikan jumlah nilai uang_makan, dengan cara menghitung 10% dari uang gaji pegawai.
    }

    public static float transport(int Gaji) { /* metode(fungsi) static bertipe data float dengan nama metod trasport 
                                               yang memiliki parameter integer Gaji*/
        
        return Gaji / 100 * 8; //mengembalikan jumlah nilai transport, dengan cara menghitung 8% dari uang gaji pegawai.
    }

    public static float total_gaji(int Gaji) { /* metode(fungsi) static bertipe data float dengan nama metod total_gaji
                                               yang memiliki parameter integer Gaji*/
        
        return Gaji + uang_makan(Gaji) + transport(Gaji); /* Metode ini menghitung dan mengembalikan total gaji. 
        Total gaji dihitung dengan menambahkan gaji pokok, uang makan, dan uang transportasi */
    }

  

}
