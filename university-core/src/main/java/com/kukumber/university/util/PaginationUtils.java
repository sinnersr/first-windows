package com.kukumber.university.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PaginationUtils {

    private static final int pageSize = 50;

    //------------------------------------------------------------------------------------------------------------------

    public static Pageable getPageable(int pageNumber) {
        return getPageable(pageNumber - 1, pageSize, true, "id");
    }

    public static Pageable getPageable(int pageNumber, int pageSize) {
        return getPageable(pageNumber - 1, pageSize, true, "id");
    }

    public static Pageable getPageable(int pageNumber, int pageSize, boolean ascSort) {
        return getPageable(pageNumber - 1, pageSize, ascSort, "id");
    }

    //------------------------------------------------------------------------------------------------------------------

    public static Pageable getPageable(int pageNumber, boolean ascSort) {
        return getPageable(pageNumber - 1, pageSize, ascSort, "id");
    }

    public static Pageable getPageable(int pageNumber, String sortField) {
        return getPageable(pageNumber - 1, pageSize, true, sortField);
    }

    //------------------------------------------------------------------------------------------------------------------

    public static Pageable getPageable(int pageNumber, boolean ascSort, String sortField) {
        return getPageable(pageNumber - 1, pageSize, ascSort, sortField);
    }

    //------------------------------------------------------------------------------------------------------------------

    public static Pageable getPageable(int pageNumber, int pageSize, boolean ascSort, String sortField) {
        return PageRequest.of(pageNumber - 1, pageSize, ascSort ? Sort.Direction.ASC : Sort.Direction.DESC, sortField);
    }
}
