package morracinese.partita.giocatore;

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
        this.nome = nome;
        this.punteggio = 0;
    }
    
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