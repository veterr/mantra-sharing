package org.bhaktimarga.mantrasharing.mappers;

import org.bhaktimarga.mantrasharing.dto.MantraUserDto;
import org.bhaktimarga.mantrasharing.model.MantraUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MantraUserMapper {

    MantraUserDto toMantraUserDto(MantraUser user);

    MantraUser fromMantraUserDto(MantraUserDto userDto);

}
