package org.bhaktimarga.mantrasharing.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MantraUserDto {

    private UUID id;
    private Integer chatId;
    private String name;

}
