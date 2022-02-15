package com.example.myinterviewmanagementsystem2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "interviews")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "interviewee_cid",
            joinColumns = @JoinColumn(name = "interview_id"),
            inverseJoinColumns = @JoinColumn(name = "interviewee_id"))
    private Interviewee cid;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_interviewers",
            joinColumns = @JoinColumn(name = "interview_id"),
            inverseJoinColumns = @JoinColumn(name = "interviewee_id"))
    private List<User> interviewers;

    @Column(name = "marks")
    private double marks;

    @Column(name = "status")
    private CandStatus status;
}
