
public class pessoa {
	
	//Atributos ---------------------------
    //Sempre Privados
    private String nome;
    private String apelido;
    private String dataNascimento;
    private String morada;
    private int telefone;
    private long bi;
    private long nif;
    private long niss;
    private String passagem;

    //Construtores-------------------------
    public pessoa(String name, String lastN)
    {
        nome = name;
        apelido = lastN;
    }

    public pessoa(String name, String lastName, String dataN)
    {
        nome = name;
        apelido = lastName;
        dataNascimento = dataN;
    }

    //Métodos-------------------------------

    // Sets
    public void agoraFaloEu(String nome)
    {
        System.out.println("Eu " + getName() + getLastName() + " Falo Agora");
    }

    public void agoraFaloEu(pessoa p)
    {
        System.out.println("Eu " + p.getName() + p.getLastName() + " Falo Agora");
        p.agoraFaloEu(this);
    }

    public void dizOlaAPessoa(String nome)
    {
    	passagem = "Ola" + nome + "Eu sou o " + this.nome + " " + apelido;
    }

    public void dizOlaAmigo(String nomeAmigo)
    {
    	passagem = "Ola " + nomeAmigo + "Eu sou o " + nome + " " + apelido;
    }

    public void dizOlaAmigo(pessoa px)
    {
        System.out.println("Ola" + px.getName() + px.getLastName() + "Eu sou o " + nome + " " + apelido);
    }
    
    
    
    

    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public void setMorada(String morada)
    {
        this.morada = morada;
    }

    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }

    public void setBi(long bi)
    {
        this.bi = bi;
    }

    public void setNif(long nif)
    {
        this.nif = nif;
    }

    public void setNiss(long niss)
    {
        this.niss = niss;
    }

    // Gets
    public long getNiss()
    {
        return niss;
    }

    public long getNif()
    {
        return nif;
    }

    public long getBi()
    {
        return bi;
    }

    public int getTelefone()
    {
        return telefone;
    }

    public String getMorada()
    {
        return morada;
    }

    public String getName()
    {
        return nome;
    }

    public String getLastName()
    {
        return apelido;
    }

    public String getDataN()
    {
        return dataNascimento;
    }
    
    public String getPassagem()
    {
    	return passagem;
    }

}
