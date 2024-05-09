package com.crowdin.client.core.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderByMapper {

    private final LinkedHashMap<String, SortOrder> linkedHashMap;

    public OrderByMapper() {
        this.linkedHashMap = new LinkedHashMap<>();
    }

    /**
     * @param key The field on which the sorting is to be done
     * 
     * @param order The sort strategy in either ascending or descending order
     * 
     * @return Returns the linked hash map instantiated in the constructor with the
     * key,sort strategy pair added
     * 
     */
    public OrderByMapper addSortStrategy(String key, SortOrder order) {

        if (order == null)
            order = SortOrder.ASC;
        this.linkedHashMap.put(key, order);
        return this;
    }

    public void removeSortStrategy(String key) {
        this.linkedHashMap.remove(key);
    }

    public void clearSortStrategy() {
        this.linkedHashMap.clear();
    }

    /**
     * @return Immutable map containing the sort entries to avoid future modification
     * */
    public Map<String, SortOrder> build() {
        return Collections.unmodifiableMap(linkedHashMap);
    }

}