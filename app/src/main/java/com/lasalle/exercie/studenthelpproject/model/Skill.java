package com.lasalle.exercie.studenthelpproject.model;

import androidx.annotation.NonNull;

public class Skill {



    private String skillId;
    private String description;
    private String skillName;

    public Skill() {

    }

    public Skill(String skillId, String description, String skillName) {
        this.skillId = skillId;
        this.description = description;
        this.skillName = skillName;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillId='" + skillId + '\'' +
                ", description='" + description + '\'' +
                ", skillName='" + skillName + '\'' +
                '}';
    }
}
