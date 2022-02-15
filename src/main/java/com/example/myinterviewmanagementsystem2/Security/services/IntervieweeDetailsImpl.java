package com.example.myinterviewmanagementsystem2.Security.services;

import com.example.myinterviewmanagementsystem2.model.Interviewee;
import com.example.myinterviewmanagementsystem2.repository.InterVieweeRepository;

import java.util.Optional;

public class IntervieweeDetailsImpl{
    private InterVieweeRepository repository;

    public Optional<Interviewee> findWithId(long id){
        return repository.findById(id);
    }

//    public Optional<> findbyUniversity(String university) throws {
//        User user = userRepository.getUserByUsername(username);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("Could not find user");
//        }
//
//        return new MyUserDetails(user);
//        return repository.findById(university);
//    }
//
//    public Optional<String> findbyUniversity(String university){
//        return repository.findById(university);
//    }

}
