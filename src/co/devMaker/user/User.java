package co.devMaker.user;

public class User {

   public String nome;
   public String sobrenome;
   public String fullName;

   //Construtor
   public User(String nome, String sobrenome) {
      this.nome = nome;
      this.sobrenome = sobrenome;
   }

   //Construtor vazio
   public User(){

   }

   //GETTERS AND SETTERS
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getSobrenome() {
      return sobrenome;
   }

   public void setSobrenome(String sobrenome) {
      this.sobrenome = sobrenome;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }


}
