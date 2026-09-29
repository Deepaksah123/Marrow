package com.marrow.di.service;

import android.app.Service;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ProgressiveMediaExtractor;
import kotlin.ProgressiveMediaPeriod;
import kotlin.discardSampleMetadataToRead;
import kotlin.discardToEnd;
import kotlin.discardUpstreamFrom;
import kotlin.discardUpstreamSamples;
import kotlin.getChannel;
import kotlin.getDisplayCues;
import kotlin.getLargestReadTimestampUs$write;
import kotlin.isPendingReset;
import kotlin.setSeekMap;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH&¢\u0006\u0004\b\u0007\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/marrow/di/service/ServicePresenterModule;", "", "<init>", "()V", "Lo/setSeekMap;", "p0", "Lo/isPendingReset$write;", "AudioAttributesCompatParcelizer", "(Lo/setSeekMap;)Lo/isPendingReset$write;", "Lo/discardSampleMetadataToRead;", "Lo/discardToEnd$read;", "IconCompatParcelizer", "(Lo/discardSampleMetadataToRead;)Lo/discardToEnd$read;", "Lo/discardUpstreamFrom;", "Lo/discardUpstreamSamples$AudioAttributesCompatParcelizer;", "(Lo/discardUpstreamFrom;)Lo/discardUpstreamSamples$AudioAttributesCompatParcelizer;", "Lo/ProgressiveMediaPeriod;", "Lo/ProgressiveMediaExtractor$IconCompatParcelizer;", "write", "(Lo/ProgressiveMediaPeriod;)Lo/ProgressiveMediaExtractor$IconCompatParcelizer;", "Lo/getDisplayCues;", "AudioAttributesCompatParcelizer$62676930", "(Lo/getDisplayCues;)Lo/getDisplayCues;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ServicePresenterModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract discardUpstreamSamples.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(discardUpstreamFrom p0);

    public abstract isPendingReset.write AudioAttributesCompatParcelizer(setSeekMap p0);

    public abstract getDisplayCues AudioAttributesCompatParcelizer$62676930(getDisplayCues p0);

    public abstract discardToEnd.read IconCompatParcelizer(discardSampleMetadataToRead p0);

    public abstract ProgressiveMediaExtractor.IconCompatParcelizer write(ProgressiveMediaPeriod p0);

    /* JADX INFO: renamed from: com.marrow.di.service.ServicePresenterModule$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/marrow/di/service/ServicePresenterModule$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Service;", "p0", "Lo/getChannel;", "IconCompatParcelizer", "(Landroid/app/Service;)Lo/getChannel;", "Lo/isPendingReset$IconCompatParcelizer;", "read", "(Landroid/app/Service;)Lo/isPendingReset$IconCompatParcelizer;", "Lo/getLargestReadTimestampUs$write;", "RemoteActionCompatParcelizer", "(Landroid/app/Service;)Lo/getLargestReadTimestampUs$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final getChannel IconCompatParcelizer(Service p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (getChannel) p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final isPendingReset.IconCompatParcelizer read(Service p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (isPendingReset.IconCompatParcelizer) p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final getLargestReadTimestampUs$write RemoteActionCompatParcelizer(Service p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (getLargestReadTimestampUs$write) p0;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
