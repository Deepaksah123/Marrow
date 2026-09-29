package com.marrow2.core.di;

import kotlin.BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;
import kotlin.ByteArrayDataSink;
import kotlin.CachedRegionTracker;
import kotlin.DebugTextViewHelper;
import kotlin.GTNudgeRequestModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ServerSideAdInsertionMediaSourceSampleStreamImpl;
import kotlin.ServerSideAdInsertionMediaSourceServerSideAdInsertionTimeline;
import kotlin.elementSet;
import kotlin.getRegionEndTimeMs;
import kotlin.onRemove;
import kotlin.regionsConnect;
import kotlin.setGateway;
import kotlin.storeFully;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0007\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0015H&¢\u0006\u0004\b\u0007\u0010\u0017"}, d2 = {"Lcom/marrow2/core/di/SyncModule;", "", "<init>", "()V", "Lo/ByteArrayDataSink;", "p0", "Lo/BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;", "write", "(Lo/ByteArrayDataSink;)Lo/BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;", "Lo/regionsConnect;", "Lo/getRegionEndTimeMs;", "read", "(Lo/regionsConnect;)Lo/getRegionEndTimeMs;", "Lo/elementSet;", "Lo/DebugTextViewHelper;", "RemoteActionCompatParcelizer", "(Lo/elementSet;)Lo/DebugTextViewHelper;", "Lo/ServerSideAdInsertionMediaSourceServerSideAdInsertionTimeline;", "Lo/ServerSideAdInsertionMediaSourceSampleStreamImpl;", "IconCompatParcelizer", "(Lo/ServerSideAdInsertionMediaSourceServerSideAdInsertionTimeline;)Lo/ServerSideAdInsertionMediaSourceSampleStreamImpl;", "Lo/storeFully;", "Lo/onRemove;", "(Lo/storeFully;)Lo/onRemove;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SyncModule {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract ServerSideAdInsertionMediaSourceSampleStreamImpl IconCompatParcelizer(ServerSideAdInsertionMediaSourceServerSideAdInsertionTimeline p0);

    public abstract DebugTextViewHelper RemoteActionCompatParcelizer(elementSet p0);

    public abstract getRegionEndTimeMs read(regionsConnect p0);

    public abstract BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 write(ByteArrayDataSink p0);

    public abstract onRemove write(storeFully p0);

    /* JADX INFO: renamed from: com.marrow2.core.di.SyncModule$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow2/core/di/SyncModule$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/GTNudgeRequestModel;", "p0", "Lo/CachedRegionTracker;", "write", "(Lo/GTNudgeRequestModel;)Lo/CachedRegionTracker;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final CachedRegionTracker write(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) CachedRegionTracker.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return (CachedRegionTracker) obj;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
