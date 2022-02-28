package com.akif.appsiyonclone.features.common;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Audit {
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String createdBy;
    private String modifiedBy;
}
