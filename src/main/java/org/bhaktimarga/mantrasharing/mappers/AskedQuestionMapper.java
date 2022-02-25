package org.bhaktimarga.mantrasharing.mappers;

import org.bhaktimarga.mantrasharing.dto.AskedQuestionDto;
import org.bhaktimarga.mantrasharing.model.AskedQuestion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {QuestionMapper.class, MantraUserMapper.class})
public interface AskedQuestionMapper {

    AskedQuestionDto toAskedQuestionDto(AskedQuestion question);

    AskedQuestion fromAskedQuestionDto(AskedQuestionDto questionDto);

}
