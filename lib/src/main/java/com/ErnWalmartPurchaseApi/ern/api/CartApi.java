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

package com.ErnWalmartPurchaseApi.ern.api;

import android.support.annotation.NonNull;

import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeEventListener;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeEvent;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeRequestHandler;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeResponseListener;
import com.walmartlabs.electrode.reactnative.bridge.None;
import java.util.*;
import java.util.UUID;

import com.ErnWalmartPurchaseApi.ern.model.Cart;

public final class CartApi {
    private static final Requests REQUESTS;

    static {
        REQUESTS = new CartRequests();
    }

    private CartApi() {
    }

    @NonNull
    public static Requests requests() {
        return REQUESTS;
    }



    public interface Requests {
        String REQUEST_GET_CART = "com.ErnWalmartPurchaseApi.ern.api.request.getCart";
        String REQUEST_SAVE_CART = "com.ErnWalmartPurchaseApi.ern.api.request.saveCart";


        void registerGetCartRequestHandler(@NonNull final ElectrodeBridgeRequestHandler<None, List<Cart>> handler);

        void registerSaveCartRequestHandler(@NonNull final ElectrodeBridgeRequestHandler<None, List<Cart>> handler);

        void getCart(@NonNull final ElectrodeBridgeResponseListener<List<Cart>> responseListener);

        void saveCart(@NonNull final ElectrodeBridgeResponseListener<List<Cart>> responseListener);

    }
}