package com.sivalabs.bookstore.catalog.domain;

class ProductMapper {
    public static Product mapToProduct(ProductEntity productEntity)
    {
        return new Product(productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getPrice());
    }
}
