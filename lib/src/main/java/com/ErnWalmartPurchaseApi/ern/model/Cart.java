/*
* Copyright 2017 WalmartLabs
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* http://www.apache.org/licenses/LICENSE-2.0
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.ErnWalmartPurchaseApi.ern.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;

import com.walmartlabs.electrode.reactnative.bridge.Bridgeable;

import static com.walmartlabs.electrode.reactnative.bridge.util.BridgeArguments.*;

public class Cart implements Parcelable, Bridgeable {

    private String id;
    private String name;
    private Integer originPrice;
    private Integer currentPrice;
    private Integer rating;
    private String photo;
    private String ship;
    private Integer quantity;
    private Boolean isSelected;

    private Cart() {}

    private Cart(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.originPrice = builder.originPrice;
        this.currentPrice = builder.currentPrice;
        this.rating = builder.rating;
        this.photo = builder.photo;
        this.ship = builder.ship;
        this.quantity = builder.quantity;
        this.isSelected = builder.isSelected;
    }

    private Cart(Parcel in) {
        this(in.readBundle());
    }

    public Cart(@NonNull Bundle bundle) {
        this.id = bundle.getString("id");
        this.name = bundle.getString("name");
        this.originPrice = getNumberValue(bundle, "originPrice") == null ? null : getNumberValue(bundle, "originPrice").intValue();
        this.currentPrice = getNumberValue(bundle, "currentPrice") == null ? null : getNumberValue(bundle, "currentPrice").intValue();
        this.rating = getNumberValue(bundle, "rating") == null ? null : getNumberValue(bundle, "rating").intValue();
        this.photo = bundle.getString("photo");
        this.ship = bundle.getString("ship");
        this.quantity = getNumberValue(bundle, "quantity") == null ? null : getNumberValue(bundle, "quantity").intValue();
        this.isSelected = bundle.containsKey("isSelected") ? bundle.getBoolean("isSelected") : null;
    }

    public static final Creator<Cart> CREATOR = new Creator<Cart>() {
        @Override
        public Cart createFromParcel(Parcel in) {
            return new Cart(in);
        }

        @Override
        public Cart[] newArray(int size) {
            return new Cart[size];
        }
    };

    @Nullable
    public String getId() {
        return id;
    }

    @Nullable
    public String getName() {
        return name;
    }

    @Nullable
    public Integer getOriginPrice() {
        return originPrice;
    }

    @Nullable
    public Integer getCurrentPrice() {
        return currentPrice;
    }

    @Nullable
    public Integer getRating() {
        return rating;
    }

    @Nullable
    public String getPhoto() {
        return photo;
    }

    @Nullable
    public String getShip() {
        return ship;
    }

    @Nullable
    public Integer getQuantity() {
        return quantity;
    }

    @Nullable
    public Boolean getIsSelected() {
        return isSelected;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeBundle(toBundle());
    }

    @NonNull
    @Override
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if(id != null) {
            bundle.putString("id", this.id );
        }
        if(name != null) {
            bundle.putString("name", this.name );
        }
        if(this.originPrice != null) {
            bundle.putInt("originPrice", this.originPrice);
        }
        if(this.currentPrice != null) {
            bundle.putInt("currentPrice", this.currentPrice);
        }
        if(this.rating != null) {
            bundle.putInt("rating", this.rating);
        }
        if(photo != null) {
            bundle.putString("photo", this.photo );
        }
        if(ship != null) {
            bundle.putString("ship", this.ship );
        }
        if(this.quantity != null) {
            bundle.putInt("quantity", this.quantity);
        }
        if(this.isSelected != null) {
            bundle.putBoolean("isSelected", this.isSelected);
        }
        return bundle;
    }

    @Override
    public String toString() {
        return "{"
        + "id:" + (id != null ? "\"" + id + "\"" : null)+ ","
        + "name:" + (name != null ? "\"" + name + "\"" : null)+ ","
        + "originPrice:" + originPrice+ ","
        + "currentPrice:" + currentPrice+ ","
        + "rating:" + rating+ ","
        + "photo:" + (photo != null ? "\"" + photo + "\"" : null)+ ","
        + "ship:" + (ship != null ? "\"" + ship + "\"" : null)+ ","
        + "quantity:" + quantity+ ","
        + "isSelected:" + isSelected
        + "}";
    }

    public static class Builder {
        private String id;
        private String name;
        private Integer originPrice;
        private Integer currentPrice;
        private Integer rating;
        private String photo;
        private String ship;
        private Integer quantity;
        private Boolean isSelected;

        public Builder() {
        }

        @NonNull
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @NonNull
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @NonNull
        public Builder originPrice(@Nullable Integer originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        @NonNull
        public Builder currentPrice(@Nullable Integer currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }
        @NonNull
        public Builder rating(@Nullable Integer rating) {
            this.rating = rating;
            return this;
        }
        @NonNull
        public Builder photo(@Nullable String photo) {
            this.photo = photo;
            return this;
        }
        @NonNull
        public Builder ship(@Nullable String ship) {
            this.ship = ship;
            return this;
        }
        @NonNull
        public Builder quantity(@Nullable Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        @NonNull
        public Builder isSelected(@Nullable Boolean isSelected) {
            this.isSelected = isSelected;
            return this;
        }

        @NonNull
        public Cart build() {
            return new Cart(this);
        }
    }
}
