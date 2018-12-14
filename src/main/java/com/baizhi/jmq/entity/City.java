package com.baizhi.jmq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class City implements Serializable {
    @Id
    @KeySql(sql = "select city_seq.nextval from dual",order = ORDER.BEFORE)
    private Integer id;
    private String code;
    private String name;
    @Column(name = "provincecode")
    private String provinceCode;
}
