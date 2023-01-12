
package com.backend.jk_portfolio.Service;

import com.backend.jk_portfolio.Entity.Skills;
import com.backend.jk_portfolio.Interface.ISkillsService;
import com.backend.jk_portfolio.Repository.SkillsRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class SkillsService implements ISkillsService{
    
    @Autowired
    SkillsRepository rSkills;
    
    @Override
    public void deleteSkills(int id) {
        rSkills.deleteById(id);
    }

    @Override
    public void saveSkills(Skills skill) {
        rSkills.save(skill);   
    }

    @Override
    public List<Skills> traerSkills() {
        List<Skills> skills = rSkills.findAll();
        return skills;
    }

    @Override
    public Skills traerSkillsPorId(int id) {
        Skills skill = rSkills.findById(id).orElse(null);
        return skill;
    }
}
