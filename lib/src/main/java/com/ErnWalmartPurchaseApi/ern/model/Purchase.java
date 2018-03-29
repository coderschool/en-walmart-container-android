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

public class Purchase implements Parcelable, Bridgeable {

    private String orderNumber;
    private String subTotal;
    private String shipping;
    private String tax;
    private String total;
    private String cardEnding;

    private Purchase() {}

    private Purchase(Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.subTotal = builder.subTotal;
        this.shipping = builder.shipping;
        this.tax = builder.tax;
        this.total = builder.total;
        this.cardEnding = builder.cardEnding;
    }

    private Purchase(Parcel in) {
        this(in.readBundle());
    }

    public Purchase(@NonNull Bundle bundle) {
        this.orderNumber = bundle.getString("orderNumber");
        this.subTotal = bundle.getString("subTotal");
        this.shipping = bundle.getString("shipping");
        this.tax = bundle.getString("tax");
        this.total = bundle.getString("total");
        this.cardEnding = bundle.getString("cardEnding");
    }

    public static final Creator<Purchase> CREATOR = new Creator<Purchase>() {
        @Override
        public Purchase createFromParcel(Parcel in) {
            return new Purchase(in);
        }

        @Override
        public Purchase[] newArray(int size) {
            return new Purchase[size];
        }
    };

    @Nullable
    public String getOrderNumber() {
        return orderNumber;
    }

    @Nullable
    public String getSubTotal() {
        return subTotal;
    }

    @Nullable
    public String getShipping() {
        return shipping;
    }

    @Nullable
    public String getTax() {
        return tax;
    }

    @Nullable
    public String getTotal() {
        return total;
    }

    @Nullable
    public String getCardEnding() {
        return cardEnding;
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
        if(orderNumber != null) {
            bundle.putString("orderNumber", this.orderNumber );
        }
        if(subTotal != null) {
            bundle.putString("subTotal", this.subTotal );
        }
        if(shipping != null) {
            bundle.putString("shipping", this.shipping );
        }
        if(tax != null) {
            bundle.putString("tax", this.tax );
        }
        if(total != null) {
            bundle.putString("total", this.total );
        }
        if(cardEnding != null) {
            bundle.putString("cardEnding", this.cardEnding );
        }
        return bundle;
    }

    @Override
    public String toString() {
        return "{"
        + "orderNumber:" + (orderNumber != null ? "\"" + orderNumber + "\"" : null)+ ","
        + "subTotal:" + (subTotal != null ? "\"" + subTotal + "\"" : null)+ ","
        + "shipping:" + (shipping != null ? "\"" + shipping + "\"" : null)+ ","
        + "tax:" + (tax != null ? "\"" + tax + "\"" : null)+ ","
        + "total:" + (total != null ? "\"" + total + "\"" : null)+ ","
        + "cardEnding:" + (cardEnding != null ? "\"" + cardEnding + "\"" : null)
        + "}";
    }

    public static class Builder {
        private String orderNumber;
        private String subTotal;
        private String shipping;
        private String tax;
        private String total;
        private String cardEnding;

        public Builder() {
        }

        @NonNull
        public Builder orderNumber(@Nullable String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        @NonNull
        public Builder subTotal(@Nullable String subTotal) {
            this.subTotal = subTotal;
            return this;
        }
        @NonNull
        public Builder shipping(@Nullable String shipping) {
            this.shipping = shipping;
            return this;
        }
        @NonNull
        public Builder tax(@Nullable String tax) {
            this.tax = tax;
            return this;
        }
        @NonNull
        public Builder total(@Nullable String total) {
            this.total = total;
            return this;
        }
        @NonNull
        public Builder cardEnding(@Nullable String cardEnding) {
            this.cardEnding = cardEnding;
            return this;
        }

        @NonNull
        public Purchase build() {
            return new Purchase(this);
        }
    }
}
