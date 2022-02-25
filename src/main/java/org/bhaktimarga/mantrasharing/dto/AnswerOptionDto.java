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
    private UUID questionId;
    private String code;
    private String text;
    private String additionalText;

}
