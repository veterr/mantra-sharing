package org.bhaktimarga.mantrasharing.mappers;

import org.bhaktimarga.mantrasharing.dto.AnswerOptionDto;
import org.bhaktimarga.mantrasharing.model.AnswerOption;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {QuestionMapper.class})
public interface AnswerOptionMapper {

    AnswerOptionDto QuestionToQuestionDto (AnswerOption option);

    AnswerOption QuestionDtoToQuestion (AnswerOptionDto optionDto);

    List<AnswerOptionDto> toAnswerOptionDtoAsList (List<AnswerOption> options);
}
