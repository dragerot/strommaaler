package strommaaler.model;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
public class Maaling implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @CreatedDate

    @Column(name = "creationDate", insertable = true, updatable = false)
    private LocalDate creationDate;
    //@NotEmpty
    private Integer gjelderMaaned;
    //@NotEmpty
    private Integer aar;
    //@NotEmpty
    private Integer maalingHoved;
    //@NotEmpty
    private Integer maalingLeietaker;
    @Column(columnDefinition="Decimal(10,2) default '100.00'")
    private BigDecimal netleieFakturaPris;
    @Column(columnDefinition="Decimal(10,2) default '100.00'")
    private BigDecimal forbrukeFakturaPris;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

//    public void setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;
//    }

    public int getGjelderMaaned() {
        return gjelderMaaned;
    }

    public void setGjelderMaaned(Integer gjelderMaaned) {
        this.gjelderMaaned = gjelderMaaned;
    }

    public int getAar() {
        return aar;
    }

    public void setAar(Integer aar) {
        this.aar = aar;
    }

    public int getMaalingHoved() {
        return maalingHoved;
    }

    public void setMaalingHoved(Integer maalingHoved) {
        this.maalingHoved = maalingHoved;
    }

    public int getMaalingLeietaker() {
        return maalingLeietaker;
    }

    public void setMaalingLeietaker(Integer maalingLeietaker) {
        this.maalingLeietaker = maalingLeietaker;
    }

    public BigDecimal getNetleieFakturaPris() {
        return netleieFakturaPris;
    }

    public void setNetleieFakturaPris(BigDecimal netleieFakturaPris) {
        this.netleieFakturaPris = netleieFakturaPris;
    }

    public BigDecimal getForbrukeFakturaPris() {
        return forbrukeFakturaPris;
    }

    public void setForbrukeFakturaPris(BigDecimal forbrukeFakturaPris) {
        this.forbrukeFakturaPris = forbrukeFakturaPris;
    }
}
