package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unju.fi.model.Consejo;

/**
 * Clase que representa una lista de consejos.
 */
public class ListaConsejo {
    // Lista de consejos
    private List<Consejo> consejos;

    /**
     * Constructor de la clase ListaConsejo.
     * Inicializa la lista de consejos y agrega algunos consejos predefinidos.
     */
    public ListaConsejo() {
        consejos = new ArrayList<Consejo>();

        // Agrega consejos predefinidos a la lista
        consejos.add(new Consejo("C001", "Visita regularmente al veterinario",
                "Es importante que lleves a tu mascota a chequeos regulares para asegurarte de que está en buena salud y detectar cualquier problema a tiempo.",
                "Juan Pérez", new Date()));
        consejos.add(new Consejo("C002", "Mantén el peso adecuado",
                "El sobrepeso y la obesidad pueden causar una serie de problemas de salud en las mascotas, como diabetes, problemas de articulaciones y enfermedades del corazón. Asegúrate de que tu mascota tenga una dieta equilibrada y realiza suficiente actividad física.",
                "María López", new Date()));
        consejos.add(new Consejo("C003", "Vacuna a tu mascota",
                "Las vacunas son una parte importante del cuidado preventivo de la salud de tu mascota. Asegúrate de mantener al día el calendario de vacunación de tu mascota.",
                "Pedro Gómez", new Date()));
        consejos.add(new Consejo("C004", "Proporciona una alimentación saludable",
                "La alimentación de tu mascota debe ser balanceada y adecuada para su edad, tamaño y necesidades nutricionales. Consulta con un veterinario para obtener recomendaciones específicas.",
                "Ana Torres", new Date()));
        consejos.add(new Consejo("C005", "Ejercicio diario",
                "El ejercicio es importante para mantener a tu mascota en buena forma física y mental. Asegúrate de proporcionar suficiente actividad diaria para mantener a tu mascota sana y feliz.",
                "Luis Rodríguez", new Date()));
        consejos.add(new Consejo("C006", "Mantén una buena higiene",
                "Mantener una buena higiene es fundamental para la salud de tu mascota. Baña a tu mascota regularmente y cepilla su pelaje para evitar problemas de piel y para reducir la cantidad de pelo que ingiere cuando se lame.",
                "Carolina González", new Date()));
        consejos.add(new Consejo("C007", "Control de parásitos",
                "Las pulgas, garrapatas, gusanos y otros parásitos pueden causar problemas de salud graves en las mascotas. Asegúrate de utilizar productos adecuados y seguir las instrucciones del veterinario para prevenir y controlar los parásitos.",
                "Martín Sánchez", new Date()));
        consejos.add(new Consejo("C008", "Proporciona agua fresca",
                "Tu mascota debe tener acceso constante a agua fresca y limpia para mantenerse hidratada y saludable.",
                "Lucía Vargas", new Date()));
        consejos.add(new Consejo("C009", "Mantén la dentadura de tu mascota limpia",
                "Los problemas dentales pueden ser una causa de dolor y enfermedad en las mascotas. Asegúrate de proporcionar una dieta adecuada y cepillar regularmente sus dientes para prevenir problemas dentales.",
                "Roberto Mendoza", new Date()));
        consejos.add(new Consejo("C010", "Proporciona un ambiente seguro",
                "Asegúrate de que tu mascota esté segura en su entorno. Evita exponerla a sustancias tóxicas, asegúrate de que no tenga acceso a objetos peligrosos, y mantén la casa limpia y libre de objetos que puedan causar accidentes.",
                "Valeria Ramírez", new Date()));
    }

    /**
     * Obtiene la lista de consejos.
     * 
     * @return la lista de consejos
     */
    public List<Consejo> getConsejos() {
        return consejos;
    }

    /**
     * Establece la lista de consejos.
     * 
     * @param consejos la lista de consejos a establecer
     */
    public void setConsejos(List<Consejo> consejos) {
        this.consejos = consejos;
    }
}
