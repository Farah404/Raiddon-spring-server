package fr.isika.al17.raiddonspringserver.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipment implements Serializable {
    private static final long serialVersionUID = 1905122041950251207L;

    @Id
    @GeneratedValue
    private Long id;

    private String headItem;
    private String shoulderItem;
    private String backItem;
    private String chestItem;
    private String wristItem;
    private String handItem;
    private String waistItem;
    private String legsItem;
    private String feetItem;
    private String neckItem;
    private String firstRingItem;
    private String secondRingItem;
    private String firstTrinketItem;
    private String secondTrinketItem;
    private String mainHandItem;
    private String offHandItem;
    private String relicItem;

    public Equipment() {
	super();
    }

    public Equipment(Long id, String headItem, String shoulderItem, String backItem, String chestItem, String wristItem,
	    String handItem, String waistItem, String legsItem, String feetItem, String neckItem, String firstRingItem,
	    String secondRingItem, String firstTrinketItem, String secondTrinketItem, String mainHandItem,
	    String offHandItem, String relicItem) {
	super();
	this.id = id;
	this.headItem = headItem;
	this.shoulderItem = shoulderItem;
	this.backItem = backItem;
	this.chestItem = chestItem;
	this.wristItem = wristItem;
	this.handItem = handItem;
	this.waistItem = waistItem;
	this.legsItem = legsItem;
	this.feetItem = feetItem;
	this.neckItem = neckItem;
	this.firstRingItem = firstRingItem;
	this.secondRingItem = secondRingItem;
	this.firstTrinketItem = firstTrinketItem;
	this.secondTrinketItem = secondTrinketItem;
	this.mainHandItem = mainHandItem;
	this.offHandItem = offHandItem;
	this.relicItem = relicItem;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getHeadItem() {
	return headItem;
    }

    public void setHeadItem(String headItem) {
	this.headItem = headItem;
    }

    public String getShoulderItem() {
	return shoulderItem;
    }

    public void setShoulderItem(String shoulderItem) {
	this.shoulderItem = shoulderItem;
    }

    public String getBackItem() {
	return backItem;
    }

    public void setBackItem(String backItem) {
	this.backItem = backItem;
    }

    public String getChestItem() {
	return chestItem;
    }

    public void setChestItem(String chestItem) {
	this.chestItem = chestItem;
    }

    public String getWristItem() {
	return wristItem;
    }

    public void setWristItem(String wristItem) {
	this.wristItem = wristItem;
    }

    public String getHandItem() {
	return handItem;
    }

    public void setHandItem(String handItem) {
	this.handItem = handItem;
    }

    public String getWaistItem() {
	return waistItem;
    }

    public void setWaistItem(String waistItem) {
	this.waistItem = waistItem;
    }

    public String getLegsItem() {
	return legsItem;
    }

    public void setLegsItem(String legsItem) {
	this.legsItem = legsItem;
    }

    public String getFeetItem() {
	return feetItem;
    }

    public void setFeetItem(String feetItem) {
	this.feetItem = feetItem;
    }

    public String getNeckItem() {
	return neckItem;
    }

    public void setNeckItem(String neckItem) {
	this.neckItem = neckItem;
    }

    public String getFirstRingItem() {
	return firstRingItem;
    }

    public void setFirstTingItem(String firstTingItem) {
	this.firstRingItem = firstTingItem;
    }

    public String getSecondRingItem() {
	return secondRingItem;
    }

    public void setSecondRingItem(String secondRingItem) {
	this.secondRingItem = secondRingItem;
    }

    public String getFirstTrinketItem() {
	return firstTrinketItem;
    }

    public void setFirstTrinketItem(String firstTrinketItem) {
	this.firstTrinketItem = firstTrinketItem;
    }

    public String getSecondTrinketItem() {
	return secondTrinketItem;
    }

    public void setSecondTrinketItem(String secondTrinketItem) {
	this.secondTrinketItem = secondTrinketItem;
    }

    public String getMainHandItem() {
	return mainHandItem;
    }

    public void setMainHandItem(String mainHandItem) {
	this.mainHandItem = mainHandItem;
    }

    public String getOffHandItem() {
	return offHandItem;
    }

    public void setOffHandItem(String offHandItem) {
	this.offHandItem = offHandItem;
    }

    public String getRelicItem() {
	return relicItem;
    }

    public void setRelicItem(String relicItem) {
	this.relicItem = relicItem;
    }

}
