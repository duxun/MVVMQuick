/*
 *    Copyright 2018 XuJiaji
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.xujiaji.mvvmquick.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

/**
 * author: xujiaji
 * created on: 2018/7/4 16:54
 * description:
 */
public class MQViewModel extends AndroidViewModel {
    private int loadOffset = initLoadOffset();

    public MQViewModel(@NonNull Application application) {
        super(application);
    }

    public void onDestroy() {

    }

    public void onListRefresh() {
        loadOffset = initLoadOffset();
    }

    public void onListLoad(int offset) {
    }

    public int getLoadOffset() {
        return ++loadOffset;
    }

    /**
     * 超时时间(单位：s)
     */
    public int timeout() {
        return 20;
    }

    public int initLoadOffset() {
        return 0;
    }
}
