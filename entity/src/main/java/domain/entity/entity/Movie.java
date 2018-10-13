package domain.entity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private Integer id;
    private String movieCode;
    private Integer categoryId;
    private String title;
    private String director;
    private Date dateReleased;
}
