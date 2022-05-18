
//contrato Autenticavel
 // quem assina o contrato precisa
  // metodo setSenha
	//metodo autentica

public abstract interface Autenticavel  {


	public abstract void setSenha(int senha); 
	

	public abstract boolean autentica(int senha);

}
