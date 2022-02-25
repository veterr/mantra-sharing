package org.bhaktimarga.mantrasharing.dto;

import lombok.*;
import org.bhaktimarga.mantrasharing.model.AnswerOption;
import org.bhaktimarga.mantrasharing.model.MantraUser;

import java.util.UUID;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GivenAnswerDto {

    private UUID id;
    private AnswerOptionDto answerOption;
    private MantraUserDto user;
    private String text;
    private String additionalText;

}
