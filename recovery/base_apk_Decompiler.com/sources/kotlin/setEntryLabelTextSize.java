package kotlin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public interface setEntryLabelTextSize extends Closeable {

    public interface AudioAttributesCompatParcelizer {
        setEntryLabelTextSize AudioAttributesCompatParcelizer(write writeVar);
    }

    setDrawSliceText AudioAttributesCompatParcelizer();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String read();

    void read(boolean z);

    setDrawSliceText write();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\n\u0010\u0011R\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0012"}, d2 = {"Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;", "", "", "p0", "<init>", "(I)V", "Lo/setDrawSliceText;", "", "AudioAttributesCompatParcelizer", "(Lo/setDrawSliceText;)V", "IconCompatParcelizer", "p1", "p2", "RemoteActionCompatParcelizer", "(Lo/setDrawSliceText;II)V", "read", "", "(Ljava/lang/String;)V", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public final int RemoteActionCompatParcelizer;

        public abstract void IconCompatParcelizer(setDrawSliceText p0);

        public abstract void RemoteActionCompatParcelizer(setDrawSliceText p0, int p1, int p2);

        public RemoteActionCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        public void read(setDrawSliceText p0, int p1, int p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(p1);
            sb.append(" to ");
            sb.append(p2);
            throw new SQLiteException(sb.toString());
        }

        public static void read(setDrawSliceText p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Objects.toString(p0);
            if (!p0.AudioAttributesImplBaseParcelizer()) {
                String str = p0.read();
                if (str != null) {
                    IconCompatParcelizer(str);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listIconCompatParcelizer = null;
            try {
                try {
                    listIconCompatParcelizer = p0.IconCompatParcelizer();
                } catch (SQLiteException unused) {
                }
                try {
                    p0.close();
                } catch (IOException unused2) {
                }
                if (listIconCompatParcelizer != null) {
                    return;
                }
            } finally {
                if (listIconCompatParcelizer != null) {
                    Iterator<T> it = listIconCompatParcelizer.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
                        IconCompatParcelizer((String) obj);
                    }
                } else {
                    String str2 = p0.read();
                    if (str2 != null) {
                        IconCompatParcelizer(str2);
                    }
                }
            }
        }

        private static void IconCompatParcelizer(String p0) {
            if (TestGroupLSModel.read(p0, ":memory:", true)) {
                return;
            }
            String str = p0;
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = toMagicModuleMetaRepoModel.read((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            try {
                SQLiteDatabase.deleteDatabase(new File(p0));
            } catch (Exception e) {
            }
        }

        public static void AudioAttributesCompatParcelizer(setDrawSliceText p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
        }

        public void RemoteActionCompatParcelizer(setDrawSliceText p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lo/setEntryLabelTextSize$write;", "", "Landroid/content/Context;", "p0", "", "p1", "Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;", "p2", "", "p3", "p4", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;ZZ)V", "read", "Landroid/content/Context;", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;", "MediaBrowserCompatCustomActionResultReceiver", "Z", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public final RemoteActionCompatParcelizer read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public final boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        public final boolean IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public final Context write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public final String AudioAttributesCompatParcelizer;

        public write(Context context, String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z, boolean z2) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            this.write = context;
            this.AudioAttributesCompatParcelizer = str;
            this.read = remoteActionCompatParcelizer;
            this.IconCompatParcelizer = z;
            this.RemoteActionCompatParcelizer = z2;
        }

        public static class IconCompatParcelizer {
            private final Context AudioAttributesCompatParcelizer;
            private RemoteActionCompatParcelizer IconCompatParcelizer;
            private boolean RemoteActionCompatParcelizer;
            private boolean read;
            private String write;

            public IconCompatParcelizer(Context context) {
                toMagicModuleMetaRepoModel.write(context, "");
                this.AudioAttributesCompatParcelizer = context;
            }

            public final write IconCompatParcelizer() {
                String str;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
                if (remoteActionCompatParcelizer == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.RemoteActionCompatParcelizer && ((str = this.write) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new write(this.AudioAttributesCompatParcelizer, this.write, remoteActionCompatParcelizer, this.RemoteActionCompatParcelizer, this.read);
            }

            public final IconCompatParcelizer write(String str) {
                this.write = str;
                return this;
            }

            public final IconCompatParcelizer RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
                this.IconCompatParcelizer = remoteActionCompatParcelizer;
                return this;
            }

            public final IconCompatParcelizer AudioAttributesCompatParcelizer() {
                this.RemoteActionCompatParcelizer = true;
                return this;
            }

            public final IconCompatParcelizer read() {
                this.read = true;
                return this;
            }
        }

        /* JADX INFO: renamed from: o.setEntryLabelTextSize$write$RemoteActionCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setEntryLabelTextSize$write$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/setEntryLabelTextSize$write$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Lo/setEntryLabelTextSize$write$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @getMagicModuleMeta
            public static IconCompatParcelizer RemoteActionCompatParcelizer(Context p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                return new IconCompatParcelizer(p0);
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }
}
