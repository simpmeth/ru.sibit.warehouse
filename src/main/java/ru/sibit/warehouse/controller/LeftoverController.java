package ru.sibit.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sibit.warehouse.entity.Leftover;
import ru.sibit.warehouse.repository.LeftoverRepository;

import java.util.List;

@Controller
public class LeftoverController {
    @Autowired
    private LeftoverRepository leftoverRepository;

    @GetMapping(value = "/leftover/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Leftover>> list(@RequestParam int page, @RequestParam int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        return ResponseEntity.ok().body(leftoverRepository.findAll(pageable).get().toList());
    }
}
