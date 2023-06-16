package com.mrbebo.yachtBooking.Services.Implementations;

import com.mrbebo.yachtBooking.Services.IOwnerService;
import com.mrbebo.yachtBooking.models.Owner;
import com.mrbebo.yachtBooking.repositories.IOwnerRepository;
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
public class OwnerServiceImplemenation implements IOwnerService {
    private  final IOwnerRepository ownerRepository;



    @Override
    public Owner create(Owner owner) {
        log.info("Creating Owner:{}",owner.getName());
        return ownerRepository.save(owner);
    }

    @Override
    public Owner update(Owner owner) {
        log.info("Updating Owner with Id :{}",owner.getId());

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
        log.info("Fetch All Owners as List with Special Page Size ");
        return ownerRepository.findAll(Pageable.ofSize(pageSize)).toList();
    }

    @Override
    public Owner getSpecialOwner(Long ownerId) {
        log.info("Get Specific Owner By Id:{} ",ownerId);
        return ownerRepository.findById(ownerId).get();
    }
}
