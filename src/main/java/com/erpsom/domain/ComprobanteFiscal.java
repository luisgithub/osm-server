package com.erpsom.domain;

import com.erpsom.domain.json.ComprobanteInfo;
import com.erpsom.domain.jsonb.types.JSONBUserType;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/15/17.
 */


@Table(name = "comprobante")
@Entity
@TypeDef( name = "jsonb", typeClass = JSONBUserType.class, parameters = {
        @org.hibernate.annotations.Parameter(name = JSONBUserType.CLASS, value = "com.erpsom.domain.json.ComprobanteInfo")
    }
)
public class ComprobanteFiscal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    @Type(type = "jsonb")
    private ComprobanteInfo comprobanteInfo;

    public ComprobanteFiscal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ComprobanteInfo getComprobanteInfo() {
        return comprobanteInfo;
    }

    public void setComprobanteInfo(ComprobanteInfo comprobanteInfo) {
        this.comprobanteInfo = comprobanteInfo;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComprobanteFiscal comprobante = (ComprobanteFiscal) o;

        if (id != null ? !id.equals(comprobante.id) : comprobante.id != null) return false;
        if (comprobanteInfo != null ? !comprobanteInfo.equals(comprobante.comprobanteInfo) : comprobante.comprobanteInfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (test != null ? test.hashCode() : 0);
        result = 31 * result + (getComprobanteInfo() != null ? getComprobanteInfo().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "id=" + id +
//                ", test='" + test + '\'' +
                ", info=" + getComprobanteInfo() +
                '}';
    }

}
