package kr.or.ksmart.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.model.vo.Branch;

@Mapper
public interface BranchMapper {
	Branch selectBranch(String branchNo);
	List<Branch> allSelectBranch();
}
