package se.lexicon.jpa_assignment;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.util.Collection;
import java.util.List;

import static se.lexicon.jpa_assignment.EntityConstants.GENERATOR;
import static se.lexicon.jpa_assignment.EntityConstants.UUID_GENERATOR;

public class RecipeCategory {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private int id;

    @Column(name = "category")
    private String category;

    private List<RecipeCategory> collection;

}
