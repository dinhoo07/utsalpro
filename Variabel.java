public class Variabel {
    public static void main(String[] args) {
        String namaLengkap = "Rodini Putri Zamroni";
        String tempatLahir = "Jombang";
        String tanggalLahir = "12 Juli 2006";
        char jenisKelamin = 'P'; // L / P
        String alamat = "Wundumbatu, Poasia, Kendari, Sulawesi Tenggara";
        String noHp = "085784773968"; // String agar angka 0 di depan tidak hilang
        long penghasilan = 2500000L;

        System.out.println("Assalamu'alaikum");
        System.out.println("Izinkan saya memperkenalkan diri");
        System.out.println("Nama Lengkap\t\t: " + namaLengkap);
        System.out.println("Tempat & Tanggal Lahir\t: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Jenis Kelamin\t\t: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Alamat Lengkap\t\t: " + alamat);
        System.out.println("No Hp\t\t\t: " + noHp);
        System.out.println("Penghasilan Sebulan\t: Rp " + penghasilan);
    }
}
