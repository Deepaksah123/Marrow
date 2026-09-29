package kotlin;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class assertPreparedWithMedia implements isAfterLast, Cloneable {
    public static final assertPreparedWithMedia write = new assertPreparedWithMedia();
    private boolean AudioAttributesCompatParcelizer;
    private double AudioAttributesImplApi26Parcelizer = -1.0d;
    private int read = 136;
    private boolean AudioAttributesImplApi21Parcelizer = true;
    private List<removeDownload> RemoteActionCompatParcelizer = Collections.emptyList();
    private List<removeDownload> IconCompatParcelizer = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public assertPreparedWithMedia clone() {
        try {
            return (assertPreparedWithMedia) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // kotlin.isAfterLast
    public final <T> isBeforeFirst<T> write(final setDownloadingStatesToQueued setdownloadingstatestoqueued, final DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
        boolean zWrite = write(downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer());
        final boolean z = zWrite || RemoteActionCompatParcelizer(true);
        final boolean z2 = zWrite || RemoteActionCompatParcelizer(false);
        if (z || z2) {
            return new isBeforeFirst<T>() { // from class: o.assertPreparedWithMedia.4
                private isBeforeFirst<T> read;

                @Override // kotlin.isBeforeFirst
                public final T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                    if (z2) {
                        downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                        return null;
                    }
                    return IconCompatParcelizer().AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                }

                @Override // kotlin.isBeforeFirst
                public final void read(DownloadHelper2 downloadHelper2, T t) throws IOException {
                    if (z) {
                        downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                    } else {
                        IconCompatParcelizer().read(downloadHelper2, t);
                    }
                }

                private isBeforeFirst<T> IconCompatParcelizer() {
                    isBeforeFirst<T> isbeforefirst = this.read;
                    if (isbeforefirst != null) {
                        return isbeforefirst;
                    }
                    isBeforeFirst<T> isbeforefirstAudioAttributesCompatParcelizer = setdownloadingstatestoqueued.AudioAttributesCompatParcelizer(assertPreparedWithMedia.this, downloadHelperExternalSyntheticLambda3);
                    this.read = isbeforefirstAudioAttributesCompatParcelizer;
                    return isbeforefirstAudioAttributesCompatParcelizer;
                }
            };
        }
        return null;
    }

    public final boolean IconCompatParcelizer(Field field, boolean z) {
        if ((this.read & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.AudioAttributesImplApi26Parcelizer != -1.0d && !AudioAttributesCompatParcelizer((moveToFirst) field.getAnnotation(moveToFirst.class), (moveToPrevious) field.getAnnotation(moveToPrevious.class))) || field.isSynthetic()) {
            return true;
        }
        if ((!this.AudioAttributesImplApi21Parcelizer && read(field.getType())) || RemoteActionCompatParcelizer(field.getType())) {
            return true;
        }
        List<removeDownload> list = z ? this.RemoteActionCompatParcelizer : this.IconCompatParcelizer;
        if (list.isEmpty()) {
            return false;
        }
        new setStatesToRemoving(field);
        Iterator<removeDownload> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().RemoteActionCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    private boolean write(Class<?> cls) {
        if (this.AudioAttributesImplApi26Parcelizer != -1.0d && !AudioAttributesCompatParcelizer((moveToFirst) cls.getAnnotation(moveToFirst.class), (moveToPrevious) cls.getAnnotation(moveToPrevious.class))) {
            return true;
        }
        if (this.AudioAttributesImplApi21Parcelizer || !read(cls)) {
            return RemoteActionCompatParcelizer(cls);
        }
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(Class<?> cls, boolean z) {
        return write(cls) || RemoteActionCompatParcelizer(z);
    }

    private boolean RemoteActionCompatParcelizer(boolean z) {
        Iterator<removeDownload> it = (z ? this.RemoteActionCompatParcelizer : this.IconCompatParcelizer).iterator();
        while (it.hasNext()) {
            if (it.next().AudioAttributesCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    private static boolean RemoteActionCompatParcelizer(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || IconCompatParcelizer(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private static boolean read(Class<?> cls) {
        return cls.isMemberClass() && !IconCompatParcelizer(cls);
    }

    private static boolean IconCompatParcelizer(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean AudioAttributesCompatParcelizer(moveToFirst movetofirst, moveToPrevious movetoprevious) {
        return AudioAttributesCompatParcelizer(movetofirst) && AudioAttributesCompatParcelizer(movetoprevious);
    }

    private boolean AudioAttributesCompatParcelizer(moveToFirst movetofirst) {
        if (movetofirst != null) {
            return this.AudioAttributesImplApi26Parcelizer >= movetofirst.write();
        }
        return true;
    }

    private boolean AudioAttributesCompatParcelizer(moveToPrevious movetoprevious) {
        if (movetoprevious != null) {
            return this.AudioAttributesImplApi26Parcelizer < movetoprevious.IconCompatParcelizer();
        }
        return true;
    }
}
