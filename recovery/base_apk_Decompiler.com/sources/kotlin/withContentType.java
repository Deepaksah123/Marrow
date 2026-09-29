package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\f\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u000b\u0010\u0017J\u0017\u0010\u0007\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0011\u0010\f\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u001bR\u0014\u0010\u0013\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001dR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u001d"}, d2 = {"Lo/withContentType;", "Lo/isAbstract;", "Lo/readerFor;", "p0", "<init>", "(Lo/readerFor;)V", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(J)J", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "IconCompatParcelizer", "p1", "(Lo/isAbstract;J)J", "", "p2", "(Lo/isAbstract;JZ)J", "Lo/WritableTypeIdInclusion;", "write", "(Lo/isAbstract;Z)Lo/WritableTypeIdInclusion;", "Lo/resetWithShared;", "", "(Lo/isAbstract;[F)V", "([F)V", "Lo/readerFor;", "Lo/_bindAndClose;", "()Lo/_bindAndClose;", "Lo/getKey;", "()J", "()Lo/isAbstract;", "MediaBrowserCompatItemReceiver", "()Z", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withContentType implements isAbstract {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final readerFor RemoteActionCompatParcelizer;

    public withContentType(readerFor readerfor) {
        this.RemoteActionCompatParcelizer = readerfor;
    }

    public final _bindAndClose IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.isAbstract
    public final long write() {
        readerFor readerfor = this.RemoteActionCompatParcelizer;
        long j = -1;
        return getKey.read((((long) readerfor.getRead()) << 32) | (((long) readerfor.getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    @Override // kotlin.isAbstract
    public final isAbstract RemoteActionCompatParcelizer() {
        readerFor write;
        if (!MediaBrowserCompatItemReceiver()) {
            reportWrongTokenException.read("LayoutCoordinate operations are only valid when isAttached is true");
        }
        _bindAndClose audioAttributesImplApi26Parcelizer = IconCompatParcelizer().getIconCompatParcelizer().r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer == null || (write = audioAttributesImplApi26Parcelizer.getWrite()) == null) {
            return null;
        }
        return write.onFastForward();
    }

    @Override // kotlin.isAbstract
    public final boolean MediaBrowserCompatItemReceiver() {
        return IconCompatParcelizer().MediaBrowserCompatItemReceiver();
    }

    private final long AudioAttributesCompatParcelizer() {
        readerFor readerforWrite = withContentTypeHandler.write(this.RemoteActionCompatParcelizer);
        return getReferencedType.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(readerforWrite.onFastForward(), getReferencedType.INSTANCE.write()), IconCompatParcelizer().RemoteActionCompatParcelizer(readerforWrite.getAudioAttributesCompatParcelizer(), getReferencedType.INSTANCE.write()));
    }

    @Override // kotlin.isAbstract
    public final long AudioAttributesCompatParcelizer(long p0) {
        return getReferencedType.RemoteActionCompatParcelizer(IconCompatParcelizer().AudioAttributesCompatParcelizer(p0), AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.isAbstract
    public final long RemoteActionCompatParcelizer(long p0) {
        return IconCompatParcelizer().RemoteActionCompatParcelizer(getReferencedType.RemoteActionCompatParcelizer(p0, AudioAttributesCompatParcelizer()));
    }

    @Override // kotlin.isAbstract
    public final long AudioAttributesImplBaseParcelizer(long p0) {
        return getReferencedType.RemoteActionCompatParcelizer(IconCompatParcelizer().AudioAttributesImplBaseParcelizer(p0), AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.isAbstract
    public final long read(long p0) {
        return IconCompatParcelizer().read(getReferencedType.RemoteActionCompatParcelizer(p0, AudioAttributesCompatParcelizer()));
    }

    @Override // kotlin.isAbstract
    public final long IconCompatParcelizer(long p0) {
        return IconCompatParcelizer().IconCompatParcelizer(getReferencedType.RemoteActionCompatParcelizer(p0, AudioAttributesCompatParcelizer()));
    }

    @Override // kotlin.isAbstract
    public final long RemoteActionCompatParcelizer(isAbstract p0, long p1) {
        return IconCompatParcelizer(p0, p1, true);
    }

    @Override // kotlin.isAbstract
    public final long IconCompatParcelizer(isAbstract p0, long p1, boolean p2) {
        if (p0 instanceof withContentType) {
            readerFor readerfor = ((withContentType) p0).RemoteActionCompatParcelizer;
            readerfor.getAudioAttributesCompatParcelizer().PlaybackStateCompatCustomAction();
            readerFor write = IconCompatParcelizer().AudioAttributesCompatParcelizer(readerfor.getAudioAttributesCompatParcelizer()).getWrite();
            if (write != null) {
                boolean z = !p2;
                long jIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(hasReferringProperties.AudioAttributesCompatParcelizer(readerfor.AudioAttributesCompatParcelizer(write, z), referringProperties.AudioAttributesCompatParcelizer(p1)), this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(write, z));
                long j = -1;
                return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(hasReferringProperties.IconCompatParcelizer(jIconCompatParcelizer))) << 32) | (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(hasReferringProperties.AudioAttributesCompatParcelizer(jIconCompatParcelizer)))));
            }
            readerFor readerforWrite = withContentTypeHandler.write(readerfor);
            boolean z2 = !p2;
            long jAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(hasReferringProperties.AudioAttributesCompatParcelizer(readerfor.AudioAttributesCompatParcelizer(readerforWrite, z2), readerforWrite.getRead()), referringProperties.AudioAttributesCompatParcelizer(p1));
            readerFor readerforWrite2 = withContentTypeHandler.write(this.RemoteActionCompatParcelizer);
            long jIconCompatParcelizer2 = hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer, hasReferringProperties.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(readerforWrite2, z2), readerforWrite2.getRead()));
            float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(jIconCompatParcelizer2);
            long j2 = -1;
            long jAudioAttributesCompatParcelizer2 = getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(hasReferringProperties.AudioAttributesCompatParcelizer(jIconCompatParcelizer2)))) | (Float.floatToRawIntBits(fIconCompatParcelizer) << 32));
            _bindAndClose audioAttributesImplApi26Parcelizer = readerforWrite2.getAudioAttributesCompatParcelizer().getAudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer);
            _bindAndClose audioAttributesImplApi26Parcelizer2 = readerforWrite.getAudioAttributesCompatParcelizer().getAudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer2);
            return audioAttributesImplApi26Parcelizer.IconCompatParcelizer(audioAttributesImplApi26Parcelizer2, jAudioAttributesCompatParcelizer2, p2);
        }
        readerFor readerforWrite3 = withContentTypeHandler.write(this.RemoteActionCompatParcelizer);
        long jIconCompatParcelizer3 = IconCompatParcelizer(readerforWrite3.getHandleMediaPlayPauseIfPendingOnHandler(), p1, p2);
        long read = readerforWrite3.getRead();
        float fIconCompatParcelizer2 = hasReferringProperties.IconCompatParcelizer(read);
        long j3 = -1;
        long jAudioAttributesCompatParcelizer3 = getReferencedType.AudioAttributesCompatParcelizer(jIconCompatParcelizer3, getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) Float.floatToRawIntBits(hasReferringProperties.AudioAttributesCompatParcelizer(read)))) | (Float.floatToRawIntBits(fIconCompatParcelizer2) << 32)));
        isAbstract isabstractOnStop = readerforWrite3.getAudioAttributesCompatParcelizer().onStop();
        if (isabstractOnStop == null) {
            isabstractOnStop = readerforWrite3.getAudioAttributesCompatParcelizer().onFastForward();
        }
        return getReferencedType.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer3, isabstractOnStop.IconCompatParcelizer(p0, getReferencedType.INSTANCE.write(), p2));
    }

    @Override // kotlin.isAbstract
    public final WritableTypeIdInclusion write(isAbstract p0, boolean p1) {
        return IconCompatParcelizer().write(p0, p1);
    }

    @Override // kotlin.isAbstract
    public final void read(isAbstract p0, float[] p1) {
        IconCompatParcelizer().read(p0, p1);
    }

    @Override // kotlin.isAbstract
    public final void AudioAttributesCompatParcelizer(float[] p0) {
        IconCompatParcelizer().AudioAttributesCompatParcelizer(p0);
    }
}
