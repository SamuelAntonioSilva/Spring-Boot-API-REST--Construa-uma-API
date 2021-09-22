package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TopicoForm {

	@NotEmpty @NotNull
	private String titulo;
	@NotEmpty @NotNull
	private String mensagem;
	@NotEmpty @NotNull
	private String nomeCurso;
	
	public Topico converter(CursoRepository cursoRepository) {
		
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem,curso);
	}


}
