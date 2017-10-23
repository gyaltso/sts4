/*******************************************************************************
 * Copyright (c) 2017 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.vscode.commons.languageserver.java;

import org.springframework.ide.vscode.commons.java.IJavaProject;

/**
 * Java Projects Cache
 * 
 * @author Alex Boyko
 *
 * @param <K> key class
 * @param <P> java project class
 */
public interface JavaProjectCache<K, P extends IJavaProject> extends ProjectObserver {

	P project(K key);
	
}