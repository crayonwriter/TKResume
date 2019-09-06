package com.crayonwriter.newresume;

public class Experience {
    private String name;
    private String description;

    public static final Experience[] experiences = {
            new Experience("Proofreader", "Fannie Mae: Proofread documents quickly and accurately using company style guide and extensive AP style knowledge, while working remotely."),
            new Experience("Proofreader", "Synchrony Bank: Proofread terms and conditions for mutiple Synchrony Bank clients"),

    };

    private Experience(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
