/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.designer.model;

import java.util.Collections;
import java.util.List;

/**
 * 开始节点模型类
 * @author yuqs
 * @version 1.0
 */
public class Start extends NodeElement {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4432755584557916445L;
	
	/**
	 * 开始节点输入变迁为空
	 */
	@Override
	public List<Transition> getInputs() {
		return Collections.emptyList();
	}
}
