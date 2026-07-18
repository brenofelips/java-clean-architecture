package br.com.alura.codechella.domain.entites;

import br.com.alura.codechella.domain.entities.Usuario;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
  @Test
  void naoDeveCriarUsuarioComCpfInvalido() {
    Assertions.assertThrows(IllegalArgumentException.class,
        () -> new Usuario("007300129-08", "Breno", LocalDate.parse("1999-05-26"), "email@email.com"));
  }
}
