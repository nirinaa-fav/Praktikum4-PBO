/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author VICTUS
 */
public class MainAset {
    public static void main(String[] args) {
        ManajemenAset manajemen = new ManajemenAset();

        manajemen.tambahAset(new AsetIT("AST01", "Server", "Ruang Server", "Baik"));
        manajemen.tambahAset(new AsetIT("AST02", "Router", "Ruang Network", "Rusak"));
        manajemen.tambahAset(new AsetIT("AST03", "Switch", "Lantai 2", "Baik"));
        manajemen.tambahAset(new AsetIT("AST04", "PC Workstation", "Lab Komputer", "Baik"));

        System.out.println("--- Data Aset IT (Awal) ---");
        manajemen.tampilkanSemuaAset();

        manajemen.hapusAset("AST02");

        System.out.println("\n--- Data Aset IT (Setelah Penghapusan) ---");
        manajemen.tampilkanSemuaAset();
    }
}

