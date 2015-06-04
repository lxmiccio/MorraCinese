package morracinese.engine.partita.giocatore;

/**
 *
 * @author Alex, Simone
 */
public class Giocatore
{
    private String nome;
    private int punteggio;

    public Giocatore(String nome)
    {
        if(nome == null)
            throw new IllegalArgumentException("Nome cannot be null");
        this.nome = nome;
        this.punteggio = 0;
    }
    
    /**
     * Increase punteggio by 1
     */
    public void increasePunteggio()
    {
        this.punteggio++;
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