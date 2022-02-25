package org.bhaktimarga.mantrasharing.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AskedQuestionDto {

    private UUID id;
    private UUID questionId;
    private UUID userId;
    private String text;

}
