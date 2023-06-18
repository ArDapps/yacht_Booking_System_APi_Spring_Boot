package com.mrbebo.yachtbooking.Services.Implementations;


import com.mrbebo.yachtbooking.Services.Interfaces.IYachtService;

import com.mrbebo.yachtbooking.Entities.Yacht;

import com.mrbebo.yachtbooking.repositories.IYachtRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class YachtService implements IYachtService {


    final IYachtRepository yachtRepository;
    @Override
    public Yacht create(Yacht yacht) {
        log.info("Creating yacht:{}",yacht.getName());

        return yachtRepository.save(yacht);
    }

    @Override
    public Yacht update(Yacht yacht) {
        log.info("Updating yacht with Id :{}",yacht.getId());
        return yachtRepository.save(yacht);
    }

    @Override
    public Boolean delete(Long yachtId) {
        log.info("Deleting yacht by Id : {}",yachtId);
        yachtRepository.deleteById(yachtId);
        return true;
    }

    @Override
    public Collection<Yacht> getAllYachts(int pageSize) {
        log.info("Fetch All Yachts as List with Number Special Page Size ");
        return yachtRepository.findAll(Pageable.ofSize(pageSize)).toList();
    }

    public List<Yacht> getAllYachtsForSpecificOwner(Long ownerId) {
        log.info("Fetch all yachts for a specific owner");

        List<Yacht> yachts = yachtRepository.findYachtsByOwner(ownerId);
        return yachts;
    }
    @Override
    public Yacht getSpecificYacht(Long yachtId) {
        log.info("Get Specific yacht By Id:{} ",yachtId);
        return yachtRepository.findById(yachtId).get();
    }
}
