package re.hn_k24_cntt5_dgnl_45.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "component_category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ComponentCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotBlank
    @Size(min =5,max = 100)
    private String name;
    @NotNull
    @NotBlank
    private String description;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<KeyboardPart> keyboardParts;
}
