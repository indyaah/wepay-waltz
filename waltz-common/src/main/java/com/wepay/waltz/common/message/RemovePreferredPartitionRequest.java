package com.wepay.waltz.common.message;

import java.util.Collections;
import java.util.List;

public class RemovePreferredPartitionRequest extends AbstractMessage {

    public final List<Integer> partitionIds;
    public RemovePreferredPartitionRequest(ReqId reqId, List<Integer> partitionIds) {
        super(reqId);
        this.partitionIds = Collections.unmodifiableList(partitionIds);
    }

    @Override
    public byte type() {
        return MessageType.REMOVE_PREFERRED_PARTITION_REQUEST;
    }
}
