/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.boot.nacos.autoconfigure;

import com.alibaba.boot.nacos.config.autoconfigure.NacosBootConfigException;
import org.junit.Assert;
import org.junit.Test;

/**
 *  {@link NacosBootConfigException} Test
 * @ClassName: NacosBootConfigExceptionTest
 * @Author: ChenHao26
 * @Date: 2022/8/12 15:56
 */
public class NacosBootConfigExceptionTest {
    
    @Test
    public void getCons() {
        try {
            testMethod("spring boot");
        }catch (Exception e) {
            Assert.assertTrue(e instanceof NacosBootConfigException);
        }
    }
    
    private  void testMethod(String str) {
        if (str.startsWith("spring")) {
            throw new NacosBootConfigException(new Throwable());
        }
    }
}
