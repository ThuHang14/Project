package vn.techmaster.jobhunt.repository;

import org.springframework.stereotype.Repository;
import vn.techmaster.jobhunt.model.City;
import vn.techmaster.jobhunt.model.Job;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class JobRepository {
    private ConcurrentHashMap<String,Job> jobs;

    public JobRepository() {
        jobs = new ConcurrentHashMap<>();
        jobs.put("job1",new Job("job1","e1","back end","abcdefghk",City.DaNang,LocalDateTime.now(),LocalDateTime.now()));
        jobs.put("job2",new Job("job2","e4","font end","abcdefghk",City.HaiPhong,LocalDateTime.now(),LocalDateTime.now()));
        jobs.put("job3",new Job("job3","e2","thu ki","abcdefghk",City.HoChiMinh,LocalDateTime.now(),LocalDateTime.now()));
        jobs.put("job4",new Job("job4","e1","ky su","abcdefghk",City.HaNoi,LocalDateTime.now(),LocalDateTime.now()));
        jobs.put("job5",new Job("job5","e3","giao vien","abcdefghk",City.Others,LocalDateTime.now(),LocalDateTime.now()));

    }

    public List<Job> listjob(){
        return jobs.values().stream().toList();
    }

    public Job getById(String id){
        return jobs.get(id);
    }

    public void addJob(Job job) {
        jobs.put(job.getId(),job);
    }

    public void deleteJobById(String id){
        jobs.remove(id);
    }

    public void updateJob(Job job){
        jobs.put(job.getId(),job);
    }
}
