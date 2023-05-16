package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tabelas {
    private final Connection connection;
    
    public Tabelas(Connection connection){
       this.connection = connection; 
    }
    
    public void atualizarTabelas() throws SQLException{        
        String situacaoCadastro =   "CREATE TABLE situacaocadastro (" +
                                    "    id SERIAL NOT NULL PRIMARY KEY, " +
                                    "    descricao VARCHAR(25) NOT NULL " +
                                    ");"
                                    + "INSERT INTO situacaocadastro (descricao) VALUES ('Ativo'), ('Excluído');";
        String situacaoLocacao = "CREATE TABLE situacaolocacao("
                                    + "id SERIAL NOT NULL PRIMARY KEY, "
                                    + "descricao VARCHAR(25) NOT NULL "
                                    + ");"
                                    + "INSERT INTO situacaolocacao (descricao) VALUES ('Finalizado'), ('Cancelado'), ('Pendente');";
        String tipoQuadra = "CREATE TABLE tipoquadra (" +
                            "    id SERIAL NOT NULL PRIMARY KEY, " +
                            "    descricao VARCHAR(25) NOT NULL, " +
                            "    id_situacaocadastro INTEGER NOT NULL, " +
                            "    CONSTRAINT id_situacaocadastro FOREIGN KEY (id_situacaocadastro) " +
                            "        REFERENCES public.situacaocadastro (id)" +
                            ");";
        String quadra = "CREATE TABLE quadra( " +
                        "    id SERIAL NOT NULL PRIMARY KEY, " +
                        "    nome VARCHAR(100) NOT NULL, " +
                        "    valorminuto numeric(10,2) NOT NULL, " +
                        "    id_tipoquadra INTEGER NOT NULL, " +
                        "    id_situacaocadastro integer NOT NULL,\n" +
                        "    CONSTRAINT id_situacaocadastro FOREIGN KEY (id_situacaocadastro) " +
                        "        REFERENCES situacaocadastro (id)," +
                        "    CONSTRAINT id_tipoquadra FOREIGN KEY (id_tipoquadra) " +
                        "        REFERENCES tipoquadra (id)" +
                        ");";
        String locatario = "CREATE TABLE locatario(" +
                            "    id SERIAL NOT NULL PRIMARY KEY, " +
                            "    nome VARCHAR(100) NOT NULL, " +
                            "    cpf CHAR(11) NOT NULL, " +
                            "    telefone VARCHAR(11) NOT NULL, " +
                            "    datanascimento DATE NOT NULL, " +
                            "    id_situacaocadastro INTEGER NOT NULL, " +
                            "    CONSTRAINT id_situacaocadastro FOREIGN KEY (id_situacaocadastro) " +
                            "        REFERENCES situacaocadastro(id)" +
                            ");";
        String locacao =    "CREATE TABLE locacao( " +
                            "    id SERIAL NOT NULL PRIMARY KEY, " +
                            "    necessitaequipamento BOOLEAN NOT NULL, " +
                            "    datahorainicio TIMESTAMP NOT NULL, " +
                            "    datahoratermino TIMESTAMP NOT NULL, " +
                            "    precototal NUMERIC(10,2) NOT NULL, " +
                            "    id_situacaolocacao INTEGER NOT NULL," +
                            "    id_locatario INTEGER NOT NULL, " +
                            "    id_quadra INTEGER NOT NULL, " + 
                            "    CONSTRAINT id_situacaolocacao FOREIGN KEY (id_situacaolocacao)" +
                            "        REFERENCES situacaolocacao(id)," +
                            "    CONSTRAINT id_quadra FOREIGN KEY (id_quadra)" +
                            "        REFERENCES quadra(id)," +
                            "    CONSTRAINT id_locatario FOREIGN KEY (id_locatario) " +
                            "        REFERENCES locatario(id)" +
                            ");";
        
        String sql = situacaoCadastro + situacaoLocacao + tipoQuadra + quadra + locatario + locacao;
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
}
