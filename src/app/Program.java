package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		int op = 0;
		String name = "teste", name2 = "teste2";
		int phone = 0;
		double note = 0;

		Pessoa p1 = new Pessoa() {
		};
		p1.setName("bruce");
		p1.setPhone(01);
		p1.setBirthday(sdf.parse("23/10/2000"));
		p1.setDataRegister(sdf.parse("04/01/2000"));
		p1.setDataChange(sdf.parse("08/02/1980"));
		Aluno a1 = new Aluno("noveleto", 111, sdf.parse("23/10/2000"), sdf.parse("23/10/2000"), sdf.parse("23/10/2000"),
				5.0);
		list.add(a1);
		list.add(p1);

		Pessoa p2 = new Pessoa() {
		};
		Pessoa p3 = new Pessoa() {
		};
		Pessoa p4 = new Pessoa() {
		};

		p2.setName("lucas");
		p2.setPhone(44444);
		p2.setDataChange(sdf.parse("10/05/2020"));
		p2.setDataRegister(sdf.parse("07/01/2019"));
		p2.setBirthday(sdf.parse("08/02/1990"));
		list.add(p2);
		p3.setName("gomes");
		p3.setPhone(11111);
		p3.setDataChange(sdf.parse("30/12/2021"));
		p3.setDataRegister(sdf.parse("04/01/2020"));
		p3.setBirthday(sdf.parse("08/02/1998"));
		list.add(p3);

		String nome = "", nome2 = "";
		String telefone = "";

		Pessoa a2 = new Aluno("maria", 545454, sdf.parse("10/05/2020"), sdf.parse("10/05/2020"),
				sdf.parse("10/05/2020"), 7.5);
		Pessoa a3 = new Aluno("mario", 67676, sdf.parse("25/05/2020"), sdf.parse("10/05/2020"), sdf.parse("10/05/2020"),
				5.5);
		Pessoa a4 = new Aluno("fernando", 10990, sdf.parse("10/05/2020"), sdf.parse("10/05/2020"),
				sdf.parse("10/05/2020"), 6.5);
		Pessoa a5 = new Aluno("bruno", 777777, sdf.parse("10/05/2020"), sdf.parse("10/05/2020"),
				sdf.parse("10/05/2020"), 4.5);
		Pessoa a6 = new Aluno("bruna", 22222, sdf.parse("10/05/2020"), sdf.parse("10/05/2020"), sdf.parse("10/05/2020"),
				8.5);
		Pessoa a7 = new Aluno("gustavo", 11111, sdf.parse("10/05/2020"), sdf.parse("10/05/2020"),
				sdf.parse("10/05/2020"), 9.5);
		Pessoa a8 = new Aluno("marcus", 33333, sdf.parse("10/05/2020"), sdf.parse("10/05/2020"),
				sdf.parse("10/05/2020"), 2.5);
		Pessoa a9 = new Aluno("paul", 9909090, sdf.parse("10/05/2020"), sdf.parse("10/05/2020"),
				sdf.parse("10/05/2020"), 1.5);

		list.add(a9);
		list.add(a8);
		list.add(a7);
		list.add(a6);
		list.add(a5);
		list.add(a4);
		list.add(a3);
		list.add(a2);
		do {
			System.out.println();
			System.out.println("             ***************************************************");
			System.out.println("             *1-  Criar pessoa ou aluno                        *");
			System.out.println("             *2-  Mostrar todas pessoas e alunos criados       *");
			System.out.println("             *3-  Atualializar dados de uma pessoa ou aluno    *");
			System.out.println("             *4-  Deletar uma pessoa ou aluno                  *");
			System.out.println("             *5-  Encessar o programa                          *");
			System.out.println("             ***************************************************");
			System.out.println();
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Nome :");
				name = sc.next();
				System.out.println("Telefone :");
				phone = sc.nextInt();
				System.out.println("Data aniversario");
				Date birthday = sdf.parse(sc.next());
				System.out.println("Data registro");
				Date dateRegister = sdf.parse(sc.next());
				System.out.println("Data alteração");
				Date dateChange = sdf.parse(sc.next());
				System.out.println("Nota final");
				note = sc.nextDouble();
				Pessoa p6 = new Pessoa() {
				};
				if (note > 0) {
					list.add(new Aluno(name, phone, birthday, dateRegister, dateChange, note));
				} else {
					p6.setName(name);
					p6.setPhone(2222);
					p6.setBirthday(birthday);
					p6.setDataRegister(dateRegister);
					p6.setDataChange(dateChange);
					list.add(p6);
				}

				break;
			case 2:
				System.out.println(
						"____________________________________________________Lista Completa_________________________________________________________________ ");
				System.out.println("");
				for (Pessoa pessoa : list) {
					System.out.println(pessoa);
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------");
				}
				System.out.println(
						"________________________________________________________________________________________________________________________________");
				break;
			case 3:
				System.out.println("Digite o nome da pessoa ou aluno para atualizar dados");
				name2 = sc.next();

				for (Pessoa pessoa : list) {
					if (name2.equals(pessoa.getName())) {
						System.out.println("Nome :");
						name2 = sc.next();
						pessoa.setName(name2);
						System.out.println("Telefone :");
						phone = sc.nextInt();
						pessoa.setPhone(phone);
						System.out.println("Data aniversario");
						birthday = sdf.parse(sc.next());
						pessoa.setBirthday(birthday);
						System.out.println("Data registro");
						Date dataRegister2 = sdf.parse(sc.next());
						pessoa.setDataRegister(dataRegister2);
						System.out.println("Data alteração");
						Date dataChange2 = sdf.parse(sc.next());
						pessoa.setDataChange(dataChange2);
						System.out.println("Nota final");
						note = sc.nextDouble();
						if (note > 0) {

							((Aluno) pessoa).setFinalNote(note);

						}

					}

				}

				break;
			case 4:

				for (int i = 0; i < list.size(); i++) {
					for (Pessoa pessoa : list) {

						System.out.println();
						System.out.println("Posição " + i + " = " + pessoa);
						System.out.println();
						i++;
					}
					System.out.println("Digite a posição da pessoa ou aluno para excluir");
					int n = sc.nextInt();
					list.remove(list.get(n));
				}
				break;

			default:
				System.out.println("Encerrar a aplicacao");
				break;
			}
		} while (op != 5);

	}

}
