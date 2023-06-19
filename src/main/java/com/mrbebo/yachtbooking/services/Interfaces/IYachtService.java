package com.mrbebo.yachtbooking.services.Interfaces;

import com.mrbebo.yachtbooking.entities.Yacht;

import java.util.Collection;
import java.util.UUID;

public interface IYachtService {
    Yacht create (Yacht yacht);
    Yacht update (Yacht yacht);
    Boolean delete (UUID yachtId);

    Collection<Yacht> getAllYachts(int pageSize);
    Yacht getSpecificYacht(UUID yachtId);

}
