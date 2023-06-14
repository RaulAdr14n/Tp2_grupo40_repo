package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Sucursal;
@Component
public class ListaSucursal {
    private List<Sucursal> sucursales;

    public ListaSucursal() {
        sucursales = new ArrayList<Sucursal>();
        sucursales.add(new Sucursal(1, "Los Molinos", "La Nación S/n", "San Salvador de Jujuy", "388-6xxxxxx",
                "losmolinos@animalada.com",
                "09:00 - 21:00", java.sql.Date.valueOf("2021-01-01")));
        sucursales.add(new Sucursal(2, "Palpalá", "San Martín 107", "Palpalá", "388-5xxxxxx",
                "palpala@animalada.com",
                "09:00 - 18:00", java.sql.Date.valueOf("2022-02-01")));
        sucursales.add(new Sucursal(3, "Libertador", "Belgrano 250", "Libertador General San Martín",
                "388-4xxxxxx", "libertador@animalada.com",
                "10:00 - 21:00", java.sql.Date.valueOf("2023-03-01")));
    }

    // Getter de la lista de sucursales
    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }


}
