package com.example;

import com.example.model.HoraExtra;
import com.example.repository.HoraExtraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoraExtraService {
    @Autowired
    private HoraExtraRepository repository;

    public List<HoraExtra> obtenerHorasExtras() {
        return repository.findAll();
    }

    public HoraExtra registrarHoraExtra(HoraExtra horaExtra) {
// Lógica de cálculo del valor según el tipo de hora
        double valorBase = horaExtra.getValorHora();
        switch (horaExtra.getTipo()) {
            case "Diurna":
                horaExtra.setValorHora(valorBase * 1.25);
                break;
            case "Nocturna":
                horaExtra.setValorHora(valorBase * 1.75);
                break;
            case "Festiva":
            case "Dominical":
                horaExtra.setValorHora(valorBase * 2.0);
                break;
        }
        return repository.save(horaExtra);
    }
}
