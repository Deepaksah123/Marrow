package kotlin;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.getChildIndexByChildUid;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/AbstractConcatenatedTimeline;", "Lo/getChildIndexByChildUid;", "Lo/AbstractConcatenatedTimeline$read;", "p0", "<init>", "(Lo/AbstractConcatenatedTimeline$read;)V", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AbstractConcatenatedTimeline extends getChildIndexByChildUid {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractConcatenatedTimeline(read readVar) {
        super(readVar.RemoteActionCompatParcelizer(), readVar.MediaBrowserCompatItemReceiver(), readVar.AudioAttributesImplApi26Parcelizer());
        toMagicModuleMetaRepoModel.write(readVar, "");
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class read extends getChildIndexByChildUid.RemoteActionCompatParcelizer<read, AbstractConcatenatedTimeline> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getChildIndexByChildUid.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
        public read read() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Class<? extends j> cls, long j, TimeUnit timeUnit, TimeUnit timeUnit2) {
            super(cls);
            toMagicModuleMetaRepoModel.write(cls, "");
            toMagicModuleMetaRepoModel.write(timeUnit, "");
            toMagicModuleMetaRepoModel.write(timeUnit2, "");
            MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(timeUnit.toMillis(j), timeUnit2.toMillis(5L));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getChildIndexByChildUid.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
        public AbstractConcatenatedTimeline IconCompatParcelizer() {
            if (AudioAttributesCompatParcelizer() && MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (MediaBrowserCompatItemReceiver().write) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
            }
            return new AbstractConcatenatedTimeline(this);
        }
    }
}
