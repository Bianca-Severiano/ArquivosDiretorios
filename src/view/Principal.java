package view;

import java.io.File;
import java.io.IOException;

import controller.ArquivoController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		
		IArquivosController ArqCont = new ArquivoController();
		String dirWin = "C:\\TEMP";
		File [] files;
		String nome = "teste2.csv";
		try {
			//files = ArqCont.readDir(dirWin);
			//ArqCont.createFile(dirWin, nome);
			ArqCont.readFile(dirWin, nome);
			ArqCont.openFile(dirWin, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
