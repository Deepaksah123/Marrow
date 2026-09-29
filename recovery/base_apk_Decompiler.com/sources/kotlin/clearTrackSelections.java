package kotlin;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class clearTrackSelections extends isBeforeFirst<Object> {
    private static final isAfterLast write = RemoteActionCompatParcelizer(isTerminalState.DOUBLE);
    private final DownloadCursor IconCompatParcelizer;
    private final setDownloadingStatesToQueued read;

    /* synthetic */ clearTrackSelections(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadCursor downloadCursor, byte b) {
        this(setdownloadingstatestoqueued, downloadCursor);
    }

    private clearTrackSelections(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadCursor downloadCursor) {
        this.read = setdownloadingstatestoqueued;
        this.IconCompatParcelizer = downloadCursor;
    }

    private static isAfterLast RemoteActionCompatParcelizer(final DownloadCursor downloadCursor) {
        return new isAfterLast() { // from class: o.clearTrackSelections.3
            @Override // kotlin.isAfterLast
            public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
                if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Object.class) {
                    return new clearTrackSelections(setdownloadingstatestoqueued, downloadCursor, (byte) 0);
                }
                return null;
            }
        };
    }

    public static isAfterLast read(DownloadCursor downloadCursor) {
        if (downloadCursor == isTerminalState.DOUBLE) {
            return write;
        }
        return RemoteActionCompatParcelizer(downloadCursor);
    }

    /* JADX INFO: renamed from: o.clearTrackSelections$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[DownloadHelperExternalSyntheticLambda2.values().length];
            write = iArr;
            try {
                iArr[DownloadHelperExternalSyntheticLambda2.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[DownloadHelperExternalSyntheticLambda2.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[DownloadHelperExternalSyntheticLambda2.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[DownloadHelperExternalSyntheticLambda2.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[DownloadHelperExternalSyntheticLambda2.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[DownloadHelperExternalSyntheticLambda2.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2) throws IOException {
        int i = AnonymousClass4.write[downloadHelperExternalSyntheticLambda2.ordinal()];
        if (i == 1) {
            downloadHelperExternalSyntheticLambda4.read();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        return new DownloadHelper();
    }

    private Object write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2) throws IOException {
        int i = AnonymousClass4.write[downloadHelperExternalSyntheticLambda2.ordinal()];
        if (i == 3) {
            return downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        }
        if (i == 4) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        }
        if (i == 5) {
            return Boolean.valueOf(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
        if (i == 6) {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
            return null;
        }
        throw new IllegalStateException("Unexpected token: ".concat(String.valueOf(downloadHelperExternalSyntheticLambda2)));
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = downloadHelperExternalSyntheticLambda4.onCustomAction();
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4, downloadHelperExternalSyntheticLambda2OnCustomAction);
        if (objAudioAttributesCompatParcelizer == null) {
            return write(downloadHelperExternalSyntheticLambda4, downloadHelperExternalSyntheticLambda2OnCustomAction);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                String strMediaBrowserCompatMediaItem = objAudioAttributesCompatParcelizer instanceof Map ? downloadHelperExternalSyntheticLambda4.MediaBrowserCompatMediaItem() : null;
                DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction2 = downloadHelperExternalSyntheticLambda4.onCustomAction();
                Object objAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4, downloadHelperExternalSyntheticLambda2OnCustomAction2);
                boolean z = objAudioAttributesCompatParcelizer2 != null;
                Object objWrite = objAudioAttributesCompatParcelizer2 == null ? write(downloadHelperExternalSyntheticLambda4, downloadHelperExternalSyntheticLambda2OnCustomAction2) : objAudioAttributesCompatParcelizer2;
                if (objAudioAttributesCompatParcelizer instanceof List) {
                    ((List) objAudioAttributesCompatParcelizer).add(objWrite);
                } else {
                    ((Map) objAudioAttributesCompatParcelizer).put(strMediaBrowserCompatMediaItem, objWrite);
                }
                if (z) {
                    arrayDeque.addLast(objAudioAttributesCompatParcelizer);
                    objAudioAttributesCompatParcelizer = objWrite;
                }
            } else {
                if (objAudioAttributesCompatParcelizer instanceof List) {
                    downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
                } else {
                    downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                }
                if (arrayDeque.isEmpty()) {
                    return objAudioAttributesCompatParcelizer;
                }
                objAudioAttributesCompatParcelizer = arrayDeque.removeLast();
            }
        }
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        isBeforeFirst isbeforefirst = this.read.read(obj.getClass());
        if (isbeforefirst instanceof clearTrackSelections) {
            downloadHelper2.RemoteActionCompatParcelizer();
            downloadHelper2.IconCompatParcelizer();
        } else {
            isbeforefirst.read(downloadHelper2, obj);
        }
    }
}
