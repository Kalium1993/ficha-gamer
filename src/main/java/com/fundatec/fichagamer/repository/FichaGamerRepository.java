package com.fundatec.fichagamer.repository;

import com.fundatec.fichagamer.domain.FichaGamer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FichaGamerRepository extends MongoRepository<FichaGamer, String> {

    FichaGamer findBy_id(ObjectId _id);

}
