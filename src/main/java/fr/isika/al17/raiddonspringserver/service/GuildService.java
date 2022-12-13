package fr.isika.al17.raiddonspringserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al17.raiddonspringserver.models.Guild;
import fr.isika.al17.raiddonspringserver.repository.GuildRepository;

@Service
public class GuildService {

    @Autowired
    private GuildRepository repository;

    public Guild addGuild(Guild guild) {
	return repository.save(guild);
    }

    public List<Guild> getGuilds() {
	List<Guild> guilds = repository.findAll();
	return guilds;
    }

    public void deleteGuild(Guild guild) {
	repository.delete(guild);
    }

}
