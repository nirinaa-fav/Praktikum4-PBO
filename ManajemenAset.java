/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author VICTUS
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManajemenAset {
    private List<AsetIT> daftarAset = new ArrayList<>();
    
    public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
    }
    
    public void tampilkanSemuaAset() {
        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }
    
    public void hapusAset(String idAset) {
        Iterator<AsetIT> it = daftarAset.iterator();
        boolean ditemukan = false;
        
        while (it.hasNext()) {
            AsetIT asetSekarang = it.next();
            if(asetSekarang.getIdAset().equals(idAset)) {
                it.remove();
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Peringatan: ID Aset" + idAset + "tidak ditemukan!");
        }
    }
}
