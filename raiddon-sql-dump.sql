-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: raiddon_db
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `equipment`
--
use heroku_d2ebe8afecd08ef;

DROP TABLE IF EXISTS `equipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `equipment` (
  `id` bigint NOT NULL,
  `back_item` varchar(255) DEFAULT NULL,
  `chest_item` varchar(255) DEFAULT NULL,
  `feet_item` varchar(255) DEFAULT NULL,
  `first_ring_item` varchar(255) DEFAULT NULL,
  `first_trinket_item` varchar(255) DEFAULT NULL,
  `hand_item` varchar(255) DEFAULT NULL,
  `head_item` varchar(255) DEFAULT NULL,
  `legs_item` varchar(255) DEFAULT NULL,
  `main_hand_item` varchar(255) DEFAULT NULL,
  `neck_item` varchar(255) DEFAULT NULL,
  `off_hand_item` varchar(255) DEFAULT NULL,
  `relic_item` varchar(255) DEFAULT NULL,
  `second_ring_item` varchar(255) DEFAULT NULL,
  `second_trinket_item` varchar(255) DEFAULT NULL,
  `shoulder_item` varchar(255) DEFAULT NULL,
  `waist_item` varchar(255) DEFAULT NULL,
  `wrist_item` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment`
--

LOCK TABLES `equipment` WRITE;
/*!40000 ALTER TABLE `equipment` DISABLE KEYS */;
INSERT INTO `equipment` VALUES (1,'Platinum Mesh Cloak','Breastplate of Frozen Pain','Sabatons of Endurance','Ring of Invincibility','Fezziks Pocketwatch','Valorous Scourgeborne Handguards','Spiked Titansteel Helm','Valorous Scourgeborne Legguards','Red Sword of Courage','Boundless Ambition','Last Laugh','Signet of the Impregnable Fortress','Figurine - Ruby Hare','Pauldrons of Unnatural Death','Ablative Chitin Girdle','Bracers of the Unholy Knight','Valorous Scourgeborne Handguards'),(2,'Hammerhead Sharkskin Cloak','Valorous Redemption Breastplate','Sabatons of Endurance','Sand-Worn Band ','Essence of Gossamer ','Heroes Redemption Handguards','The Horsemans Horrific Helm','Legplates of Sovereignty','Red Sword of Courage','Wall of Terror','Last Laugh','Signet of the Impregnable Fortress','Figurine - Ruby Hare','Pauldrons of Unnatural Death','Ablative Chitin Girdle','Bracers of the Unholy Knight','Valorous Scourgeborne Handguards'),(3,'Sash of Blood Removal','The Sanctums Flowing Vestments','Desecrated Past','Sand-Worn Band ','Legguards of the Boneyard','Sandals of Crimson Fury','Helm of Anomalus','Putrescent Bands','Red Sword of Courage','Spellweave Gloves','Last Laugh','The Egg of Mortal Essence','Cloak of the Dying','Pauldrons of Unnatural Death','Chains of Adoration','Mantle of Shattered Kinship','Valorous Scourgeborne Handguards'),(4,'Helm of Pilgrimage','Torque of the Red Dragonflight','Valorous Redemption Spaulder','Tunic of the Artifact Guardian','Valorous Redemption Greaves','Sandals of Crimson Fury','Poignant Sabatons ','Bindings of the Decrepit ','Gauntlets of Guiding Touch','Spellweave Gloves','Wicked Witchs Band','The Egg of Mortal Essence','Eye of Gruul','Pauldrons of Unnatural Death','The Impossible Dream','Mantle of Shattered Kinship','Valorous Scourgeborne Handguards'),(5,'Cloak of Averted Crisis','Valorous Redemption Tunic','Eruption-Scarred Boots','Ring of Decaying Beauty','Darkmoon Card: Greatness','Gauntlets of Guiding Touch','Helm of Purified Thoughts','Valorous Redemption Greaves','Hammer of the Astral Plane','Chains of Adoration','Voice of Reason','Libram of Souls Redeemed','Annhyldes Ring','Ribbon of Sacrifice','Valorous Redemption Spaulders','Magroths Meditative Cincture','Abetment Bracers'),(6,'Cowl of Sheet Lightning','Chains of Adoration','Valorous Shoulderpads of Faith','Heroes Robe of Faith ','Darkmoon Card: Greatness','Gauntlets of Guiding Touch','Helm of Purified Thoughts','Valorous Redemption Greaves','Hammer of the Astral Plane','Chains of Adoration','Voice of Reason','Libram of Souls Redeemed','Annhyldes Ring','Ribbon of Sacrifice','Valorous Redemption Spaulders','Valorous Leggings of Faith','Abetment Bracers'),(7,'Cowl of Sheet Lightning','Chains of Adoration','Valorous Shoulderpads of Faith','Heroes Robe of Faith ','Darkmoon Card: Greatness','Girdle of Bane','Helm of Purified Thoughts','Valorous Redemption Greaves','Hammer of the Astral Plane','Chains of Adoration','Voice of Reason','Libram of Souls Redeemed','Annhyldes Ring','Ribbon of Sacrifice','Valorous Redemption Spaulders','Skirt of the Old Kingdom','Abetment Bracers'),(8,'Cowl of Sheet Lightning','Chains of Adoration','Blade of Dormant Memories','Heroes Robe of Faith ','Bindings of the Decrepit','Valorous Earthshatter Legguards','Cloak of Averted Crisis','Valorous Redemption Greaves','Hammer of the Astral Plane','Chains of Adoration','Voice of Reason','Totem of Healing Rains','Annhyldes Ring','Ribbon of Sacrifice','Valorous Redemption Spaulders','Skirt of the Old Kingdom','Abetment Bracers'),(9,'Spiked Titansteel Helm ','Chains of Adoration','Blade of Dormant Memories','Heroes Robe of Faith ','Iron-Spring Jumpers','Valorous Earthshatter Legguards','Cloak of Averted Crisis','Angry Dread ','Hammer of the Astral Plane','Chains of Adoration','Mark of Norgannon ','Totem of Healing Rains','Annhyldes Ring','Ribbon of Sacrifice','Valorous Redemption Spaulders','Skirt of the Old Kingdom','Abetment Bracers'),(10,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(11,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(12,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(13,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(14,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(15,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(16,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(17,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(18,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(19,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(20,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(21,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(22,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(23,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(24,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(25,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(26,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(27,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(28,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant '),(29,'Cloak of Bloodied Waters  ','Valorous Scourgeborne Battleplate ','Sabatons of Sudden Reprisal ','Ring of Invincibility  ','Mirror of Truth ','Horn-Tipped Gauntlets ','Obsidian Greathelm ','Bolstered Legplates  ','Inevitable Defeat ','Pendant of the Dragonsworn','Grasscutter  ','Sigil of the Wild Buck ','Signet of the Impregnable Fortress ','Darkmoon Card: Greatness ','Valorous Scourgeborne Shoulderplates','Girdle of Chivalry ','Bracers of the Tyrant ');
/*!40000 ALTER TABLE `equipment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guild`
--

DROP TABLE IF EXISTS `guild`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `guild` (
  `id` bigint NOT NULL,
  `activities` varchar(255) DEFAULT NULL,
  `guild_emblem` varchar(255) DEFAULT NULL,
  `guild_master` varchar(255) DEFAULT NULL,
  `guild_name` varchar(255) DEFAULT NULL,
  `loot_systems` varchar(255) DEFAULT NULL,
  `objectives` varchar(255) DEFAULT NULL,
  `raids_per_week` bigint DEFAULT NULL,
  `rank` bigint DEFAULT NULL,
  `realm` varchar(255) DEFAULT NULL,
  `recruiting` bit(1) NOT NULL,
  `slogan` varchar(255) DEFAULT NULL,
  `total_players` bigint DEFAULT NULL,
  `wow_log_link` varchar(255) DEFAULT NULL,
  `guild_recruitment_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK922vbro3yuvyh7dlmerahy33r` (`guild_recruitment_id`),
  CONSTRAINT `FK922vbro3yuvyh7dlmerahy33r` FOREIGN KEY (`guild_recruitment_id`) REFERENCES `guild_recruitment` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guild`
--

LOCK TABLES `guild` WRITE;
/*!40000 ALTER TABLE `guild` DISABLE KEYS */;
INSERT INTO `guild` VALUES (1,'PVE','https://i.pinimg.com/originals/a0/b4/b7/a0b4b72f50ca162bd86ff2f6df016a69.jpg','Färäh','Parse Patrouille','Attribution','Semi Try Hard',2,57,'Auberdine',_binary '','FIGHT LIKE A LEGEND',30,'https://classic.warcraftlogs.com/guild/id/664278',1),(2,'PVE','https://i.pinimg.com/originals/27/70/be/2770be9fba8f43ae8b5f0f5c6bffdcdc.jpg','Rami','Maze','Attribution','Try Hard',2,1,'Auberdine',_binary '','We are Unbeatable',79,'https://classic.warcraftlogs.com/guild/id/516939',2),(3,'PVE','https://live.staticflickr.com/760/20225171473_6740130784_b.jpg','Dima','NeoLithic','Attribution','Try Hard',2,2,'Auberdine',_binary '\0','We are immortals',85,'https://classic.warcraftlogs.com/guild/id/661821',3),(4,'PVE','https://d3b4yo2b5lbfy.cloudfront.net/wp-content/uploads/2015/07/33174012.png','Nolwenn','Eclipse','Random','Chill',4,294,'Auberdine',_binary '','Just play for Fun',65,'https://classic.warcraftlogs.com/guild/eu/auberdine/eclipse',4),(5,'PVE','https://i.pinimg.com/originals/74/bf/b5/74bfb58eda5128c606fef0eaa3301d1e.jpg','Alix','Beef Bar','DKP','Try Hard',2,294,'Gehennas',_binary '\0','Legends never die',164,'https://classic.warcraftlogs.com/guild/id/519542',5),(6,'PVE','https://cdna.artstation.com/p/assets/images/images/033/044/052/large/marcelina-borkowska-erzcsnfxkasjzys.jpg?1608221054','Safa','Wip n Roll','Random','Chill',4,288,'Auberdine',_binary '','Just for Fun',20,'https://classic.warcraftlogs.com/guild/id/616761/',6),(7,'PVP','https://i.pinimg.com/originals/6a/ea/11/6aea1163d6c57d0b3f7adf93cccb1bb0.jpg','Natacha','Tombenuit','Random','Chill',3,223,'Auberdine',_binary '\0','BANG.BANG.PRO.GANG',28,'https://classic.warcraftlogs.com/guild/id/510850/',7),(8,'PVE','https://d3b4yo2b5lbfy.cloudfront.net/wp-content/uploads/2015/07/6c4e6031.png','Vincent','Osmose','DKP','Chill',3,230,'Auberdine',_binary '','We are Monsters',53,'https://classic.warcraftlogs.com/guild/id/518564/',8),(9,'PVE','https://wallpaperaccess.com/full/2949599.png','Camille','Pixel Perfect','Attribution','Semi Try Hard',3,4,'Auberdine',_binary '','Only Pro Players',76,'https://classic.warcraftlogs.com/guild/id/671265/',9),(10,'PVE','https://dthezntil550i.cloudfront.net/2a/latest/2a2002082118569070007669689/1280_960/8eca1cf9-fab8-4cfb-b65c-c7779fb07655.png','Pierre','Phobias','DKP','Semi Try Hard',3,18,'Auberdine',_binary '','Dare to Die',76,'https://classic.warcraftlogs.com/search/?term=phobias',10),(11,'PVP','https://wallpapercave.com/wp/wp541960.jpg','Helios','Statement','GDKP','Semi Try Hard',3,20,'Auberdine',_binary '','LF exceptional multiclass DPS',126,'https://classic.warcraftlogs.com/guild/id/509250',11),(12,'PVP','https://cdnb.artstation.com/p/assets/images/images/051/585/213/large/pawel-adamus-soowonnoodles-emblem.jpg?1657661684','Rola','小红手桥本丶','GDKP','Try Hard',3,9,'Auberdine',_binary '\0','龙之召唤',130,'https://classic.warcraftlogs.com/character/id/68285578?mode=detailed&zone=1015#metric=dps&partition=1',12),(13,'PVE','https://cdna.artstation.com/p/assets/images/images/033/044/048/large/marcelina-borkowska-erzcqdpx0ae5ddt.jpg?1608221046','David','Unlucky','GDKP','Semi Try Hard',2,10,'Auberdine',_binary '','Driven & mature group',46,'https://classic.warcraftlogs.com/guild/id/602251/',13),(14,'PVE','https://i.scdn.co/image/ab67616d0000b273de13608102141bbad021b02c','Jonathan','Infamous','Random','Chill',4,101,'Auberdine',_binary '','Formed on Outland-EU in 2007',54,'https://classic.warcraftlogs.com/guild/id/478891/',14),(15,'PVE','https://d3b4yo2b5lbfy.cloudfront.net/wp-content/uploads/2015/07/70988029.png','Romuald','Trinity','Random','Chill',5,13,'Auberdine',_binary '','Hello friend, join us',33,'https://classic.warcraftlogs.com/guild/id/509250',15),(16,'PVE','https://i.pinimg.com/736x/3b/bc/e3/3bbce320c80ea0e5b9b1db44256c9743.jpg','Gaia','Tribe','Random','Chill',5,23,'Auberdine',_binary '\0','French speaking guild on Sulfuron',33,'https://classic.warcraftlogs.com/guild/id/476197/',1);
/*!40000 ALTER TABLE `guild` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guild_recruitment`
--

DROP TABLE IF EXISTS `guild_recruitment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `guild_recruitment` (
  `id` bigint NOT NULL,
  `bulk` varchar(255) DEFAULT NULL,
  `can_cook` bit(1) NOT NULL,
  `can_first_aid` bit(1) NOT NULL,
  `can_fish` bit(1) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `first_profession` varchar(255) DEFAULT NULL,
  `main_role` varchar(255) DEFAULT NULL,
  `main_spec` varchar(255) DEFAULT NULL,
  `min_ilevel` bigint DEFAULT NULL,
  `min_level` bigint DEFAULT NULL,
  `playable_character` varchar(255) DEFAULT NULL,
  `quantity` varchar(255) DEFAULT NULL,
  `second_profession` varchar(255) DEFAULT NULL,
  `secondary_role` varchar(255) DEFAULT NULL,
  `secondary_spec` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guild_recruitment`
--

LOCK TABLES `guild_recruitment` WRITE;
/*!40000 ALTER TABLE `guild_recruitment` DISABLE KEYS */;
INSERT INTO `guild_recruitment` VALUES (1,'High',_binary '',_binary '',_binary '','Player has to be available twice oer week for raid','Enginnering','Damage','Enhancement',200,80,'Shaman','2','Inscription','Healer','Restoration'),(2,'Low',_binary '',_binary '',_binary '','Player has to be available twice oer week for raid','Enchanting','Healer','Restoration',200,80,'Druid','1','Tailoring','Damage','Balance'),(3,'Medium',_binary '',_binary '',_binary '','Player has to be available thrre times oer week for raid','Engineering','Damage','Frost',200,80,'Mage','1','Tailoring','Damage','Fire'),(4,'High',_binary '\0',_binary '\0',_binary '\0','Join us for fun','Herbalism','Damage','Fury',0,0,'Warrior','100','Mining','Damage','Arms'),(5,'High',_binary '\0',_binary '\0',_binary '\0','Join us for fun','Herbalism','Damage','Assassination',0,0,'Rogue','100','Mining','Damage','Combat'),(6,'High',_binary '\0',_binary '\0',_binary '\0','Join us for fun','Herbalism','Damage','Unholy',0,0,'Death Knight','100','Mining','Damage','Frost'),(7,'High',_binary '\0',_binary '\0',_binary '\0','We are looking for new friends to join our guild','Herbalism','Damage','Holy',0,0,'Paladin','100','Mining','Tank','Protection'),(8,'High',_binary '\0',_binary '\0',_binary '\0','We are looking for new friends to join our guild','Inscription','Damage','Survival',0,0,'Hunter','100','Mining','Damage','Beast Mastery'),(9,'Medium',_binary '',_binary '',_binary '','We are looking for a new main tank for our raids','Engineering','Tank','Protection',200,80,'Warrior','1','Mining','Damage','Arms'),(10,'Medium',_binary '',_binary '',_binary '','We are looking for a new off-tank for our raids','Engineering','Tank','Protection',200,80,'Paladin','1','Mining','Damage','Retribution'),(11,'High',_binary '',_binary '',_binary '','We are looking for a warlock with very high parses','Engineering','Damage','Affliction',210,80,'Warlock','1','Tailoring','Damage','Demonology'),(12,'High',_binary '',_binary '',_binary '','We are looking for a priest with very high parses','Tailoring','Damage','Shadow',210,80,'Priest','1','Enchanting','Healer','Holy'),(13,'Low',_binary '',_binary '\0',_binary '','We are looking for new players','LeathesSkinning','Tank','Guardian',210,80,'Druid','2','Blacksmithing','Healer','Restoration'),(14,'Medium',_binary '',_binary '',_binary '\0','We are looking for new players','Herbalism','Damage','Discipline',210,80,'Priest','1','Engineering','Damage','Shadow'),(15,'High',_binary '\0',_binary '',_binary '','We are looking for new players','Alchemy','Damage','Elemental',210,80,'Shaman','5','Enchanting','Damage','Enhancement');
/*!40000 ALTER TABLE `guild_recruitment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `items` (
  `id` bigint NOT NULL,
  `agility` bigint DEFAULT NULL,
  `armor` bigint DEFAULT NULL,
  `attack_power` bigint DEFAULT NULL,
  `block_value` bigint DEFAULT NULL,
  `critical_strike` bigint DEFAULT NULL,
  `defense` bigint DEFAULT NULL,
  `expertise` bigint DEFAULT NULL,
  `hasterating` bigint DEFAULT NULL,
  `hit_rating` bigint DEFAULT NULL,
  `intellect` bigint DEFAULT NULL,
  `item_armor_type` varchar(255) DEFAULT NULL,
  `item_drop_zone` varchar(255) DEFAULT NULL,
  `item_icon` varchar(255) DEFAULT NULL,
  `item_level` bigint DEFAULT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  `item_priority_class` varchar(255) DEFAULT NULL,
  `item_priority_spec` varchar(255) DEFAULT NULL,
  `item_slot` varchar(255) DEFAULT NULL,
  `item_source` varchar(255) DEFAULT NULL,
  `mana_per_five_seconds` bigint DEFAULT NULL,
  `parry_value` bigint DEFAULT NULL,
  `spell_power` bigint DEFAULT NULL,
  `spirit` bigint DEFAULT NULL,
  `stamina` bigint DEFAULT NULL,
  `strength` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playable_character`
--

DROP TABLE IF EXISTS `playable_character`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `playable_character` (
  `id` bigint NOT NULL,
  `can_cook` bit(1) NOT NULL,
  `can_first_aid` bit(1) NOT NULL,
  `can_fish` bit(1) NOT NULL,
  `faction` varchar(255) DEFAULT NULL,
  `first_profession` varchar(255) DEFAULT NULL,
  `guild_rank` varchar(255) DEFAULT NULL,
  `has_guild` bit(1) NOT NULL,
  `ilevel` bigint DEFAULT NULL,
  `level` bigint DEFAULT NULL,
  `main_role` varchar(255) DEFAULT NULL,
  `main_spec` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `playable_class` varchar(255) DEFAULT NULL,
  `race` varchar(255) DEFAULT NULL,
  `realm` varchar(255) DEFAULT NULL,
  `second_profession` varchar(255) DEFAULT NULL,
  `secondary_role` varchar(255) DEFAULT NULL,
  `secondary_spec` varchar(255) DEFAULT NULL,
  `wow_log_link` varchar(255) DEFAULT NULL,
  `equipment_id` bigint DEFAULT NULL,
  `guild_id` bigint DEFAULT NULL,
  `preferences_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKq65wql4tc68rhq3fe1ehryht6` (`equipment_id`),
  KEY `FKah2otxcnaf5dyoiqx7wmqnnr0` (`guild_id`),
  KEY `FKbli6p1uivh5iwkabh6mp2ojnr` (`preferences_id`),
  CONSTRAINT `FKah2otxcnaf5dyoiqx7wmqnnr0` FOREIGN KEY (`guild_id`) REFERENCES `guild` (`id`),
  CONSTRAINT `FKbli6p1uivh5iwkabh6mp2ojnr` FOREIGN KEY (`preferences_id`) REFERENCES `preferences` (`id`),
  CONSTRAINT `FKq65wql4tc68rhq3fe1ehryht6` FOREIGN KEY (`equipment_id`) REFERENCES `equipment` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playable_character`
--

LOCK TABLES `playable_character` WRITE;
/*!40000 ALTER TABLE `playable_character` DISABLE KEYS */;
INSERT INTO `playable_character` VALUES (1,_binary '',_binary '',_binary '','Alliance','Engineering','Guild Master',_binary '',209,80,'Healer','Holy','Färäh','Paladin','Human','Auberdine','Alchemy','Damage','Retribution','https://classic.warcraftlogs.com/character/EU/Auberdine/F%C3%A4r%C3%A4h',5,1,3),(2,_binary '',_binary '',_binary '','Alliance','Engineering','Guild Master',_binary '',210,80,'Damage','Unholy','Décapitaine','Death Knight','Human','Auberdine','Jewelcrafting','Tank','Blood','https://classic.warcraftlogs.com/character/EU/Auberdine/F%C3%A4r%C3%A4h',10,1,4),(3,_binary '',_binary '',_binary '','Alliance','LeatherWorking','Guild Officer',_binary '',212,80,'Healer','Restoration','Emyly','Druid','Night Elf','Auberdine','Enchanting','Damage','Balance','https://classic.warcraftlogs.com/character/EU/Auberdine/Emyly',3,16,7),(4,_binary '',_binary '\0',_binary '','Alliance','Herbalism','Guild Member',_binary '',207,80,'Damage','Elemental','Zasham','Shaman','Draenei','Auberdine','Alchemy','Healer','Restoration','https://classic.warcraftlogs.com/character/EU/Auberdine/Zasham',22,1,8),(5,_binary '\0',_binary '\0',_binary '','Alliance','Engineering','Guild Member',_binary '',210,80,'Damage','Combat','Arpakshade','Rogue','Human','Auberdine','Tailoring','Damage','Assassination','https://classic.warcraftlogs.com/character/EU/Auberdine/Arpaskshade',21,1,11),(6,_binary '\0',_binary '\0',_binary '\0','Alliance','Alchemy','Guild Member',_binary '',209,80,'Damage','Frost','Sisse','Mage','Gnome','Auberdine','Tailoring','Damage','Arcane','https://classic.warcraftlogs.com/character/EU/Auberdine/Sisse',16,4,12),(7,_binary '\0',_binary '\0',_binary '\0','Alliance','Skinning','Guild Member',_binary '',209,80,'Damage','Fire','Gorlois','Mage','Gnome','Auberdine','Mining','Damage','Frost','https://classic.warcraftlogs.com/character/EU/Auberdine/Gorlois',15,1,1),(8,_binary '',_binary '',_binary '','Alliance','Engineering','Guild Member',_binary '',213,80,'Damage','Demonology','Nowarlock','Warlock','Gnome','Auberdine','Tailoring','Damage','Affliction','https://classic.warcraftlogs.com/character/EU/Auberdine/Nowarlock',24,1,5),(9,_binary '',_binary '',_binary '','Alliance','Enchanting','Guild Member',_binary '',211,80,'Healer','Disciplne','Didàdidàdoum','Priest','Human','Auberdine','Alchemy','Damage','Shadow','https://classic.warcraftlogs.com/character/EU/Auberdine/Did%C3%A0did%C3%A0doum',6,1,6),(10,_binary '\0',_binary '\0',_binary '','Alliance','Blacksmithing','Guild Officer',_binary '',213,80,'Tank','Protection','Fookmi','Paladin','Human','Auberdine','Mining','Damage','Retribution','https://classic.warcraftlogs.com/character/EU/Auberdine/Fookmi',2,1,28),(11,_binary '',_binary '\0',_binary '','Alliance','JewelCrafting','Guild Member',_binary '',208,80,'Damage','Demonology','Amentia','Warlock','Human','Auberdine','Inscription','Damage','Destruction','https://classic.warcraftlogs.com/character/EU/Auberdine/Amentia',27,1,26),(12,_binary '\0',_binary '',_binary '\0','Alliance','JewelCrafting','Guild Member',_binary '',211,80,'Damage','Balance','Vigdig','Druid','Nigh Elf','Auberdine','Inscription','Damage','Feral','https://classic.warcraftlogs.com/character/EU/Auberdine/Vigdig',11,3,9),(13,_binary '\0',_binary '',_binary '\0','Alliance','Leatherworking','Guild Member',_binary '',213,80,'Damage','Feral','Dinxsi','Druid','Nigh Elf','Auberdine','Skinning','Damage','Balance','https://classic.warcraftlogs.com/character/EU/Auberdine/Dinxsi',12,2,10),(14,_binary '',_binary '\0',_binary '','Alliance','Tailoring','Guild Member',_binary '',205,80,'Healer','Holy','Dreimuss','Paladin','Human','Auberdine','Alchemy','Damage','Retribution','https://classic.warcraftlogs.com/character/EU/Auberdine/Dreimuss',4,7,29),(15,_binary '',_binary '\0',_binary '','Alliance','Engineering','Guild Member',_binary '',211,80,'Damage','Frost','Crøøklyne','Death Knight','Human','Auberdine','Mining','Damage','Unholy','https://classic.warcraftlogs.com/character/EU/Auberdine/Cr%C3%B8%C3%B8klyne',9,8,13),(16,_binary '\0',_binary '\0',_binary '','Alliance','Inscription','Guild Member',_binary '',212,80,'Tank','Blood','Thasria','Death Knight','Draenei','Auberdine','Mining','Damage','Unholy','https://classic.warcraftlogs.com/character/EU/Auberdine/Thasria',1,1,14),(17,_binary '\0',_binary '\0',_binary '','Alliance','Enchanting','Guild Member',_binary '',211,80,'Healer','Restoration','Loundoue','Shaman','Draenei','Auberdine','Jewelcrafting','Damage','Elemental','https://classic.warcraftlogs.com/character/EU/Auberdine/Loundoue',8,5,15),(18,_binary '',_binary '',_binary '','Alliance','Enchanting','Guild Member',_binary '',213,80,'Healer','Holy','Ellei','Priest','Human','Auberdine','Tailoring','Damage','Shadow','https://classic.warcraftlogs.com/character/EU/Auberdine/Ellei',7,6,16),(19,_binary '',_binary '',_binary '','Alliance','Leatherworking','Guild Member',_binary '',213,80,'Damage','Survival','Arzess','Hunter','Dwarf','Auberdine','Skinning','Damage','Beast Mastery','https://classic.warcraftlogs.com/character/EU/Auberdine/Arzess',13,1,17),(20,_binary '',_binary '',_binary '','Alliance','Leatherworking','Guild Member',_binary '',213,80,'Damage','Survival','Flytox','Hunter','Gnome','Auberdine','Skinning','Damage','Marksmanship','https://classic.warcraftlogs.com/character/EU/Auberdine/Flytox',14,1,18),(21,_binary '',_binary '',_binary '','Alliance','Tailoring','Guild Member',_binary '',213,80,'Damage','Demonology','Jarns','Warlock','Human','Auberdine','Alchemy','Damage','Affliction','https://classic.warcraftlogs.com/character/EU/Auberdine/Jarns',26,1,19),(22,_binary '',_binary '',_binary '','Alliance','Jewelcrafting','Guild Member',_binary '',213,80,'Damage','Retribution','Encome','Paladin','Human','Auberdine','Alchemy','Healer','Holy','https://classic.warcraftlogs.com/character/EU/Auberdine/Encome',17,10,20),(23,_binary '',_binary '',_binary '','Alliance','Inscription','Guild Member',_binary '',208,80,'Damage','Enhancement','Hyrami','Shaman','Draenei','Auberdine','Mining','Damage','Elemental','https://classic.warcraftlogs.com/character/EU/Auberdine/Hyrami',23,12,30),(24,_binary '',_binary '',_binary '','Alliance','Jewelcrafting','Guild Member',_binary '',213,80,'Damage','Retribution','Valius','Paladin','Human','Auberdine','Alchemy','Tank','Protection','https://classic.warcraftlogs.com/character/EU/Auberdine/Valius',18,13,21),(25,_binary '',_binary '',_binary '','Alliance','Alchemy','Guild Member',_binary '',213,80,'Damage','Shadow','Metaverse','Priest','Human','Auberdine','Herbalism','Healer','Holy','https://classic.warcraftlogs.com/character/EU/Auberdine/Metaverse',19,9,22),(26,_binary '\0',_binary '\0',_binary '','Alliance','Engineering','Guild Member',_binary '',210,80,'Damage','Combat','Anomaly','Rogue','Human','Auberdine','Tailoring','Damage','Assassination','https://classic.warcraftlogs.com/character/EU/Auberdine/Anomaly',20,1,23),(27,_binary '\0',_binary '\0',_binary '','Alliance','Engineering','Guild Member',_binary '',210,80,'Damage','Demonology','Edsdelafédé','Warlock','Human','Auberdine','Alchemy','Damage','Affliction','https://classic.warcraftlogs.com/character/EU/Auberdine/Edsdelaf%C3%A9d%C3%A9',25,14,24),(28,_binary '\0',_binary '\0',_binary '','Alliance','Engineering','Guild Member',_binary '',210,80,'Damage','Arms','Erasama','Warrior','Human','Auberdine','Alchemy','Tank','Protection','https://classic.warcraftlogs.com/character/EU/Auberdine/Erasama',29,15,25);
/*!40000 ALTER TABLE `playable_character` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preferences`
--

DROP TABLE IF EXISTS `preferences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `preferences` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `loot_systems` varchar(255) DEFAULT NULL,
  `objectives` varchar(255) DEFAULT NULL,
  `raids_per_week` bigint DEFAULT NULL,
  `seeking_guild` bit(1) NOT NULL,
  `seeking_raid` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preferences`
--

LOCK TABLES `preferences` WRITE;
/*!40000 ALTER TABLE `preferences` DISABLE KEYS */;
INSERT INTO `preferences` VALUES (1,'Action command power-Up SimCity whale level dpm smurf tryhard boss speedrun survival game Wii Fit.','Random','Chill',2,_binary '',_binary ''),(2,'Uncharted CPU computer graphics Flying Simulator The Legend of Zelda: Twilight Princess main quest Gran Turismo.','Attribution','Try Hard',3,_binary '',_binary '\0'),(3,'RQ underpowered jrpg cut-in retrogaming wanted level gold sink co-op Mario Kart Game Boy Color Mario.','DKP','Try Hard',4,_binary '\0',_binary ''),(4,'Easter egg shovelware Call of Duty: Modern Warfare 2 wall hack easter eggs GG Counter-Strike recoi survival game Healer.','GDKP','Semi Try Hard',0,_binary '\0',_binary '\0'),(5,'Spoiler emulator Final Fantasy job influencer marketing level Action game battle pass beta Game Over beastiary open world.','Random','Chill',2,_binary '',_binary ''),(6,'The Witcher Metal Gear analog control survival game alpha Pokemon pervasive game.','Attribution','Try Hard',3,_binary '',_binary '\0'),(7,'Wall hack AAA quest pervasive game Randomom encounter flicker difficulty.','DKP','Try Hard',3,_binary '\0',_binary ''),(8,'Exploit light gun horde mode GRandom Theft Auto: Vice City trigger point of no return Third-Person headshot slow-down.','GDKP','Semi Try Hard',0,_binary '\0',_binary '\0'),(9,'Mudflation PlayStation3 demo power spike headshot hack Mario Party Red Dead Redemption graphics cut-scene Gran Turismo.','Random','Chill',2,_binary '',_binary ''),(10,'RQ The Elder Scrolls V: Skyrim God of War going gold Halo griefing open world casual 1-Up Gran Turismo RTS anti-aliasing Perfect Dark.','Attribution','Try Hard',3,_binary '',_binary '\0'),(11,'Sidequest Microsoft gib cheated death Third-Person draw distance DLC NBA Live CPU PlayStation Portable Portal 2.','DKP','Try Hard',3,_binary '\0',_binary ''),(12,'Call of Duty: Modern Warfare 2 NBA 2K Wii U FP CoD FOV bullshot FPS Xbox 360.','GDKP','Semi Try Hard',0,_binary '\0',_binary '\0'),(13,'Nintendo DS corruptor sandbox controller The Elder Scrolls V: Skyrim anti-aliasing Pac-Man quicksave MMORPG Nintendo 3DS.','Random','Chill',2,_binary '',_binary ''),(14,'Fighting game GameBattles noob Pokemon SimCity cheated death secret character texture mapping kill stealing Halo Multiplayer.','Attribution','Try Hard',3,_binary '',_binary '\0'),(15,'Suppression fire digital rights management respawn difficulty Nintendo DS quicksave Nintendo 3DS Wombo Combo emulator.','DKP','Try Hard',3,_binary '\0',_binary ''),(16,'Combo E.S.R.B. shoulder buttons bot gank pause controller hack Driving simulator.','GDKP','Semi Try Hard',0,_binary '\0',_binary '\0'),(17,'Influencer marketing Tomb Raider anti-aliasing Sony action command floaty FP point of no return level design Mario Party Far Cry.','Random','Chill',2,_binary '',_binary ''),(18,'GG no re Gran Turismo esp cheats Easter egg Mass Effect Just Dance OHKO genre AFK avatar VAC Super Smash Bros.','Attribution','Try Hard',3,_binary '',_binary '\0'),(19,'Trigger RQ The Orange Box spoiler grinding gank permadeath Fighting game.','DKP','Try Hard',3,_binary '\0',_binary ''),(20,'The Last of Us Shoot them up texture mapping The Legend of Zelda indie recoi GRandom Theft Auto isometric view Sega Genesis publisher.','GDKP','Semi Try Hard',0,_binary '\0',_binary '\0'),(21,'Exploit main quest heat map AAA Pac-Man VAC spoiler Counter-Strike manic shooter Star Wars: Battlefront Microsoft.','Random','Chill',2,_binary '',_binary ''),(22,'Easter egg Mass Effect beastiary anime graphics exploit head bob.','Attribution','Try Hard',3,_binary '',_binary '\0'),(23,'Fatality 1-Up SNES Pokemon simulation game RNG Tom Clancys Splinter Cell LittleBigPlanet.','DKP','Try Hard',3,_binary '\0',_binary ''),(24,'Assassins Creed map Healer job nerf kill stealing matchmaking drop-out RTS God Mode Party game.','GDKP','Semi Try Hard',0,_binary '\0',_binary '\0'),(25,'Faceroll screen cheat pervasive game kill Beat Em Up touchscreen Kinect attract mode Survival Horror Nintendo 64 Frogger influencer marketing.','Random','Chill',2,_binary '',_binary ''),(26,'Action game Hit Points (HP) credit-feeding third-person RQ kill wrapping genre gib.','Attribution','Try Hard',3,_binary '',_binary '\0'),(27,'ÜberCharge split-screen multiplayer nerf chiptune Animal Crossing Medal of Honor HP real time knock-back save point Kingdom Hearts open world.','DKP','Try Hard',3,_binary '\0',_binary ''),(28,'Cel-shaded cut-scene action Just Dance controller Tom Clancy Splinter Cell turbo wrapping cheap hit rekt anime.','GDKP','Semi Try Hard',0,_binary '\0',_binary '\0'),(29,'First-party developer sprite Sony level ambient occlusion Dark Souls floaty.','DKP','Semi Try Hard',0,_binary '\0',_binary '\0'),(30,'Patch demo isometric view frag area of effect Halo 2 Own Beatem up horde mode broken paddle action point KO.','Random','Chill',2,_binary '',_binary '');
/*!40000 ALTER TABLE `preferences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raid`
--

DROP TABLE IF EXISTS `raid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `raid` (
  `id` bigint NOT NULL,
  `raid_date` varchar(255) DEFAULT NULL,
  `raid_difficulty` varchar(255) DEFAULT NULL,
  `raid_icon` varchar(255) DEFAULT NULL,
  `raid_loot_system` varchar(255) DEFAULT NULL,
  `raid_name` varchar(255) DEFAULT NULL,
  `raid_off_time` varchar(255) DEFAULT NULL,
  `raid_pull_time` varchar(255) DEFAULT NULL,
  `raid_total_encounters` int DEFAULT NULL,
  `raid_zone` varchar(255) DEFAULT NULL,
  `raid_leader_id` bigint DEFAULT NULL,
  `raid_requirements_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo9h0sylalo5fh9q5hpgaem1vj` (`raid_leader_id`),
  KEY `FKen9rwd2p2jx4vmy1dtwb3vuxi` (`raid_requirements_id`),
  CONSTRAINT `FKen9rwd2p2jx4vmy1dtwb3vuxi` FOREIGN KEY (`raid_requirements_id`) REFERENCES `raid_requirements` (`id`),
  CONSTRAINT `FKo9h0sylalo5fh9q5hpgaem1vj` FOREIGN KEY (`raid_leader_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raid`
--

LOCK TABLES `raid` WRITE;
/*!40000 ALTER TABLE `raid` DISABLE KEYS */;
INSERT INTO `raid` VALUES (1,'17/01/2023','10 players party','https://i.pinimg.com/564x/65/45/e3/6545e3cb1da17738860096f180421481.jpg','Random','Naxxramas','23:00','21:00',15,'Dragonblight',1,1),(2,'17/01/2023','25 players party','https://i.pinimg.com/564x/fc/63/fb/fc63fbd8898af52e596f9cdc71495cd6.jpg','Random','Naxxramas','23:00','21:00',15,'Dragonblight',2,2),(3,'18/01/2023','25 players party','https://i.pinimg.com/736x/e8/bd/c8/e8bdc88117fb28bf63334a9412838173.jpg','GDKP','The Obsidian Sanctum','23:00','21:00',1,'Black Dragonflight',3,3),(4,'18/01/2023','10 players party','https://i.pinimg.com/564x/a5/cd/5b/a5cd5b826b65395571c990228240c08e.jpg','GDKP','The Obsidian Sanctum','23:00','21:00',1,'Black Dragonflight',4,4),(5,'19/01/2023','10 players party','https://i.pinimg.com/564x/69/bc/50/69bc50996c29d438d241ba2de4abacfe.jpg','GDKP','The Eye of Eternity','23:00','21:00',1,'Borean Tundra',5,5),(6,'19/01/2023','25 players party','https://i.pinimg.com/564x/c6/a3/a5/c6a3a50916ed88c70065b12d757e1f49.jpg','GDKP','The Eye of Eternity','23:00','21:00',1,'Borean Tundra',6,6),(7,'20/01/2023','10 players party','https://i.pinimg.com/736x/2d/da/88/2dda886bf9f779803b89e171cd184964.jpg','Attribution','Naxxramas','18:00','15:00',15,'Dragonblight',7,7),(8,'20/01/2023','25 players party','https://i.pinimg.com/736x/e1/3c/c6/e13cc62fdaa49b362170dae354b9b738.jpg','Attribution','Naxxramas','18:00','15:00',15,'Dragonblight',8,8),(9,'21/01/2023','25 players party','https://i.pinimg.com/736x/3f/a5/8a/3fa58a96a8863c88c3d2636728fc9f14.jpg','GDKP','The Obsidian Sanctum','20:00','18:00',1,'Black Dragonflight',9,9),(10,'21/01/2023','10 players party','https://i.pinimg.com/736x/23/44/95/23449540ee87c98d17631ce47f8666cc.jpg','GDKP','The Obsidian Sanctum','20:00','18:00',1,'Black Dragonflight',10,10),(11,'25/01/2023','10 players party','https://i.pinimg.com/564x/da/eb/e0/daebe0bc3d1e8c223730f7cdbaadfae4.jpg','DKP','The Eye of Eternity','22:00','20:00',1,'Borean Tundra',11,11),(12,'25/01/2023','25 players party','https://i.pinimg.com/736x/2b/33/76/2b3376bedf0179ecd425df4dc3c723a3.jpg','DKP','The Eye of Eternity','22:00','20:00',1,'Borean Tundra',12,12),(13,'26/01/2023','10 players party','https://i.pinimg.com/736x/75/d5/41/75d541c6d05fa113990cb9dab52a86ce.jpg','Random','Naxxramas','20:00','18:00',15,'Dragonblight',13,13),(14,'10/01/2023','25 players party','https://i.pinimg.com/564x/18/7c/06/187c0601d146e1f67ad4c093b44a3062.jpg','Random','Naxxramas','20:00','18:00',15,'Dragonblight',14,14),(15,'11/01/2023','25 players party','https://i.pinimg.com/564x/67/ab/2f/67ab2f19d8d9e403a6ccca538f7df167.jpg','GDKP','The Obsidian Sanctum','20:00','18:00',1,'Black Dragonflight',15,15),(16,'16/01/2023','10 players party','https://i.pinimg.com/564x/3e/09/d5/3e09d51bbd71aee910302404fb7d47e8.jpg','GDKP','The Obsidian Sanctum','20:00','18:00',1,'Black Dragonflight',16,16),(17,'07/01/2023','10 players party','https://i.pinimg.com/736x/d4/13/54/d41354e4c4369fa2ef1b02e3ca2bd09b.jpg','DKP','The Eye of Eternity','22:00','20:00',1,'Borean Tundra',17,17),(18,'28/01/2023','25 players party','https://i.pinimg.com/564x/28/2a/ad/282aadecb08e32e5d7da55707dd883fb.jpg','DKP','The Eye of Eternity','22:00','20:00',1,'Borean Tundra',18,18),(19,'20/01/2023','10 players party','https://i.pinimg.com/564x/b2/96/ff/b296ffd06256cbae71e6393eced00ae5.jpg','Attribution','Naxxramas','18:00','15:00',15,'Dragonblight',19,19),(20,'21/01/2023','25 players party','https://i.pinimg.com/564x/c2/35/1c/c2351c8bea6fdc73418aa7ae17171c13.jpg','Attribution','Naxxramas','18:00','15:00',15,'Dragonblight',20,20),(21,'22/01/2023','25 players party','https://i.pinimg.com/736x/19/dc/8d/19dc8df09ec255b4c04490b7b35ac66d.jpg','GDKP','The Obsidian Sanctum','20:00','18:00',1,'Black Dragonflight',21,21),(22,'21/01/2023','10 players party','https://i.pinimg.com/564x/8d/68/a2/8d68a23a47b5f62775c9efe862ddef84.jpg','GDKP','The Obsidian Sanctum','20:00','18:00',1,'Black Dragonflight',22,22),(23,'22/01/2023','10 players party','https://i.pinimg.com/736x/63/44/32/634432764f0742bb90d690525ce3fd0d.jpg','DKP','The Eye of Eternity','22:00','20:00',1,'Borean Tundra',23,23),(24,'23/01/2023','25 players party','https://i.pinimg.com/564x/58/ab/fd/58abfdd704d834c5c9b417bf54991eb5.jpg','DKP','The Eye of Eternity','22:00','20:00',1,'Borean Tundra',24,24),(25,'14/01/2023','10 players party','https://i.pinimg.com/736x/51/bc/8a/51bc8af6620c18eb2d4861aebc421e9b.jpg','Random','Naxxramas','18:00','15:00',15,'Dragonblight',25,25),(26,'14/01/2023','25 players party','https://i.pinimg.com/564x/e0/5b/4c/e05b4c4355bd896b16897611800a56d8.jpg','Random','Naxxramas','15:00','18:00',15,'Dragonblight',26,26),(27,'15/01/2023','25 players party','https://i.pinimg.com/736x/8a/a7/7f/8aa77f7f9e64e6c0205e866a574be33a.jpg','GDKP','The Obsidian Sanctum','18:00','20:00',1,'Black Dragonflight',27,27),(28,'13/01/2023','10 players party','https://i.pinimg.com/564x/90/59/83/905983ccb5853383233a48046ce4dfac.jpg','GDKP','The Obsidian Sanctum','18:00','20:00',1,'Black Dragonflight',28,28);
/*!40000 ALTER TABLE `raid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raid_requirements`
--

DROP TABLE IF EXISTS `raid_requirements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `raid_requirements` (
  `id` bigint NOT NULL,
  `main_class` varchar(255) DEFAULT NULL,
  `main_role` varchar(255) DEFAULT NULL,
  `main_spec` varchar(255) DEFAULT NULL,
  `secondary_role` varchar(255) DEFAULT NULL,
  `secondary_spec` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raid_requirements`
--

LOCK TABLES `raid_requirements` WRITE;
/*!40000 ALTER TABLE `raid_requirements` DISABLE KEYS */;
INSERT INTO `raid_requirements` VALUES (1,'Warrior','Tank','Protection','Damage','Arms'),(2,'Warrior','Damage','Fury','Tank','Protection'),(3,'Warrior','Damage','Arms','Damage','Fury'),(4,'Paladin','Healer','Holy','Damage','Retribution'),(5,'Paladin','Damage','Retribution','Tank','Protection'),(6,'Paladin','Tank','Protection','Healer','Holy'),(7,'Shaman','Damage','Elemntal','Damage','Enchancement'),(8,'Shaman','Damage','Enchancement','Damage','Elemntal'),(9,'Shaman','Healer','Restoration','Healer','Restoration'),(10,'Druid','Healer','Restoration','Damage','Balance'),(11,'Druid','Damage','Balance','Damage','Balance'),(12,'Druid','Damage','Feral','Tank','Protection'),(13,'Druid','Tank','Protection','Damage','Feral'),(14,'Mage','Damage','Frost','Damage','Fire'),(15,'Mage','Damage','Arcane','Damage','Frost'),(16,'Mage','Damage','Fire','Damage','Arcane'),(17,'Warlock','Damage','Affliction','Damage','Demonology'),(18,'Warlock','Damage','Demonology','Damage','Destruction'),(19,'Warlock','Damage','Destruction','Damage','Affliction'),(20,'Death Knight','Damage','Blood','Damage','Unholy'),(21,'Death Knight','Damage','Unholy','Tank','Frost'),(22,'Death Knight','Tank','Frost','Damage','Blood'),(23,'Hunter','Damage','Survival','Damage','Marksmanship'),(24,'Hunter','Damage','Marksmanship','Damage','Beast Mastery'),(25,'Hunter','Damage','Beast Mastery','Damage','Survival'),(26,'Rogue','Damage','Combat','Damage','Assassination'),(27,'Rogue','Damage','Assassination','Damage','Subtlety'),(28,'Rogue','Damage','Subtlety','Damage','Combat'),(29,'Priest','Damage','Shadow','Healer','Discipline'),(30,'Priest','Healer','Holy','Damage','Shadow'),(31,'Priest','Healer','Discipline','Damage','Shadow');
/*!40000 ALTER TABLE `raid_requirements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'ROLE_USER'),(2,'ROLE_MODERATOR'),(3,'ROLE_ADMIN');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `battle_tag` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `guild_rank` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `profile_picture` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `playable_character_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKl2p4ffcrc6tydd2l48481mtb0` (`playable_character_id`),
  CONSTRAINT `FKl2p4ffcrc6tydd2l48481mtb0` FOREIGN KEY (`playable_character_id`) REFERENCES `playable_character` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Farah#21473','farah@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/originals/67/e0/e0/67e0e017079c973b9e2155717d9f8789.jpg','farah',1),(2,'Hermann#37421','hermann@raiddon.com','Guild Officer','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/564x/eb/11/42/eb114219b71d07e8d855a03f990f21fd.jpg','hermann',2),(3,'Gaia#5648','gaia@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://preview.redd.it/jatzzrjvik331.jpg?width=637&format=pjpg&auto=webp&s=ad3c9f64072211b1546565bc499dc258b9427020','gaia',3),(4,'Valerie#7854','valerie@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://64.media.tumblr.com/91df0cca6e0824560d6f2b669a66b4cd/7ae14143090f045b-24/s1280x1920/dabd506a3e49d6d6e9062e7ab20742246f1f0ece.jpg','valerie',4),(5,'Christophe#85241','christophe@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://external-preview.redd.it/qiytGvkXTqPl42BPSCEz0PAWwqSR_znWg80-IoxVyvU.jpg?width=640&crop=smart&auto=webp&s=fbf9281068d2670429c05254bac2cbe80f4650b2','christophe',5),(6,'Nolwenn#96541','nolwenn@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://pbs.twimg.com/media/ELs7G1gXYAEY5bl?format=jpg&name=4096x4096','nolwenn',6),(7,'Mathew#951753','mathew@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/originals/d5/8b/3a/d58b3acafacfd2615825dfb7bf7e0073.jpg','mathew',7),(8,'Ruby#741963','ruby@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/736x/1d/22/34/1d2234b3a488fe75d415965f9f243cf5--warcraft-art-world-of-warcraft.jpg','ruby',8),(9,'Nala#159632','nala@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/564x/c4/8e/11/c48e11bf49227f4067a5282159cbf932.jpg','nala',9),(10,'Helios#852456','helios@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://64.media.tumblr.com/08b0ba35cf2f22f0aba7b37896b6ecb6/tumblr_priqo8naRb1wt7ek9o1_1280.jpg','helios',10),(11,'Rose#654987','rose@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://images.nightcafe.studio/jobs/vNigshShKCGbeBISwyfI/vNigshShKCGbeBISwyfI--1--nfms0.jpg?tr=w-1600,c-at_max','rose',11),(12,'Dima#654987','dima@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://pbs.twimg.com/media/EXb7SJvX0AE1rer.jpg','dima',12),(13,'Rami#654987','rami@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.etsystatic.com/11882103/r/il/adf56e/1209030097/il_570xN.1209030097_ejfh.jpg','rami',13),(14,'Natacha#654987','natacha@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.redd.it/w3j4l11py3h21.png','natacha',14),(15,'Vincent#654987','vincent@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://cs14.pikabu.ru/post_img/2022/01/15/8/1642253455118960042.webp','vincent',15),(16,'Patrick#654987','patrick@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/originals/64/52/27/645227ee536c237108217d13d5574574.jpg','patrick',16),(17,'Alix#654987','alix@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://pbs.twimg.com/media/Eeg3jZZX0AALHiV.jpg','alix',17),(18,'Safa#654987','safa@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://64.media.tumblr.com/5ea80955067fcf123ce0697c9880f5c9/tumblr_psswry7Iq41wt7ek9o1_1280.jpg','safa',18),(19,'Maxime#654987','maxime@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://preview.redd.it/2fgb8kgxik331.jpg?width=637&format=pjpg&auto=webp&s=d189c646e23e90e91baf1e417094b8a7d4998e8a','maxime',19),(20,'Stephane#654987','stephane@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/736x/f3/d0/69/f3d069b883663d584b723584b468dc52.jpg','stephane',20),(21,'Caroline#654987','caroline@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/originals/a0/05/7f/a0057f1fe2bc6bd36ec5997e216d9364.jpg','caroline',21),(22,'Pierre#654987','pierre@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://pbs.twimg.com/media/E-giIMoWEAQNvew?format=jpg&name=4096x4096','pierre',22),(23,'Rola#654987','rola@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/736x/ea/2a/85/ea2a85d29fd6a08cf2ff78a452d01946.jpg','rola',23),(24,'David#654987','david@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/564x/5a/f9/f6/5af9f622dff199933dc46fa7a90dcbf5.jpg','david',24),(25,'Camille#654987','camille@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/564x/a4/0b/9e/a40b9e020f2f4769ccbdd04b85c3a991.jpg','camille',25),(26,'Anthony#654987','anthony@raiddon.com','Guild Member','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/564x/03/3d/b1/033db12322e561268ece658c38d93f06.jpg','anthony',26),(27,'Jonathan#654987','jonathan@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/564x/b8/b1/c4/b8b1c48a747ae12cf363e709fe3a3c52.jpg','jonathan',27),(28,'Romuald#654987','romuald@raiddon.com','Guild Master','$2a$10$MslWfF9gNxR/ZQ2.oQGTmu5r8VOBckr9.5Ws6B6vaRVAqEFv8GgNC','https://i.pinimg.com/736x/00/2c/c9/002cc9bed39efcfc8cc2a2c2a995ffdb.jpg','romuald',28);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `users_roles` (
  `user_id` bigint NOT NULL,
  `roles_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`roles_id`),
  KEY `FKoq2ymhpm0kretp06snvc5mn4f` (`roles_id`),
  CONSTRAINT `FK7ursf5mr7s447yoobqh7q3x1v` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `FKoq2ymhpm0kretp06snvc5mn4f` FOREIGN KEY (`roles_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),(8,1),(9,1),(10,1),(11,1),(12,1),(13,1),(14,1),(15,1),(16,1),(17,1),(18,1),(19,1),(20,1),(21,1),(22,1),(23,1),(24,1),(25,1),(26,1),(27,1),(28,1);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-09 21:10:48
