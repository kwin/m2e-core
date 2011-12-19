/*******************************************************************************
 * Copyright (c) 2008-2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.internal.launch;

import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;


/**
 * @author Eugene Kuleshov
 */
public class MavenSourceLocator extends AbstractSourceLookupDirector {

  public void initializeParticipants() {
    // enabled source lookup participants are calculated dynamically by MavenLaunchDelegate
  }
}
