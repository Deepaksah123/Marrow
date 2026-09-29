package com.marrow.data.dataprovider.magic_module.remote;

import kotlin.getSubmittedOn;
import kotlin.getTestId;

/* JADX INFO: loaded from: classes5.dex */
public final class MagicModuleRemoteImpl_Factory implements getSubmittedOn<MagicModuleRemoteImpl> {
    private final getTestId<MagicModuleService> magicModuleServiceProvider;

    private MagicModuleRemoteImpl_Factory(getTestId<MagicModuleService> gettestid) {
        this.magicModuleServiceProvider = gettestid;
    }

    @Override // kotlin.setDescriptionList
    public final MagicModuleRemoteImpl get() {
        return newInstance(this.magicModuleServiceProvider.get());
    }

    public static MagicModuleRemoteImpl_Factory create(getTestId<MagicModuleService> gettestid) {
        return new MagicModuleRemoteImpl_Factory(gettestid);
    }

    public static MagicModuleRemoteImpl newInstance(MagicModuleService magicModuleService) {
        return new MagicModuleRemoteImpl(magicModuleService);
    }
}
