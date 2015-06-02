package morracinese.partita.giocatore;

/**
 *
 * @author Alex
 */
public class Giocatore
{
    private String nome;
    private int punteggio;

    public Giocatore(String nome)
    {
        this.nome = nome;
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