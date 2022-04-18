package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa {
	private Double finalNote;

	public Aluno(String name, int phone, Date birthday, Date dateRegister, Date dateChange, Double finalNote) {
		super(name, phone, birthday, dateRegister, dateChange);
		this.finalNote = finalNote;
	}

	public Double getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(Double finalNote) {
		this.finalNote = finalNote;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Aluno [nome=" + getName() + ",Telefone=" + getPhone() + ", Nascimento=" + sdf.format(getBirthday())
				+ ",Data Registro=" + sdf.format(getDataRegister()) + ", Data Alteração=" + sdf.format(getDataChange())
				+ "Nota final=" + finalNote + "]";
	}

}