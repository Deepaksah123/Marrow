package kotlin;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public enum isTerminalState implements DownloadCursor {
    DOUBLE { // from class: o.isTerminalState.2
        @Override // kotlin.DownloadCursor
        public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            return read(downloadHelperExternalSyntheticLambda4);
        }

        private static Double read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            return Double.valueOf(downloadHelperExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: o.isTerminalState.1
        @Override // kotlin.DownloadCursor
        public final Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            return new addTrackSelectionInternal(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver());
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LONG_OR_DOUBLE { // from class: o.isTerminalState.4
        @Override // kotlin.DownloadCursor
        public final Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException, Download {
            String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
            try {
                try {
                    return Long.valueOf(Long.parseLong(strMediaBrowserCompatSearchResultReceiver));
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder("Cannot parse ");
                    sb.append(strMediaBrowserCompatSearchResultReceiver);
                    sb.append("; at path ");
                    sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                    throw new Download(sb.toString(), e);
                }
            } catch (NumberFormatException unused) {
                Double dValueOf = Double.valueOf(strMediaBrowserCompatSearchResultReceiver);
                if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || downloadHelperExternalSyntheticLambda4.onCommand()) {
                    return dValueOf;
                }
                StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(dValueOf);
                sb2.append("; at path ");
                sb2.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                throw new DownloadHelperExternalSyntheticLambda6(sb2.toString());
            }
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    BIG_DECIMAL { // from class: o.isTerminalState.3
        @Override // kotlin.DownloadCursor
        public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        }

        private static BigDecimal IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
            try {
                return new BigDecimal(strMediaBrowserCompatSearchResultReceiver);
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("Cannot parse ");
                sb.append(strMediaBrowserCompatSearchResultReceiver);
                sb.append("; at path ");
                sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                throw new Download(sb.toString(), e);
            }
        }
    };

    /* synthetic */ isTerminalState(byte b) {
        this();
    }
}
