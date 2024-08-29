package com.example.Esercizio_Get_Post;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {
    @Operation(summary = "Get the name provided by user", description = "This endpoint returns the name.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Name retrieved successfully!"),
            @ApiResponse(responseCode = "400", description = "Invalid request body")
    })
    @GetMapping("/name")
    public String getName(@Parameter(description = "Name to be returned") @RequestParam String name){
        return name;
    }

    @Operation(summary = "Reversed name", description = "This endpoint return a reverse name.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Name reversed successfully!"),
            @ApiResponse(responseCode = "400", description = "Invalid request body")
    })
    @PostMapping("/name/reverse")
    public String reverseName(@Parameter(description = "Name to be reversed") @RequestBody String name){
        StringBuilder reverseName = new StringBuilder(name);
        return reverseName.reverse().toString();
    }
}
