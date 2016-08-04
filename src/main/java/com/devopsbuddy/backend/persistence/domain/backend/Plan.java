package com.devopsbuddy.backend.persistence.domain.backend;

import com.devopsbuddy.enums.PlansEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lede on 8/4/16.
 */

@Entity
public class Plan implements Serializable {

    private static final long serialVersionUID = 7640062836482955705L;

    @Id
    private int id;

    private String name;

    /** Default constructor. */
    public Plan() {

    }

    public Plan(PlansEnum plansEnum) {
        this.id = plansEnum.getId();
        this.name = plansEnum.getPlanName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plan plan = (Plan) o;

        return id == plan.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

}
