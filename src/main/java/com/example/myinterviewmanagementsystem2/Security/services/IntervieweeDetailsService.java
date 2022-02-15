package com.example.myinterviewmanagementsystem2.Security.services;

import com.example.myinterviewmanagementsystem2.model.Interviewee;

public interface IntervieweeDetailsService{
    public Iterable<Interviewee> findAll();
    public Interviewee save(Interviewee interviewee);
}
