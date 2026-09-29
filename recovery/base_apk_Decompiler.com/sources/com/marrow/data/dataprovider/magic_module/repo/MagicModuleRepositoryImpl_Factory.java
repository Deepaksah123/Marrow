package com.marrow.data.dataprovider.magic_module.repo;

import com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal;
import com.marrow.data.dataprovider.magic_module.remote.MagicModuleRemote;
import kotlin.getSubmittedOn;
import kotlin.getTestId;

/* JADX INFO: loaded from: classes5.dex */
public final class MagicModuleRepositoryImpl_Factory implements getSubmittedOn<MagicModuleRepositoryImpl> {
    private final getTestId<MagicModuleLocal> magicModuleLocalProvider;
    private final getTestId<MagicModuleRemote> magicModuleRemoteProvider;

    private MagicModuleRepositoryImpl_Factory(getTestId<MagicModuleLocal> gettestid, getTestId<MagicModuleRemote> gettestid2) {
        this.magicModuleLocalProvider = gettestid;
        this.magicModuleRemoteProvider = gettestid2;
    }

    @Override // kotlin.setDescriptionList
    public final MagicModuleRepositoryImpl get() {
        return newInstance(this.magicModuleLocalProvider.get(), this.magicModuleRemoteProvider.get());
    }

    public static MagicModuleRepositoryImpl_Factory create(getTestId<MagicModuleLocal> gettestid, getTestId<MagicModuleRemote> gettestid2) {
        return new MagicModuleRepositoryImpl_Factory(gettestid, gettestid2);
    }

    public static MagicModuleRepositoryImpl newInstance(MagicModuleLocal magicModuleLocal, MagicModuleRemote magicModuleRemote) {
        return new MagicModuleRepositoryImpl(magicModuleLocal, magicModuleRemote);
    }
}
