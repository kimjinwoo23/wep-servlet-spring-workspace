package com.khmall.mapper;

import com.khmall.dto.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductMapper {
    Product getProduct(@Param("PRODUCT_NAME") String PRODUCT_NAME,
                       @Param("PRODUCT_IMAGE_PATH") String PRODUCT_IMAGE_PATH,
                       @Param("PRODUCT_PRICE") int PRODUCT_PRICE,
                       @Param("PRODUCT_COUNT") int PRODUCT_COUNT);
}

