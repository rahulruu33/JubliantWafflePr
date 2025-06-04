package com.springboot.GameOfThrones.restAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {
    private List<Character> characters = new ArrayList<>();
    public CharacterController() {
        // Add some characters to the list
        characters.add(new Character(1L, "Jon Snow", "Stark"));
        characters.add(new Character(3L, "Ned Stark", "Stark"));
        characters.add(new Character(2L, "Daenerys Targaryen", "Targaryen"));
    }

    @GetMapping("/house/{houseName}")
    public ResponseEntity<Character> getCharacterByHouse(@PathVariable String houseName) {
        Character character = characters.stream()
                .filter(c -> c.getHouse().equalsIgnoreCase(houseName))
                .findFirst()
                .orElseThrow(() -> new HouseNotFoundException("House " + houseName + " not found in Westeros!"));
        return ResponseEntity.ok(character);
    }

    @ExceptionHandler(HouseNotFoundException.class)
    public ResponseEntity<String> handleHouseNotFoundException(HouseNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
