package br.com.petshopdoTousen.entity;

import java.util.List;

public class Pet {

     private Long id;
     private Boolean temPelo;
     private String cor;
     private Boolean ehAgressivo;
     private String dieta;
     private Integer idade;
     private String nome;
     private List<String> vacinas;

     public Pet() {}

     public Pet(Long id, Boolean temPelo, String cor, Boolean ehAgressivo, String dieta, Integer idade, String nome, List<String> vacinas) {
          this.id = id;
          this.temPelo = temPelo;
          this.cor = cor;
          this.ehAgressivo = ehAgressivo;
          this.dieta = dieta;
          this.idade = idade;
          this.nome = nome;
          this.vacinas = vacinas;
     }

     public Long getId() {
          return id;
     }

     public Boolean getTemPelo() {
          return temPelo;
     }

     public String getCor() {
          return cor;
     }

     public void setTemPelo(Boolean temPelo) {
          this.temPelo = temPelo;
     }

     public void setCor(String cor) {
          this.cor = cor;
     }

     public void setIdade(Integer idade) {
          this.idade = idade;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public Boolean getEhAgressivo() {
          return ehAgressivo;
     }

     public void setEhAgressivo(Boolean ehAgressivo) {
          this.ehAgressivo = ehAgressivo;
     }

     public String getDieta() {
          return dieta;
     }

     public void setDieta(String dieta) {
          this.dieta = dieta;
     }

     public Integer getIdade() {
          return idade;
     }

     public String getNome() {
          return nome;
     }

     public List<String> getVacinas() {
          return vacinas;
     }

     public void setVacinas(List<String> vacinas) {
          this.vacinas = vacinas;
     }


}
