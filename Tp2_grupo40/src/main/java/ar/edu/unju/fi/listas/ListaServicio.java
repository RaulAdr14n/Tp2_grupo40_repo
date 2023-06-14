package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Servicio;

/**
 * Clase que representa una lista de servicios.
 */
@Component
public class ListaServicio {
        // Lista de servicios
        private List<Servicio> servicios;

        /**
         * Constructor de la clase ListaServicio.
         * Inicializa la lista de servicios y agrega algunos servicios predefinidos.
         */
        public ListaServicio() {
                servicios = new ArrayList<Servicio>();
                // Agrega servicios predefinidos a la lista
                servicios.add(new Servicio("001", "Venta de alimentos para mascotas",
                                "Amplia variedad de alimentos para perros y gatos. Ofrecemos una amplia selección de alimentos nutritivos y equilibrados para satisfacer las necesidades dietéticas específicas de cada mascota. Nuestros productos incluyen alimentos secos, húmedos, naturales y especializados para todas las etapas de la vida y condiciones de salud."));
                servicios.add(new Servicio("002", "Venta de productos de higiene y cuidado para mascotas",
                                "Productos de calidad para el cuidado e higiene de mascotas. Contamos con una amplia gama de productos de alta calidad que incluyen champús, acondicionadores, cepillos, cortauñas, perfumes y productos para el cuidado dental. Nuestros productos están diseñados para mantener la piel, el pelaje y los dientes de tus mascotas limpios y saludables."));
                servicios.add(new Servicio("003", "Servicio de peluquería canina y felina",
                                "Corte de pelo, baño y arreglo para perros y gatos. Nuestro equipo de expertos peluqueros se encarga de brindar servicios de peluquería profesionales y personalizados para tu mascota. Ofrecemos cortes de pelo de acuerdo a las características de cada raza, baños relajantes, desenredado de pelo, limpieza de oídos y corte de uñas."));
                servicios.add(new Servicio("004", "Atención veterinaria especializada",
                                "Servicios médicos y tratamientos para mascotas. Contamos con un equipo de veterinarios altamente capacitados y equipados con tecnología de vanguardia para brindar atención veterinaria especializada. Ofrecemos servicios de diagnóstico, medicina interna, cirugía, vacunación, control de plagas, control de la reproducción y cuidados preventivos para garantizar la salud y bienestar de tus mascotas."));
                servicios.add(new Servicio("005", "Servicio de paseo y ejercicio para mascotas",
                                "Paseos y actividades físicas para perros. Nuestro equipo de paseadores de perros profesionales se encarga de brindarles a tus mascotas la actividad física y el ejercicio necesario para mantenerse saludables y felices. Realizamos paseos programados, juegos interactivos y estimulación mental para satisfacer las necesidades individuales de cada perro."));
                servicios.add(new Servicio("006", "Envío a domicilio de productos para mascotas",
                                "Entrega de productos para mascotas en la comodidad de tu hogar. Realiza tus pedidos de alimentos, accesorios y productos para mascotas desde la comodidad de tu hogar y nosotros nos encargamos de llevarlos hasta tu puerta. Nuestro servicio de entrega a domicilio es rápido, confiable y seguro, para que nunca te quedes sin los productos que tus mascotas necesitan."));
                servicios.add(new Servicio("007", "Adiestramiento y entrenamiento de mascotas",
                                "Entrenamiento y educación básica para perros. Nuestro equipo de adiestradores profesionales utiliza técnicas basadas en refuerzo positivo para brindar entrenamiento y educación a perros de todas las edades y razas. Ofrecemos programas de obediencia básica, socialización, modificación de conducta y entrenamiento en habilidades avanzadas para fortalecer el vínculo entre tú y tu mascota."));
                servicios.add(new Servicio("008", "Servicio de guardería y hospedaje para mascotas",
                                "Cuidado y hospedaje temporal para mascotas. Brindamos un ambiente seguro, cómodo y lleno de cariño para el cuidado y hospedaje temporal de tus mascotas cuando no puedes estar con ellas. Nuestro equipo de cuidadores se encarga de proporcionarles alimentación adecuada, atención personalizada, tiempo de juego y espacios de descanso apropiados."));
                servicios.add(new Servicio("009", "Accesorios y juguetes para mascotas",
                                "Amplia variedad de accesorios y juguetes para mascotas. Descubre nuestra selección de accesorios y juguetes de alta calidad para satisfacer las necesidades de juego, comodidad y entretenimiento de tus mascotas. Ofrecemos collares, correas, camas, comederos, juguetes interactivos, rascadores y más, para que puedas consentir a tus mascotas con productos duraderos y seguros."));
                servicios.add(new Servicio("010", "Venta de medicamentos veterinarios",
                                "Medicamentos y productos farmacéuticos para mascotas. Contamos con un amplio stock de medicamentos veterinarios, incluyendo antiparasitarios, analgésicos, antibióticos, antiinflamatorios, suplementos vitamínicos y otros productos de salud, para garantizar el bienestar y cuidado de tus mascotas. Nuestro equipo de profesionales está disponible para brindarte información y recomendaciones sobre el uso correcto de los medicamentos."));
                servicios.add(new Servicio("011", "Asesoramiento nutricional para mascotas",
                                "Consejos y recomendaciones sobre la alimentación de mascotas. Nuestros expertos en nutrición animal te brindarán información y asesoramiento personalizado para que puedas elegir la mejor dieta y alimentación adecuada para tu mascota. Analizamos las necesidades nutricionales específicas de cada animal, teniendo en cuenta su edad, raza, tamaño, estado de salud y estilo de vida."));
                servicios.add(new Servicio("012", "Servicio de vacunación y desparasitación",
                                "Vacunas y desparasitantes para la salud de las mascotas. Mantén a tus mascotas protegidas contra enfermedades con nuestro servicio de vacunación y desparasitación, siguiendo los calendarios y protocolos recomendados por los profesionales veterinarios. Además, te proporcionamos los productos desparasitantes necesarios para prevenir y tratar infestaciones de parásitos internos y externos."));
                servicios.add(new Servicio("013", "Consultas veterinarias en línea",
                                "Servicio de consulta veterinaria a través de internet. Obtén asesoramiento veterinario sin salir de casa, a través de consultas en línea con nuestros especialistas. Nuestro equipo de veterinarios está disponible para brindarte diagnósticos, recomendaciones de tratamiento, consejos de cuidado y respuestas a tus preguntas sobre la salud y el bienestar de tus mascotas."));
                servicios.add(new Servicio("014", "Rehabilitación y fisioterapia para mascotas",
                                "Tratamientos de rehabilitación física para mascotas. Nuestros profesionales especializados en rehabilitación y fisioterapia animal utilizan técnicas y terapias físicas para ayudar en la recuperación y mejora de la movilidad, fuerza y bienestar general de las mascotas. Realizamos tratamientos individualizados y programas de ejercicios terapéuticos para mascotas que han sufrido lesiones, cirugías o condiciones crónicas."));
        }

        /**
         * Obtiene la lista de servicios.
         * 
         * @return la lista de servicios
         */
        public List<Servicio> getServicios() {
                return servicios;
        }

        /**
         * Establece la lista de servicios.
         * 
         * @param servicios la lista de servicios a establecer
         */
        public void setServicios(List<Servicio> servicios) {
                this.servicios = servicios;
        }
}
