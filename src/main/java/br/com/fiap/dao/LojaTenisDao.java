package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.LojaTenis;
import br.com.fiap.entities.Tenis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LojaTenisDao {

    Connection minhaConexao;

    public LojaTenisDao() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().connection();
    }

    // Insert
    public String inserir(LojaTenis lojaTenis) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Insert into LOJA_TENIS values (?,?,?,?,?)");
        stmt.setInt(1, lojaTenis.getTenis_id_tenis());
        stmt.setInt(2, lojaTenis.getTenis_marca_id_marca());
        stmt.setInt(3, lojaTenis.getId_loja());
        stmt.setInt(4, lojaTenis.getPreco());
        stmt.setInt(5, lojaTenis.getQuantidade_estoque());
        stmt.execute();

        return "Produto cadastrado com sucesso!";
    }

}
