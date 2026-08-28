package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.Marca;
import br.com.fiap.entities.Tenis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MarcaDao {

    Connection minhaConexao;

    public MarcaDao() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().connection();
    }

    // Insert
    public String inserir(Marca marca) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Insert into MARCA values (?,?)");
        stmt.setInt(1, marca.getId_marca());
        stmt.setString(2, marca.getNome());
        stmt.execute();

        return "Produto cadastrado com sucesso!";
    }

}
