package com.mrbebo.yachtbooking.services.Implementations;


import com.mrbebo.yachtbooking.services.Interfaces.IYachtService;

import com.mrbebo.yachtbooking.entities.Yacht;

import com.mrbebo.yachtbooking.repositories.IYachtRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

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
    public Boolean delete(UUID yachtId) {
        log.info("Deleting yacht by Id : {}",yachtId);
        yachtRepository.deleteById(yachtId);
        return true;
    }

    @Override
    public Collection<Yacht> getAllYachts(int pageSize) {
        log.info("Fetch All Yachts as List with Number Special Page Size ");
        return yachtRepository.findAll(Pageable.ofSize(pageSize)).toList();
    }

    public List<Yacht> getAllYachtsForSpecificOwner(UUID ownerId) {
        log.info("Fetch all yachts for a specific owner");

        List<Yacht> yachts = yachtRepository.findYachtsByOwner(ownerId);
        return yachts;
    }
    @Override
    public Yacht getSpecificYacht(UUID yachtId) {
        log.info("Get Specific yacht By Id:{} ",yachtId);
        return yachtRepository.findById(yachtId).get();
    }
}
