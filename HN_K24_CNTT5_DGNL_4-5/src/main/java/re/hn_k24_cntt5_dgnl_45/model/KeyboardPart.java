package re.hn_k24_cntt5_dgnl_45.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "keyboard_parts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class KeyboardPart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotBlank
    @Size(min = 5,max = 150)
    private String partName;
    @NotBlank
    private String manufacturer;
    private double price;
    @Future
    private LocalDate releaseDate;
    @Column(length = 1000)
    private String partImage;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private ComponentCategory category;
    private boolean inStock;
}
