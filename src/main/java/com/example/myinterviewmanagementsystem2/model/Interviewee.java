package com.example.myinterviewmanagementsystem2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "interviewees",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "user_id"),
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        }
)
public class Interviewee {

    public enum Status{
        YES,
        NO
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "user_interviewee",
            joinColumns = @JoinColumn(name = "interviewee_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private User user;

    @Column(name = "university")
    private String univ;

    @Column(name = "ssc_year")
    private String ssc_yr;

    @Column(name = "hsc_yr")
    private String hsc_yr;

    @Column(name = "expreience_year")
    private Long exp_yr;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private GenderType gender;

    @Column(name = "l1_interview")
    private LocalDateTime l1_intvw;

    @Column(name = "l2_interview")
    private LocalDateTime l2_intvw;

    @Column(name = "l3_interview")
    private LocalDateTime l3_intvw;

    @Column(name = "l1_result")
    private double l1_result;

    @Column(name = "l2_result")
    private double l2_result;

    @Column(name = "l2_result")
    private double l3_result;

    @Column(name = "cv_result")
    private double cv_result;

    @Column(name = "final_result")
    private double final_result;

    @Enumerated(EnumType.STRING)
    @Column(name = "hired")
    private Status status;
}
