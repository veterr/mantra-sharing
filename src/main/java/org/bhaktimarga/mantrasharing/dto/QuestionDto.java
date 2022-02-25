package org.bhaktimarga.mantrasharing.dto;

import lombok.*;
import org.bhaktimarga.mantrasharing.model.AnswerOption;

import java.util.List;
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
    private List<AnswerOptionDto> answers;
}
