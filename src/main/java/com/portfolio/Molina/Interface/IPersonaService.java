/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Molina.Interface;

import com.portfolio.Molina.Entity.Persona;
import java.util.List;

/**
 *
 * @author mabel
 */
public interface IPersonaService {
    //traer una lista de personas
    public List<Persona>getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario por ID
    public void deletePersona(Long id);
    
    //busqueda de persona por id
    public Persona findPersona(Long id);
}
