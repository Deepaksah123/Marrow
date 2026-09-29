package kotlin;

import kotlin.Metadata;
import kotlin.Module;
import kotlin._handleOddName;
import kotlin.isLoadInBackgroundCanceled;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\b\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0018\u00010\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/isLoadInBackgroundCanceled;", "Lo/writerFor;", "Lo/isLoadInBackgroundCanceled$RemoteActionCompatParcelizer;", "<init>", "()V", "", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "read", "()Lo/isLoadInBackgroundCanceled$RemoteActionCompatParcelizer;", "p0", "(Lo/isLoadInBackgroundCanceled$RemoteActionCompatParcelizer;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Lo/isLoadInBackgroundCanceled$RemoteActionCompatParcelizer;", "Lo/getUserStartedTimestampMs;", "write", "Lo/getUserStartedTimestampMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isLoadInBackgroundCanceled extends writerFor<RemoteActionCompatParcelizer> {
    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getUserStartedTimestampMs<getShowPopup> read;

    public final boolean equals(Object p0) {
        return p0 == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(RemoteActionCompatParcelizer p0) {
    }

    public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        getUserStartedTimestampMs<getShowPopup> getuserstartedtimestampmsAudioAttributesCompatParcelizer = this.read;
        if (getuserstartedtimestampmsAudioAttributesCompatParcelizer == null) {
            getuserstartedtimestampmsAudioAttributesCompatParcelizer = getUserSubmittedTimestampMs.AudioAttributesCompatParcelizer(null);
            this.read = getuserstartedtimestampmsAudioAttributesCompatParcelizer;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
            if (remoteActionCompatParcelizer != null && remoteActionCompatParcelizer.getRatingCompat()) {
                remoteActionCompatParcelizer.read();
            }
        }
        Object objAudioAttributesCompatParcelizer = getuserstartedtimestampmsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final RemoteActionCompatParcelizer IconCompatParcelizer() {
        return new RemoteActionCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/isLoadInBackgroundCanceled$RemoteActionCompatParcelizer;", "Lo/_handleOddName$IconCompatParcelizer;", "<init>", "(Lo/isLoadInBackgroundCanceled;)V", "", "c_", "()V", "read", "MediaDescriptionCompat", "Lo/Module$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "Lo/Module$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class RemoteActionCompatParcelizer extends _handleOddName.IconCompatParcelizer {
        private Module.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer() {
        }

        @Override // o._handleOddName.IconCompatParcelizer
        public final void c_() {
            isLoadInBackgroundCanceled.this.RemoteActionCompatParcelizer = this;
            if (isLoadInBackgroundCanceled.this.read != null) {
                read();
            }
        }

        public final void read() {
            final isLoadInBackgroundCanceled isloadinbackgroundcanceled = isLoadInBackgroundCanceled.this;
            this.AudioAttributesCompatParcelizer = getEmptyValue.IconCompatParcelizer(this, 0L, 0L, new getAnswerMap() { // from class: o.loadInBackground
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return isLoadInBackgroundCanceled.RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer, isloadinbackgroundcanceled, (getDefaultPropertyIgnorals) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(RemoteActionCompatParcelizer remoteActionCompatParcelizer, isLoadInBackgroundCanceled isloadinbackgroundcanceled, getDefaultPropertyIgnorals getdefaultpropertyignorals) {
            Module.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.IconCompatParcelizer();
            }
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = null;
            getUserStartedTimestampMs getuserstartedtimestampms = isloadinbackgroundcanceled.read;
            if (getuserstartedtimestampms != null) {
                getuserstartedtimestampms.AudioAttributesCompatParcelizer(getShowPopup.INSTANCE);
            }
            isloadinbackgroundcanceled.read = null;
            return getShowPopup.INSTANCE;
        }

        @Override // o._handleOddName.IconCompatParcelizer
        public final void MediaDescriptionCompat() {
            if (isLoadInBackgroundCanceled.this.RemoteActionCompatParcelizer == this) {
                isLoadInBackgroundCanceled.this.RemoteActionCompatParcelizer = null;
            }
            Module.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.IconCompatParcelizer();
            }
            this.AudioAttributesCompatParcelizer = null;
        }
    }
}
