package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Items {

    @Id
    @GeneratedValue
    private Long id;

    private String itemName;
    private Long itemLevel;
    private String itemIcon;
    private String itemSlot;
    private String itemArmorType;
    private String itemSource;
    private String itemDropZone;
    private String itemPriorityClass;
    private String itemPrioritySpec;
    private Long armor;
    private Long agility;
    private Long stamina;
    private Long intellect;
    private Long strength;
    private Long spirit;
    private Long hitRating;
    private Long hasterating;
    private Long criticalStrike;
    private Long spellPower;
    private Long attackPower;
    private Long defense;

    public Items() {
	super();
    }

    public Items(Long id, String itemName, Long itemLevel, String itemIcon, String itemSlot, String itemArmorType,
	    String itemSource, String itemDropZone, String itemPriorityClass, String itemPrioritySpec, Long armor,
	    Long agility, Long stamina, Long intellect, Long strength, Long spirit, Long hitRating, Long hasterating,
	    Long criticalStrike, Long spellPower, Long attackPower, Long defense) {
	super();
	this.id = id;
	this.itemName = itemName;
	this.itemLevel = itemLevel;
	this.itemIcon = itemIcon;
	this.itemSlot = itemSlot;
	this.itemArmorType = itemArmorType;
	this.itemSource = itemSource;
	this.itemDropZone = itemDropZone;
	this.itemPriorityClass = itemPriorityClass;
	this.itemPrioritySpec = itemPrioritySpec;
	this.armor = armor;
	this.agility = agility;
	this.stamina = stamina;
	this.intellect = intellect;
	this.strength = strength;
	this.spirit = spirit;
	this.hitRating = hitRating;
	this.hasterating = hasterating;
	this.criticalStrike = criticalStrike;
	this.spellPower = spellPower;
	this.attackPower = attackPower;
	this.defense = defense;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getItemName() {
	return itemName;
    }

    public void setItemName(String itemName) {
	this.itemName = itemName;
    }

    public Long getItemLevel() {
	return itemLevel;
    }

    public void setItemLevel(Long itemLevel) {
	this.itemLevel = itemLevel;
    }

    public String getItemIcon() {
	return itemIcon;
    }

    public void setItemIcon(String itemIcon) {
	this.itemIcon = itemIcon;
    }

    public String getItemSlot() {
	return itemSlot;
    }

    public void setItemSlot(String itemSlot) {
	this.itemSlot = itemSlot;
    }

    public String getItemArmorType() {
	return itemArmorType;
    }

    public void setItemArmorType(String itemArmorType) {
	this.itemArmorType = itemArmorType;
    }

    public String getItemSource() {
	return itemSource;
    }

    public void setItemSource(String itemSource) {
	this.itemSource = itemSource;
    }

    public String getItemDropZone() {
	return itemDropZone;
    }

    public void setItemDropZone(String itemDropZone) {
	this.itemDropZone = itemDropZone;
    }

    public String getItemPriorityClass() {
	return itemPriorityClass;
    }

    public void setItemPriorityClass(String itemPriorityClass) {
	this.itemPriorityClass = itemPriorityClass;
    }

    public String getItemPrioritySpec() {
	return itemPrioritySpec;
    }

    public void setItemPrioritySpec(String itemPrioritySpec) {
	this.itemPrioritySpec = itemPrioritySpec;
    }

    public Long getArmor() {
	return armor;
    }

    public void setArmor(Long armor) {
	this.armor = armor;
    }

    public Long getAgility() {
	return agility;
    }

    public void setAgility(Long agility) {
	this.agility = agility;
    }

    public Long getStamina() {
	return stamina;
    }

    public void setStamina(Long stamina) {
	this.stamina = stamina;
    }

    public Long getIntellect() {
	return intellect;
    }

    public void setIntellect(Long intellect) {
	this.intellect = intellect;
    }

    public Long getStrength() {
	return strength;
    }

    public void setStrength(Long strength) {
	this.strength = strength;
    }

    public Long getSpirit() {
	return spirit;
    }

    public void setSpirit(Long spirit) {
	this.spirit = spirit;
    }

    public Long getHitRating() {
	return hitRating;
    }

    public void setHitRating(Long hitRating) {
	this.hitRating = hitRating;
    }

    public Long getHasterating() {
	return hasterating;
    }

    public void setHasterating(Long hasterating) {
	this.hasterating = hasterating;
    }

    public Long getCriticalStrike() {
	return criticalStrike;
    }

    public void setCriticalStrike(Long criticalStrike) {
	this.criticalStrike = criticalStrike;
    }

    public Long getSpellPower() {
	return spellPower;
    }

    public void setSpellPower(Long spellPower) {
	this.spellPower = spellPower;
    }

    public Long getAttackPower() {
	return attackPower;
    }

    public void setAttackPower(Long attackPower) {
	this.attackPower = attackPower;
    }

    public Long getDefense() {
	return defense;
    }

    public void setDefense(Long defense) {
	this.defense = defense;
    }

}
