public class pegawai {
    private String nama;
    private String nip;
    private int jumlahJamKerja;
    private double gajiPokok;
    private double lembur;
    private double uangMakan = 3500;
    private double transport = 4000;

    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }    

    public String getNama(){
        return this.nama;
    }

    public String getNIP(){
        return this.nip;
    }

    public int getJamKerja(){
        return this.jumlahJamKerja;
    }

    public double getGajiPokok(){
        return gajiPokok = 2000 * getJamKerja();
    }

    public double getLembur(){
        return lembur = 1.5 * getGajiPokok();
    }
    
    pegawai (String nama, String nip, int jumlahJamKerja){
        setNama(nama);
        setNIP(nip);
        setJamKerja(jumlahJamKerja);
    }

    public void hitungGajiHarian(){
        double jumlahGaji = 0;
        if(jumlahJamKerja == 7){
            jumlahGaji = getGajiPokok();
            System.out.println("Take home pay        : " + jumlahGaji);
        }else if(jumlahJamKerja == 8){
            jumlahGaji = getGajiPokok() + getLembur() + uangMakan;
            System.out.println("Uang lembur          : " + getLembur());
            System.out.println("Take home pay        : " + jumlahGaji);
        }else if(jumlahJamKerja == 9){
            jumlahGaji = getGajiPokok() + getLembur() + uangMakan + transport;
            System.out.println("Uang lembur          : " + getLembur());
            System.out.println("Take home pay        : " + jumlahGaji);
        }
    }

    public void cetakPenghasilan(){
        System.out.println("Nama karyawan        : " + getNama());
        System.out.println("NIP                  : " + getNIP());
        System.out.println("Gaji pokok           : " + getGajiPokok());
        if(jumlahJamKerja == 7){
            hitungGajiHarian();
        }else if(jumlahJamKerja == 8){
            System.out.println("Uang makan           : " + uangMakan);
            hitungGajiHarian();
        }else if(jumlahJamKerja == 9){
            System.out.println("Uang makan           : " + uangMakan);
            System.out.println("Uang transport       : " + transport);
            hitungGajiHarian();
        }
    }

}
