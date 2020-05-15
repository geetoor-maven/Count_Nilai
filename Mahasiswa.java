
package Tugas4;


public class Mahasiswa {
    private String nama;
    private String nim;
    private double nilai_tugas;
    private double nilai_mid;
    private double nilai_final;
    private double nilai_kehadiran;
    private double presentase_tugas;
    private double presentase_mid;
    private double presentase_final;
    private double presentase_kehadiran;
    private double nilai_total;
    private String nilai_huruf;

    public double getNilai_total() {
        return nilai_total;
    }

    public String getNilai_huruf() {
        return nilai_huruf;
    }
    
    public double getPresentase_tugas() {
        return presentase_tugas;
    }

    public double getPresentase_mid() {
        return presentase_mid;
    }

    public double getPresentase_final() {
        return presentase_final;
    }

    public double getPresentase_kehadiran() {
        return presentase_kehadiran;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getNilai_tugas() {
        return nilai_tugas;
    }

    public void setNilai_tugas(double nilai_tugas) {
        this.nilai_tugas = nilai_tugas;
    }

    public double getNilai_mid() {
        return nilai_mid;
    }

    public void setNilai_mid(double nilai_mid) {
        this.nilai_mid = nilai_mid;
    }

    public double getNilai_final() {
        return nilai_final;
    }

    public void setNilai_final(double nilai_final) {
        this.nilai_final = nilai_final;
    }

    public double getNilai_kehadiran() {
        return nilai_kehadiran;
    }

    public void setNilai_kehadiran(double nilai_kehadiran) {
        this.nilai_kehadiran = nilai_kehadiran;
    }
    
     public void HitungPresentase(){
         this.presentase_tugas =   20 * this.nilai_tugas;
         this.presentase_mid = 30 * this.nilai_mid;
         this.presentase_final = 30 * this.nilai_final;
         this.presentase_kehadiran = 20 * (this.nilai_kehadiran/16);
     }
     
     public void HitungNIlaiTotal(){
         this.nilai_total = this.presentase_final + this.presentase_kehadiran + this.presentase_mid + this.presentase_tugas;
         
        if(this.nilai_total >= 85){
            this.nilai_huruf = "A";
        }else if(this.nilai_total >= 70 && this.nilai_total <85){
            this.nilai_huruf = "B";
        }else if(this.nilai_total >= 60 && this.nilai_total <70){
            this.nilai_huruf = "C";
        }else if(this.nilai_total >= 40 && this.nilai_total <60){
            this.nilai_huruf = "D";
        }else{
            this.nilai_huruf = "E";
        }
     }
     
     
}
