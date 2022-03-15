package se.lexicon.jpa_assignment;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import static se.lexicon.jpa_assignment.EntityConstants.GENERATOR;
import static se.lexicon.jpa_assignment.EntityConstants.UUID_GENERATOR;

public class RecipeIngredient {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private String id;

    @Column(name = "ingredient")
    private Ingredient ingredient;

    @Column(name = "amount")
    private double amount;

    @Column(name = "measurement")
    private Measurement measurement;

    @Column(name = "recipe")
    private Recipe recipe;
}
