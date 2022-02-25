package org.bhaktimarga.mantrasharing.mappers;

import org.bhaktimarga.mantrasharing.dto.QuestionDto;
import org.bhaktimarga.mantrasharing.model.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AnswerOptionMapper.class})
public interface QuestionMapper {

    QuestionDto toQuestionDto(Question question);

    Question fromQuestionDto(QuestionDto questionDto);

    List<QuestionDto> toQuestionDtoAsList (List<Question> questions);
}
