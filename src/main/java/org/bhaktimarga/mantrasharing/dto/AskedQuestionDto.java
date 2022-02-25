package org.bhaktimarga.mantrasharing.dto;

import lombok.*;
import org.bhaktimarga.mantrasharing.model.MantraUser;
import org.bhaktimarga.mantrasharing.model.Question;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AskedQuestionDto {

    private UUID id;
    private QuestionDto question;
    private MantraUserDto user;
    private String text;

}
