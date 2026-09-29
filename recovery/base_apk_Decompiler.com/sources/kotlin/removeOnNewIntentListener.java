package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.compress.utils.CharsetNames;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class removeOnNewIntentListener extends DataSetObservable {
    static final String read = "ActivityChooserModel";
    final Context AudioAttributesCompatParcelizer;
    private final Object AudioAttributesImplApi21Parcelizer;
    private final List<read> AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    final String IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private Intent MediaBrowserCompatItemReceiver;
    private boolean MediaDescriptionCompat;
    boolean RemoteActionCompatParcelizer;
    private final List<write> write;

    static {
        new HashMap();
    }

    public final int write() {
        int size;
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            AudioAttributesCompatParcelizer();
            size = this.write.size();
        }
        return size;
    }

    public final ResolveInfo RemoteActionCompatParcelizer(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            AudioAttributesCompatParcelizer();
            resolveInfo = this.write.get(i).RemoteActionCompatParcelizer;
        }
        return resolveInfo;
    }

    public final int RemoteActionCompatParcelizer(ResolveInfo resolveInfo) {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            AudioAttributesCompatParcelizer();
            List<write> list = this.write;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).RemoteActionCompatParcelizer == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final Intent IconCompatParcelizer() {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
        }
        return null;
    }

    public final ResolveInfo RemoteActionCompatParcelizer() {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            AudioAttributesCompatParcelizer();
            if (this.write.isEmpty()) {
                return null;
            }
            return this.write.get(0).RemoteActionCompatParcelizer;
        }
    }

    public final void read(int i) {
        float f;
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            AudioAttributesCompatParcelizer();
            write writeVar = this.write.get(i);
            write writeVar2 = this.write.get(0);
            if (writeVar2 != null) {
                float f2 = writeVar2.AudioAttributesCompatParcelizer;
                float f3 = writeVar.AudioAttributesCompatParcelizer;
                f = 5.0f;
            } else {
                f = 1.0f;
            }
            IconCompatParcelizer(new read(new ComponentName(((PackageItemInfo) writeVar.RemoteActionCompatParcelizer.activityInfo).packageName, ((PackageItemInfo) writeVar.RemoteActionCompatParcelizer.activityInfo).name), System.currentTimeMillis(), f));
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        if (!this.MediaDescriptionCompat) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplBaseParcelizer = false;
            if (TextUtils.isEmpty(this.IconCompatParcelizer)) {
                return;
            }
            new AudioAttributesCompatParcelizer().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.AudioAttributesImplApi26Parcelizer), this.IconCompatParcelizer);
        }
    }

    public final int read() {
        int size;
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            AudioAttributesCompatParcelizer();
            size = this.AudioAttributesImplApi26Parcelizer.size();
        }
        return size;
    }

    private void AudioAttributesCompatParcelizer() throws IOException {
        boolean zMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        AudioAttributesImplApi26Parcelizer();
        if (zMediaBrowserCompatItemReceiver) {
            notifyChanged();
        }
    }

    private boolean MediaBrowserCompatItemReceiver() throws IOException {
        if (!this.RemoteActionCompatParcelizer || !this.AudioAttributesImplBaseParcelizer || TextUtils.isEmpty(this.IconCompatParcelizer)) {
            return false;
        }
        this.RemoteActionCompatParcelizer = false;
        this.MediaDescriptionCompat = true;
        AudioAttributesImplBaseParcelizer();
        return true;
    }

    private boolean IconCompatParcelizer(read readVar) {
        boolean zAdd = this.AudioAttributesImplApi26Parcelizer.add(readVar);
        if (zAdd) {
            this.AudioAttributesImplBaseParcelizer = true;
            AudioAttributesImplApi26Parcelizer();
            AudioAttributesImplApi21Parcelizer();
            notifyChanged();
        }
        return zAdd;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int size = this.AudioAttributesImplApi26Parcelizer.size() - this.MediaBrowserCompatCustomActionResultReceiver;
        if (size > 0) {
            this.AudioAttributesImplBaseParcelizer = true;
            for (int i = 0; i < size; i++) {
                this.AudioAttributesImplApi26Parcelizer.remove(0);
            }
        }
    }

    public static final class read {
        public final long AudioAttributesCompatParcelizer;
        public final float read;
        public final ComponentName write;

        public read(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public read(ComponentName componentName, long j, float f) {
            this.write = componentName;
            this.AudioAttributesCompatParcelizer = j;
            this.read = f;
        }

        public final int hashCode() {
            ComponentName componentName = this.write;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.AudioAttributesCompatParcelizer;
            return ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.read);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            read readVar = (read) obj;
            ComponentName componentName = this.write;
            if (componentName == null) {
                if (readVar.write != null) {
                    return false;
                }
            } else if (!componentName.equals(readVar.write)) {
                return false;
            }
            return this.AudioAttributesCompatParcelizer == readVar.AudioAttributesCompatParcelizer && Float.floatToIntBits(this.read) == Float.floatToIntBits(readVar.read);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[; activity:");
            sb.append(this.write);
            sb.append("; time:");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append("; weight:");
            sb.append(new BigDecimal(this.read));
            sb.append("]");
            return sb.toString();
        }
    }

    public static final class write implements Comparable<write> {
        public float AudioAttributesCompatParcelizer;
        public final ResolveInfo RemoteActionCompatParcelizer;

        public final int hashCode() {
            return Float.floatToIntBits(this.AudioAttributesCompatParcelizer) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.AudioAttributesCompatParcelizer) == Float.floatToIntBits(((write) obj).AudioAttributesCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(write writeVar) {
            return Float.floatToIntBits(writeVar.AudioAttributesCompatParcelizer) - Float.floatToIntBits(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[resolveInfo:");
            sb.append(this.RemoteActionCompatParcelizer.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal(0.0d));
            sb.append("]");
            return sb.toString();
        }
    }

    private void AudioAttributesImplBaseParcelizer() throws IOException {
        try {
            FileInputStream fileInputStreamOpenFileInput = this.AudioAttributesCompatParcelizer.openFileInput(this.IconCompatParcelizer);
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, CharsetNames.UTF_8);
                for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                }
                if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                List<read> list = this.AudioAttributesImplApi26Parcelizer;
                list.clear();
                while (true) {
                    int next2 = xmlPullParserNewPullParser.next();
                    if (next2 == 1) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                            return;
                        }
                        return;
                    } else if (next2 != 3 && next2 != 4) {
                        if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                            throw new XmlPullParserException("Share records file not well-formed.");
                        }
                        list.add(new read(xmlPullParserNewPullParser.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                    }
                }
            } catch (IOException unused) {
                if (fileInputStreamOpenFileInput == null) {
                    return;
                }
                fileInputStreamOpenFileInput.close();
            } catch (XmlPullParserException unused2) {
                if (fileInputStreamOpenFileInput == null) {
                    return;
                }
                fileInputStreamOpenFileInput.close();
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException | IOException unused4) {
        }
    }

    final class AudioAttributesCompatParcelizer extends AsyncTask<Object, Void, Void> {
        AudioAttributesCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Object... r14) {
            /*
                r13 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                r2 = 0
                r3 = r14[r2]
                java.util.List r3 = (java.util.List) r3
                r4 = 1
                r14 = r14[r4]
                java.lang.String r14 = (java.lang.String) r14
                r5 = 0
                o.removeOnNewIntentListener r6 = kotlin.removeOnNewIntentListener.this     // Catch: java.io.FileNotFoundException -> La3
                android.content.Context r6 = r6.AudioAttributesCompatParcelizer     // Catch: java.io.FileNotFoundException -> La3
                java.io.FileOutputStream r14 = r6.openFileOutput(r14, r2)     // Catch: java.io.FileNotFoundException -> La3
                org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
                r6.setOutput(r14, r5)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                java.lang.String r7 = "UTF-8"
                java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                r6.startDocument(r7, r8)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                r6.startTag(r5, r1)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                int r7 = r3.size()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                r8 = r2
            L2d:
                if (r8 >= r7) goto L5f
                java.lang.Object r9 = r3.remove(r2)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                o.removeOnNewIntentListener$read r9 = (o.removeOnNewIntentListener.read) r9     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                r6.startTag(r5, r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                android.content.ComponentName r10 = r9.write     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                java.lang.String r10 = r10.flattenToString()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                java.lang.String r11 = "activity"
                r6.attribute(r5, r11, r10)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                java.lang.String r10 = "time"
                long r11 = r9.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                java.lang.String r10 = "weight"
                float r9 = r9.read     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                r6.attribute(r5, r10, r9)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                r6.endTag(r5, r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                int r8 = r8 + 1
                goto L2d
            L5f:
                r6.endTag(r5, r1)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                r6.endDocument()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L7b java.lang.IllegalArgumentException -> L88
                o.removeOnNewIntentListener r13 = kotlin.removeOnNewIntentListener.this
                r13.RemoteActionCompatParcelizer = r4
                if (r14 == 0) goto L98
                goto L95
            L6c:
                r0 = move-exception
                goto L99
            L6e:
                java.lang.String r0 = kotlin.removeOnNewIntentListener.read     // Catch: java.lang.Throwable -> L6c
                o.removeOnNewIntentListener r0 = kotlin.removeOnNewIntentListener.this     // Catch: java.lang.Throwable -> L6c
                java.lang.String r0 = r0.IconCompatParcelizer     // Catch: java.lang.Throwable -> L6c
                o.removeOnNewIntentListener r13 = kotlin.removeOnNewIntentListener.this
                r13.RemoteActionCompatParcelizer = r4
                if (r14 == 0) goto L98
                goto L95
            L7b:
                java.lang.String r0 = kotlin.removeOnNewIntentListener.read     // Catch: java.lang.Throwable -> L6c
                o.removeOnNewIntentListener r0 = kotlin.removeOnNewIntentListener.this     // Catch: java.lang.Throwable -> L6c
                java.lang.String r0 = r0.IconCompatParcelizer     // Catch: java.lang.Throwable -> L6c
                o.removeOnNewIntentListener r13 = kotlin.removeOnNewIntentListener.this
                r13.RemoteActionCompatParcelizer = r4
                if (r14 == 0) goto L98
                goto L95
            L88:
                java.lang.String r0 = kotlin.removeOnNewIntentListener.read     // Catch: java.lang.Throwable -> L6c
                o.removeOnNewIntentListener r0 = kotlin.removeOnNewIntentListener.this     // Catch: java.lang.Throwable -> L6c
                java.lang.String r0 = r0.IconCompatParcelizer     // Catch: java.lang.Throwable -> L6c
                o.removeOnNewIntentListener r13 = kotlin.removeOnNewIntentListener.this
                r13.RemoteActionCompatParcelizer = r4
                if (r14 != 0) goto L95
                goto L98
            L95:
                r14.close()     // Catch: java.io.IOException -> L98
            L98:
                return r5
            L99:
                o.removeOnNewIntentListener r13 = kotlin.removeOnNewIntentListener.this
                r13.RemoteActionCompatParcelizer = r4
                if (r14 == 0) goto La2
                r14.close()     // Catch: java.io.IOException -> La2
            La2:
                throw r0
            La3:
                java.lang.String r13 = kotlin.removeOnNewIntentListener.read
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.removeOnNewIntentListener.AudioAttributesCompatParcelizer.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }
}
