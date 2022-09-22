
package vn.techmaster.jobhunt.repository;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import vn.techmaster.jobhunt.model.Employer;

@Repository
public class EmployerRepository {
    ConcurrentHashMap<String, Employer> employers;

    public EmployerRepository() {
        employers = new ConcurrentHashMap<>();
        employers.put("e1",
                new Employer("e1", "FPT", "logo/logoFPT.jpg", "https://fpt.com.vn",
                        "fpt@gmail.com"));
        employers.put("e2",
                new Employer("e2", "CMC", "logo/logoCMC.jpg", "https://cmc.com.vn",
                        "cmc@gmail.com"));
        employers.put("e3",
                new Employer("e3", "Amazon", "logo/logoAZ.jpg", "https://amazon.com.vn",
                        "amazon@gmail.com"));
        employers.put("e4",
                new Employer("e4", "Google", "logo/logoGG.jpg", "https://google.com.vn",
                        "google@gmail.com"));
    }

    public List<Employer> getEmployers() {
        return employers.values().stream().toList();
    }

    public Employer getEmployerById(String id) {
        return employers.get(id);
    }

    public void createEmployer(Employer employer) {
        employers.put(employer.getId(), employer);
    }

    public void updateEmployer(Employer employer) {
        employers.put(employer.getId(), employer);
    }

    public void deleteEmployerById(String id) {
        employers.remove(id);
    }

    public Employer add(Employer employer){
        String id = UUID.randomUUID().toString();
        employer.setId(id);
        employers.put(id,employer);
        return employer;
    }

    public void updateLogo(String id,String logo){
      var emp =  employers.get(id);
      emp.setLogo_path(logo);
      employers.put(id,emp);
    }
}
