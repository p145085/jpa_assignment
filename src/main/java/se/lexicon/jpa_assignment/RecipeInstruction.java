package se.lexicon.jpa_assignment;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;

import static se.lexicon.jpa_assignment.EntityConstants.GENERATOR;
import static se.lexicon.jpa_assignment.EntityConstants.UUID_GENERATOR;

public class RecipeInstruction {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private String id;

    @Column(name = "recipeInstructions")
    private String recipeInstructions;
}
