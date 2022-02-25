package org.bhaktimarga.mantrasharing.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "question")
public class Question {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;
    @Basic
    @Column(name = "code", nullable = true, length = 64)
    private String code;
    @Basic
    @Column(name = "text", nullable = true, length = 512)
    private String text;
    @Basic
    @Column(name = "is_multyanswer", nullable = true)
    private Boolean isMultyanswer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    List<AnswerOption> answers;
}
