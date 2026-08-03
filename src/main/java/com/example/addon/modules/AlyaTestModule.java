package com.example.addon.modules;

import meteordevelopment.meteorclient.systems.modules.Module;
import com.example.addon.AddonTemplate;

public class AlyaTestModule extends Module {
    public AlyaTestModule() {
        super(AddonTemplate.CATEGORY, "alya-test", "Modulo de prueba creado con Alya.");
    }

    @Override
    public void onActivate() {
        info("¡El modulo de Alya se activo correctamente!");
    }

    @Override
    public void onDeactivate() {
        info("El modulo se desactivo.");
    }
}
