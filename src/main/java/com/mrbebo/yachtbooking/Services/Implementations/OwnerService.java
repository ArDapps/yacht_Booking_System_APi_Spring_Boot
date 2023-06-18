package com.mrbebo.yachtbooking.Services.Implementations;

import com.mrbebo.yachtbooking.Services.Interfaces.IOwnerService;
import com.mrbebo.yachtbooking.Entities.Owner;
import com.mrbebo.yachtbooking.repositories.IOwnerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class OwnerService implements IOwnerService {
    private  final IOwnerRepository ownerRepository;



    @Override
    public Owner create(Owner owner) {
        log.info("Creating Owner:{}",owner.getName());

        return ownerRepository.save(owner);
    }

    @Override
    public Owner update(Owner owner) {
        log.info("Updating Owner with Id :{}",owner.getId());

        /**
         will use Spring boot Security to Encode owner.setPassword
         **/
        return ownerRepository.save(owner);
    }

    @Override
    public Boolean delete(Long ownerId) {
        log.info("Deleting Owner by Id : {}",ownerId);
        ownerRepository.deleteById(ownerId);
        return true;
    }

    @Override
    public Collection<Owner> getAllOwners(int pageSize) {
        log.info("Fetch All Owners as List with  Number Special Page Size ");
        return ownerRepository.findAll(Pageable.ofSize(pageSize)).toList();
    }
    @Override
    public Owner getSpecificOwner(Long ownerId) {
        log.info("Get Specific Owner By Id:{} ",ownerId);
        return ownerRepository.findById(ownerId).get();
    }


}
