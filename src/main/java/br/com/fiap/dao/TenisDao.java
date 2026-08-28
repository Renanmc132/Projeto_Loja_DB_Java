package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.Tenis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TenisDao {

    Connection minhaConexao;

    public TenisDao() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().connection();
    }

    // Insert
    public String inserir(Tenis tenis) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Insert into TENIS values (?,?,?,?)");
        stmt.setInt(1, tenis.getId_tenis());
        stmt.setString(2, tenis.getNome());
        stmt.setString(3, tenis.getCor());
        stmt.setInt(4, tenis.getMarca_id_marca());
        stmt.execute();

        return "Produto cadastrado com sucesso!";
    }

}
