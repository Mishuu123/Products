package com.Product.Mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.Product.Entity.Feedback;
import com.Product.Model.FeedbackModel;

@Mapper
public interface FeedbackMapper  {

	FeedbackMapper INSTANCE = Mappers.getMapper(FeedbackMapper.class);

	@IterableMapping(qualifiedByName="entityToModel")
	public abstract List<FeedbackModel> entityToFeedbackModelList(List<Feedback> response);

	public abstract Feedback feedbackModelToEntity(FeedbackModel model);

	@Named("entityToModel")
	public abstract FeedbackModel entityToFeedbackModel(Feedback response);

}
