package com.crayonwriter.newresume;

public class Experience {
    private String name;
    private String description;
    private String description2;
    private String description3;

    public static final Experience[] experiences = {
            new Experience("Proofreader", "Fannie Mae", "Made word choice suggestions for major marketing materials", "Proofread a variety of B2B documents using AP and company style guidelines"),

            new Experience("Proofreader", "Synchrony Bank", "Proofread newly updated terms and conditions for various bank clients", "Used detail-oriented skills to ensure accuracy of interest rates" ),

            new Experience("Proofreader", "Creative Circle", "Worked expertly under quick deadlines ", "Excelled at juggling multiple assignments" ),

            new Experience("Proofreader", "Sapient Nitro", "Proofread and copyedited annual reports Insights 2015 & Insights 2016", "Copyedited infographics and articles" ),

            new Experience("Copywriter/editor", "Girl Scouts of Greater Atlanta", "Wrote and edited content for annual report", " " ),

            new Experience("Grant panel review writer/editor", "Centers for Disease Control", "Wrote summaries and edited grant panel content for submission to the CDC ", "Took notes during science-oriented grant review panels" )

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
