package javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.animalMicrochip;

// Object CLass
public class Microchip {
    // Attributes
    private String microchip_id;
    private String animal_id;
    private String manufacturer;
    private String implant_date;
    private String implant_location;

    public Microchip(String microchip_id, String animal_id, String manufacturer, String implant_date, String implant_location) {
        this.microchip_id = microchip_id;
        this.animal_id = animal_id;
        this.manufacturer = manufacturer;
        this.implant_date = implant_date;
        this.implant_location = implant_location;
    }

    public String getMicrochip_id() {
        return microchip_id;
    }

    public void setMicrochip_id(String microchip_id) {
        this.microchip_id = microchip_id;
    }

    public String getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(String animal_id) {
        this.animal_id = animal_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getImplant_date() {
        return implant_date;
    }

    public void setImplant_date(String implant_date) {
        this.implant_date = implant_date;
    }

    public String getImplant_location() {
        return implant_location;
    }

    public void setImplant_location(String implant_location) {
        this.implant_location = implant_location;
    }
}
