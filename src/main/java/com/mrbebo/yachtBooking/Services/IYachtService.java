package com.mrbebo.yachtBooking.Services;

import com.mrbebo.yachtBooking.models.Yacht;

import java.util.Collection;

public interface IYachtService {
    Yacht create (Yacht yacht);
    Yacht update (Yacht yacht);
    Boolean delete (Long yachtId);

    Collection<Yacht> getAllYachts(int pageSize);
    Yacht getSpecificYacht(Long ownerId);

}
