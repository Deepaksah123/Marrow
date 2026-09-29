package com.marrow2.data.mcq.remote;

import kotlin.getSubmittedOn;
import kotlin.getTestId;

/* JADX INFO: loaded from: classes5.dex */
public final class McqRemoteSourceImpl_Factory implements getSubmittedOn<McqRemoteSourceImpl> {
    private final getTestId<McqService> mcqServiceProvider;

    private McqRemoteSourceImpl_Factory(getTestId<McqService> gettestid) {
        this.mcqServiceProvider = gettestid;
    }

    @Override // kotlin.setDescriptionList
    public final McqRemoteSourceImpl get() {
        return newInstance(this.mcqServiceProvider.get());
    }

    public static McqRemoteSourceImpl_Factory create(getTestId<McqService> gettestid) {
        return new McqRemoteSourceImpl_Factory(gettestid);
    }

    public static McqRemoteSourceImpl newInstance(McqService mcqService) {
        return new McqRemoteSourceImpl(mcqService);
    }
}
