package morracinese.engine.partita.giocatore;

import morracinese.gui.*;
import morracinese.gui.posizione.*;

/**
 *
 * @author Alex Miccio, Simone Raichini
 */
public class Giocatore
{
    private Gui gui;
    private String nome;
    private int punteggio;

    public Giocatore(String nome, Posizione posizione)
    {
        if(nome == null)
            throw new IllegalArgumentException("Nome cannot be null");
        this.nome = nome;
        if(posizione == null)
            throw new IllegalArgumentException("Posizione cannot be null");
        this.gui = new Gui(posizione);
        this.punteggio = 0;
    }
    
    /**
     * Increase punteggio by 1
     */
    public void increasePunteggio()
    {
        this.punteggio++;
    }

    public Gui getGui()
    {
        return this.gui;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getPunteggio()
    {
        return this.punteggio;
    }
}