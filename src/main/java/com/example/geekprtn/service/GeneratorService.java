package com.example.geekprtn.service;

import com.example.geekprtn.entity.Code;
import com.example.geekprtn.utils.Generator;
import com.example.geekprtn.repository.CodeRepository;
import org.springframework.stereotype.Service;

@Service
public class GeneratorService {

    private final CodeRepository codeRepository;

    public GeneratorService(CodeRepository codeRepository) {
        this.codeRepository = codeRepository;
    }

    public String generate() {
       Code code = codeRepository.findById(1L).orElseThrow();
       String str = Generator.generate(code.getCode());
       code.setCode(str);
       codeRepository.save(code);
       return str;
    }
}
