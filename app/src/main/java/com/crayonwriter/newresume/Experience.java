package com.crayonwriter.newresume;

public class Experience {
    private String name;
    private String description;
    private String description2;
    private String description3;

    public static final Experience[] experiences = {
            new Experience("Proofreader", "Fannie Mae: Proofread documents quickly and accurately using company style guide and extensive AP style knowledge, while working remotely.", "Made word choice suggestions for major marketing materials", "Proofread a variety of B2B documents using AP and company style guidelines"),

            new Experience("Proofreader", "Synchrony Bank: Proofread newly updated terms and conditions for various bank clients", "Used detail-oriented skills to ensure accuracy of interest rates", "" )

    };

    private Experience(String name, String description, String description2, String description3) {
        this.name = name;
        this.description = description;
        this.description2 = description2;
        this.description3 = description3;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDescription2() {
        return description2;
    }

    public String getDescription3() {
        return description3;
    }
}
