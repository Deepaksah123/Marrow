package kotlin;

import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lo/getMediaPeriodIdTimeline;", "", "<init>", "()V", "", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class getMediaPeriodIdTimeline {
    public static final getMediaPeriodIdTimeline INSTANCE = new getMediaPeriodIdTimeline();

    private getMediaPeriodIdTimeline() {
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer() {
        if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.CrashReport, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.getMediaPeriodIdTimeline.5
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
                public final void RemoteActionCompatParcelizer(boolean z) {
                    if (z) {
                        getPlayingMediaPeriod.INSTANCE.AudioAttributesCompatParcelizer();
                        if (DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.CrashShield)) {
                            isMatchingMediaPeriod.RemoteActionCompatParcelizer();
                            getMinWindowSequenceNumber.write();
                        }
                        if (DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.ThreadCheck)) {
                            getOrAddSession.RemoteActionCompatParcelizer();
                        }
                    }
                }
            });
            DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.ErrorReport, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.getMediaPeriodIdTimeline.4
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
                public final void RemoteActionCompatParcelizer(boolean z) {
                    if (z) {
                        generateDefaultSessionId.AudioAttributesCompatParcelizer();
                    }
                }
            });
            DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.AnrReport, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.getMediaPeriodIdTimeline.3
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
                public final void RemoteActionCompatParcelizer(boolean z) {
                    if (z) {
                        onQueueUpdated.RemoteActionCompatParcelizer();
                    }
                }
            });
        }
    }
}
