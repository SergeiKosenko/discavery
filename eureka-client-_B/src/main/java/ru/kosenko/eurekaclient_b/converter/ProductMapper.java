package ru.kosenko.eurekaclient_b.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;
import ru.kosenko.eurekaclient_b.dto.ProductDto;
import ru.kosenko.eurekaclient_b.model.Product;
import ru.kosenko.eurekaclient_b.repository.ProductRepository;


@Mapper(componentModel = "spring")
public abstract class ProductMapper {

    @Autowired
    protected ProductRepository productRepository;

    @Mappings({
            @Mapping(source = "id", target = "productId"),
            @Mapping(source = "title", target = "titlePerOne"),
            @Mapping(source = "price", target = "pricePerOne")
    })
    public abstract ProductDto productDto(Product product);


}
