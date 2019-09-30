package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class projetoInterdisciplinar {

    public float Cabo;
    public String Material;
    public int Circuito; // Forca = 0, Iluminação = 1
    public String MetodoInstalacao;
    public float Comprimento;
    public float Potencia;
    public float FatorDePotencia;
    public int Temperatura;
    public float QuedaDeTensao;
    public int Tensao;
    public int Sistema;
    public int NumeroDeCondutores;
    public int NumeroCircuitos;
    public ArrayList<String> Descricao;
    public ArrayList<String[]> AuxiliarDeLeitura;
    public float[][] tabelaCapacidadeCorrente;
    public float[][] k1;
    public float[][] k3;

    public projetoInterdisciplinar() {
        this.Descricao = new ArrayList<>();
        this.AuxiliarDeLeitura = new ArrayList<>();
        leituraTabelaK1();
        leituraTabelaK3();
        leituraCapacidadeCorrente();

    }

    public void leituraCapacidadeCorrente() {

        String caminho = "src/Arquivos/CapacidadeCorrente.txt";

        leituraDoArquivo(caminho);

    }

    public void leituraDasDescricoes() {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/Arquivos/Descricao.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(projetoInterdisciplinar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (br.ready()) {
                String linha = br.readLine();
                Descricao.add(linha);

            }
        } catch (IOException ex) {
            Logger.getLogger(projetoInterdisciplinar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(projetoInterdisciplinar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void leituraDoArquivo(String caminho) {

        try {
            FileInputStream arquivo = new FileInputStream(caminho);

            leituraDosDados(arquivo);

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }

    private void leituraDosDados(FileInputStream arquivo) throws IOException {
        AuxiliarDeLeitura.clear();
        InputStreamReader input = new InputStreamReader(arquivo);
        BufferedReader ler = new BufferedReader(input);
        int i = 0;
        while (true) {
            String linha = ler.readLine();
            if (!(linha == null)) {
                String auxiliar[] = linha.split("\t");
                AuxiliarDeLeitura.add(auxiliar);
//                for (int j = 0; j < auxiliar.length; j++) {
//                   // System.out.println( Float.parseFloat(auxiliar[j]));
//                    Tabela[j][i] = Float.parseFloat(auxiliar[j]);
//                }
//                i++;
            } else {
                break;
            }
        }

    }

    public void imprimeTabela() {

        for (float[] i : tabelaCapacidadeCorrente) {
            for (float j : i) {
                System.out.print(j + "\t");
            }
            System.out.println("");
        }

    }

    public void leituraTabelas() {
        tabelaCapacidadeCorrente = new float[AuxiliarDeLeitura.size()][AuxiliarDeLeitura.get(0).length];
        for (int i = 0; i < AuxiliarDeLeitura.size(); i++) {
            for (int j = 0; j < AuxiliarDeLeitura.get(i).length; j++) {
                String x = AuxiliarDeLeitura.get(i)[j].replace(",", ".");
                tabelaCapacidadeCorrente[i][j] = Float.parseFloat(x);
            }
        }
    }

    public void calculaDimensaoDoCabo() {
        //Condutores isolados, cabos unipolares, e multipolares COBRE PVC (A1,A2,B1,B2,C e D)
        // 1:13
        //Condutores isolados, cabos unipolares e multipolares – COBRE, XLPE/EPR
        //14:26
        //Condutores isolados, cabos unipolares e multipolares – ALUMÍNIO, PVC
        //27:39
        //Condutores isolados, cabos unipolares e multipolares – ALUMÍNIO, XLPE/EPR
        //40:52

    }

    private float capacidadeDeCorrente() {
        float secao = 0;
        double resistividadeTermicaDoSolo = 0;

        float IB = (Potencia / (Tensao * FatorDePotencia));
        float k1 = coeficienteDeTemperaturaK1();
        float k2 = fatorDeCorrecaoK2((float) resistividadeTermicaDoSolo);
        float k3 = agrupamentoDeCircuitos(1, NumeroCircuitos);

        float IBCorrigido = IB / (k1 * k2 * k3);
        secao = buscaTabelaCorrente(IBCorrigido);
        return secao;
    }

    private void leituraTabelaK1() {
        String caminho = "src/Arquivos/k1.txt";
        leituraDoArquivo(caminho);
        k1 = new float[AuxiliarDeLeitura.size()][AuxiliarDeLeitura.get(0).length];
        for (int i = 0; i < AuxiliarDeLeitura.size(); i++) {
            for (int j = 0; j < AuxiliarDeLeitura.get(i).length; j++) {
                String x = AuxiliarDeLeitura.get(i)[j].replace(",", ".");
                k1[i][j] = Float.parseFloat(x);
            }
        }
    }

    private void leituraTabelaK3() {
        String caminho = "src/Arquivos/k3.txt";
        leituraDoArquivo(caminho);
        k3 = new float[AuxiliarDeLeitura.size()][AuxiliarDeLeitura.get(0).length];
        for (int i = 0; i < AuxiliarDeLeitura.size(); i++) {
            for (int j = 0; j < AuxiliarDeLeitura.get(i).length; j++) {
                String x = AuxiliarDeLeitura.get(i)[j].replace(",", ".");
                k3[i][j] = Float.parseFloat(x);
            }
        }
    }

    private float buscaTabelaCorrente(float IB) {

        return 1;
    }

    private float agrupamentoDeCircuitos(int item, int circuitos) {

        float valor = k3[item][circuitos];

        return valor;
    }

    private float fatorDeCorrecaoK2(float resistividadeTermica) {
        if (resistividadeTermica == 1) {
            return (float) 1.18;
        }
        if (resistividadeTermica == 1.5) {
            return (float) 1.1;
        }
        if (resistividadeTermica == 2) {
            return (float) 1.05;
        }
        if (resistividadeTermica == 3) {
            return (float) 0.96;
        }

        return 1;
    }

    private float coeficienteDeTemperaturaK1() {
        float valor = 0;
        for (int i = 0; i < k1.length; i++) {
            if (k1[0][i] == Temperatura) {
                valor = k1[1][i];
                i = k1.length;
            }
        }
        return valor;
    }

}
