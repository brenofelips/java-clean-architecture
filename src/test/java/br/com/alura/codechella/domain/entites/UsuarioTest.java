package br.com.alura.codechella.domain.entites;

import br.com.alura.codechella.domain.entities.Usuario;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
  @Test
  void naoDeveCriarUsuarioComCpfInvalido() {
    Assertions.assertThrows(IllegalArgumentException.class,
        () -> new Usuario("144-334.121.96", "Breno", LocalDate.parse("1999-05-26"), "email@email.com"));
  }

  @Test
  void deveCriarUsuarioComCpf() {
    Usuario usuario = new Usuario();
    usuario.setCpf("144.334.121-96");
    Assertions.assertEquals("144.334.121-96", usuario.getCpf());
  }

  @Test
  void deveCriarUsuariComNome() {
    Usuario usuario = new Usuario();
    usuario.setNome("Breno");
    Assertions.assertEquals("Breno", usuario.getNome());
  }
}
