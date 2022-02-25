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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_option_id")
    private AnswerOption answerOption;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private MantraUser user;

    @Basic
    @Column(name = "text", nullable = true, length = 512)
    private String text;

}
