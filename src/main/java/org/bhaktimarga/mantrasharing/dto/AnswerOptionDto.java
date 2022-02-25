package org.bhaktimarga.mantrasharing.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AnswerOptionDto {

    private UUID id;
    private QuestionDto question;
    private String code;
    private String text;
    private String additionalText;

}
