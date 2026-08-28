package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.Loja;
import br.com.fiap.entities.Tenis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LojaDao {

    Connection minhaConexao;

    public LojaDao() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().connection();
    }

    // Insert
    public String inserir(Loja loja) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Insert into LOJA values (?,?,?)");
        stmt.setInt(1, loja.getId_loja());
        stmt.setString(2, loja.getFilial());
        stmt.setString(3, loja.getNome());
        stmt.execute();

        return "Produto cadastrado com sucesso!";
    }

}
