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

import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeHolder;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeRequestHandler;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeResponseListener;
import com.walmartlabs.electrode.reactnative.bridge.None;
import com.walmartlabs.electrode.reactnative.bridge.RequestHandlerProcessor;
import com.walmartlabs.electrode.reactnative.bridge.RequestProcessor;
import java.util.*;
import com.ErnWalmartPurchaseApi.ern.model.Cart;


final class CartRequests implements CartApi.Requests {
    CartRequests() {}


    @Override
    public void registerGetCartRequestHandler(@NonNull final ElectrodeBridgeRequestHandler<None, List<Cart>> handler) {
        new RequestHandlerProcessor<>(REQUEST_GET_CART, None.class, (Class) Cart.class, handler).execute();
    }

    @Override
    public void registerSaveCartRequestHandler(@NonNull final ElectrodeBridgeRequestHandler<None, List<Cart>> handler) {
        new RequestHandlerProcessor<>(REQUEST_SAVE_CART, None.class, (Class) Cart.class, handler).execute();
    }

    //------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void getCart(@NonNull final ElectrodeBridgeResponseListener<List<Cart>> responseListener) {
        new RequestProcessor<>(REQUEST_GET_CART, null, (Class) List.class, Cart.class, responseListener).execute();
    }
    @Override
    public void saveCart(@NonNull final ElectrodeBridgeResponseListener<List<Cart>> responseListener) {
        new RequestProcessor<>(REQUEST_SAVE_CART, null, (Class) List.class, Cart.class, responseListener).execute();
    }
}