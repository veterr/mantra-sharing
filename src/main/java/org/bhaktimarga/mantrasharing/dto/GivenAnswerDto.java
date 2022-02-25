package org.bhaktimarga.mantrasharing.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GivenAnswerDto {

    private UUID id;
    private UUID answerOptionId;
    private UUID userId;
    private String text;
    private String additionalText;

}
