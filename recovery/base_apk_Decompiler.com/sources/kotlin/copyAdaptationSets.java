package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class copyAdaptationSets {
    public static final String MediaBrowserCompatItemReceiver(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return cursor.getString(cursor.getColumnIndex(str));
    }

    public static final String AudioAttributesImplBaseParcelizer(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String string = cursor.getString(cursor.getColumnIndex(str));
        if (string != null) {
            return string;
        }
        StringBuilder sb = new StringBuilder("cursor[$");
        sb.append(str);
        sb.append("] is null");
        throw new NullPointerException(sb.toString());
    }

    public static final int AudioAttributesCompatParcelizer(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    public static final double write(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return cursor.getDouble(cursor.getColumnIndex(str));
    }

    public static final float read(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return cursor.getFloat(cursor.getColumnIndex(str));
    }

    public static final long AudioAttributesImplApi21Parcelizer(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    public static final boolean RemoteActionCompatParcelizer(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return AudioAttributesCompatParcelizer(cursor, str) == 1;
    }

    public static final JSONObject MediaBrowserCompatCustomActionResultReceiver(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(cursor, str);
        if (strMediaBrowserCompatItemReceiver == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(strMediaBrowserCompatItemReceiver);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static final JSONArray IconCompatParcelizer(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(cursor, str);
        if (strMediaBrowserCompatItemReceiver == null) {
            return new JSONArray();
        }
        try {
            return new JSONArray(strMediaBrowserCompatItemReceiver);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray();
        }
    }

    public static final String[] AudioAttributesImplApi26Parcelizer(Cursor cursor, String str) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String[] strArrRemoteActionCompatParcelizer = parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver(cursor, str));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strArrRemoteActionCompatParcelizer, "");
        return strArrRemoteActionCompatParcelizer;
    }

    public static final String read(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        String str = parseLastSegmentNumberSupplementalProperty.read(strArr);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public static final <V> ContentValues IconCompatParcelizer(Pair<String, ? extends V>... pairArr) {
        toMagicModuleMetaRepoModel.write(pairArr, "");
        ContentValues contentValues = new ContentValues();
        for (Pair<String, ? extends V> pair : pairArr) {
            V vIconCompatParcelizer = pair.IconCompatParcelizer();
            if (vIconCompatParcelizer instanceof Integer) {
                String strWrite = pair.write();
                V vIconCompatParcelizer2 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer2, "");
                contentValues.put(strWrite, (Integer) vIconCompatParcelizer2);
            } else if (vIconCompatParcelizer instanceof Byte) {
                String strWrite2 = pair.write();
                V vIconCompatParcelizer3 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer3, "");
                contentValues.put(strWrite2, (Byte) vIconCompatParcelizer3);
            } else if (vIconCompatParcelizer instanceof Float) {
                String strWrite3 = pair.write();
                V vIconCompatParcelizer4 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer4, "");
                contentValues.put(strWrite3, (Float) vIconCompatParcelizer4);
            } else if (vIconCompatParcelizer instanceof Long) {
                String strWrite4 = pair.write();
                V vIconCompatParcelizer5 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer5, "");
                contentValues.put(strWrite4, (Long) vIconCompatParcelizer5);
            } else if (vIconCompatParcelizer instanceof Short) {
                String strWrite5 = pair.write();
                V vIconCompatParcelizer6 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer6, "");
                contentValues.put(strWrite5, (Short) vIconCompatParcelizer6);
            } else if (vIconCompatParcelizer instanceof Double) {
                String strWrite6 = pair.write();
                V vIconCompatParcelizer7 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer7, "");
                contentValues.put(strWrite6, (Double) vIconCompatParcelizer7);
            } else if (vIconCompatParcelizer instanceof String) {
                String strWrite7 = pair.write();
                V vIconCompatParcelizer8 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer8, "");
                contentValues.put(strWrite7, (String) vIconCompatParcelizer8);
            } else if (vIconCompatParcelizer instanceof Boolean) {
                String strWrite8 = pair.write();
                V vIconCompatParcelizer9 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer9, "");
                contentValues.put(strWrite8, (Boolean) vIconCompatParcelizer9);
            } else if (vIconCompatParcelizer instanceof byte[]) {
                String strWrite9 = pair.write();
                V vIconCompatParcelizer10 = pair.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(vIconCompatParcelizer10, "");
                contentValues.put(strWrite9, (byte[]) vIconCompatParcelizer10);
            } else {
                contentValues.putNull(pair.write());
            }
        }
        return contentValues;
    }

    public static final void RemoteActionCompatParcelizer(Cursor cursor, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        if (cursor.moveToFirst()) {
            do {
                getcreatedondatems.invoke();
            } while (cursor.moveToNext());
        }
    }

    public static final <T> List<T> IconCompatParcelizer(final Cursor cursor, final getAnswerMap<? super Cursor, ? extends T> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        final ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            RemoteActionCompatParcelizer(cursor, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getPeriodDurationUs
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return copyAdaptationSets.write(arrayList, getanswermap, cursor);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(List list, getAnswerMap getanswermap, Cursor cursor) {
        list.add(getanswermap.invoke(cursor));
        return getShowPopup.INSTANCE;
    }

    public static final List<String> IconCompatParcelizer(final Cursor cursor) {
        final ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            Cursor cursor2 = cursor;
            try {
                final int i = 0;
                RemoteActionCompatParcelizer(cursor, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs(arrayList, cursor, i) { // from class: o.DashManifest
                    private /* synthetic */ List RemoteActionCompatParcelizer;
                    private /* synthetic */ Cursor read;
                    private /* synthetic */ int write = 0;

                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return copyAdaptationSets.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this.write);
                    }
                });
                MagicModuleMetaLSModel.IconCompatParcelizer(cursor2, null);
            } finally {
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(List list, Cursor cursor, int i) {
        String string = cursor.getString(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        list.add(string);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AudioAttributesCompatParcelizer(Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            StringBuilder sb = new StringBuilder();
            sb.append(externalFilesDir);
            sb.append("/databases");
            String string = sb.toString();
            File file = new File(string);
            File dataDirectory = Environment.getDataDirectory();
            if (!file.exists()) {
                file.mkdir();
            }
            if (!file.canWrite()) {
                return false;
            }
            String packageName = context.getPackageName();
            StringBuilder sb2 = new StringBuilder("//data//");
            sb2.append(packageName);
            sb2.append("//databases//");
            sb2.append(str);
            File file2 = new File(dataDirectory, sb2.toString());
            File file3 = new File(string, str2);
            if (!file2.exists()) {
                return false;
            }
            FileChannel channel = new FileInputStream(file2).getChannel();
            FileChannel channel2 = new FileOutputStream(file3).getChannel();
            channel2.transferFrom(channel, 0L, channel.size());
            channel.close();
            channel2.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
