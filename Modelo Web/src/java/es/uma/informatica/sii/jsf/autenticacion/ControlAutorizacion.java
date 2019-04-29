/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;
import static es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario.Rol.ADMINISTRADOR;
import static es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario.Rol.NORMAL;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author francis
 */
@Named(value = "controlAutorizacion")
@SessionScoped
public class ControlAutorizacion implements Serializable {

    private Usuario usuario;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String home() {
        String pag = "login.xhtml";
        if (usuario.getRol()== NORMAL) {
            pag = "normal.xhtml";
        } else { 
            if (usuario.getRol() == ADMINISTRADOR){
                pag = "admin.xhtml";
            }
        }
        return pag;
    }
    
    public String socios() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "socios.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String saldoGlobal() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "saldoGlobal.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String proyectos() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "proyectos.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String personal() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "personal.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String ordenPago() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "ordenPago.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String ninosjovenes() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "ninosjovenes.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String ingresos() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "ingresos.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String gastos() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "gastos.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String colonias() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "colonias.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String beneficiarios() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "beneficiarios.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String becas() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "becas.xhtml";
            return pag;
        }
        return pag;
    }
        
    public String agente() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "agente.xhtml";
            return pag;
        }
        return pag;
    }
    
    public String academico() {
        String pag = "login.xhtml";
        if (usuario.getRol() == ADMINISTRADOR){
            pag = "academico.xhtml";
            return pag;
        }
        return pag;
    }
    
    
    public String logout()
    {
        // Destruye la sesión (y con ello, el ámbito de este bean)
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.getExternalContext().invalidateSession();
        usuario = null;
        return "login.xhtml";
    }

    /**
     * Creates a new instance of ControlAutorizacion
     */
    public ControlAutorizacion() {
    }
}
