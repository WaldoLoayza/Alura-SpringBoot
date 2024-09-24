package med.voll.api.model.dto;

import med.voll.api.model.Medico;

public record DatosListadoMedico(

        Long id,
        String nombre,
        String especialidad,
        String documento,
        String email
) {
    public DatosListadoMedico(Medico medico){
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }
}
