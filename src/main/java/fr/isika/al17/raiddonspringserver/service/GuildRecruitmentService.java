package fr.isika.al17.raiddonspringserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.GuildRecruitment;
import fr.isika.al17.raiddonspringserver.repository.GuildRecruitmentRepository;

@Service
public class GuildRecruitmentService {
    
	@Autowired
	private GuildRecruitmentRepository repository;
	

	public GuildRecruitment addGuildRecruitment(GuildRecruitment guildRecruitment) {
		return repository.save(guildRecruitment);
	}

	public List<GuildRecruitment> getGuildRecruitment() {
		List<GuildRecruitment> guildRecruitment = repository.findAll();
		return guildRecruitment;
	}

	public void deleteGuildRecruitment(GuildRecruitment guildRecruitment) {
		repository.delete(guildRecruitment);
	}


}
