package br.com.fiap.infrastructure.mapper;

import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.infrastructure.dto.EstabelecimentoDTO;
import br.com.fiap.infrastructure.entity.EstabelecimentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EstabelecimentoMapper {
    EstabelecimentoMapper INSTANCE = Mappers.getMapper(EstabelecimentoMapper.class);

    // Mapeamento entre Estabelecimento e EstabelecimentoEntity
    EstabelecimentoEntity toEntity(Estabelecimento estabelecimento);

    Estabelecimento toModel(EstabelecimentoEntity estabelecimentoEntity);

    // Mapeamento entre Estabelecimento e EstabelecimentoDTO
//    @Mapping(target = "diasFuncionamento", source = "diasFuncionamento")
    EstabelecimentoDTO toDto(Estabelecimento estabelecimento);

//    @Mapping(target = "diasFuncionamento", source = "diasFuncionamento")
    Estabelecimento toModel(EstabelecimentoDTO estabelecimentoDTO);
}