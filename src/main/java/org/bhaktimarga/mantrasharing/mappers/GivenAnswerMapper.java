package org.bhaktimarga.mantrasharing.mappers;

import org.bhaktimarga.mantrasharing.dto.GivenAnswerDto;
import org.bhaktimarga.mantrasharing.model.GivenAnswer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AnswerOptionMapper.class, MantraUserMapper.class})
public interface GivenAnswerMapper {

    GivenAnswerDto toGivenAnswerDto(GivenAnswer answer);

    GivenAnswer fromGivenAnswerDto(GivenAnswerDto answerDto);

}
