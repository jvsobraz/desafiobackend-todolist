package br.com.jvsobraz.desafiobackendtodolist;

import java.util.ArrayList;
import java.util.List;

import br.com.jvsobraz.desafiobackendtodolist.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@jvsobraz", "Curtir", false, 1));
      add(new Todo(9996L, "@jvsobraz", "Comentar", false, 1));
      add(new Todo(9997L, "@jvsobraz", "Compartilhar", false, 1));
      add(new Todo(9998L, "@jvsobraz", "Se Inscrever", false, 1));
      add(new Todo(9999L, "@jvsobraz", "Ativar as Notificações", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}