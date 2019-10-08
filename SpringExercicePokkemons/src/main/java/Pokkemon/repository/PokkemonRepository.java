package Pokkemon.repository;

import Pokkemon.model.Pokkemon;
import Pokkemon.model.PokkemonType;

import java.util.List;

public interface PokkemonRepository {
    public Pokkemon getPokkemonbyId(int id);
    public void savePokkemon(Pokkemon pokkemon);
    public List<Pokkemon> getListPokkemons();

}
