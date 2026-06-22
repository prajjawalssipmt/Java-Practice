package Comparator.Developer;

public class Developer {
    private String name;
    private int experienceYears;

    public Developer(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() { return name; }
    public int getExperienceYears() { return experienceYears; }

    @Override
    public String toString() {
        return name + " (" + experienceYears + " yrs)";
    }
}
