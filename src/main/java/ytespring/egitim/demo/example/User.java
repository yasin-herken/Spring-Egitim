package ytespring.egitim.demo.example;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

    @NotBlank(message = "İsim boş olamaz")
    private String isim;

    @NotBlank(message = "Soyisim boş olamaz")
    private String soyisim;

    @Min(value = 12, message = "Yaş en az 12 olmalıdır")
    @Max(value = 100, message = "Yaş en fazla 100 olmalıdır")
    private int age;

    @NotBlank(message = "Email boş olamaz")
    @Email(message = "Geçersiz email formatı")
    private String email;

    @TcKimlikNo
    private String tcKimlikNo;

    @PastOrPresent
    private LocalDateTime dogumTarihi;

    @Size(max = 250, message = "İkametgah adresi en fazla 250 karakter olmalıdır")
    private String ikametgahAdresi;

    @NotBlank
    private String kullaniciAdi;

    @AssertTrue
    public boolean isNotAdmin() {
        return kullaniciAdi != null && !kullaniciAdi.equalsIgnoreCase("admin");
    }
}
