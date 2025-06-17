/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.action.main;

import org.opensearch.core.common.io.stream.StreamInput;

import java.io.IOException;

/**
 * Utility methods.
 */
public class MainPackageAccessHelper {

    /**
     * Shortcut to MainResponse constructor which has package access restriction.
     * 
     * @param in StreamInput
     * @return MainResponse
     * @throws IOException When something goes wrong
     */
    public static MainResponse createMainResponse(StreamInput in) throws IOException {
        return in.readOptionalWriteable(MainResponse::new);
    }
}