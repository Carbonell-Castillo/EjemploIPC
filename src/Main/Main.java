/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Clases.Usuario;
import Ventanas.CrearInvestigador;

/**
 *
 * @author devcast
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "admin");
        Listas.SG.listadoUsuarios.AgregarUsuario(usuario);
        
        CrearInvestigador crearInvestigador = new CrearInvestigador();
        crearInvestigador.setVisible(true);
                
    }
}
