package com.marrow2.core.di.coroutine;

import kotlin.Metadata;
import kotlin.getPlatform;
import kotlin.setMbbsVerificationYear;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/marrow2/core/di/coroutine/CoroutinesDispatchersModule;", "", "<init>", "()V", "Lo/getPlatform;", "write", "()Lo/getPlatform;", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoroutinesDispatchersModule {
    public static final CoroutinesDispatchersModule INSTANCE = new CoroutinesDispatchersModule();

    private CoroutinesDispatchersModule() {
    }

    public final getPlatform write() {
        return setMbbsVerificationYear.IconCompatParcelizer();
    }

    public final getPlatform read() {
        return setMbbsVerificationYear.write();
    }

    public final getPlatform AudioAttributesCompatParcelizer() {
        return setMbbsVerificationYear.RemoteActionCompatParcelizer();
    }

    public final getPlatform IconCompatParcelizer() {
        return setMbbsVerificationYear.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
    }
}
