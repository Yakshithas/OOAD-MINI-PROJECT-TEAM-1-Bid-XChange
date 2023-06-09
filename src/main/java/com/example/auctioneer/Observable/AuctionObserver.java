package com.example.auctioneer.Observable;

import com.example.auctioneer.Model.Auction;
import com.example.auctioneer.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
@Service
public class AuctionObserver implements Observer {
    private Auction auction;

    @Autowired
    EmailService emailService;

    @Override
    public void update(Observable o, Object arg) {
        auction=(Auction)arg;
        emailService.sendAuctionEmail(auction);
    }
}
