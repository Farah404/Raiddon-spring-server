package fr.isika.al17.raiddonspringserver.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import fr.isika.al17.raiddonspringserver.models.Items;

public class CSVHelper {
    public static String TYPE = "text/csv";
    static String[] HEADERs = { "id", "item_name","item_level", "item_icon", "item_slot", "item_armor", "item_source",
	    "item_drop_zone", "item_priority_class", "item_priority_spec", "armor", "agility", "stamina", "intellect",
	    "strength", "spirit", "hit", "haste", "critical", "spell_power", "attack_power", "defense" };

    public static boolean hasCSVFormat(MultipartFile file) {

	if (!TYPE.equals(file.getContentType())) {
	    return false;
	}

	return true;
    }

    public static List<Items> csvToItems(InputStream is) {
	    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        CSVParser csvParser = new CSVParser(fileReader,
	            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

	      List<Items> items = new ArrayList<Items>();

	      Iterable<CSVRecord> csvRecords = csvParser.getRecords();

	      for (CSVRecord csvRecord : csvRecords) {
		  Items item = new Items(
			  Long.parseLong(csvRecord.get("id")),
			  csvRecord.get("item_name"),
			  Long.parseLong(csvRecord.get("item_level")),
			  csvRecord.get("item_icon"),
			  csvRecord.get("item_slot"),
			  csvRecord.get("item_armor_type"),
			  csvRecord.get("item_source"),
			  csvRecord.get("item_drop_zone"),
			  csvRecord.get("item_priority_class"),
			  csvRecord.get("item_priority_spec"),
			  Long.parseLong(csvRecord.get("armor")),
			  Long.parseLong(csvRecord.get("agility")),
			  Long.parseLong(csvRecord.get("stamina")),
			  Long.parseLong(csvRecord.get("intellect")),
			  Long.parseLong(csvRecord.get("strength")),
			  Long.parseLong(csvRecord.get("spirit")),
			  Long.parseLong(csvRecord.get("hit")),
			  Long.parseLong(csvRecord.get("haste")),
			  Long.parseLong(csvRecord.get("critical")),
			  Long.parseLong(csvRecord.get("spell_power")),
			  Long.parseLong(csvRecord.get("attack_power")),
			  Long.parseLong(csvRecord.get("defense"))
	            );

	            items.add(item);
	      }

	      return items;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
	    }
	  }

}