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
package com.f1reking.gank.entity

/**
 * @author: F1ReKing
 * @date: 2018/6/4
 * @desc:
 */
data class JDHttpEntity(var status: String,
                        val page_count: Int,
                        val total_comments: Int,
                        val count: Int,
                        var comments: List<JDGirlEntity>)