package com.example.myinterviewmanagementsystem2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "answers")
public class Answer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "answer")
    private String answer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "question_qid",
            joinColumns = @JoinColumn(name = "answer_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id"))
    private Question qid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "interviewee_cid",
            joinColumns = @JoinColumn(name = "answer_id"),
            inverseJoinColumns = @JoinColumn(name = "interviewee_id"))
    private Interviewee cid;

    @Column(name = "marks")
    private double marks;
}
