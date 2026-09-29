package kotlin;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import com.marrow.data.models.ResponseError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.StdScalarDeserializer;

/* JADX INFO: loaded from: classes2.dex */
final class findStringBasedKeyDeserializer {
    private static final ActionMenuViewLayoutParams<read, ProviderInfo> write = new ActionMenuViewLayoutParams<>(2);
    private static final Comparator<byte[]> IconCompatParcelizer = new Comparator() { // from class: o.lambdafindStringBasedKeyDeserializer0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return findStringBasedKeyDeserializer.AudioAttributesCompatParcelizer((byte[]) obj, (byte[]) obj2);
        }
    };

    static StdScalarDeserializer.IconCompatParcelizer AudioAttributesCompatParcelizer(Context context, List<StdKeyDeserializersExternalSyntheticLambda0> list) throws PackageManager.NameNotFoundException {
        MarkerView.AudioAttributesCompatParcelizer("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                StdKeyDeserializersExternalSyntheticLambda0 stdKeyDeserializersExternalSyntheticLambda0 = list.get(i);
                ProviderInfo providerInfoIconCompatParcelizer = IconCompatParcelizer(context.getPackageManager(), stdKeyDeserializersExternalSyntheticLambda0, context.getResources());
                if (providerInfoIconCompatParcelizer == null) {
                    return StdScalarDeserializer.IconCompatParcelizer.write(1, null);
                }
                arrayList.add(RemoteActionCompatParcelizer(context, stdKeyDeserializersExternalSyntheticLambda0, providerInfoIconCompatParcelizer.authority, null));
            }
            return StdScalarDeserializer.IconCompatParcelizer.AudioAttributesCompatParcelizer(0, arrayList);
        } finally {
            MarkerView.RemoteActionCompatParcelizer();
        }
    }

    static class read {
        private String AudioAttributesCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private List<List<byte[]>> read;

        read(String str, String str2, List<List<byte[]>> list) {
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.read = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return Objects.equals(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer) && Objects.equals(this.AudioAttributesCompatParcelizer, readVar.AudioAttributesCompatParcelizer) && Objects.equals(this.read, readVar.read);
        }

        public final int hashCode() {
            return Objects.hash(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read);
        }
    }

    private static ProviderInfo IconCompatParcelizer(PackageManager packageManager, StdKeyDeserializersExternalSyntheticLambda0 stdKeyDeserializersExternalSyntheticLambda0, Resources resources) throws PackageManager.NameNotFoundException {
        MarkerView.AudioAttributesCompatParcelizer("FontProvider.getProvider");
        try {
            List<List<byte[]>> list = read(stdKeyDeserializersExternalSyntheticLambda0, resources);
            read readVar = new read(stdKeyDeserializersExternalSyntheticLambda0.write(), stdKeyDeserializersExternalSyntheticLambda0.RemoteActionCompatParcelizer(), list);
            ProviderInfo providerInfo = write.get(readVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String strWrite = stdKeyDeserializersExternalSyntheticLambda0.write();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strWrite, 0);
            if (providerInfoResolveContentProvider == null) {
                StringBuilder sb = new StringBuilder("No package found for authority: ");
                sb.append(strWrite);
                throw new PackageManager.NameNotFoundException(sb.toString());
            }
            if (!((PackageItemInfo) providerInfoResolveContentProvider).packageName.equals(stdKeyDeserializersExternalSyntheticLambda0.RemoteActionCompatParcelizer())) {
                StringBuilder sb2 = new StringBuilder("Found content provider ");
                sb2.append(strWrite);
                sb2.append(", but package was not ");
                sb2.append(stdKeyDeserializersExternalSyntheticLambda0.RemoteActionCompatParcelizer());
                throw new PackageManager.NameNotFoundException(sb2.toString());
            }
            List<byte[]> list2 = read(packageManager.getPackageInfo(((PackageItemInfo) providerInfoResolveContentProvider).packageName, 64).signatures);
            Collections.sort(list2, IconCompatParcelizer);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList = new ArrayList(list.get(i));
                Collections.sort(arrayList, IconCompatParcelizer);
                if (read(list2, arrayList)) {
                    write.put(readVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            MarkerView.RemoteActionCompatParcelizer();
            return null;
        } finally {
            MarkerView.RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static StdScalarDeserializer.AudioAttributesCompatParcelizer[] RemoteActionCompatParcelizer(Context context, StdKeyDeserializersExternalSyntheticLambda0 stdKeyDeserializersExternalSyntheticLambda0, String str, CancellationSignal cancellationSignal) {
        Cursor cursorWrite;
        ArrayList arrayList;
        int i;
        Uri uriWithAppendedId;
        int i2;
        boolean z;
        MarkerView.AudioAttributesCompatParcelizer("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = AudioAttributesCompatParcelizer.write(context, uriBuild);
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                MarkerView.AudioAttributesCompatParcelizer("ContentQueryWrapper.query");
                try {
                    int i3 = 1;
                    cursorWrite = audioAttributesCompatParcelizerWrite.write(uriBuild, strArr, "query = ?", new String[]{stdKeyDeserializersExternalSyntheticLambda0.MediaBrowserCompatCustomActionResultReceiver()}, null, null);
                    try {
                        if (cursorWrite == null || cursorWrite.getCount() <= 0) {
                            arrayList = arrayList2;
                        } else {
                            int columnIndex = cursorWrite.getColumnIndex("result_code");
                            ArrayList arrayList3 = new ArrayList();
                            int columnIndex2 = cursorWrite.getColumnIndex("_id");
                            int columnIndex3 = cursorWrite.getColumnIndex("file_id");
                            int columnIndex4 = cursorWrite.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorWrite.getColumnIndex("font_weight");
                            int columnIndex6 = cursorWrite.getColumnIndex("font_italic");
                            while (cursorWrite.moveToNext()) {
                                int i4 = columnIndex != -1 ? cursorWrite.getInt(columnIndex) : 0;
                                int i5 = columnIndex4 != -1 ? cursorWrite.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    i = i5;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorWrite.getLong(columnIndex2));
                                } else {
                                    i = i5;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorWrite.getLong(columnIndex3));
                                }
                                int i6 = columnIndex5 != -1 ? cursorWrite.getInt(columnIndex5) : ResponseError.NO_INTERNET_ERROR;
                                if (columnIndex6 == -1 || cursorWrite.getInt(columnIndex6) != i3) {
                                    i2 = i6;
                                    z = 0;
                                } else {
                                    z = i3;
                                    i2 = i6;
                                }
                                arrayList3.add(StdScalarDeserializer.AudioAttributesCompatParcelizer.read(uriWithAppendedId, i, i2, z, i4));
                                i3 = 1;
                            }
                            arrayList = arrayList3;
                        }
                        if (cursorWrite != null) {
                            cursorWrite.close();
                        }
                        audioAttributesCompatParcelizerWrite.write();
                        return (StdScalarDeserializer.AudioAttributesCompatParcelizer[]) arrayList.toArray(new StdScalarDeserializer.AudioAttributesCompatParcelizer[0]);
                    } catch (Throwable th) {
                        th = th;
                        if (cursorWrite != null) {
                            cursorWrite.close();
                        }
                        audioAttributesCompatParcelizerWrite.write();
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
                cursorWrite = null;
            }
        } finally {
        }
    }

    private static List<List<byte[]>> read(StdKeyDeserializersExternalSyntheticLambda0 stdKeyDeserializersExternalSyntheticLambda0, Resources resources) {
        if (stdKeyDeserializersExternalSyntheticLambda0.AudioAttributesCompatParcelizer() != null) {
            return stdKeyDeserializersExternalSyntheticLambda0.AudioAttributesCompatParcelizer();
        }
        return _parseInteger.write(resources, stdKeyDeserializersExternalSyntheticLambda0.IconCompatParcelizer());
    }

    static /* synthetic */ int AudioAttributesCompatParcelizer(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    private static boolean read(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<byte[]> read(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    interface AudioAttributesCompatParcelizer {
        Cursor write(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void write();

        static AudioAttributesCompatParcelizer write(Context context, Uri uri) {
            return new IconCompatParcelizer(context, uri);
        }
    }

    static class IconCompatParcelizer implements AudioAttributesCompatParcelizer {
        private final ContentProviderClient RemoteActionCompatParcelizer;

        IconCompatParcelizer(Context context, Uri uri) {
            this.RemoteActionCompatParcelizer = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // o.findStringBasedKeyDeserializer.AudioAttributesCompatParcelizer
        public Cursor write(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.RemoteActionCompatParcelizer;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // o.findStringBasedKeyDeserializer.AudioAttributesCompatParcelizer
        public void write() {
            ContentProviderClient contentProviderClient = this.RemoteActionCompatParcelizer;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }
}
