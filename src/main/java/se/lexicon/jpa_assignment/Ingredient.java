package se.lexicon.jpa_assignment;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import static se.lexicon.jpa_assignment.EntityConstants.GENERATOR;
import static se.lexicon.jpa_assignment.EntityConstants.UUID_GENERATOR;

public class Ingredient {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    private int ID;

    @Column(name = "ingredient")
    private String ingredient;
}
