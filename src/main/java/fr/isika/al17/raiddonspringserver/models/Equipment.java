package fr.isika.al17.raiddonspringserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Equipment {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Items headItem;
    @OneToOne
    private Items shoulderItem;
    @OneToOne
    private Items backItem;
    @OneToOne
    private Items chestItem;
    @OneToOne
    private Items wristItem;
    @OneToOne
    private Items handItem;
    @OneToOne
    private Items waistItem;
    @OneToOne
    private Items legsItem;
    @OneToOne
    private Items feetItem;
    @OneToOne
    private Items neckItem;
    @OneToOne
    private Items firstTingItem;
    @OneToOne
    private Items secondRingItem;
    @OneToOne
    private Items firstTrinketItem;
    @OneToOne
    private Items secondTrinketItem;
    @OneToOne
    private Items mainHandItem;
    @OneToOne
    private Items offHandItem;
    @OneToOne
    private Items relicItem;

    public Equipment() {
	super();
    }

    public Equipment(Long id, Items headItem, Items shoulderItem, Items backItem, Items chestItem, Items wristItem,
	    Items handItem, Items waistItem, Items legsItem, Items feetItem, Items neckItem, Items firstTingItem,
	    Items secondRingItem, Items firstTrinketItem, Items secondTrinketItem, Items mainHandItem,
	    Items offHandItem, Items relicItem) {
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
	this.firstTingItem = firstTingItem;
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

    public Items getHeadItem() {
	return headItem;
    }

    public void setHeadItem(Items headItem) {
	this.headItem = headItem;
    }

    public Items getShoulderItem() {
	return shoulderItem;
    }

    public void setShoulderItem(Items shoulderItem) {
	this.shoulderItem = shoulderItem;
    }

    public Items getBackItem() {
	return backItem;
    }

    public void setBackItem(Items backItem) {
	this.backItem = backItem;
    }

    public Items getChestItem() {
	return chestItem;
    }

    public void setChestItem(Items chestItem) {
	this.chestItem = chestItem;
    }

    public Items getWristItem() {
	return wristItem;
    }

    public void setWristItem(Items wristItem) {
	this.wristItem = wristItem;
    }

    public Items getHandItem() {
	return handItem;
    }

    public void setHandItem(Items handItem) {
	this.handItem = handItem;
    }

    public Items getWaistItem() {
	return waistItem;
    }

    public void setWaistItem(Items waistItem) {
	this.waistItem = waistItem;
    }

    public Items getLegsItem() {
	return legsItem;
    }

    public void setLegsItem(Items legsItem) {
	this.legsItem = legsItem;
    }

    public Items getFeetItem() {
	return feetItem;
    }

    public void setFeetItem(Items feetItem) {
	this.feetItem = feetItem;
    }

    public Items getNeckItem() {
	return neckItem;
    }

    public void setNeckItem(Items neckItem) {
	this.neckItem = neckItem;
    }

    public Items getFirstTingItem() {
	return firstTingItem;
    }

    public void setFirstTingItem(Items firstTingItem) {
	this.firstTingItem = firstTingItem;
    }

    public Items getSecondRingItem() {
	return secondRingItem;
    }

    public void setSecondRingItem(Items secondRingItem) {
	this.secondRingItem = secondRingItem;
    }

    public Items getFirstTrinketItem() {
	return firstTrinketItem;
    }

    public void setFirstTrinketItem(Items firstTrinketItem) {
	this.firstTrinketItem = firstTrinketItem;
    }

    public Items getSecondTrinketItem() {
	return secondTrinketItem;
    }

    public void setSecondTrinketItem(Items secondTrinketItem) {
	this.secondTrinketItem = secondTrinketItem;
    }

    public Items getMainHandItem() {
	return mainHandItem;
    }

    public void setMainHandItem(Items mainHandItem) {
	this.mainHandItem = mainHandItem;
    }

    public Items getOffHandItem() {
	return offHandItem;
    }

    public void setOffHandItem(Items offHandItem) {
	this.offHandItem = offHandItem;
    }

    public Items getRelicItem() {
	return relicItem;
    }

    public void setRelicItem(Items relicItem) {
	this.relicItem = relicItem;
    }

}
