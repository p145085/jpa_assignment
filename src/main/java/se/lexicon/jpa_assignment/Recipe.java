package se.lexicon.jpa_assignment;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.util.Collection;
import java.util.List;

import static se.lexicon.jpa_assignment.EntityConstants.GENERATOR;
import static se.lexicon.jpa_assignment.EntityConstants.UUID_GENERATOR;

public class Recipe {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private int id;

    @Column(name = "recipeName")
    private String recipeName;

    private List<RecipeIngredient> recipeIngredientsList;

    @Column(name = "recipeInstruction")
    private RecipeInstruction recipeInstruction;

    private Collection<RecipeCategory> recipeCategoryCollection;
}
