package com.rezeda.diplomSpring.repos;

import com.rezeda.diplomSpring.models.ShortLink;
import org.springframework.data.repository.CrudRepository;

public interface ShortLinkRepository extends CrudRepository<ShortLink, Long> {
    ShortLink findBySmallLink (String smallLink);

}
