package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    // To allow users to put in more the 265 chars for large object
    @Lob
    private String recipeNotes;
}
