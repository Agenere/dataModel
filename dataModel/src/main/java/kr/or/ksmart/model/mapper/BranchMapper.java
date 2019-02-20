package kr.or.ksmart.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.model.vo.Branch;

@Mapper
public interface BranchMapper {
	Branch selectBranch(int branchNo);
}
