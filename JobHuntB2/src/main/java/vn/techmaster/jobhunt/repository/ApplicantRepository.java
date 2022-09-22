package vn.techmaster.jobhunt.repository;

import org.springframework.stereotype.Repository;
import vn.techmaster.jobhunt.model.Applicant;
import vn.techmaster.jobhunt.model.Skill;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Repository
public class ApplicantRepository {
    private ConcurrentHashMap<String, Applicant> applicants = new ConcurrentHashMap<>();
    private List<Skill> skill = new ArrayList<>();
    Random random = new Random();


    public void addAppli(Applicant applicant){
        String id = UUID.randomUUID().toString();
        applicant.setId(id);
        applicants.put(id,applicant);
    }

    public Collection<Applicant> getAll(){
        return applicants.values();
    }

    public Applicant getId(String id){
        return applicants.get(id);
    }

    public void removeById(String id){
        applicants.remove(id);
    }

    public void update(Applicant applicant){
        applicants.put(applicant.getId(),applicant);
    }

    @PostConstruct
    public void addData(){
        skill.addAll(List.of(Skill.values()));

        this.addAppli(Applicant.builder()
                        .job_id("j1")
                        .email("abc@gmail")
                        .phone("+8436547891")
                        .name("Nguyen Thi A")
                        .skills(Collections.singletonList(skill.get(random.nextInt(skill.size()))))
                .build());
    }
}
