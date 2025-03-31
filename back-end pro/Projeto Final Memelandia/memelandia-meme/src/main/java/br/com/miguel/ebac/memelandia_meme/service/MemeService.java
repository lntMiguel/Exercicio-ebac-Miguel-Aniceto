package br.com.miguel.ebac.memelandia_meme.service;

import br.com.miguel.ebac.memelandia_meme.client.CategoriaClient;
import br.com.miguel.ebac.memelandia_meme.client.UserClient;
import br.com.miguel.ebac.memelandia_meme.models.Meme;
import br.com.miguel.ebac.memelandia_meme.repository.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableMongoRepositories(basePackageClasses = MemeRepository.class)
public class MemeService {
    @Autowired
    private MemeRepository memeRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private CategoriaClient categoriaClient;

    @Autowired
    private UserClient userClient;

    public Meme saveMeme(Meme meme) throws Exception {

        if(!userClient.validaUser(meme.getIdUsuario()) || !categoriaClient.validarCategoria(meme.getIdCategoria())){
            throw new Exception("Erro na criação do meme, Usuario ou categoria inexistente");
        }

        return memeRepository.save(meme);
    }

    public List<Meme> listaTodosMemes(){
        return memeRepository.findAll();
    }

    public Meme memeDoDia(){
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.sample(1)
        );
        AggregationResults<Meme> result = mongoTemplate.aggregate(aggregation, "Meme", Meme.class);
        return result.getUniqueMappedResult();

    }
}
