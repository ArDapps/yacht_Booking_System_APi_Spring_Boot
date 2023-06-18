package com.mrbebo.yachtbooking.Services.Interfaces;

import com.mrbebo.yachtbooking.Entities.Yacht;

import java.util.Collection;

public interface IYachtService {
    Yacht create (Yacht yacht);
    Yacht update (Yacht yacht);
    Boolean delete (Long yachtId);

    Collection<Yacht> getAllYachts(int pageSize);
    Yacht getSpecificYacht(Long yachtId);

}
