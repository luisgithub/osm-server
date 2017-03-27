package com.erpsom.service;

import com.erpsom.domain.Rx;
import com.erpsom.repository.RxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/8/16.
 */
@Service
public class RxService {

    @Autowired
    RxRepository rxRepository;

    public Rx createRx(Rx rx){
        Rx newRx = new Rx();
        newRx = rxRepository.save(rx);
        return newRx;
    }

    public Rx updateRx(Rx rx){
        Rx newRx = new Rx();
        newRx = rxRepository.save(rx);
        return rx;
    }

}
