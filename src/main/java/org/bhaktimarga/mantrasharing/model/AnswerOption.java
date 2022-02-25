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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @Basic
    @Column(name = "code", nullable = true, length = 64)
    private String code;

}
