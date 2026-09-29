package kotlin;

import android.os.Parcel;
import android.util.Base64;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u0005\u0010\u0014J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0015¢\u0006\u0004\b\u000b\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0016¢\u0006\u0004\b\u0005\u0010\u0017J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0018¢\u0006\u0004\b\u000b\u0010\u0019J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001a¢\u0006\u0004\b\u0007\u0010\u001bJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001c¢\u0006\u0004\b\u0007\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001e¢\u0006\u0004\b\u0005\u0010\u001fJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020 ¢\u0006\u0004\b\u0007\u0010\u0014J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020!¢\u0006\u0004\b\u0007\u0010\u0017J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\"¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010#R\u0016\u0010\u000b\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lo/WindowInsetsCompatImpl20;", "", "<init>", "()V", "", "IconCompatParcelizer", "", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "Lo/_findPropertyUnwrapper;", "p0", "AudioAttributesCompatParcelizer", "(Lo/_findPropertyUnwrapper;)V", "Lo/switchToNext;", "write", "(J)V", "Lo/ReadableObjectIdReferring;", "Lo/getDataStream;", "(Lo/getDataStream;)V", "Lo/withValueDeserializer;", "(I)V", "Lo/_findFormat;", "Lo/_find2ViaAlias;", "(F)V", "Lo/CreatorCandidate;", "(Lo/CreatorCandidate;)V", "Lo/renameAll;", "(Lo/renameAll;)V", "Lo/nopInstance;", "(Lo/nopInstance;)V", "", "(B)V", "", "", "Lo/setClientId;", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "read", "Landroid/os/Parcel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowInsetsCompatImpl20 {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Parcel AudioAttributesCompatParcelizer = Parcel.obtain();

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.recycle();
        this.AudioAttributesCompatParcelizer = Parcel.obtain();
    }

    public final String RemoteActionCompatParcelizer() {
        return Base64.encodeToString(this.AudioAttributesCompatParcelizer.marshall(), 0);
    }

    public final void AudioAttributesCompatParcelizer(_findPropertyUnwrapper p0) {
        if (!switchToNext.RemoteActionCompatParcelizer(p0.read(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            IconCompatParcelizer((byte) 1);
            write(p0.read());
        }
        if (!ReadableObjectIdReferring.AudioAttributesCompatParcelizer(p0.getAudioAttributesCompatParcelizer(), ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer())) {
            IconCompatParcelizer((byte) 2);
            RemoteActionCompatParcelizer(p0.getAudioAttributesCompatParcelizer());
        }
        getDataStream remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer != null) {
            IconCompatParcelizer((byte) 3);
            RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        withValueDeserializer write = p0.getWrite();
        if (write != null) {
            int iconCompatParcelizer = write.getIconCompatParcelizer();
            IconCompatParcelizer((byte) 4);
            IconCompatParcelizer(iconCompatParcelizer);
        }
        _findFormat read = p0.getRead();
        if (read != null) {
            int read2 = read.getRead();
            IconCompatParcelizer((byte) 5);
            AudioAttributesCompatParcelizer(read2);
        }
        String mediaBrowserCompatCustomActionResultReceiver = p0.getMediaBrowserCompatCustomActionResultReceiver();
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            IconCompatParcelizer((byte) 6);
            RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        }
        if (!ReadableObjectIdReferring.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver(), ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer())) {
            IconCompatParcelizer((byte) 7);
            RemoteActionCompatParcelizer(p0.getMediaBrowserCompatItemReceiver());
        }
        _find2ViaAlias audioAttributesImplApi21Parcelizer = p0.getAudioAttributesImplApi21Parcelizer();
        if (audioAttributesImplApi21Parcelizer != null) {
            float audioAttributesCompatParcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer();
            IconCompatParcelizer((byte) 8);
            IconCompatParcelizer(audioAttributesCompatParcelizer);
        }
        CreatorCandidate audioAttributesImplApi26Parcelizer = p0.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer != null) {
            IconCompatParcelizer((byte) 9);
            AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer);
        }
        if (!switchToNext.RemoteActionCompatParcelizer(p0.getMediaDescriptionCompat(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            IconCompatParcelizer((byte) 10);
            write(p0.getMediaDescriptionCompat());
        }
        renameAll mediaMetadataCompat = p0.getMediaMetadataCompat();
        if (mediaMetadataCompat != null) {
            IconCompatParcelizer((byte) 11);
            RemoteActionCompatParcelizer(mediaMetadataCompat);
        }
        nopInstance mediaBrowserCompatSearchResultReceiver = p0.getMediaBrowserCompatSearchResultReceiver();
        if (mediaBrowserCompatSearchResultReceiver != null) {
            IconCompatParcelizer((byte) 12);
            RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver);
        }
    }

    public final void write(long p0) {
        AudioAttributesCompatParcelizer(p0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(long r5) {
        /*
            r4 = this;
            long r0 = kotlin.ReadableObjectIdReferring.write(r5)
            o.processUnwrapped$read r2 = kotlin.processUnwrapped.INSTANCE
            long r2 = r2.IconCompatParcelizer()
            boolean r2 = kotlin.processUnwrapped.read(r0, r2)
            if (r2 != 0) goto L2c
            o.processUnwrapped$read r2 = kotlin.processUnwrapped.INSTANCE
            long r2 = r2.read()
            boolean r2 = kotlin.processUnwrapped.read(r0, r2)
            if (r2 == 0) goto L1e
            r0 = 1
            goto L2d
        L1e:
            o.processUnwrapped$read r2 = kotlin.processUnwrapped.INSTANCE
            long r2 = r2.AudioAttributesCompatParcelizer()
            boolean r0 = kotlin.processUnwrapped.read(r0, r2)
            if (r0 == 0) goto L2c
            r0 = 2
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r4.IconCompatParcelizer(r0)
            long r0 = kotlin.ReadableObjectIdReferring.write(r5)
            o.processUnwrapped$read r2 = kotlin.processUnwrapped.INSTANCE
            long r2 = r2.IconCompatParcelizer()
            boolean r0 = kotlin.processUnwrapped.read(r0, r2)
            if (r0 != 0) goto L47
            float r5 = kotlin.ReadableObjectIdReferring.AudioAttributesCompatParcelizer(r5)
            r4.RemoteActionCompatParcelizer(r5)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WindowInsetsCompatImpl20.RemoteActionCompatParcelizer(long):void");
    }

    public final void RemoteActionCompatParcelizer(getDataStream p0) {
        RemoteActionCompatParcelizer(p0.getAudioAttributesCompatParcelizer());
    }

    public final void IconCompatParcelizer(int p0) {
        IconCompatParcelizer((withValueDeserializer.write(p0, withValueDeserializer.INSTANCE.IconCompatParcelizer()) || !withValueDeserializer.write(p0, withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer())) ? (byte) 0 : (byte) 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(int r2) {
        /*
            r1 = this;
            o._findFormat$AudioAttributesCompatParcelizer r0 = kotlin._findFormat.INSTANCE
            int r0 = r0.IconCompatParcelizer()
            boolean r0 = kotlin._findFormat.AudioAttributesCompatParcelizer(r2, r0)
            if (r0 != 0) goto L36
            o._findFormat$AudioAttributesCompatParcelizer r0 = kotlin._findFormat.INSTANCE
            int r0 = r0.RemoteActionCompatParcelizer()
            boolean r0 = kotlin._findFormat.AudioAttributesCompatParcelizer(r2, r0)
            if (r0 == 0) goto L1a
            r2 = 1
            goto L37
        L1a:
            o._findFormat$AudioAttributesCompatParcelizer r0 = kotlin._findFormat.INSTANCE
            int r0 = r0.AudioAttributesCompatParcelizer()
            boolean r0 = kotlin._findFormat.AudioAttributesCompatParcelizer(r2, r0)
            if (r0 == 0) goto L28
            r2 = 2
            goto L37
        L28:
            o._findFormat$AudioAttributesCompatParcelizer r0 = kotlin._findFormat.INSTANCE
            int r0 = r0.write()
            boolean r2 = kotlin._findFormat.AudioAttributesCompatParcelizer(r2, r0)
            if (r2 == 0) goto L36
            r2 = 3
            goto L37
        L36:
            r2 = 0
        L37:
            r1.IconCompatParcelizer(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WindowInsetsCompatImpl20.AudioAttributesCompatParcelizer(int):void");
    }

    public final void IconCompatParcelizer(float p0) {
        RemoteActionCompatParcelizer(p0);
    }

    public final void AudioAttributesCompatParcelizer(CreatorCandidate p0) {
        RemoteActionCompatParcelizer(p0.getRemoteActionCompatParcelizer());
        RemoteActionCompatParcelizer(p0.getRead());
    }

    public final void RemoteActionCompatParcelizer(renameAll p0) {
        RemoteActionCompatParcelizer(p0.write());
    }

    public final void RemoteActionCompatParcelizer(nopInstance p0) {
        write(p0.getIconCompatParcelizer());
        RemoteActionCompatParcelizer(Float.intBitsToFloat((int) (p0.getWrite() >> 32)));
        RemoteActionCompatParcelizer(Float.intBitsToFloat((int) p0.getWrite()));
        RemoteActionCompatParcelizer(p0.getAudioAttributesCompatParcelizer());
    }

    public final void IconCompatParcelizer(byte p0) {
        this.AudioAttributesCompatParcelizer.writeByte(p0);
    }

    public final void RemoteActionCompatParcelizer(int p0) {
        this.AudioAttributesCompatParcelizer.writeInt(p0);
    }

    public final void RemoteActionCompatParcelizer(float p0) {
        this.AudioAttributesCompatParcelizer.writeFloat(p0);
    }

    public final void AudioAttributesCompatParcelizer(long p0) {
        this.AudioAttributesCompatParcelizer.writeLong(p0);
    }

    public final void RemoteActionCompatParcelizer(String p0) {
        this.AudioAttributesCompatParcelizer.writeString(p0);
    }
}
