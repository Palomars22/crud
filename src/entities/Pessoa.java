package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pessoa {
	private String name;
	private int phone;
	private Date birthday, dataRegister, dataChange;
	List<Pessoa> list = new ArrayList<>();

	public Pessoa(String name, int phone, Date birthday, Date dataRegister, Date dataChange) {
		super();
		this.name = name;
		this.phone = phone;
		this.birthday = birthday;
		this.dataRegister = dataRegister;
		this.dataChange = dataChange;
	}

	public Pessoa() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getDataRegister() {
		return dataRegister;
	}

	public void setDataRegister(Date dataRegister) {
		this.dataRegister = dataRegister;
	}

	public Date getDataChange() {
		return dataChange;
	}

	public void setDataChange(Date dataChange) {
		this.dataChange = dataChange;
	}

	public void removerPessoa(Pessoa pessoa) {
		list.remove(pessoa);
	}

	@Override
	public String toString() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Pessoa [nome=" + name + ", telefone=" + phone + ", Nascimento=" + sdf.format(birthday)
				+ ", Data Registro=" + sdf.format(dataRegister) + ", Data Alteração=" + sdf.format(dataChange) + "]";
	}

}
