package com.hackathon.hackathon.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.hackathon.model.Bidder;
import com.hackathon.hackathon.model.Item;

import static java.util.stream.Collectors.*;

@Service
public class HackathonService {
	
	private static final String ITEM_NOT_FOUND = "Item not found";
	private static final String OFFER_ACCEPTED = "Offer accepted";
	private static final String OFFER_REJECTED = "Offer rejected";

    private final List<Item> items;

    @Autowired
    public HackathonService(List<Item> items) {
        this.items = items;
    }

    public List<Item> getAllItems() {
        return new ArrayList<>(items);
    }

    public List<Item> getItemsByType(String type) {
    	return items.stream()
                .filter(item -> item.getType().equalsIgnoreCase(type))
                .toList();
    }

    public void addItem(Item item) {
        items.add(item);
    }

	public String makeOffer(String itemName, double amount, Bidder bidder) {

        Optional<Item> item = items.stream()
                .filter(itemInList -> itemInList.getName().equalsIgnoreCase(itemName))
                .findAny();

    	if(item.isEmpty()) {
            return ITEM_NOT_FOUND;
        }

        Item foundItem = item.get();

        if(amount > foundItem.getHighestOffer()) {
            foundItem.setHighestOffer(amount);
            item.get().setCurrentBidder(bidder);
            return OFFER_ACCEPTED;
        }

        return OFFER_REJECTED;
	}

	public Map<String, String> getWinningBidder() {
    	return items.stream()
                .filter(item -> item.getCurrentBidder() != null)
                .collect(toMap(Item::getName, item -> item.getCurrentBidder().getName()));
    }
}