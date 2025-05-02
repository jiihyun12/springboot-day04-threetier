package com.app.threetier.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StudentVO {
   private Long id;
   private Integer kor;
   private Integer eng;
   private Integer math;
   private Integer total;
   private double avg;
}
