package com.google.android.exoplayer2.upsteam;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upsteam.base.StringDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda50;
import kotlin.Metadata;
import kotlin.StyledPlayerControlViewAudioTrackSelectionAdapter;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/google/android/exoplayer2/upsteam/JsonManifestDataSource;", "Lcom/google/android/exoplayer2/upsteam/base/StringDataSource;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Lcom/google/android/exoplayer2/upstream/DataSpec;", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "(Lcom/google/android/exoplayer2/upstream/DataSpec;)J", "", "close", "()V", "jsonContent", "Ljava/lang/String;", "", "isValid", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JsonManifestDataSource extends StringDataSource {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int write;
    private final String jsonContent;

    public JsonManifestDataSource(String str) {
        this.jsonContent = str;
    }

    @Override // com.google.android.exoplayer2.upsteam.base.StringDataSource, com.google.android.exoplayer2.upstream.DataSource
    public final long open(DataSpec p0) throws StringDataSource.StringDataSourceException {
        String str = "";
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 77;
        int i4 = (i3 - (~((i2 ^ 77) | i3))) - 1;
        write = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        String str2 = this.jsonContent;
        int i6 = AudioAttributesCompatParcelizer;
        int i7 = i6 + 106;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        write = i8 % 128;
        int i9 = i8 % 2;
        if (str2 == null) {
            int i10 = ((i6 & 112) + (i6 | 112)) - 1;
            int i11 = i10 % 128;
            write = i11;
            if (i10 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i12 = i11 ^ 87;
            int i13 = ((i11 & 87) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            AudioAttributesCompatParcelizer = i15 % 128;
            int i16 = i15 % 2;
        } else {
            str = str2;
        }
        setStreamContent((String) StyledPlayerControlViewAudioTrackSelectionAdapter.AudioAttributesCompatParcelizer(new Object[]{str}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1998611802, 1998611802, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer()));
        long jOpen = super.open(p0);
        int i17 = write + 107;
        AudioAttributesCompatParcelizer = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 65 / 0;
        }
        return jOpen;
    }

    @Override // com.google.android.exoplayer2.upsteam.base.StringDataSource, com.google.android.exoplayer2.upstream.DataSource
    public final void close() throws StringDataSource.StringDataSourceException {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 13;
        write = i2 % 128;
        int i3 = i2 % 2;
        clearStreamContent();
        super.close();
        int i4 = write + 51;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isValid() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.exoplayer2.upsteam.JsonManifestDataSource.write
            r2 = r1 & 35
            int r3 = ~r2
            r1 = r1 | 35
            r1 = r1 & r3
            r3 = 1
            int r2 = r2 << r3
            r4 = r1 & r2
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            com.google.android.exoplayer2.upsteam.JsonManifestDataSource.AudioAttributesCompatParcelizer = r1
            int r4 = r4 % r0
            r2 = 0
            if (r4 == 0) goto L6e
            java.lang.String r4 = r6.jsonContent
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L50
            r5 = r1 ^ 45
            r1 = r1 & 45
            int r1 = r1 << r3
            int r5 = r5 + r1
            int r1 = r5 % 128
            com.google.android.exoplayer2.upsteam.JsonManifestDataSource.write = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L49
            int r1 = r4.length()
            if (r1 == 0) goto L50
            int r1 = com.google.android.exoplayer2.upsteam.JsonManifestDataSource.write
            r2 = r1 ^ 117(0x75, float:1.64E-43)
            r4 = r1 & 117(0x75, float:1.64E-43)
            r2 = r2 | r4
            int r2 = r2 << r3
            int r4 = ~r4
            r1 = r1 | 117(0x75, float:1.64E-43)
            r1 = r1 & r4
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 - r3
            int r1 = r2 % 128
            com.google.android.exoplayer2.upsteam.JsonManifestDataSource.AudioAttributesCompatParcelizer = r1
            int r2 = r2 % r0
            r0 = 0
            goto L61
        L49:
            r4.length()
            r2.hashCode()
            throw r2
        L50:
            int r1 = com.google.android.exoplayer2.upsteam.JsonManifestDataSource.AudioAttributesCompatParcelizer
            int r1 = r1 + 6
            r1 = r1 ^ (-1)
            int r1 = (-2) - r1
            int r2 = r1 % 128
            com.google.android.exoplayer2.upsteam.JsonManifestDataSource.write = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L60
            int r0 = r0 / r0
        L60:
            r0 = r3
        L61:
            r1 = r0 & 1
            int r2 = ~r1
            r0 = r0 ^ r3
            r0 = r0 | r1
            r0 = r0 & r2
            java.lang.System.identityHashCode(r6)
            kotlin.logAssumedSupport.RemoteActionCompatParcelizer()
            return r0
        L6e:
            java.lang.String r6 = r6.jsonContent
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upsteam.JsonManifestDataSource.isValid():boolean");
    }
}
