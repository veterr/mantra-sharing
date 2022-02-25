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
@Table(name = "given_answer")
public class GivenAnswer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;
    @Basic
    @Column(name = "answer_option_id", nullable = false)
    private UUID answerOptionId;
    @Basic
    @Column(name = "user_id", nullable = false)
    private UUID userId;
    @Basic
    @Column(name = "text", nullable = true, length = 512)
    private String text;
    @Basic
    @Column(name = "additional_text", nullable = true, length = 512)
    private String additionalText;

}
