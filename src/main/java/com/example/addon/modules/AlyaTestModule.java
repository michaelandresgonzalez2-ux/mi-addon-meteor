package com.example.addon.modules;

import meteordevelopment.meteorclient.systems.modules.Module;
import com.example.addon.Addon;

public class AlyaTestModule extends Module {
    public AlyaTestModule() {
        super(Addon.CATEGORY, "alya-test", "Modulo de prueba creado con Alya.");
    }

    @Override
    public void onActivate() {
        info("¡El modulo de Alya se activo correctamente en el servidor!");
    }

    @Override
    public void onDeactivate() {
        info("El modulo se desactivo.");
    }
}
