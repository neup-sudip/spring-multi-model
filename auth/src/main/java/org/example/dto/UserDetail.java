package org.example.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserDetail {
    private String username;
    private String userId;
    private String authorities;
}