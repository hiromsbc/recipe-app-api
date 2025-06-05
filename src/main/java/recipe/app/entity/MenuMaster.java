package recipe.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class MenuMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menu_id;

    private String menu_code;

    private String menu_name;

    private String menu_api;

    private String menu_description;

    private Integer delete_flg;

    private LocalDateTime registration_date_time;

    private LocalDateTime update_date_time;
}
