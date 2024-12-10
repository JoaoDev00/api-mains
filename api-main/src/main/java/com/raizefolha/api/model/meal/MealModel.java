package com.raizefolha.api.model.meal;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Table(name = "pratos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
// @EqualsAndHashCode(of = "id")
public class MealModel {
    
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;

    private String nameMeal;
    private Double price;
    private String description;

    public MealModel (RegisterMealData data) {

        this.nameMeal = data.name();
        this.price = data.price();
        this.description = data.description();

    }

    public void updateMeal (UpdateMealData data) {

        if (data.price() != null){
            this.price = data.price();
        }

        if (data.description() != null) {
            this.description = data.description();
        }

    }

}
