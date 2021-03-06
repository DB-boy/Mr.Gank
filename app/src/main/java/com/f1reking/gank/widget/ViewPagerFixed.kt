/*
 *  Copyright (c) 2018 F1ReKing
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.f1reking.gank.widget

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 * @author: F1ReKing
 * @date: 2018/6/10 16:40
 * @desc:
 */
class ViewPagerFixed : ViewPager {

  constructor(context: Context) : super(context)
  constructor(context: Context,
              attrs: AttributeSet?) : super(context, attrs)

  override fun onTouchEvent(ev: MotionEvent?): Boolean {
    try {
      return super.onTouchEvent(ev)
    } catch (ex: IllegalArgumentException) {
      ex.printStackTrace()
    }
    return false
  }

  override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
    try {
      return super.onInterceptTouchEvent(ev)
    } catch (ex: IllegalArgumentException) {
      ex.printStackTrace()
    }
    return false
  }
}