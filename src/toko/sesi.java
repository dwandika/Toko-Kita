
package toko;

public class sesi {
    private static String username,nama,email,status;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        sesi.username = username;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        sesi.nama = nama;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        sesi.email = email;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        sesi.status = status;
    }
    
}
