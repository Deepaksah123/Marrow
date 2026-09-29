package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class addTextLanguagesToSelection extends isBeforeFirst<Number> {
    private static final isAfterLast AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(isTerminalState.LAZILY_PARSED_NUMBER);
    private final DownloadCursor RemoteActionCompatParcelizer;

    @Override // kotlin.isBeforeFirst
    public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
        IconCompatParcelizer(downloadHelper2, number);
    }

    private addTextLanguagesToSelection(DownloadCursor downloadCursor) {
        this.RemoteActionCompatParcelizer = downloadCursor;
    }

    private static isAfterLast AudioAttributesCompatParcelizer(DownloadCursor downloadCursor) {
        return new isAfterLast() { // from class: o.addTextLanguagesToSelection.4
            @Override // kotlin.isAfterLast
            public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
                if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Number.class) {
                    return addTextLanguagesToSelection.this;
                }
                return null;
            }
        };
    }

    public static isAfterLast read(DownloadCursor downloadCursor) {
        if (downloadCursor == isTerminalState.LAZILY_PARSED_NUMBER) {
            return AudioAttributesCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer(downloadCursor);
    }

    /* JADX INFO: renamed from: o.addTextLanguagesToSelection$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[DownloadHelperExternalSyntheticLambda2.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[DownloadHelperExternalSyntheticLambda2.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[DownloadHelperExternalSyntheticLambda2.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RemoteActionCompatParcelizer[DownloadHelperExternalSyntheticLambda2.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = downloadHelperExternalSyntheticLambda4.onCustomAction();
        int i = AnonymousClass1.RemoteActionCompatParcelizer[downloadHelperExternalSyntheticLambda2OnCustomAction.ordinal()];
        if (i == 1) {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        }
        StringBuilder sb = new StringBuilder("Expecting number, got: ");
        sb.append(downloadHelperExternalSyntheticLambda2OnCustomAction);
        sb.append("; at path ");
        sb.append(downloadHelperExternalSyntheticLambda4.write());
        throw new getPercentDownloaded(sb.toString());
    }

    private static void IconCompatParcelizer(DownloadHelper2 downloadHelper2, Number number) throws IOException {
        downloadHelper2.AudioAttributesCompatParcelizer(number);
    }
}
