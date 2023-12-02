package com.shkrimtaret.controllers;

import com.shkrimtaret.dtos.ShkrimtariDto;
import com.shkrimtaret.services.ShkrimtariService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/shkrimtaret")
public class ShkrimtariController {

    private final ShkrimtariService shkrimtariService;

    public ShkrimtariController(ShkrimtariService shkrimtariService) {
        this.shkrimtariService = shkrimtariService;
    }


    @GetMapping("/")
    public List<ShkrimtariDto> getAllReportCases() {
        return shkrimtariService.getAll();
    }

    @GetMapping("/{id}")
    public ShkrimtariDto getById(@PathVariable long id) {
        return shkrimtariService.getById(id);
    }

    @PostMapping("/")
    public void addShkrimtarin(@RequestBody ShkrimtariDto shkrimtari){
        shkrimtariService.create(shkrimtari);

    }


    @PutMapping("/{id}")
    public void updateReportCase(@PathVariable long id, @RequestBody ShkrimtariDto shkrimtari) {
        shkrimtariService.update(id, shkrimtari);}

        @DeleteMapping("/{id}")
        public void deleteReportCase(@PathVariable long id){
            shkrimtariService.deleteById(id);


    }

}
