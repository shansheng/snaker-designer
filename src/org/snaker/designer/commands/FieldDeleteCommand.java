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
package org.snaker.designer.commands;

import org.eclipse.gef.commands.Command;

import org.snaker.designer.model.BaseElement;
import org.snaker.designer.model.Field;
import org.snaker.designer.model.Form;
import org.snaker.designer.model.Task;

/**
 * field删除命令
 * @author yuqs
 * @version 1.0
 */
public class FieldDeleteCommand extends Command {
	private BaseElement parent;

	private Field model;

	public Field getModel() {
		return this.model;
	}

	public void setModel(Field model) {
		this.model = model;
	}

	public BaseElement getParent() {
		return this.parent;
	}

	public void setParent(BaseElement parent) {
		this.parent = parent;
	}

	@Override
	public void execute() {
		if (this.parent instanceof Form) {
			((Form) this.parent).removeField(this.model);
		} else if (this.parent instanceof Task) {
			((Task) this.parent).removeField(this.model);
		}
	}

	@Override
	public void undo() {
		if (this.parent instanceof Form) {
			((Form) this.parent).addField(this.model);
		} else if (this.parent instanceof Task) {
			((Task) this.parent).addField(this.model);
		}
	}
}
