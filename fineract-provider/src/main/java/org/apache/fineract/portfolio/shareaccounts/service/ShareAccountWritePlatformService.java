/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.portfolio.shareaccounts.service;

import org.apache.fineract.infrastructure.core.api.JsonCommand;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResult;
import org.apache.fineract.portfolio.shareaccounts.domain.ShareAccountTransaction;



public interface ShareAccountWritePlatformService {

    CommandProcessingResult createShareAccount(JsonCommand jsonCommand);

    CommandProcessingResult updateShareAccount(Long accountId, JsonCommand jsonCommand);

    CommandProcessingResult approveShareAccount(Long accountId, JsonCommand jsonCommand);

    CommandProcessingResult activateShareAccount(Long accountId, JsonCommand jsonCommand);

    CommandProcessingResult rejectShareAccount(Long entityId, JsonCommand jsonCommand);

    CommandProcessingResult undoApproveShareAccount(Long entityId, JsonCommand jsonCommand);

    CommandProcessingResult closeShareAccount(Long accountId, JsonCommand jsonCommand);

    CommandProcessingResult applyAdditionalShares(Long accountId, JsonCommand jsonCommand);

    CommandProcessingResult approveAdditionalShares(Long accountId, JsonCommand jsonCommand);

    ShareAccountTransaction applyAdditionalSharesByTransfer(Long accountId, JsonCommand jsonCommand);

    CommandProcessingResult rejectAdditionalShares(Long accountId, JsonCommand jsonCommand);

    CommandProcessingResult redeemShares(Long accountId, JsonCommand jsonCommand);

    ShareAccountTransaction redeemSharesByTransfer(Long accountId, JsonCommand jsonCommand);
}
