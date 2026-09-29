package kotlin;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.DownloadRequest;
import kotlin.updateWaitingForRequirements;

/* JADX INFO: loaded from: classes3.dex */
final class onInitialized extends notifyWaitingForRequirementsChanged<updateWaitingForRequirements.read> {
    onInitialized() {
    }

    @Override // kotlin.notifyWaitingForRequirementsChanged
    final boolean read(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
        return downloadManagerExternalSyntheticLambda0 instanceof updateWaitingForRequirements.IconCompatParcelizer;
    }

    @Override // kotlin.notifyWaitingForRequirementsChanged
    final onRequirementsStateChanged<updateWaitingForRequirements.read> AudioAttributesCompatParcelizer(Object obj) {
        return ((updateWaitingForRequirements.IconCompatParcelizer) obj).extensions;
    }

    @Override // kotlin.notifyWaitingForRequirementsChanged
    final onRequirementsStateChanged<updateWaitingForRequirements.read> IconCompatParcelizer(Object obj) {
        return ((updateWaitingForRequirements.IconCompatParcelizer) obj).RemoteActionCompatParcelizer();
    }

    @Override // kotlin.notifyWaitingForRequirementsChanged
    final void write(Object obj) {
        AudioAttributesCompatParcelizer(obj).AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: o.onInitialized$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[DownloadRequest.read.values().length];
            write = iArr;
            try {
                iArr[DownloadRequest.read.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[DownloadRequest.read.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[DownloadRequest.read.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[DownloadRequest.read.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[DownloadRequest.read.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[DownloadRequest.read.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[DownloadRequest.read.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                write[DownloadRequest.read.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                write[DownloadRequest.read.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                write[DownloadRequest.read.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                write[DownloadRequest.read.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                write[DownloadRequest.read.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                write[DownloadRequest.read.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                write[DownloadRequest.read.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                write[DownloadRequest.read.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                write[DownloadRequest.read.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                write[DownloadRequest.read.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                write[DownloadRequest.read.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // kotlin.notifyWaitingForRequirementsChanged
    final int AudioAttributesCompatParcelizer(Map.Entry<?, ?> entry) {
        return ((updateWaitingForRequirements.read) entry.getKey()).AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.notifyWaitingForRequirementsChanged
    final void AudioAttributesCompatParcelizer(getRetryDelayMillis getretrydelaymillis, Map.Entry<?, ?> entry) throws IOException {
        updateWaitingForRequirements.read readVar = (updateWaitingForRequirements.read) entry.getKey();
        if (readVar.RemoteActionCompatParcelizer()) {
            switch (AnonymousClass2.write[readVar.IconCompatParcelizer().ordinal()]) {
                case 1:
                    DownloadManagerListener.write(readVar.AudioAttributesCompatParcelizer(), (List<Double>) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 2:
                    DownloadManagerListener.MediaBrowserCompatItemReceiver(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 3:
                    DownloadManagerListener.MediaBrowserCompatCustomActionResultReceiver(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 4:
                    DownloadManagerListener.MediaDescriptionCompat(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 5:
                    DownloadManagerListener.AudioAttributesImplBaseParcelizer(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 6:
                    DownloadManagerListener.AudioAttributesCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), (List<Long>) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 7:
                    DownloadManagerListener.read(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 8:
                    DownloadManagerListener.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 9:
                    DownloadManagerListener.RatingCompat(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 10:
                    DownloadManagerListener.AudioAttributesImplApi26Parcelizer(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 11:
                    DownloadManagerListener.AudioAttributesImplApi21Parcelizer(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 12:
                    DownloadManagerListener.MediaBrowserCompatMediaItem(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 13:
                    DownloadManagerListener.MediaBrowserCompatSearchResultReceiver(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 14:
                    DownloadManagerListener.AudioAttributesImplBaseParcelizer(readVar.AudioAttributesCompatParcelizer(), (List) entry.getValue(), getretrydelaymillis, readVar.read());
                    break;
                case 15:
                    DownloadManagerListener.AudioAttributesCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), (List<DownloadIndex>) entry.getValue(), getretrydelaymillis);
                    break;
                case 16:
                    DownloadManagerListener.RemoteActionCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), (List<String>) entry.getValue(), getretrydelaymillis);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        DownloadManagerListener.write(readVar.AudioAttributesCompatParcelizer(), (List<?>) entry.getValue(), getretrydelaymillis, syncStoppedDownload.write().AudioAttributesCompatParcelizer(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        DownloadManagerListener.RemoteActionCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), (List<?>) entry.getValue(), getretrydelaymillis, syncStoppedDownload.write().AudioAttributesCompatParcelizer(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (AnonymousClass2.write[readVar.IconCompatParcelizer().ordinal()]) {
            case 1:
                getretrydelaymillis.read(readVar.AudioAttributesCompatParcelizer(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                getretrydelaymillis.AudioAttributesCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                getretrydelaymillis.AudioAttributesCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                getretrydelaymillis.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                getretrydelaymillis.RemoteActionCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                getretrydelaymillis.RemoteActionCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                getretrydelaymillis.read(readVar.AudioAttributesCompatParcelizer(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                getretrydelaymillis.write(readVar.AudioAttributesCompatParcelizer(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                getretrydelaymillis.MediaBrowserCompatCustomActionResultReceiver(readVar.AudioAttributesCompatParcelizer(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                getretrydelaymillis.write(readVar.AudioAttributesCompatParcelizer(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                getretrydelaymillis.write(readVar.AudioAttributesCompatParcelizer(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                getretrydelaymillis.AudioAttributesCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                getretrydelaymillis.read(readVar.AudioAttributesCompatParcelizer(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                getretrydelaymillis.RemoteActionCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                getretrydelaymillis.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), (DownloadIndex) entry.getValue());
                break;
            case 16:
                getretrydelaymillis.write(readVar.AudioAttributesCompatParcelizer(), (String) entry.getValue());
                break;
            case 17:
                getretrydelaymillis.write(readVar.AudioAttributesCompatParcelizer(), entry.getValue(), syncStoppedDownload.write().AudioAttributesCompatParcelizer(entry.getValue().getClass()));
                break;
            case 18:
                getretrydelaymillis.AudioAttributesCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), entry.getValue(), syncStoppedDownload.write().AudioAttributesCompatParcelizer(entry.getValue().getClass()));
                break;
        }
    }
}
