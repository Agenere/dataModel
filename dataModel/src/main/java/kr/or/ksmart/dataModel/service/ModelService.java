package kr.or.ksmart.dataModel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ksmart.dataModel.mapper.ModelMapper;

@Service
@Transactional
public class ModelService {
	@Autowired
	private ModelMapper modelMapper;
}
