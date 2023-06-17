package com.mrbebo.yachtBooking.Services.Implementations;


import com.mrbebo.yachtBooking.Services.IYachtService;

import com.mrbebo.yachtBooking.models.Yacht;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class YachtServiceImplemenation implements IYachtService {


    @Override
    public Yacht create(Yacht yacht) {
        return null;
    }

    @Override
    public Yacht update(Yacht yacht) {
        return null;
    }

    @Override
    public Boolean delete(Long yachtId) {
        return null;
    }

    @Override
    public Collection<Yacht> getAllYachts(int pageSize) {
        return null;
    }

    @Override
    public Yacht getSpecificYacht(Long ownerId) {
        return null;
    }
}
