package com.example.demo.entity;



import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "nhanvien")
public class NhanVien implements Serializable {
    @Id
    @Column(name = "MaNV")
    private String MaNV;

    @Column(name = "Ten")
    private String Ten;

    @Column(name = "Luong")
    private Integer Luong;
}