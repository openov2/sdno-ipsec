/*
 * Copyright (c) 2016, Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.ipsecservice.model;

import org.openo.sdno.overlayvpn.inventory.sdk.model.annotation.MOResType;
import org.openo.sdno.overlayvpn.model.common.enums.ActionStatus;
import org.openo.sdno.overlayvpn.model.uuid.AbstUuidModel;

/**
 * Class of IpSecReqModelInfo Model Data. <br/>
 * <p>
 * It is used to recode the original data that passed by caller.
 * </p>
 * 
 * @author
 * @version SDNO 0.5 Jun 16, 2016
 */
@MOResType(infoModelName = "ipsecreqmodelinfo")
public class IpSecReqModelInfo extends AbstUuidModel {

    private String connectionId;

    private String actionState = ActionStatus.NORMAL.getName();

    private String data;

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public String getActionState() {
        return actionState;
    }

    public void setActionState(String actionState) {
        this.actionState = actionState;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}