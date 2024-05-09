package com.crowdin.client.core.model;

public enum SortOrder implements EnumConverter<SortOrder> {
    ASC, DESC;

    public static SortOrder from(String value) {
        return SortOrder.valueOf(value.toUpperCase());
    }

    @Override
    public Object to(SortOrder v) {
        // TODO Auto-generated method stub

        return v.ordinal() == 0 || v == null ? "asc" : "desc";
    }

}