package com.wli.model.cms.project;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProjectEntity {

    private String name;

    private Integer id;

    private String updUser;

    private String creUser;

    private long creTime;

    private long updTime;


}
