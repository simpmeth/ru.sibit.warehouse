package ru.sibit.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sibit.warehouse.entity.Receiving;
import ru.sibit.warehouse.repository.ReceivingRepository;

import java.util.List;

@Controller
public class ReceivingController {
    @Autowired
    private ReceivingRepository receivingRepository;

    @GetMapping(value = "/receiving/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Receiving>> list(@RequestParam int page, @RequestParam int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        return ResponseEntity.ok().body(receivingRepository.findAll(pageable).get().toList());
    }
}
