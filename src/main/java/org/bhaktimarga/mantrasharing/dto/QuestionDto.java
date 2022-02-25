package org.bhaktimarga.mantrasharing.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {

    private UUID id;
    private String code;
    private String text;
    private Boolean isMultyanswer;

}
