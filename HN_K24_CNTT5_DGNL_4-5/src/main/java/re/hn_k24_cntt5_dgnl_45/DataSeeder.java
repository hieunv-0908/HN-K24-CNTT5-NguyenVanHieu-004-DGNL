package re.hn_k24_cntt5_dgnl_45;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import re.hn_k24_cntt5_dgnl_45.model.ComponentCategory;
import re.hn_k24_cntt5_dgnl_45.model.KeyboardPart;
import re.hn_k24_cntt5_dgnl_45.repositoty.ComponentCategoryRepository;
import re.hn_k24_cntt5_dgnl_45.repositoty.KeyboardPartRepository;

import java.time.LocalDate;

@Component
public class DataSeeder implements CommandLineRunner {
        @Autowired
        private ComponentCategoryRepository componentCategoryRepository;

        @Autowired
        private KeyboardPartRepository keyboardPartRepository;

        @Override
        public void run(String @NonNull ... args) throws Exception {

            if(componentCategoryRepository.count() == 0) {
                ComponentCategory category1 = ComponentCategory.builder()
                        .name("Switches")
                        .description("Switches")
                        .build();
                ComponentCategory category2 = ComponentCategory.builder()
                        .name("Switches")
                        .description("Switches")
                        .build();
                ComponentCategory category3 = ComponentCategory.builder()
                        .name("Switches")
                        .description("Switches")
                        .build();

                componentCategoryRepository.save(category1);
                componentCategoryRepository.save(category2);
                componentCategoryRepository.save(category3);
            }


            if(keyboardPartRepository.count() == 0) {
                KeyboardPart part1 = KeyboardPart.builder()
                        .partName("Cherry MX Red")
                        .manufacturer("Cherry")
                        .releaseDate(LocalDate.now())
                        .price(0.5)
                        .partImage("switches")
                        .inStock(true)
                        .category(null)
                        .build();
                KeyboardPart part2 = KeyboardPart.builder()
                        .partName("Cherry MX Red")
                        .manufacturer("Cherry")
                        .releaseDate(LocalDate.now())
                        .price(0.5)
                        .partImage("switches")
                        .inStock(true)
                        .category(null)
                        .build();
                KeyboardPart part3 = KeyboardPart.builder()
                        .partName("Cherry MX Red")
                        .manufacturer("Cherry")
                        .releaseDate(LocalDate.now())
                        .price(0.5)
                        .partImage("switches")
                        .inStock(true)
                        .category(null)
                        .build();
                KeyboardPart part4 = KeyboardPart.builder()
                        .partName("Cherry MX Red")
                        .manufacturer("Cherry")
                        .releaseDate(LocalDate.now())
                        .price(0.5)
                        .partImage("switches")
                        .inStock(true)
                        .category(null)
                        .build();

                keyboardPartRepository.save(part1);
                keyboardPartRepository.save(part2);
                keyboardPartRepository.save(part3);
                keyboardPartRepository.save(part4);
            }
        }
}
