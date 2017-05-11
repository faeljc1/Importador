package br.com.infarma.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetodoManipulacao {
    public int contaRegistros(String tabela, Connection conn) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("Select count(*) as quantidade from ");
        sql.append(tabela);

        try (PreparedStatement stmt = conn.prepareStatement(sql.toString());
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("quantidade");
            }
        }
        return 0;
    }

    public String getCidade(String codMunicipio, Connection conn) throws SQLException {
        StringBuilder s = new StringBuilder();
        s.append("select Des_Cidade from TIBGE where Cod_IBGE = '");
        s.append(codMunicipio);
        s.append("'");

        try (PreparedStatement stmt = conn.prepareStatement(s.toString());
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getString("Des_Cidade");
            }
        }
        return null;
    }

    public int codIBGE(String cidade, Connection conn) throws SQLException, ClassNotFoundException {
        String sql = "SELECT Cod_IBGE FROM TIBGE WHERE Des_Cidade COLLATE Latin1_general_CI_AI = '" + cidade + "' COLLATE Latin1_general_CI_AI";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("Cod_IBGE");
            }
            return 0;
        }
    }

    public String quebraString(String n, int tamanho) {
        if (n != null) {
            n = n.length() > tamanho ? n.substring(0, tamanho) : n;
        }
        return n;
    }

    public String somenteNumero(String n) {
        if (n != null) {
            n = n.replaceAll("\\D", "");
        }
        return n;
    }

    public String getFlag(String n) {
        if (n != null && n.equalsIgnoreCase("A")) {
            return "0";
        } else {
            return "1";
        }
    }

    public static String calcularCodBarras(String n) {
        while (n.length() < 12) {
            n = "0" + n;
        }
        String codBarras = n;
        int dado = 0;
        int dado2 = 0;
        int resultado = 0;
        if (n.length() == 12) {
            for (int i = n.length() - 1; i > 0; i--) {
                String x = n.charAt(i) + "";
                dado += Integer.parseInt(x);
                i--;
            }
            dado = dado * 3;
            for (int i = n.length() - 2; i > 0; i--) {
                String x = n.charAt(i) + "";
                dado2 += Integer.parseInt(x);
                i--;
            }
            dado = dado + dado2;
            dado2 = dado;
            while ((dado2 % 10) != 0) {
                dado2++;
            }
            resultado = dado2 - dado;
        }
        codBarras = codBarras + resultado;
        return codBarras;
    }



    public double percentagem(int totalRegistros) {
        return 100 / totalRegistros;
    }
}
