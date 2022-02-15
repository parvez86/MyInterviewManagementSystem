package com.example.myinterviewmanagementsystem2.controller;

import com.example.myinterviewmanagementsystem2.Security.services.IntervieweeDetailsImpl;
import com.example.myinterviewmanagementsystem2.model.Interviewee;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

//@CrossOrigin()
@RestController
public class IntervieweeController {

    private IntervieweeDetailsImpl intervieweeServiceService;

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{id}", method = RequestMethod.GET)
    public Optional<Interviewee> getOnebyId(@PathVariable(value = "id") long id){
        return intervieweeServiceService.findWithId(id);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{univ}", method = RequestMethod.GET)
    public Interviewee getOnebyUniversity(@PathVariable(value = "univ") String universty){
        return intervieweeServiceService.findbyUniversity(universty);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{ssyr}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "ssyr") String year){
        return intervieweeServiceService.findbySSCYear(year);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{hscyr}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "hscyr") String year){
        return intervieweeServiceService.findbyHSCYear(year);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{l1_date}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "l1_date")LocalDateTime time){
        return intervieweeServiceService.findbyL1InvDate(time);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{l2_date}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "l2_date") LocalDateTime time){
        return intervieweeServiceService.findbyL2InvDate(time);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{l3_date}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "l3_date") LocalDateTime time){
        return intervieweeServiceService.findbyL3InvDate(time);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{l1_result}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "l1_result") Double l1_result){
        return intervieweeServiceService.findbyL1InvResult(l1_result);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{l2_result}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "l1_result") Double l1_result){
        return intervieweeServiceService.findbyL2InvResult(l1_result);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{l3_result}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "l1_result") Double l1_result){
        return intervieweeServiceService.findbyL3InvResult(l1_result);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{cv_result}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "cv_result") Double l1_result){
        return intervieweeServiceService.findbyCVResult(l1_result);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{final_result}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "final_result") Double l1_result){
        return intervieweeServiceService.findbyFinalResult(l1_result);
    }

    @PreAuthorize("hasAnyRole('MODERATOR', 'ADMIN')")
    @RequestMapping(value = "/interviewee/{cstaus}", method = RequestMethod.GET)
    public Interviewee getOneby(@PathVariable(value = "cstatus") String l1_result){
        return intervieweeServiceService.findbyCandidateStatus(l1_result);
    }
}
