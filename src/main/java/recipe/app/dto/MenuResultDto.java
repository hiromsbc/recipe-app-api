package recipe.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MenuResultDto {
    private String menu_name;

    private String menu_api;

    private String menu_description;
}
