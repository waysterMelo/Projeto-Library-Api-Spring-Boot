package com.waysterdemelo.LibraryApi.api.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanDto {

    private Long id;
    private String isbn;
    private String customer;
    private String email;
    private BookDto bookDto;

}
