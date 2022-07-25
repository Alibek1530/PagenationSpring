package com.ali.pagenationspring.service;


import com.ali.pagenationspring.model.Country;
import java.util.List;

public interface ICountryService {

    List<Country> findPaginated(int pageNo, int pageSize);
}