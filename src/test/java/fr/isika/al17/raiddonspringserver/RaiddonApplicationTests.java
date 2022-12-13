package fr.isika.al17.raiddonspringserver;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import fr.isika.al17.raiddonspringserver.models.Equipment;
import fr.isika.al17.raiddonspringserver.models.Guild;
import fr.isika.al17.raiddonspringserver.models.GuildRecruitment;
import fr.isika.al17.raiddonspringserver.models.Items;
import fr.isika.al17.raiddonspringserver.models.PlayableCharacter;
import fr.isika.al17.raiddonspringserver.models.Preferences;
import fr.isika.al17.raiddonspringserver.models.Raid;
import fr.isika.al17.raiddonspringserver.models.RaidRequirements;
import fr.isika.al17.raiddonspringserver.models.User;
import fr.isika.al17.raiddonspringserver.repository.EquipmentRepository;
import fr.isika.al17.raiddonspringserver.repository.GuildRecruitmentRepository;
import fr.isika.al17.raiddonspringserver.repository.GuildRepository;
import fr.isika.al17.raiddonspringserver.repository.ItemsRepository;
import fr.isika.al17.raiddonspringserver.repository.PlayableCharacterRepository;
import fr.isika.al17.raiddonspringserver.repository.PreferencesRepository;
import fr.isika.al17.raiddonspringserver.repository.RaidRepository;
import fr.isika.al17.raiddonspringserver.repository.RaidRequirementsRepository;
import fr.isika.al17.raiddonspringserver.repository.UserRepository;
import fr.isika.al17.raiddonspringserver.service.EquipmentService;
import fr.isika.al17.raiddonspringserver.service.GuildRecruitmentService;
import fr.isika.al17.raiddonspringserver.service.GuildService;
import fr.isika.al17.raiddonspringserver.service.ItemsService;
import fr.isika.al17.raiddonspringserver.service.PlayableCharacterService;
import fr.isika.al17.raiddonspringserver.service.PreferencesService;
import fr.isika.al17.raiddonspringserver.service.RaidRequirementsService;
import fr.isika.al17.raiddonspringserver.service.RaidService;
import fr.isika.al17.raiddonspringserver.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
class RaiddonApplicationTests {

    @Autowired
    private UserService userService;
    @Autowired
    private ItemsService itemsService;
    @Autowired
    private PlayableCharacterService playableCharacterService;
    @Autowired
    private GuildService guildService;
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private GuildRecruitmentService guildRecruitmentService;
    @Autowired
    private PreferencesService preferencesService;
    @Autowired
    private RaidRequirementsService raidRequirementsService;
    @Autowired
    private RaidService raidService;

    @MockBean
    private UserRepository userRepository;
    @MockBean
    private ItemsRepository itemsRepository;
    @MockBean
    private PlayableCharacterRepository playablecharacterRepository;
    @MockBean
    private GuildRepository guildRepository;
    @MockBean
    private EquipmentRepository equipmentRepository;
    @MockBean
    private GuildRecruitmentRepository guildRecruitmentRepository;
    @MockBean
    private PreferencesRepository preferencesRepository;
    @MockBean
    private RaidRequirementsRepository raidRequirementsRepository;
    @MockBean
    private RaidRepository raidRepository;

    // UserTests
    @Test
    public void getUsersTest() {
	when(userRepository.findAll())
		.thenReturn(Stream.of(new User("username", "email", "password")).collect(Collectors.toList()));
	assertEquals(1, userService.getUsers().size());
    }

    @Test
    public void saveUserTest() {
	User user = new User("username", "email", "password");
	when(userRepository.save(user)).thenReturn(user);
	assertEquals(user, userService.addUser(user));
    }

    @Test
    public void deleteUserTest() {
	User user = new User("username", "email", "password");
	userService.deleteUser(user);
	verify(userRepository, times(1)).delete(user);
    }

    // ItemsTests
    @Test
    public void getItemsTest() {
	when(itemsRepository.findAll())
		.thenReturn(Stream
			.of(new Items(null, "username", null, "email", "password", null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null))
			.collect(Collectors.toList()));
	assertEquals(1, itemsService.getItems().size());
    }

    @Test
    public void saveItemsTest() {
	Items item = new Items(null, "username", null, "email", "password", null, null, null, null, null, null, null,
		null, null, null, null, null, null, null, null, null, null);
	when(itemsRepository.save(item)).thenReturn(item);
	assertEquals(item, itemsService.addItems(item));
    }

    @Test
    public void deleteItemTest() {
	Items item = new Items(null, "username", null, "email", "password", null, null, null, null, null, null, null,
		null, null, null, null, null, null, null, null, null, null);
	itemsService.deleteItems(item);
	verify(itemsRepository, times(1)).delete(item);
    }

    // PlayableCharactersTests
    @Test
    public void getPlayableCharactersTest() {
	when(playablecharacterRepository.findAll())
		.thenReturn(Stream
			.of(new PlayableCharacter(null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, false, false, false, false, null, null, null, null))
			.collect(Collectors.toList()));
	assertEquals(1, playableCharacterService.getPlayableCharacters().size());
    }

    @Test
    public void savePlayableCharactersTest() {
	PlayableCharacter playableCharacter = new PlayableCharacter(null, null, null, null, null, null, null, null,
		null, null, null, null, null, null, null, false, false, false, false, null, null, null, null);
	when(playablecharacterRepository.save(playableCharacter)).thenReturn(playableCharacter);
	assertEquals(playableCharacter, playableCharacterService.addPlayableCharacter(playableCharacter));
    }

    @Test
    public void deletePlayableCharactersTest() {
	PlayableCharacter playableCharacter = new PlayableCharacter(null, null, null, null, null, null, null, null,
		null, null, null, null, null, null, null, false, false, false, false, null, null, null, null);
	playableCharacterService.deletePlayableCharacter(playableCharacter);
	verify(playablecharacterRepository, times(1)).delete(playableCharacter);
    }

    // GuildTests
    @Test
    public void getGuildTest() {
	when(guildRepository.findAll()).thenReturn(Stream.of(
		new Guild(null, null, null, null, null, null, null, null, null, null, null, false, null, null, null))
		.collect(Collectors.toList()));
	assertEquals(1, guildService.getGuilds().size());
    }

    @Test
    public void saveGuildTest() {
	Guild guild = new Guild(null, null, null, null, null, null, null, null, null, null, null, false, null, null,
		null);
	when(guildRepository.save(guild)).thenReturn(guild);
	assertEquals(guild, guildService.addGuild(guild));
    }

    @Test
    public void deleteGuildTest() {
	Guild guild = new Guild(null, null, null, null, null, null, null, null, null, null, null, false, null, null,
		null);
	guildService.deleteGuild(guild);
	verify(guildRepository, times(1)).delete(guild);
    }

    // EquipmentTests
    @Test
    public void getEquipmentTest() {
	when(equipmentRepository.findAll()).thenReturn(Stream.of(new Equipment(null, null, null, null, null, null, null,
		null, null, null, null, null, null, null, null, null, null, null)).collect(Collectors.toList()));
	assertEquals(1, equipmentService.getEquipment().size());
    }

    @Test
    public void saveEquipmentTest() {
	Equipment equipment = new Equipment(null, null, null, null, null, null, null, null, null, null, null, null,
		null, null, null, null, null, null);
	when(equipmentRepository.save(equipment)).thenReturn(equipment);
	assertEquals(equipment, equipmentService.addEquipment(equipment));
    }

    @Test
    public void deleteEquipmentTest() {
	Equipment equipment = new Equipment(null, null, null, null, null, null, null, null, null, null, null, null,
		null, null, null, null, null, null);
	equipmentService.deleteEquipment(equipment);
	verify(equipmentRepository, times(1)).delete(equipment);
    }

    // GuildRecruitmentTests
    @Test
    public void getGuildRecruitmentTest() {
	when(guildRecruitmentRepository.findAll())
		.thenReturn(Stream.of(new GuildRecruitment(null, null, null, null, null, null, null, null, null, null,
			null, null, null, false, false, false)).collect(Collectors.toList()));
	assertEquals(1, guildRecruitmentService.getGuildRecruitment().size());
    }

    @Test
    public void saveGuildRecruitmentTest() {
	GuildRecruitment guildRecruitment = new GuildRecruitment(null, null, null, null, null, null, null, null, null,
		null, null, null, null, false, false, false);
	when(guildRecruitmentRepository.save(guildRecruitment)).thenReturn(guildRecruitment);
	assertEquals(guildRecruitment, guildRecruitmentService.addGuildRecruitment(guildRecruitment));
    }

    @Test
    public void deleteGuildRecruitmentTest() {
	GuildRecruitment guildRecruitment = new GuildRecruitment(null, null, null, null, null, null, null, null, null,
		null, null, null, null, false, false, false);
	guildRecruitmentService.deleteGuildRecruitment(guildRecruitment);
	verify(guildRecruitmentRepository, times(1)).delete(guildRecruitment);
    }

    // PreferencesTests
    @Test
    public void getPreferencesTest() {
	when(preferencesRepository.findAll()).thenReturn(
		Stream.of(new Preferences(null, null, false, false, null, null, null)).collect(Collectors.toList()));
	assertEquals(1, preferencesService.getPreferences().size());
    }

    @Test
    public void savePreferencesTest() {
	Preferences preferences = new Preferences(null, null, false, false, null, null, null);
	when(preferencesRepository.save(preferences)).thenReturn(preferences);
	assertEquals(preferences, preferencesService.addPreferences(preferences));
    }

    @Test
    public void deletePreferencesTest() {
	Preferences preferences = new Preferences(null, null, false, false, null, null, null);
	preferencesService.deletePreferences(preferences);
	verify(preferencesRepository, times(1)).delete(preferences);
    }
    
    // RaidRequirementsTests
    @Test
    public void getRaidRequirementsTest() {
	when(raidRequirementsRepository.findAll()).thenReturn(
		Stream.of(new RaidRequirements(null, null, null, null, null, null)).collect(Collectors.toList()));
	assertEquals(1, raidRequirementsService.getRaidRequirements().size());
    }

    @Test
    public void saveRaidRequirementsTest() {
	RaidRequirements raidRequirements = new RaidRequirements(null, null, null, null, null, null);
	when(raidRequirementsRepository.save(raidRequirements)).thenReturn(raidRequirements);
	assertEquals(raidRequirements, raidRequirementsService.addRaidRequirements(raidRequirements));
    }

    @Test
    public void deleteRaidRequirementsTest() {
	RaidRequirements raidRequirements = new RaidRequirements(null, null, null, null, null, null);
	raidRequirementsService.deleteRaidRequirements(raidRequirements);
	verify(raidRequirementsRepository, times(1)).delete(raidRequirements);
    }
    
    // RaidTests
    @Test
    public void getRaidTest() {
	when(raidRepository.findAll()).thenReturn(
		Stream.of(new Raid(null, null, null, null, null, null, null, null, null, null, null, null)).collect(Collectors.toList()));
	assertEquals(1, raidService.getRaids().size());
    }

    @Test
    public void saveRaidTest() {
	Raid raid = new Raid(null, null, null, null, null, null, null, null, null, null, null, null);
	when(raidRepository.save(raid)).thenReturn(raid);
	assertEquals(raid, raidService.addRaid(raid));
    }

    @Test
    public void deleteTest() {
	Raid raid = new Raid(null, null, null, null, null, null, null, null, null, null, null, null);
	raidService.deleteRaid(raid);
	verify(raidRepository, times(1)).delete(raid);
    }


}
