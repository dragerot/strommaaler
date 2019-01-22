package strommaaler.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Maaling implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @CreatedDate
    @Column(name = "creationDate", insertable = true, updatable = false)
    private LocalDate creationDate;
    private Integer gjelderMaaned;
    private Integer aar;
    private Integer maalingHoved;
    private Integer maalingLeietaker;
    @Column(columnDefinition="Decimal(10,2) default '100.00'")
    private BigDecimal netleieFakturaPris;
    @Column(columnDefinition="Decimal(10,2) default '100.00'")
    private BigDecimal forbrukeFakturaPris;

}
