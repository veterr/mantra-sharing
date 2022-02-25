package org.bhaktimarga.mantrasharing.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answer_option")
public class AnswerOption {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;
    @Basic
    @Column(name = "question_id", nullable = false)
    private UUID questionId;
    @Basic
    @Column(name = "code", nullable = true, length = 64)
    private String code;
    @Basic
    @Column(name = "text", nullable = true, length = 512)
    private String text;
    @Basic
    @Column(name = "additional_text", nullable = true, length = 512)
    private String additionalText;

}
