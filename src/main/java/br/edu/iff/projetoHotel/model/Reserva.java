
package br.edu.iff.projetoHotel.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Calendar dataHora;
    private Calendar inicio;
    private Calendar termino;
    
    private List<Quarto> quartos;
    
    private Cliente cliente;
    private Funcionario funcionario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDataHora() {
        return dataHora;
    }

    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getTermino() {
        return termino;
    }

    public void setTermino(Calendar termino) {
        this.termino = termino;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reserva other = (Reserva) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
