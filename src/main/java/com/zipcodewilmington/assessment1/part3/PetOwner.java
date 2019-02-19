package com.zipcodewilmington.assessment1.part3;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] petList;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.petList = pets;
            if (petList == null) {
                 this.petList = new Pet[0];} else {
                 for (Pet p : pets) {
                p.setOwner(this);
            }
            }
        }
//this.name = name;
//List<Pet> = Arrays.asList(pets);
//this.petList = new ArrayList<>(Arrays.asList(pets));

/**
 * @param pet pet to be added to the composite collection of Pets
 */
public void addPet(Pet pet){
        if(petList.length==1&&petList[0]==null){
        petList[0]=pet;
        }else{
        petList=Arrays.copyOf(petList,petList.length+1);
        petList[petList.length-1]=pet;
        }
        }
//petList.add(pet);

/**
 * @param pet pet to be removed from the composite collection Pets
 */
public void removePet(Pet pet){
        int i=0;
        for(Pet animal:petList){
        if(animal.equals(pet)){
        petList[i]=null;
        }
        i++;
        }
        }

/**
 * @param pet pet to evaluate ownership of
 * @return true if I own this pet
 */
public Boolean isOwnerOf(Pet pet){
        for(Pet thisPet:petList){
        if(!thisPet.equals(pet)){
        return false;
        }
        }
        return true;
        }

/**
 * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
 */
public Integer getYoungetPetAge(){
        Pet youngest=petList[0];
        for(Pet thisPet:petList){
        if(thisPet.getAge()<youngest.getAge()){
        youngest=thisPet;
        }
        }
        return youngest.getAge();
        }

/**
 * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
 */
public Integer getOldestPetAge(){
        Pet oldest=petList[0];
        for(Pet thisPet:petList){
        if(thisPet.getAge()>oldest.getAge()){
        oldest=thisPet;
        }
        }
        return oldest.getAge();
        }

/**
 * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
 */
public Float getAveragePetAge(){
        Float ageTotal=0.0F;
        for(Pet thisPet:petList){
        ageTotal+=thisPet.getAge();
        }
        return ageTotal/getNumberOfPets();
        }

/**
 * @return the number of Pet objects stored in this class
 */
public Integer getNumberOfPets(){
        return petList.length;
        }

/**
 * @return the name property of the Pet
 */
public String getName(){
        return name;
        }

/**
 * @return array representation of animals owned by this PetOwner
 */
public Pet[]getPets(){
        return petList;
        }
        }
