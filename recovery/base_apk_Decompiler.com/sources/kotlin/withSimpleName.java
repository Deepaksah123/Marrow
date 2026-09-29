package kotlin;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/withSimpleName;", "", "<init>", "()V", "MediaBrowserCompatCustomActionResultReceiver", "write", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withSimpleName {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/withSimpleName$MediaBrowserCompatCustomActionResultReceiver;", "", "", "p0", "", "read", "(I)[I", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MediaBrowserCompatCustomActionResultReceiver {
        int[] IconCompatParcelizer(int p0);

        int[] read(int p0);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u00048\u0005@\u0005X\u0084.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/withSimpleName$write;", "Lo/withSimpleName$MediaBrowserCompatCustomActionResultReceiver;", "<init>", "()V", "", "p0", "", "write", "(Ljava/lang/String;)V", "", "p1", "", "read", "(II)[I", "IconCompatParcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class write implements MediaBrowserCompatCustomActionResultReceiver {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        protected String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int[] read = new int[2];

        protected final void AudioAttributesCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = str;
        }

        protected final String write() {
            String str = this.RemoteActionCompatParcelizer;
            if (str != null) {
                return str;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        public void write(String p0) {
            AudioAttributesCompatParcelizer(p0);
        }

        protected final int[] read(int p0, int p1) {
            if (p0 < 0 || p1 < 0 || p0 == p1) {
                return null;
            }
            int[] iArr = this.read;
            iArr[0] = p0;
            iArr[1] = p1;
            return iArr;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005R\u0016\u0010\u000f\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/withSimpleName$IconCompatParcelizer;", "Lo/withSimpleName$write;", "Ljava/util/Locale;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "", "write", "(Ljava/lang/String;)V", "", "", "read", "(I)[I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Ljava/text/BreakIterator;", "AudioAttributesCompatParcelizer", "Ljava/text/BreakIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class IconCompatParcelizer extends write {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int read = 8;
        private static IconCompatParcelizer write;

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private BreakIterator RemoteActionCompatParcelizer;

        private IconCompatParcelizer(Locale locale) {
            RemoteActionCompatParcelizer(locale);
        }

        /* JADX INFO: renamed from: o.withSimpleName$IconCompatParcelizer$RemoteActionCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lo/withSimpleName$IconCompatParcelizer$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Ljava/util/Locale;", "p0", "Lo/withSimpleName$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "(Ljava/util/Locale;)Lo/withSimpleName$IconCompatParcelizer;", "write", "Lo/withSimpleName$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final IconCompatParcelizer RemoteActionCompatParcelizer(Locale p0) {
                if (IconCompatParcelizer.write == null) {
                    IconCompatParcelizer.write = new IconCompatParcelizer(p0, null);
                }
                IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.write;
                toMagicModuleMetaRepoModel.read(iconCompatParcelizer, "");
                return iconCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        @Override // o.withSimpleName.write
        public void write(String p0) {
            super.write(p0);
            BreakIterator breakIterator = this.RemoteActionCompatParcelizer;
            if (breakIterator == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                breakIterator = null;
            }
            breakIterator.setText(p0);
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public int[] read(int p0) {
            int length = write().length();
            if (length <= 0 || p0 >= length) {
                return null;
            }
            if (p0 < 0) {
                p0 = 0;
            }
            do {
                BreakIterator breakIterator = this.RemoteActionCompatParcelizer;
                if (breakIterator == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(p0)) {
                    BreakIterator breakIterator2 = this.RemoteActionCompatParcelizer;
                    if (breakIterator2 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        breakIterator2 = null;
                    }
                    p0 = breakIterator2.following(p0);
                } else {
                    BreakIterator breakIterator3 = this.RemoteActionCompatParcelizer;
                    if (breakIterator3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        breakIterator3 = null;
                    }
                    int iFollowing = breakIterator3.following(p0);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return read(p0, iFollowing);
                }
            } while (p0 != -1);
            return null;
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public int[] IconCompatParcelizer(int p0) {
            int length = write().length();
            if (length <= 0 || p0 <= 0) {
                return null;
            }
            if (p0 > length) {
                p0 = length;
            }
            do {
                BreakIterator breakIterator = this.RemoteActionCompatParcelizer;
                if (breakIterator == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(p0)) {
                    BreakIterator breakIterator2 = this.RemoteActionCompatParcelizer;
                    if (breakIterator2 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        breakIterator2 = null;
                    }
                    p0 = breakIterator2.preceding(p0);
                } else {
                    BreakIterator breakIterator3 = this.RemoteActionCompatParcelizer;
                    if (breakIterator3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        breakIterator3 = null;
                    }
                    int iPreceding = breakIterator3.preceding(p0);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return read(iPreceding, p0);
                }
            } while (p0 != -1);
            return null;
        }

        private final void RemoteActionCompatParcelizer(Locale p0) {
            this.RemoteActionCompatParcelizer = BreakIterator.getCharacterInstance(p0);
        }

        public /* synthetic */ IconCompatParcelizer(Locale locale, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(locale);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\b\u0010\u0012J\u0017\u0010\n\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\n\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0014"}, d2 = {"Lo/withSimpleName$MediaBrowserCompatItemReceiver;", "Lo/withSimpleName$write;", "Ljava/util/Locale;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "", "write", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "", "", "read", "(I)[I", "IconCompatParcelizer", "", "RemoteActionCompatParcelizer", "(I)Z", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends write {
        private static MediaBrowserCompatItemReceiver write;

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private BreakIterator read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int RemoteActionCompatParcelizer = 8;

        private MediaBrowserCompatItemReceiver(Locale locale) {
            AudioAttributesCompatParcelizer(locale);
        }

        /* JADX INFO: renamed from: o.withSimpleName$MediaBrowserCompatItemReceiver$read, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lo/withSimpleName$MediaBrowserCompatItemReceiver$read;", "", "<init>", "()V", "Ljava/util/Locale;", "p0", "Lo/withSimpleName$MediaBrowserCompatItemReceiver;", "RemoteActionCompatParcelizer", "(Ljava/util/Locale;)Lo/withSimpleName$MediaBrowserCompatItemReceiver;", "write", "Lo/withSimpleName$MediaBrowserCompatItemReceiver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer(Locale p0) {
                if (MediaBrowserCompatItemReceiver.write == null) {
                    MediaBrowserCompatItemReceiver.write = new MediaBrowserCompatItemReceiver(p0, null);
                }
                MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver.write;
                toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiver, "");
                return mediaBrowserCompatItemReceiver;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        @Override // o.withSimpleName.write
        public final void write(String p0) {
            super.write(p0);
            BreakIterator breakIterator = this.read;
            if (breakIterator == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                breakIterator = null;
            }
            breakIterator.setText(p0);
        }

        private final void AudioAttributesCompatParcelizer(Locale p0) {
            this.read = BreakIterator.getWordInstance(p0);
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public final int[] read(int p0) {
            if (write().length() <= 0 || p0 >= write().length()) {
                return null;
            }
            if (p0 < 0) {
                p0 = 0;
            }
            while (!AudioAttributesCompatParcelizer(p0) && !RemoteActionCompatParcelizer(p0)) {
                BreakIterator breakIterator = this.read;
                if (breakIterator == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    breakIterator = null;
                }
                p0 = breakIterator.following(p0);
                if (p0 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.read;
            if (breakIterator2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(p0);
            if (iFollowing == -1 || !write(iFollowing)) {
                return null;
            }
            return read(p0, iFollowing);
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public final int[] IconCompatParcelizer(int p0) {
            int length = write().length();
            if (length <= 0 || p0 <= 0) {
                return null;
            }
            if (p0 > length) {
                p0 = length;
            }
            while (p0 > 0 && !AudioAttributesCompatParcelizer(p0 - 1) && !write(p0)) {
                BreakIterator breakIterator = this.read;
                if (breakIterator == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    breakIterator = null;
                }
                p0 = breakIterator.preceding(p0);
                if (p0 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.read;
            if (breakIterator2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(p0);
            if (iPreceding == -1 || !RemoteActionCompatParcelizer(iPreceding)) {
                return null;
            }
            return read(iPreceding, p0);
        }

        private final boolean RemoteActionCompatParcelizer(int p0) {
            if (AudioAttributesCompatParcelizer(p0)) {
                return p0 == 0 || !AudioAttributesCompatParcelizer(p0 - 1);
            }
            return false;
        }

        private final boolean write(int p0) {
            if (p0 <= 0 || !AudioAttributesCompatParcelizer(p0 - 1)) {
                return false;
            }
            return p0 == write().length() || !AudioAttributesCompatParcelizer(p0);
        }

        private final boolean AudioAttributesCompatParcelizer(int p0) {
            if (p0 < 0 || p0 >= write().length()) {
                return false;
            }
            return Character.isLetterOrDigit(write().codePointAt(p0));
        }

        public /* synthetic */ MediaBrowserCompatItemReceiver(Locale locale, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(locale);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lo/withSimpleName$RemoteActionCompatParcelizer;", "Lo/withSimpleName$write;", "<init>", "()V", "", "p0", "", "read", "(I)[I", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "(I)Z", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends write {
        private static RemoteActionCompatParcelizer read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int AudioAttributesCompatParcelizer = 8;

        /* JADX INFO: renamed from: o.withSimpleName$RemoteActionCompatParcelizer$write, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lo/withSimpleName$RemoteActionCompatParcelizer$write;", "", "<init>", "()V", "Lo/withSimpleName$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/withSimpleName$RemoteActionCompatParcelizer;", "read", "Lo/withSimpleName$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
                if (RemoteActionCompatParcelizer.read == null) {
                    RemoteActionCompatParcelizer.read = new RemoteActionCompatParcelizer(null);
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.read;
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
                return remoteActionCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        private RemoteActionCompatParcelizer() {
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public final int[] read(int p0) {
            int length = write().length();
            if (length <= 0 || p0 >= length) {
                return null;
            }
            if (p0 < 0) {
                p0 = 0;
            }
            while (p0 < length && write().charAt(p0) == '\n' && !AudioAttributesCompatParcelizer(p0)) {
                p0++;
            }
            if (p0 >= length) {
                return null;
            }
            int i = p0 + 1;
            while (i < length && !write(i)) {
                i++;
            }
            return read(p0, i);
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public final int[] IconCompatParcelizer(int p0) {
            int length = write().length();
            if (length <= 0 || p0 <= 0) {
                return null;
            }
            if (p0 > length) {
                p0 = length;
            }
            while (p0 > 0 && write().charAt(p0 - 1) == '\n' && !write(p0)) {
                p0--;
            }
            if (p0 <= 0) {
                return null;
            }
            int i = p0 - 1;
            while (i > 0 && !AudioAttributesCompatParcelizer(i)) {
                i--;
            }
            return read(i, p0);
        }

        private final boolean AudioAttributesCompatParcelizer(int p0) {
            if (write().charAt(p0) != '\n') {
                return p0 == 0 || write().charAt(p0 - 1) == '\n';
            }
            return false;
        }

        private final boolean write(int p0) {
            if (p0 <= 0 || write().charAt(p0 - 1) == '\n') {
                return false;
            }
            return p0 == write().length() || write().charAt(p0) == '\n';
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/withSimpleName$read;", "Lo/withSimpleName$write;", "<init>", "()V", "", "p0", "Lo/deserializeFromNumber;", "p1", "", "IconCompatParcelizer", "(Ljava/lang/String;Lo/deserializeFromNumber;)V", "", "", "read", "(I)[I", "Lo/_properties;", "AudioAttributesCompatParcelizer", "(ILo/_properties;)I", "MediaBrowserCompatCustomActionResultReceiver", "Lo/deserializeFromNumber;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends write {
        private static read AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private deserializeFromNumber AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int RemoteActionCompatParcelizer = 8;
        private static final _properties AudioAttributesCompatParcelizer = _properties.IconCompatParcelizer;
        private static final _properties read = _properties.RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.withSimpleName$read$write, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b"}, d2 = {"Lo/withSimpleName$read$write;", "", "<init>", "()V", "Lo/withSimpleName$read;", "read", "()Lo/withSimpleName$read;", "AudioAttributesImplBaseParcelizer", "Lo/withSimpleName$read;", "AudioAttributesCompatParcelizer", "Lo/_properties;", "Lo/_properties;", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final read read() {
                if (read.AudioAttributesImplBaseParcelizer == null) {
                    read.AudioAttributesImplBaseParcelizer = new read(null);
                }
                read readVar = read.AudioAttributesImplBaseParcelizer;
                toMagicModuleMetaRepoModel.read(readVar, "");
                return readVar;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        private read() {
        }

        public final void IconCompatParcelizer(String p0, deserializeFromNumber p1) {
            AudioAttributesCompatParcelizer(p0);
            this.AudioAttributesCompatParcelizer = p1;
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public final int[] read(int p0) {
            int iAudioAttributesCompatParcelizer;
            if (write().length() <= 0 || p0 >= write().length()) {
                return null;
            }
            if (p0 < 0) {
                deserializeFromNumber deserializefromnumber = this.AudioAttributesCompatParcelizer;
                if (deserializefromnumber == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber = null;
                }
                iAudioAttributesCompatParcelizer = deserializefromnumber.AudioAttributesCompatParcelizer(0);
            } else {
                deserializeFromNumber deserializefromnumber2 = this.AudioAttributesCompatParcelizer;
                if (deserializefromnumber2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber2 = null;
                }
                int iAudioAttributesCompatParcelizer2 = deserializefromnumber2.AudioAttributesCompatParcelizer(p0);
                iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2, AudioAttributesCompatParcelizer) == p0 ? iAudioAttributesCompatParcelizer2 : iAudioAttributesCompatParcelizer2 + 1;
            }
            deserializeFromNumber deserializefromnumber3 = this.AudioAttributesCompatParcelizer;
            if (deserializefromnumber3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deserializefromnumber3 = null;
            }
            if (iAudioAttributesCompatParcelizer >= deserializefromnumber3.AudioAttributesImplBaseParcelizer()) {
                return null;
            }
            return read(AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer), AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, read) + 1);
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public final int[] IconCompatParcelizer(int p0) {
            int iAudioAttributesCompatParcelizer;
            if (write().length() <= 0 || p0 <= 0) {
                return null;
            }
            if (p0 > write().length()) {
                deserializeFromNumber deserializefromnumber = this.AudioAttributesCompatParcelizer;
                if (deserializefromnumber == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber = null;
                }
                iAudioAttributesCompatParcelizer = deserializefromnumber.AudioAttributesCompatParcelizer(write().length());
            } else {
                deserializeFromNumber deserializefromnumber2 = this.AudioAttributesCompatParcelizer;
                if (deserializefromnumber2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber2 = null;
                }
                int iAudioAttributesCompatParcelizer2 = deserializefromnumber2.AudioAttributesCompatParcelizer(p0);
                iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2, read) + 1 == p0 ? iAudioAttributesCompatParcelizer2 : iAudioAttributesCompatParcelizer2 - 1;
            }
            if (iAudioAttributesCompatParcelizer < 0) {
                return null;
            }
            return read(AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer), AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, read) + 1);
        }

        private final int AudioAttributesCompatParcelizer(int p0, _properties p1) {
            deserializeFromNumber deserializefromnumber = this.AudioAttributesCompatParcelizer;
            deserializeFromNumber deserializefromnumber2 = null;
            if (deserializefromnumber == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deserializefromnumber = null;
            }
            int iAudioAttributesImplApi26Parcelizer = deserializefromnumber.AudioAttributesImplApi26Parcelizer(p0);
            deserializeFromNumber deserializefromnumber3 = this.AudioAttributesCompatParcelizer;
            if (deserializefromnumber3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deserializefromnumber3 = null;
            }
            if (p1 != deserializefromnumber3.AudioAttributesImplApi21Parcelizer(iAudioAttributesImplApi26Parcelizer)) {
                deserializeFromNumber deserializefromnumber4 = this.AudioAttributesCompatParcelizer;
                if (deserializefromnumber4 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    deserializefromnumber2 = deserializefromnumber4;
                }
                return deserializefromnumber2.AudioAttributesImplApi26Parcelizer(p0);
            }
            deserializeFromNumber deserializefromnumber5 = this.AudioAttributesCompatParcelizer;
            if (deserializefromnumber5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deserializefromnumber5 = null;
            }
            return deserializeFromNumber.write$default(deserializefromnumber5, p0, false, 2, null) - 1;
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/withSimpleName$AudioAttributesCompatParcelizer;", "Lo/withSimpleName$write;", "<init>", "()V", "", "p0", "Lo/deserializeFromNumber;", "p1", "Lo/valueInstantiatorInstance;", "p2", "", "read", "(Ljava/lang/String;Lo/deserializeFromNumber;Lo/valueInstantiatorInstance;)V", "", "", "(I)[I", "IconCompatParcelizer", "Lo/_properties;", "AudioAttributesCompatParcelizer", "(ILo/_properties;)I", "AudioAttributesImplBaseParcelizer", "Lo/deserializeFromNumber;", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/valueInstantiatorInstance;", "Landroid/graphics/Rect;", "AudioAttributesImplApi21Parcelizer", "Landroid/graphics/Rect;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends write {
        private static AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private Rect AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private deserializeFromNumber RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private valueInstantiatorInstance read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int RemoteActionCompatParcelizer = 8;
        private static final _properties AudioAttributesCompatParcelizer = _properties.IconCompatParcelizer;
        private static final _properties read = _properties.RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.withSimpleName$AudioAttributesCompatParcelizer$write, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lo/withSimpleName$AudioAttributesCompatParcelizer$write;", "", "<init>", "()V", "Lo/withSimpleName$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/withSimpleName$AudioAttributesCompatParcelizer;", "MediaBrowserCompatItemReceiver", "Lo/withSimpleName$AudioAttributesCompatParcelizer;", "write", "Lo/_properties;", "Lo/_properties;", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
                if (AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver == null) {
                    AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = new AudioAttributesCompatParcelizer(null);
                }
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
                toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
                return audioAttributesCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        private AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = new Rect();
        }

        public final void read(String p0, deserializeFromNumber p1, valueInstantiatorInstance p2) {
            AudioAttributesCompatParcelizer(p0);
            this.RemoteActionCompatParcelizer = p1;
            this.read = p2;
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public final int[] read(int p0) {
            int iAudioAttributesImplBaseParcelizer;
            deserializeFromNumber deserializefromnumber = null;
            if (write().length() <= 0 || p0 >= write().length()) {
                return null;
            }
            try {
                valueInstantiatorInstance valueinstantiatorinstance = this.read;
                if (valueinstantiatorinstance == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    valueinstantiatorinstance = null;
                }
                WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer = valueinstantiatorinstance.IconCompatParcelizer();
                int iRound = Math.round(writableTypeIdInclusionIconCompatParcelizer.getIconCompatParcelizer() - writableTypeIdInclusionIconCompatParcelizer.getRemoteActionCompatParcelizer());
                int iWrite = getQues.write(0, p0);
                deserializeFromNumber deserializefromnumber2 = this.RemoteActionCompatParcelizer;
                if (deserializefromnumber2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber2 = null;
                }
                int iAudioAttributesCompatParcelizer = deserializefromnumber2.AudioAttributesCompatParcelizer(iWrite);
                deserializeFromNumber deserializefromnumber3 = this.RemoteActionCompatParcelizer;
                if (deserializefromnumber3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber3 = null;
                }
                float fAudioAttributesImplBaseParcelizer = deserializefromnumber3.AudioAttributesImplBaseParcelizer(iAudioAttributesCompatParcelizer) + iRound;
                deserializeFromNumber deserializefromnumber4 = this.RemoteActionCompatParcelizer;
                if (deserializefromnumber4 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber4 = null;
                }
                deserializeFromNumber deserializefromnumber5 = this.RemoteActionCompatParcelizer;
                if (deserializefromnumber5 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber5 = null;
                }
                if (fAudioAttributesImplBaseParcelizer < deserializefromnumber4.AudioAttributesImplBaseParcelizer(deserializefromnumber5.AudioAttributesImplBaseParcelizer() - 1)) {
                    deserializeFromNumber deserializefromnumber6 = this.RemoteActionCompatParcelizer;
                    if (deserializefromnumber6 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        deserializefromnumber = deserializefromnumber6;
                    }
                    iAudioAttributesImplBaseParcelizer = deserializefromnumber.read(fAudioAttributesImplBaseParcelizer);
                } else {
                    deserializeFromNumber deserializefromnumber7 = this.RemoteActionCompatParcelizer;
                    if (deserializefromnumber7 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        deserializefromnumber = deserializefromnumber7;
                    }
                    iAudioAttributesImplBaseParcelizer = deserializefromnumber.AudioAttributesImplBaseParcelizer();
                }
                return read(iWrite, AudioAttributesCompatParcelizer(iAudioAttributesImplBaseParcelizer - 1, read) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver
        public final int[] IconCompatParcelizer(int p0) {
            int i;
            deserializeFromNumber deserializefromnumber = null;
            if (write().length() <= 0 || p0 <= 0) {
                return null;
            }
            try {
                valueInstantiatorInstance valueinstantiatorinstance = this.read;
                if (valueinstantiatorinstance == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    valueinstantiatorinstance = null;
                }
                WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer = valueinstantiatorinstance.IconCompatParcelizer();
                int iRound = Math.round(writableTypeIdInclusionIconCompatParcelizer.getIconCompatParcelizer() - writableTypeIdInclusionIconCompatParcelizer.getRemoteActionCompatParcelizer());
                int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(write().length(), p0);
                deserializeFromNumber deserializefromnumber2 = this.RemoteActionCompatParcelizer;
                if (deserializefromnumber2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber2 = null;
                }
                int iAudioAttributesCompatParcelizer = deserializefromnumber2.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                deserializeFromNumber deserializefromnumber3 = this.RemoteActionCompatParcelizer;
                if (deserializefromnumber3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    deserializefromnumber3 = null;
                }
                float fAudioAttributesImplBaseParcelizer = deserializefromnumber3.AudioAttributesImplBaseParcelizer(iAudioAttributesCompatParcelizer) - iRound;
                if (fAudioAttributesImplBaseParcelizer > BitmapDescriptorFactory.HUE_RED) {
                    deserializeFromNumber deserializefromnumber4 = this.RemoteActionCompatParcelizer;
                    if (deserializefromnumber4 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        deserializefromnumber = deserializefromnumber4;
                    }
                    i = deserializefromnumber.read(fAudioAttributesImplBaseParcelizer);
                } else {
                    i = 0;
                }
                if (iRemoteActionCompatParcelizer == write().length() && i < iAudioAttributesCompatParcelizer) {
                    i++;
                }
                return read(AudioAttributesCompatParcelizer(i, AudioAttributesCompatParcelizer), iRemoteActionCompatParcelizer);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        private final int AudioAttributesCompatParcelizer(int p0, _properties p1) {
            deserializeFromNumber deserializefromnumber = this.RemoteActionCompatParcelizer;
            deserializeFromNumber deserializefromnumber2 = null;
            if (deserializefromnumber == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deserializefromnumber = null;
            }
            int iAudioAttributesImplApi26Parcelizer = deserializefromnumber.AudioAttributesImplApi26Parcelizer(p0);
            deserializeFromNumber deserializefromnumber3 = this.RemoteActionCompatParcelizer;
            if (deserializefromnumber3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deserializefromnumber3 = null;
            }
            if (p1 != deserializefromnumber3.AudioAttributesImplApi21Parcelizer(iAudioAttributesImplApi26Parcelizer)) {
                deserializeFromNumber deserializefromnumber4 = this.RemoteActionCompatParcelizer;
                if (deserializefromnumber4 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    deserializefromnumber2 = deserializefromnumber4;
                }
                return deserializefromnumber2.AudioAttributesImplApi26Parcelizer(p0);
            }
            deserializeFromNumber deserializefromnumber5 = this.RemoteActionCompatParcelizer;
            if (deserializefromnumber5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                deserializefromnumber5 = null;
            }
            return deserializeFromNumber.write$default(deserializefromnumber5, p0, false, 2, null) - 1;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
